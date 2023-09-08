package starpattern;

public class TriangleStarPattern {
    public static void main(String[] args) {
        RightHalfPyramid.pattern8();
        System.out.println();
        ReverseRightHalfPyramid.pattern9();
        LeftHalfPyramid.pattern10();
        System.out.println();
        ReverseLeftHalfPyramid.pattern11();
        System.out.println();
        EquilateralStarPattern1.pattern12();
        System.out.println();
        EquilateralStarPattern2.pattern13();
        System.out.println();
        EquilateralStarPattern3.pattern14();
    }

}
class RightHalfPyramid {
    public static void pattern8(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j<=i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
class ReverseRightHalfPyramid {
    public static void pattern9(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j<=6-i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
class LeftHalfPyramid {
    public static void pattern10(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j>=6-i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
class ReverseLeftHalfPyramid {
    public static void pattern11(){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=1;j--){
                if (j<=6-i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
class EquilateralStarPattern1 {
    public static void pattern12(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j>=6-i)
                    System.out.print("   *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
class EquilateralStarPattern2 {
    public static void pattern13(){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=1;j--){
                if (j<=6-i)
                    System.out.print("   *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}


class EquilateralStarPattern3 {
    public static void pattern14(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=9;j++) {
                if (j >= 6 - i && j <= 4 + i){
                    System.out.print(" * ");
            }
                else {
                    System.out.print("   ");
                    //j++;
                }

            }
            System.out.println();
        }
    }
}

class EquilateralStarPattern {
    public static void pattern15(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j>=6-i)
                    System.out.print("   *");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}




