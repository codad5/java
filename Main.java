class Main
{
    public static void main(String args[]) 
    {
        // System.out.println("hello World");
        Integer num = 2;
        Double dbl = 10.40;
        Boolean bln = false;
        String str = "My name is Michael";

        System.out.println("str.substring(0, 4)");
        System.out.println(str.substring(0, 4));
        System.out.println(num.doubleValue());
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace("name", "FirstName"));
        System.out.println(str.startsWith("My name"));
        System.out.println(dbl);
        
        

        
        
        while (num <= dbl){
            num++;
            System.out.println("Number of:"+num);
        }
        
    }
}

class Hello extends Main{
    public static void main() {
    System.out.println("Number of:");
    // System.in();

    }

}