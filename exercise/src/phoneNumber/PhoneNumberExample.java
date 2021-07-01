package phoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_REGEX = "^[(][0-9]{2}[)][-][(]0[0-9]{9}[)]$";

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
