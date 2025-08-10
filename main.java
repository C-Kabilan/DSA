import java.util.Scanner;
public class main{
  public static void main(String[] args){
    System.out.print("Enter a number: ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if(n%2==0){
      System.out.print("Even");
    }
    else{
      System.out.print("Odd");
    }
  }
}
