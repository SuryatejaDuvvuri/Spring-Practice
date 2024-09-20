package org.Surya;


public class Dev {

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;



//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 2 constructor");
//    }

    public Dev()
    {
        System.out.println("Dev Constructor");
    }
    public void build(){

        System.out.println("Build Dev!");
        com.compile();
    }
}

