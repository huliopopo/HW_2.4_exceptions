public class Authentication {

    public static void validation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        Checker.checkLoginLength(login);
        Checker.checkLoginCharacters(login);

        Checker.checkPasswordLength(password);
        Checker.checkPasswordCharacters(password);
        Checker.checkConfirmPassword(password, confirmPassword);

    }
}


