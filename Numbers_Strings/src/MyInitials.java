public class MyInitials {
    public static void main(String[] args) {
        String myName = "Mario Castillo Lopez";
        StringBuffer myInitials = new StringBuffer();

        int lenght = myName.length();

        for (int i = 0; i < lenght; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }

        System.out.println("My initials are: " + myInitials);

    }
}
