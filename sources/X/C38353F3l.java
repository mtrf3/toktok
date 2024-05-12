package X;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.o;

/* renamed from: X.F3l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38353F3l {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LIZ(String str) {
        boolean z;
        try {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                o.LJFF(forName, "Charset.forName(charsetName)");
                byte[] bytes = str.getBytes(forName);
                o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes);
                return LIZIZ(messageDigest.digest());
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String LIZIZ(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LIZ;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
