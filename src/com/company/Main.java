package com.company;


public class Main {

    public static void main(String[] args) {


        //Dealerships
        Dealership dealer1 = new Dealership("Car Dealership Abington", "123 St Ave Town, PA 12345", "1234567890");
        Dealership dealer2 = new Dealership("Car Dealership Bensalem", "123 St Ave Town, PA 12345", "1234567890");

        //ArrayList<Dealership> listDealerships = new ArrayList<>();
        //listDealerships.add(dealer1);
        //listDealerships.add(dealer2);


        System.out.println(dealer2.getName());


        //SalesPeople
        Salesperson sp1 = new Salesperson();
        sp1.setEmpID("ABC1");

        //Vehicles - objects [done]

        // Cars

        Car car1 = new Car("1A2B3C");
        car1.addCarToInventory(car1);


        car1.setColor("Black");
        System.out.println(car1.getColor());

//                System.out.println(.printInvList());

        Car car2 = new Car("1A4K5L");
        car2.addCarToInventory(car2);


        car2.setColor("Red");
        System.out.println(car2.getColor());

        Car car3 = new Car("2B6F9S");
        car3.addCarToInventory(car3);


        car3.setColor("White");
        System.out.println(car3.getColor());

        Car car4 = new Car("3D1G7T");
        car4.addCarToInventory(car4);


        car4.setColor("Black");
        System.out.println(car4.getColor());

        Car car5 = new Car("6H3M2X");
        car5.addCarToInventory(car5);


        car5.setColor("Silver");
        System.out.println(car5.getColor());

        Car car6 = new Car("9G5Z1E");
        car6.addCarToInventory(car6);


        car6.setColor("Purple");
        System.out.println(car6.getColor());

        Car car7 = new Car("4Y3T8U");
        car7.addCarToInventory(car7);


        car7.setColor("Green");
        System.out.println(car7.getColor());

        Car car8 = new Car("1D7C3J");
        car8.addCarToInventory(car8);


        car8.setColor("Maroon");
        System.out.println(car8.getColor());

        Car car9 = new Car("3T9R5F");
        car9.addCarToInventory(car9);


        car9.setColor("Orange");
        System.out.println(car9.getColor());

        Car car10 = new Car("5H2V9P");
        car10.addCarToInventory(car10);


        car10.setColor("Yellow");
        System.out.println(car10.getColor());

        // Trucks


        Truck truck1 = new Truck("5C6D7E");
        truck1.setTon(Ton.one);

        Truck truck2 = new Truck("6T3R1Y");
        truck2.setTon(Ton.one);

        Truck truck3 = new Truck("9P7O2S");
        truck3.setTon(Ton.two);

        Truck truck4 = new Truck("5L7F3X");
        truck4.setTon(Ton.one);

        Truck truck5 = new Truck("8T2Z4G");
        truck5.setTon(Ton.two);

        Truck truck6 = new Truck("3V8C5K");
        truck6.setTon(Ton.one);

        Truck truck7 = new Truck("7W4A3C");
        truck7.setTon(Ton.one);

        Truck truck8 = new Truck("4G1D7J");
        truck8.setTon(Ton.two);

        Truck truck9 = new Truck("2K6V8R");
        truck9.setTon(Ton.two);

        Truck truck10 = new Truck("6T9C4F");
        truck10.setTon(Ton.one);


        //Inventory
        Inventory in1 = new Inventory();

    //    in1.setCar(car1);


        //Get quantity in inventory


        //Customers


        Customers cust1 = new Customers();
        cust1.setFirstName("Ann");
        cust1.setGroupID("A");


        //SalesLead
        SalesLead s1 = new SalesLead();
        s1.setSalesLeadID(0);

        System.out.print(s1.getSalesLeadID());


    }
}








