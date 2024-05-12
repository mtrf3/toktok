package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Hbf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44399Hbf {
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
}
