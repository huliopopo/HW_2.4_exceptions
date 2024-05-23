public class Checker {
    private static final String validateCharacters = "abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ1234567890_";

    public static void checkLoginLength(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Длина логина более 20 символов");
        }
    }

    public static void checkLoginCharacters(String login) throws WrongLoginException {
        char[] chars = login.toCharArray();
        for (char ch : chars) {
            if (!validateCharacters.contains(Character.toString(ch))) {
                throw new WrongLoginException("Логин содержит неразрешенные символы");
            }
        }
    }

    public static void checkPasswordLength(String password) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Длина пароля более 20 символов");
        }
    }

    public static void checkPasswordCharacters(String password) throws WrongPasswordException {
        char[] chars = password.toCharArray();
        for (char ch : chars) {
            if (!validateCharacters.contains(Character.toString(ch))) {
                throw new WrongPasswordException("Пароль содержит неразрешенные символы");
            }
        }
    }

    public static void checkConfirmPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }
}


