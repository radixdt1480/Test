package TestScripts;

import java.awt.AWTException;
import java.io.IOException;

import Modules.M_Login;
import Modules.M_Recruitment;

public class RegistrationTest {
    public static void main(String[] args) throws IOException, AWTException {

        M_Login objLogin = new M_Login();
        objLogin.OrangeHRMLogin();

        M_Recruitment objRecruit = new M_Recruitment();
        objRecruit.AddCandidate();
        objRecruit.EditCandidate();
        objRecruit.ReplaceFile();
    }
}