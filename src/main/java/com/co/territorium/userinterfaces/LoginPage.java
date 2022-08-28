package com.co.territorium.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target DROP_DOWN_LIST = Target.the("select type document").locatedBy("//select[@id='typeDocument']");
    public static final Target TXT_NUM_DOCUMENT = Target.the("enter document number").locatedBy("//input[@id='document']");
    public static final Target TXT_PASSWORD = Target.the("enter password").locatedBy("//input[@id='passwd']");
    public static final Target BTN_LOGIN = Target.the("click the button").locatedBy("//input[@id='ingresar']");
}
