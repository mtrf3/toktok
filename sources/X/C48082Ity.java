package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Ity, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48082Ity {
    public static final MessageDigest LIZ;
    public static final char[] LIZIZ;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        LIZ = messageDigest;
        LIZIZ = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static String LIZ(String str) {
        byte[] digest;
        MessageDigest messageDigest = LIZ;
        if (messageDigest == null) {
            return "";
        }
        byte[] bytes = str.getBytes(C48100IuG.LIZIZ);
        synchronized (C48082Ity.class) {
            digest = messageDigest.digest(bytes);
        }
        if (digest == null || digest.length == 0) {
            return null;
        }
        char[] cArr = new char[digest.length << 1];
        int i = 0;
        for (byte b : digest) {
            int i2 = i + 1;
            char[] cArr2 = LIZIZ;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
