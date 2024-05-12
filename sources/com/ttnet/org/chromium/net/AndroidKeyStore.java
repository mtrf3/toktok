package com.ttnet.org.chromium.net;

import X.C25620zW;
import X.C78939UyV;
import X.X1D;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes7.dex */
public class AndroidKeyStore {
    public static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    public static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception while checking support for ");
            LIZ.append(str);
            LIZ.append(": ");
            LIZ.append(e);
            C78939UyV.LJII(X1D.LIZIZ(LIZ), new Object[0]);
            return false;
        }
    }

    public static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception while checking support for ");
            LIZ.append(str);
            LIZ.append(": ");
            LIZ.append(e);
            C78939UyV.LJII(X1D.LIZIZ(LIZ), new Object[0]);
            return false;
        }
    }

    public static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("Exception while encrypting input with ", str, " and ");
                LIZIZ.append(privateKey.getAlgorithm());
                LIZIZ.append(" private key (");
                LIZIZ.append(privateKey.getClass().getName());
                LIZIZ.append("): ");
                LIZIZ.append(e);
                C78939UyV.LJII(X1D.LIZIZ(LIZIZ), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cipher ");
            LIZ.append(str);
            LIZ.append(" not supported: ");
            LIZ.append(e2);
            C78939UyV.LJII(X1D.LIZIZ(LIZ), new Object[0]);
            return null;
        }
    }

    public static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e) {
                StringBuilder LIZIZ = C25620zW.LIZIZ("Exception while signing message with ", str, " and ");
                LIZIZ.append(privateKey.getAlgorithm());
                LIZIZ.append(" private key (");
                LIZIZ.append(privateKey.getClass().getName());
                LIZIZ.append("): ");
                LIZIZ.append(e);
                C78939UyV.LJII(X1D.LIZIZ(LIZIZ), new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Signature algorithm ");
            LIZ.append(str);
            LIZ.append(" not supported: ");
            LIZ.append(e2);
            C78939UyV.LJII(X1D.LIZIZ(LIZ), new Object[0]);
            return null;
        }
    }
}
