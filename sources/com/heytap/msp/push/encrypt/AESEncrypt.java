package com.heytap.msp.push.encrypt;

import X.X1D;
import com.heytap.mcssdk.utils.d;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes28.dex */
public class AESEncrypt {
    public static String decrypt(String str, String str2) {
        String[] split = str2.split("%IV1%");
        byte[] b = a.b(split[0]);
        byte[] b2 = a.b(split[1]);
        SecretKeySpec secretKeySpec = new SecretKeySpec(a.b(str), "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(b2));
        return new String(cipher.doFinal(b));
    }

    public static String encrypt(String str) {
        try {
            return encrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", str);
        } catch (Exception e) {
            d.b(e.getLocalizedMessage());
            return "";
        }
    }

    public static String encrypt(String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(a.b(str), "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(1, secretKeySpec);
        String d = a.d(cipher.getIV());
        String d2 = a.d(cipher.doFinal(str2.getBytes()));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(d2);
        LIZ.append("%IV1%");
        LIZ.append(d);
        return X1D.LIZIZ(LIZ);
    }

    public static String genKey() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return a.d(keyGenerator.generateKey().getEncoded());
    }
}
