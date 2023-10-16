//import java.util.*; // java/util에있는 모든 페키지 임폴트
//import lib.Test; app과는 동시 불가
import app.Test;
class Main {
  public static void main(String[] args) {

  lib.Test test = new lib.Test();
    test.test();
    app.App app = new app.App();
    app.test();
    app.app();
    Test test2 = new Test();//app.Test
    test2.test();
    
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("입력:");
    int i = scanner.nextInt();
    System.out.println(i);
  }
}