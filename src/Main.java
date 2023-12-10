public class Main {
    public static void main(String[] args) {
        try {
            Credentials.checkDetails("admin", "qwerty", "qwerty");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Аунтфикация данных не прошла!");
            e.printStackTrace();
        } finally {
            System.out.println("блок finnally отроботал успешно");
        }
    }
}