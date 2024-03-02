package Encription;

import java.io.Serializable;

public class Message implements Serializable {

    private String encryptedMessage;

    private String digitalSignature;


    String getEncryptedMessage() {
        return encryptedMessage;
    }

    public String getDigitalSignature() {
        return digitalSignature;
    }

    void setEncryptedMessage(String encryptedMessage) {
        this.encryptedMessage = encryptedMessage;
    }

    void setDigitalSignature(String digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    @Override
     public String toString() {
        System.out.println("***************************Ecripted Message**********************************");
        System.out.println(getEncryptedMessage());
        System.out.println("***************************Digital Signature**********************************");
        System.out.println("Private Key");
        System.out.println(getDigitalSignature());
        if(getEncryptedMessage()!=getDigitalSignature())
        {   
            System.out.println("Signature Verifying....");
            System.out.println("Signature Verified!!!");
        }
        else
        {
            System.out.println("Signature Verifying....");
            System.out.println("Signature Not Verified!!!");
        }
        return "";
    }
}
