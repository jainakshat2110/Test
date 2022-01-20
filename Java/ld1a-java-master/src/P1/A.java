package P1;

public class A {
    private String privateF ="private field";
    private void privateM(){
        System.out.println("private method");
    }


    String defaultF = "default field";
    void defaultM(){
        System.out.println("default method");
    }

    public String publicF = "public field";
    public void publicM(){
        System.out.println("public method");
    }
    protected String protectedF = "protected field";
    protected void protectedM(){
        System.out.println("protected method");
    }

    public static void main(String[] args) {
        A object = new A();
        System.out.println(object.privateF);
        object.privateM();
    }
     
    
}



