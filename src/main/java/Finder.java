public class Finder {


    public java.lang.Integer findMax(int[] intArray) {
        if(intArray == null) {
            return null;
        }
        if(intArray.length == 0) {
            return null;
        }
        int max = intArray[0];
        int i = 1;

        while (i < intArray.length) {

            if(intArray[i] > max){
              max = intArray[i];
            }

            i++;
        }
        return max;
    }

    public java.lang.Integer findMin(int[] intArray) {
        if(intArray == null) {
            return null;
        }
        if(intArray.length == 0) {
            return null;
        }
        int min = intArray[0];
        int i = 1;

        while (i < intArray.length) {

            if(intArray[i] < min){
                min = intArray[i];
            }

            i++;
        }
        return min;
    }



}
