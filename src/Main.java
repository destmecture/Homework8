public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");

        int[] arrayInt = new int[] {1,2,3};
        double[] arrayDouble = {1.57,7.654,9.986};
        String[] arrayString = new String[2];
        arrayString[0] = "Zero";
        arrayString[1] = "One";

        System.out.println("Task 2");

        for (int i = 0; i < arrayInt.length; i++) {
            if(i==(arrayInt.length)-1){
                System.out.print(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i]+",");
        }
        System.out.println();

        for (int i = 0; i < arrayDouble.length; i++) {
            if(i==(arrayDouble.length)-1){
                System.out.print(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i]+",");
        }
        System.out.println();

        for (int i = 0; i < arrayString.length; i++) {
            if(i==(arrayString.length)-1){
                System.out.print(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i]+",");
        }
        System.out.println();

        System.out.println("Task 3");

        for (int i = arrayInt.length-1; i >= 0; i--) {
            if(i==0){
                System.out.print(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i]+",");
        }
        System.out.println();

        for (int i = arrayDouble.length-1; i >= 0; i--) {
            if(i==0){
                System.out.print(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i]+",");
        }
        System.out.println();

        for (int i = arrayString.length-1; i >= 0; i--) {
            if(i==0){
                    System.out.print(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i]+",");
        }
        System.out.println();

        System.out.println("Task 4");

        for (int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i]%2!=0){
                int i1 = arrayInt[i] + 1;
                System.out.print(i1+" ");
                continue;
            }
            System.out.print(arrayInt[i]+" ");
        }


    }
}