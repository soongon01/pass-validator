package kr.co.kosta.passvalidator;

import kr.co.kosta.passvalidator.service.Validator;
import static kr.co.kosta.passvalidator.util.PasswordComplexityContants.*;

public class PassValidatorMain {
	
	public static void main(String[] args) {
		
		String passwd = "123445675%";
		
		Validator validator = new Validator();
		
		int validCode = validator.passwordValidate(passwd);
		
		switch (validCode) {
			case TYPE_VERY_WEAK:
				System.out.println("매우약함");
				break;
			case TYPE_WEAK:
				System.out.println("약함");
				break;
			case TYPE_STRONG:
				System.out.println("강함");
				break;
			case TYPE_VERY_STRONG:
				System.out.println("매우강함");
				break;
			default:
		}
		
	}
	
	

}
