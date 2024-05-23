public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "admin";
        String password = "password_1";
        String confirmPassword = "password_1";
        Authentication.validation(login, password, confirmPassword);

    }
}

