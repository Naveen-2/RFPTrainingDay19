package com;

/**
 * RegexConstants - class created to store all regex constants
 * which can be used in any classes
 */
public class RegexConstants {

    /*
    Starting letter of first name should be capital letter, so ^[A-Z] is used
    to fetch only one capital letter between A-Z.
    Remaining letters of the name needs to be in small so [a-z] is used.
    As the minimum number of characters need to be 3, {2,} quantifier is used to verify that
    at least 2 letters from [a-z]. It's blank after comma(,) as it's not mentioned with
    maximum character length for first name.
     */
    public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";

    /*
    Starting letter of last name should be capital letter, so ^[A-Z] is used
    to fetch only one capital letter between A-Z.
    Remaining letters of the name needs to be in small so [a-z] is used.
    As the minimum number of characters need to be 3, {2,} quantifier is used to verify that
    at least 2 letters from [a-z]. It's blank after comma(,) as it's not mentioned with
    maximum character length for last name.
     */
    public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";

    /*
    An email can start with any alphanumeric character or few special characters so
    ^[a-zA-Z0-9_+&*-]+ is used. The '+' sign denotes the letters need to present one or more times.
    The next part (?:pattern) can be entered or not entered. It's for zero or more times \\. is used to
    escape '.' in the pattern.
    After that '@' symbol is mandatory in an email which is directly entered. Then for a domain name with .
    (?:[a-zA-Z0-9-]+\\.) is used at least one time
    At the end, domain extension need to be 2 to 4 letters so [a-zA-Z]{2,7}$ is used.
     */
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,4}$";

}
