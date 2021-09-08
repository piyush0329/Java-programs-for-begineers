package piyush;

public class finally_block {
    public static  int greet(){
        try{
            int a=50;
            int b= 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up resources ... This is the end of Function");
        }
        return 0;
    }
    public static void main(String[] args) {
       // int k = greet();
        System.out.println(greet());
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am for finally value of b = "+b);
            }
            b--;
        }
        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("Yes this is finnally");
        }
    }
}