import java.lang.String;
abstract class Vehicle
{
    int no_of_wheels;
    String colour;
    float speed;
    abstract void start();
    abstract void accelerate();
    abstract void brake();
}
class TransportationVehicle extends Vehicle
{
    void start()
    {
        System.out.println("TransportationVehicle is Starting");
    }
    void accelerate()
    {
        System.out.println("TransportationVehicle is Accelerating");
    }
    void brake()
    {
        System.out.println("TransportationVehicle is Stopping");
    }
    int no_of_doors;
    float load_capacity;
}
class Van extends TransportationVehicle
{
    int no_of_boxes;
    void start()
        {
            System.out.println("Van is Starting");
        }
        void accelerate()
        {
            System.out.println("van is Accelerating");
        }
        void brake()
        {
            System.out.println("Van is Stopping");
        }
    void loadVan()
    {
        System.out.println("Van is Loading");
    }
}
class Truck extends TransportationVehicle
{
    float size_of_containers;
    void start()
        {
            System.out.println("Truck is Starting");
        }
        void accelerate()
        {
            System.out.println("Truck is Accelerating");
        }
        void brake()
        {
            System.out.println("Truck is Stopping");
        }
    void loadContainer()
    {
        System.out.println("Container is Loading");
    }
}
class PassengerVehicle extends Vehicle
{
    void start()
    {
        System.out.println("Passenger Vehicle is Starting");
    }
    void accelerate()
    {
        System.out.println("Passenger Vehicle is Accelerating");
    }
    void brake()
    {
        System.out.println("Passenger Vehicle is Stopping");
    }
    int passenger_seats;
}
class Car extends PassengerVehicle
{
    int no_of_doors;
    void start()
        {
            System.out.println("Car is Starting");
        }
        void accelerate()
        {
            System.out.println("Car is Accelerating");
        }
        void brake()
        {
            System.out.println("Car is Stopping");
        }
}
class Bike extends PassengerVehicle
{
    float saddle_height;
    void start()
        {
            System.out.println("Bike is Starting");
        }
        void accelerate()
        {
            System.out.println("Bike is Accelerating");
        }
        void brake()
        {
            System.out.println("Bike is Stopping");
        }
}
class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n" + "---------- TRANSPORTATION VEHICLE ----------" + "\n");
        TransportationVehicle obj1=new TransportationVehicle();
        obj1.no_of_wheels=4;
        obj1.colour="Black";
        obj1.speed=80;
        obj1.no_of_doors=4;
        obj1.load_capacity=40;
        System.out.println("TransportationVehicle Number of Wheels = " + obj1.no_of_wheels);
        System.out.println("TransportationVehicle Colour = " + obj1.colour);
        System.out.println("TransportationVehicle Speed = " + obj1.speed);
        System.out.println("TransportationVehicle Number of Doors = " + obj1.no_of_doors);
        System.out.println("TransportationVehicle Load Capacity = " + obj1.load_capacity);
        obj1.start();
        obj1.accelerate();
        obj1.brake();

        System.out.println("\n" + "---------- VAN ----------" + "\n");
        Van obj2=new Van();
        obj2.no_of_wheels=4;
        obj2.colour="White";
        obj2.speed=60;
        obj2.no_of_doors=4;
        obj2.load_capacity=50;
        obj2.no_of_boxes=5;
       
        System.out.println("Van Number of Wheels = " + obj2.no_of_wheels);
        System.out.println("Van Colour = " + obj2.colour);
        System.out.println("Van Speed = " + obj2.speed);
        System.out.println("Van Number of Doors = " + obj2.no_of_doors);
        System.out.println("Van Load Capacity = " + obj2.load_capacity);
        System.out.println("Van Number of Boxes = " + obj2.no_of_boxes);
        obj2.start();
        obj2.accelerate();
        obj2.brake();
        obj2.loadVan();
        
        System.out.println("\n" + "---------- TRUCK ----------" + "\n");
        Truck obj3=new Truck();
        obj3.no_of_wheels=4;
        obj3.colour="Yellow";
        obj3.speed=40;
        obj3.no_of_doors=2;
        obj3.load_capacity=120;
        obj3.size_of_containers=60;
        
        System.out.println("Truck Number of Wheels = " + obj3.no_of_wheels);
        System.out.println("Truck Colour = " + obj3.colour);
        System.out.println("Truck Speed = " + obj3.speed);
        System.out.println("Truck Number of Doors = " + obj3.no_of_doors);
        System.out.println("Truck Load Capacity = " + obj3.load_capacity);
        System.out.println("Truck Size of Containers = " + obj3.size_of_containers); 
        obj3.start();
        obj3.accelerate();
        obj3.brake();
        obj3.loadContainer();

        System.out.println("\n" + "---------- PASSENGER VEHICLE ----------" + "\n");
        PassengerVehicle obj4=new PassengerVehicle();
        obj4.no_of_wheels=4;
        obj4.colour="Brown";
        obj4.speed=170;
        obj4.passenger_seats=4;
       
        System.out.println("Passenger Vehicle Number of Wheels = " + obj4.no_of_wheels);
        System.out.println("Passenger Vehicle Colour = " + obj4.colour);
        System.out.println("Passenger Vehicle Speed = " + obj4.speed);
        System.out.println("Passenger Vehicle Seats = " + obj4.passenger_seats);
         obj4.start();
        obj4.accelerate();
        obj4.brake();

        System.out.println("\n" + "---------- CAR ----------" + "\n");
        Car obj5=new Car();
        obj5.no_of_wheels=4;
        obj5.colour="Blue";
        obj5.speed=200;
        obj5.no_of_doors=4;
        
        System.out.println("Car Number of Wheels = " + obj5.no_of_wheels);
        System.out.println("Car Colour = " + obj5.colour);
        System.out.println("Car Speed = " + obj5.speed);
        System.out.println("Car Number of Doors = " + obj5.no_of_doors);
        obj5.start();
        obj5.accelerate();
        obj5.brake();

        System.out.println("\n" + "---------- BIKE ----------" + "\n");
        Bike obj6=new Bike();
        obj6.no_of_wheels=2;
        obj6.colour="Red";
        obj6.speed=85;
        obj6.passenger_seats=2;
        obj6.saddle_height=15;
        
        System.out.println("Bike Number of Wheels = " + obj6.no_of_wheels);
        System.out.println("Bike Vehicle Colour = " + obj6.colour);
        System.out.println("Bike Vehicle Speed = " + obj6.speed);
        System.out.println("Bike Vehicle Seats = " + obj6.passenger_seats);
        System.out.println("Bike Saddle Height = " + obj6.saddle_height);
        obj6.start();
        obj6.accelerate();
        obj6.brake();
    }
}