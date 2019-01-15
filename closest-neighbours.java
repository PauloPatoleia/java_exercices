class main {
    public static void main(String[] args) {

        int[] myArray = {100, 200, 400, 9, 2, 200, 112, 33};
        int[] result = findClosest(myArray);
        System.out.println(result[0]);
        System.out.println(result[1]);
        // print the elements of the resulting array
    }
    
    private static int[] findClosest(int[] numbers) {
        // hint: remember Math.abs();
        int[] result = new int[3];

        for(int i=1; i < numbers.length-1; i++) {

            int difference = Math.abs(numbers[i] - numbers[i-1]);
            

            if(i == 1) {
                result[0] = numbers[i-1];
                result[1] = numbers[i];
                result[2] = difference;
            } else if (difference < result[2]) {
                result[0] = numbers[i-1];
                result[1] = numbers[i];
                result[2] = difference;
            }

       }

       return result;
    }
}
