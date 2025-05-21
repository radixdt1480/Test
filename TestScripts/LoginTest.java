package TestScripts;

import java.io.IOException;

import Modules.M_Login;

public class LoginTest {
    public static void main(String[] args) throws IOException {
        M_Login objLogin = new M_Login();
		objLogin.OrangeHRMLogin();
    }    
}