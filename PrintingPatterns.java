class PrintingPatterns {
    public static void main(String args[]) {
        Pattern pattern = new Pattern();
        // pattern.square(5);
        // pattern.hollowSquare(10);
        // pattern.simpleA(10);
        // pattern.styledA(10);
        pattern.styledD(10);
    }
}

class Pattern {

    public void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public void hollowSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

    }

    public void simpleA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n / 2 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

    }

    public void styledA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n / 2) ||
                        (j == 0 && i > 0) ||
                        (i == n / 2 && j <= n / 2) ||
                        (j == n / 2 && i > 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }

    }

    public void styledD(int n){
        for(int i = 0 ;i< n ;  i++){
            for(int j = 0 ;j< n ;  j++){
                if( ((i==0 || i == n-1) && j < (n/2) || j==0 ||(i > 0 && i <n-1) && ( j == n/2)) 
                ){
                        System.out.print("*  ");
                }else{
                        System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
        
    }
}