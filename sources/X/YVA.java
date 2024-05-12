package X;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: classes16.dex */
public abstract class YVA {
    public static final YV9 LIZ;

    public abstract void LIZ(Appendable appendable, byte[] bArr, int i);

    static {
        new YVD("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new YVD("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new YVB("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new YVB("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        LIZ = new YV9();
    }

    public final String LIZIZ(byte[] bArr, int i) {
        C47265Ign.LIZJ(0, i, bArr.length);
        YVC yvc = ((YVB) this).LIZIZ;
        StringBuilder sb = new StringBuilder(YVE.LIZ(i, yvc.LJFF, RoundingMode.CEILING) * yvc.LJ);
        try {
            LIZ(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
