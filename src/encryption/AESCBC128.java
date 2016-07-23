package encryption;



import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class AESCBC128 {
	

	    public static String encrypt(String key, String initVector, String value) {
	        try {
	            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
	            
	            /*KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	            keyGenerator.init(128);
	            SecretKey skeySpec = keyGenerator.generateKey();*/
	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

	            byte[] encrypted = cipher.doFinal(value.getBytes());
	            /*System.out.println("encrypted string: "
	                    + Base64.encodeBase64String(encrypted));*/

	            return Base64.encodeBase64String(encrypted);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return null;
	    }

	    public static String decrypt(String key, String initVector, String encrypted) {
	        try {
	            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
	            /*KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
	            keyGenerator.init(128);
	            SecretKey skeySpec = keyGenerator.generateKey();*/

	            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

	            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

	            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

	            return new String(original);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        return null;
	    }

	    public static void main(String[] args) {
	        String key = "Bar12345Bar12357"; // 128 bit key
	        String initVector = "RandomInitVector"; // 16 bytes IV

	        //System.out.println(decrypt(key, initVector,
	                //encrypt(key, initVector, "Hello World")));
	        String encrypted = encrypt(key, initVector, "Kartik Jajal");
	        System.out.println("Encrypt : "+encrypted);
	        
	        String decrypted = decrypt(key, initVector, encrypted);
	        System.out.println("Decrypt : "+ decrypted);
	        
	    }


}