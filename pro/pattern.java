 class pattern {
    public static void main(String[] args) {
        int rows = 5; // Change this to increase or decrease triangle height

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print dots with space
            for (int k = 1; k <= i; k++) {
                System.out.print(". ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
