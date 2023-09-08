package starpattern;

public class QuadrilateralStarPattern {
    public static void pattern1() {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=6;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}

class SquareHollowPattern {
    public static void pattern3(){
        for (int i=1;i<=6;i++){
            for (int j=1;j<=6;j++){
                if (i==1||i==6||j==1||j==6)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
class RhombusPattern1 {
    public static void pattern4(){

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i+5;j++){
                if (j>=i && j<=i+5)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}
class RhombusPattern2 {
    public static void pattern5(){

        for (int i=5;i>=1;i--){
            for (int j=1;j<=i+5;j++){
                if (j>=i && j<=i+5)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}

class HollowRhombusPattern1 {
    public static void pattern6(){

        for (int i=1;i<=5;i++){
            for (int j=1;j<=i+5;j++){
                if (i==1 || j==i||j==i+5||(i==5 && j>=5))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
    }
}
class HollowRhombusPattern2 {
    public static void pattern7(){

        for (int i=5;i>=1;i--){
            for (int j=1;j<=i+5;j++){
                if (i==1 || j==i||j==i+5||(i==5 && j>=5))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();

        }
    }
}


