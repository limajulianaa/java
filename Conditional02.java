public class Conditional02 {
    public static void main(String[] args) {

    String str = "Juliana";

    if(str.isBlank()) {
        System.out.println("Verdadeiro");
    }else if (str == "Juliana"){
        System.out.println("Juliana");
    }
    else{
       System.out.println("False");
    }
  }
}
