public class ContinueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickeld peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i=0; i < max; i++) {
            // searching for p' only
            if (searchMe.charAt(i) != 'p')
                continue;
            numPs++;
        }
        System.out.println("Found " + numPs + " p' in the string.");

    }
}
