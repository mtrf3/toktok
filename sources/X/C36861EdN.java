package X;

import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EdN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36861EdN {
    public static final int[] LIZ = new int[103];

    static {
        int i = 48;
        do {
            LIZ[i] = i - 48;
            i++;
        } while (i <= 57);
        int i2 = 65;
        do {
            LIZ[i2] = (i2 - 65) + 10;
            i2++;
        } while (i2 <= 70);
        int i3 = 97;
        do {
            LIZ[i3] = (i3 - 97) + 10;
            i3++;
        } while (i3 <= 102);
    }

    public static byte[] LIZ(String str) {
        Locale locale;
        String LIZJ;
        if (str == null || (LIZJ = OKG.LIZJ((locale = Locale.ROOT), "ROOT", str, locale, "this as java.lang.String).toUpperCase(locale)")) == null || o.LJ(LIZJ, "")) {
            return null;
        }
        int length = LIZJ.length() / 2;
        char[] charArray = LIZJ.toCharArray();
        o.LJIIIIZZ(charArray, "this as java.lang.String).toCharArray()");
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((byte) s.LJJLIIIJJIZ("0123456789ABCDEF", charArray[i2 + 1], 0, false, 6)) | (((byte) s.LJJLIIIJJIZ("0123456789ABCDEF", charArray[i2], 0, false, 6)) << 4));
        }
        return bArr;
    }
}
