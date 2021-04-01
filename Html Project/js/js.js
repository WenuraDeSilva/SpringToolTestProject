function addUser() {

    var id = document.getElementById("id").value;
    var name = document.getElementById("name").value;
    var un = document.getElementById("un").value;
    var pw = document.getElementById("pw").value;
    var age = document.getElementById("age").value;
    var tele = document.getElementById("tele").value;

    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4 && request.status === 200) {
            //    alert(request.responseText);
            getAllUsers();

        }
    };

    request.open("POST", "http://localhost:8080/user/addUser", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("id=" + id + "&name=" + name+ "&un=" + un+ "&pw=" + pw+ "&age=" + age+ "&tele=" + tele);

}
function getAllUsers() {

   
    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4 && request.status === 200) {
            //    alert(request.responseText);
            var data = JSON.parse(this.responseText);
            document.getElementById("resultuser").innerHTML=null;

            for (var i = 0; i < data.length; i++) {
                var div = document.createElement("div");
                div.innerHTML = 'ID: ' + data[i].id +'  Name: '+data[i].name+'  UserName: '+data[i].username+'  Password: '+data[i].password+' Age: '+data[i].age+' Telephone: '+data[i].telephone;
                            document.getElementById("resultuser").appendChild(div);
            }

        }
    };

    request.open("POST", "http://localhost:8080/user/getUserAll", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send();
}
function addProduct() {

    var proid = document.getElementById("proid").value;
    var proname = document.getElementById("proname").value;
    var desc = document.getElementById("description").value;
    var price = document.getElementById("price").value;

    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4 && request.status === 200) {
            //    alert(request.responseText);
            getAllProducts();

        }
    };

    request.open("POST", "http://localhost:8080/product/addProduct", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("proid=" + proid + "&proname=" + proname+ "&desc=" + desc+ "&price=" + price);

}
function getAllProducts() {

    
    
    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4 && request.status === 200) {
            //    alert(request.responseText);
            var data = JSON.parse(this.responseText);
            document.getElementById("resultproduct").innerHTML=null;

            for (var i = 0; i < data.length; i++) {
                var div = document.createElement("div");
                div.innerHTML = 'proID: ' + data[i].id +'  proName: '+data[i].product_name+'  Description: '+data[i].product_desciption+'  price: '+data[i].price;
                            document.getElementById("resultproduct").appendChild(div);
            }

        }
    };

    request.open("POST", "http://localhost:8080/product/getProductAll", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send();
}