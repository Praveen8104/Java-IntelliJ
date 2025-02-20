import java.util.Scanner;
import java.util.ArrayList;

public class Main{

//    public static int linearSearch(int[] arr, int key){
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == key){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static class Animal{
        public void eat(){
            System.out.println("Animal is eating");
        }
        public void sleep(){
            System.out.println("Animal is sleeping");
        }
    }

    public static class Dog extends Animal{
        public void bark(){
            System.out.println("Dog is barking");
        }
    }

    public static class EncapsulationDemo{
        private int age;

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static int max(int a, int b){
        return Math.max(a, b);
    }

    public static int min(int a, int b){
        return Math.min(a, b);
    }

    public static class Person{
        String name;
        int age;

        public Person(){
            name = "";
            age = 0;
        }

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static class Pair<T, U>{
        T first;
        U second;

        public Pair(T first, U second){
            this.first = first;
            this.second = second;
        }

        public T getFirst(){
            return first;
        }

        public U getSecond(){
            return second;
        }
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//         Linear Search
//        System.out.println("Enter the number of elements in the array");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array");
//        for(int i = 0; i < n; i++){
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Enter the element to be searched");
//        int key = scanner.nextInt();
//        int index = linearSearch(arr, key);
//        if(index == -1){
//            System.out.println("Element not found in the array");
//        }else{
//            System.out.println("Element found at index: " + index);
//        }

//         Adding Two Number
//        System.out.println("Enter the first number");
//        int a = scanner.nextInt();
//        System.out.println("Enter the second number");
//        int b = scanner.nextInt();
//        System.out.println("The sum of the two numbers is: " + (a + b));

//         Finding the maximum of two numbers
//        System.out.println("Enter the first number");
//        int a = scanner.nextInt();
//        System.out.println("Enter the second number");
//        int b = scanner.nextInt();
//        System.out.println("The maximum of the two numbers is: " + Math.max(a, b));

        // All functions on String
        String str = "Hello World";
        System.out.println("The length of the string is: " + str.length());
        System.out.println("The substring from index 1 to 4 is: " + str.substring(1, 5));
        System.out.println("The index of the first occurrence of 'l' is: " + str.indexOf('l'));
        System.out.println("The index of the last occurrence of 'l' is: " + str.lastIndexOf('l'));
        System.out.println("The character at index 1 is: " + str.charAt(1));
        System.out.println("The string in uppercase is: " + str.toUpperCase());
        System.out.println("The string in lowercase is: " + str.toLowerCase());
        System.out.println("The string without leading and trailing whitespaces is: " + str.trim());
        System.out.println("The string after replacing 'Hello' with 'Hi' is: " + str.replace("Hello", "Hi"));
        System.out.println("The string after splitting at space is: ");
        String[] arr = str.split(" ");
        for(String s: arr){
            System.out.println(s);
        }

        //String Handling
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //String Buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.replace(5, 10, "C++");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        //String Builder
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println(sb1);
        sb1.insert(5, " Java");
        System.out.println(sb1);
        sb1.replace(5, 10, "C++");
        System.out.println(sb1);
        sb1.delete(5, 8);
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

        //Object Creation
        Object obj = new Object();
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj));

        //Object-Oriented Programming
        //Inheritance
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

        //Polymorphism
        Animal a = new Dog();
        a.eat();
        a.sleep();

        //Encapsulation
        EncapsulationDemo obj1 = new EncapsulationDemo();
        obj1.setAge(20);
        System.out.println(obj1.getAge());

        //Exception Handling
        try{
            int c = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }finally{
            System.out.println("This block will always execute");
        }

        //Looping
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i < 5);

        //Decision-Making
        int x = 10;
        if(x > 5){
            System.out.println("x is greater than 5");
        }else{
            System.out.println("x is less than or equal to 5");
        }
        x = 5;
        switch(x){
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            default:
                System.out.println("x is neither 1 nor 2");
        }

        //Arrays
        int[] arr1 = new int[5];
        for(int j = 0; j < 5; j++){
            arr1[j] = j;
        }
        for(int j = 0; j < 5; j++){
            System.out.println(arr1[j]);
        }
        int[] arr2 = {1, 2, 3, 4, 5};
        for(int j = 0; j < 5; j++){
            System.out.println(arr2[j]);
        }
        for(int j: arr2){
            System.out.println(j);
        }

        //Functions
        System.out.println(add(5, 10));
        System.out.println(max(5, 10));
        System.out.println(min(5, 10));

        //Classes and Objects
        Person person = new Person();
        person.name = "John";
        person.age = 20;
        System.out.println(person.name + " is " + person.age + " years old");

        //Constructors
        Person person1 = new Person("John", 20);
        System.out.println(person1.name + " is " + person1.age + " years old");

        sc.close();

        //Method Overloading
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));

        //Method Overriding
        Animal animal1 = new Dog();
        animal1.eat();
        animal1.sleep();

        //Threads
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread is running");
            }
        };
        thread.start();

        //Generics
        Pair<Integer, String> pair = new Pair<>(1, "Hello");
        System.out.println(pair.getFirst() + " " + pair.getSecond());

        //Collections
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);


    }
}