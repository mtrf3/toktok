package X;

import java.io.UnsupportedEncodingException;

/* loaded from: classes12.dex */
public final class R22 {
    public static boolean LIZ;
    public static final byte[] LIZIZ = LIZ("RIFF");
    public static final byte[] LIZJ = LIZ("WEBP");
    public static final byte[] LIZLLL = LIZ("VP8 ");
    public static final byte[] LJ = LIZ("VP8L");
    public static final byte[] LJFF = LIZ("VP8X");

    public static byte[] LIZ(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean LIZIZ(byte[] bArr) {
        boolean z;
        boolean LIZLLL2 = LIZLLL(bArr, 12, LJFF);
        if ((bArr[20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (!LIZLLL2 || !z) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(byte[] bArr, int i) {
        if (i < 20 || !LIZLLL(bArr, 0, LIZIZ) || !LIZLLL(bArr, 8, LIZJ)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
