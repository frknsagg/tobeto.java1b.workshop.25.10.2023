package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        Category category = new Category("Elektronik",1);
        Category category1 = new Category("Ev Aletleri",2);
        Category category2 = new Category("Giyim",3);


        Product product = new Product("Laptop",5500,true);
        Product product1 = new Product("Mouse",550,true);
        Product product2 = new Product("Lamba",3250,false);

        Order order = new Order(3254,"Ev Aletleri , Mouse");
        Order order1 = new Order(5478,"Mutfak Eşyası , Sandalye");
        Order order2 = new Order(33,"Giyim , Pantolon");

        User user1 = new User("frknsagg","111111",25);
        User user2 = new User("asdfadfasdf","222222",26);
        User user3 = new User();
        user3.setUserID(27);
        user3.setUserName("tobeto");
        user3.setUserPhoneNumber("3333333");


        Product[] products ={product,product1,product2};
        User[] users = {user1,user2,user3};

        for (User user:users){
            System.out.println(user.getUserName() + " : " + user.getUserPhoneNumber());
        }

        for (Product pr:products){
            pr.setInStock(true);
            System.out.println(pr.getProductName() + "'in stok bilgisi =>" + pr.getInStock() + " olarak değiştirilmişti");
        }


    }
}