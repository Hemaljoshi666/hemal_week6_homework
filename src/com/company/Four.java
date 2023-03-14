package com.company;

public class Four {
    int a = 2;
    int b = 5;
    static int c=10;
    static  int d=20;

    /*
    declare instance method
     public void <method name>(){

       }
     */
    public void ins_method(){
        System.out.println("i am instant variable a "+a);
        System.out.println("i am instant variable b "+b);
        System.out.println("i am instant variable c "+c);
        System.out.println("i am instant variable d "+d);
    }

    public static void st_method(){
        //System.out.println("i am instant variable a "+a);
        //System.out.println("i am instant variable b "+b);
        System.out.println("i am instant variable c "+c);
        System.out.println("i am instant variable d "+d);
    }




    /*
    To call static method  == by using name of the class.<mathod name>
    To call instance method == by creating object of the class --- obj.<method name>

    classname <object name> = new classname;
     */
    public static void main(String[] args) {
        Four obj = new Four();

        obj.ins_method();
        st_method();

    }


}
