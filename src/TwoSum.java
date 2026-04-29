public class TwoSum {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] + numeros[j] == target){
                    System.out.println(i+ " "+j);
                }
            }
        }
    }
}
