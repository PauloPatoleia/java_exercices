class frontback {
    public static void main(String[] args) {

        frontBack("heisenberg");
    
        //receive command line argument if available
        if(args.length>0){
          frontBack(args[0]);
        }
    }
    
    private static void frontBack(String str) {
    
        // print result here
        char  firstChar = str.charAt(0);
        char  lastChar = str.charAt(str.length() - 1);
        System.out.println(firstChar);
        System.out.println(lastChar);

        System.out.println(lastChar + str.substring(1, str.length() - 1) + firstChar);
    
    }
}