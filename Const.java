public class Const  {
    int i = 5;
    Const(){
        i = 5;
        System.out.println("constructor is called");
    }
    public static void main(String[] args){
        Const O = new Const();
        System.out.println("value of i : + 0.i");
        System.out.println(O);

    }
}
