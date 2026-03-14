class Main {
    public static void main(String[] args) {

        int n = 5;
        int count = 1;
        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                count=1;
            }
            else{
                count=0;
            }
            
            for (int j = 0; j <=i; j++) {
                if(count==0){
                    System.out.print(count++ + " ");
                }else{
                    System.out.print(count-- + " ");
                }   
            }
          System.out.println();
        }

      
       
    }
}
