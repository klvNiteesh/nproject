class reverse {
    public static void main(String[] args) {
        String original = "hello";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
