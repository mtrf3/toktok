package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.o;

/* renamed from: X.Iup, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48135Iup {
    public static final C48135Iup LIZ = new C48135Iup();
    public static final char[] LIZIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String LIZ(String value) {
        MessageDigest messageDigest;
        byte[] digest;
        boolean z;
        o.LJIIIZ(value, "value");
        try {
            messageDigest = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return "";
        }
        byte[] bytes = value.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        synchronized (C48135Iup.class) {
            digest = messageDigest.digest(bytes);
            o.LJIIIIZZ(digest, "md.digest(bytes)");
        }
        if (digest.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
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
