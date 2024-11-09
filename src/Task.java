import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] integersNumbers = new int[3];
        integersNumbers[0] = 1;
        integersNumbers[1] = 2;
        integersNumbers[2] = 3;

        double[] fractionalNumbers = {1.57, 7.654, 9.986};

        String[] season = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println(Arrays.toString(integersNumbers));
        System.out.println(Arrays.toString(fractionalNumbers));
        System.out.println(Arrays.toString(season));

        for (int i = integersNumbers.length-1; i >= 0; i--) {
            if (i==0){
                System.out.print(integersNumbers[i]);
            }else {
                System.out.print(integersNumbers[i]+", ");
            }
        }

        System.out.println(" ");

        for (int j = fractionalNumbers.length-1; j >= 0; j--) {
            if (j==0){
                System.out.print(fractionalNumbers[j]);
            }else {
                System.out.print(fractionalNumbers[j]+", ");
            }
        }

        System.out.println(" ");

        for (int k = season.length-1; k >= 0; k--) {
            if (k==0){
                System.out.print(season[k]);
            }else {
                System.out.print(season[k]+", ");
            }
        }

        System.out.println(" ");

       for (int l=0; l<integersNumbers.length;l++){
           if (l==integersNumbers.length-1){
               System.out.print(integersNumbers[l]+1);
           }else
               System.out.print(integersNumbers[l]+1+", ");
       }


    }
}