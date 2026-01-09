public class Main {
    public static void main(String[] args) {

        String str = "Hello, World (Привет) 777";

        int count_lowercase  = 0;
        int count_uppercase = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (String.valueOf(ch).matches("[a-zA-Z]")){
                if (Character.isLowerCase(str.charAt(i))) {
                    count_lowercase++;
                }
                if (Character.isUpperCase(str.charAt(i))) {
                    count_uppercase++;
                }
            }
        }

        System.out.println("Дана строка - " + str);
        System.out.print("Количество строчных букв - " + count_lowercase + ", количество прописных букв - " + count_uppercase);
        System.out.println();
    }
}