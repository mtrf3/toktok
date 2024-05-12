package X;

import java.util.TimeZone;

/* renamed from: X.OJq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61706OJq {
    public static final TimeZone LIZ = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01bd, IndexOutOfBoundsException -> 0x01bf, NumberFormatException -> 0x01c1, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01bd, blocks: (B:2:0x0000, B:4:0x0012, B:5:0x0014, B:7:0x0020, B:8:0x0022, B:10:0x0031, B:12:0x0037, B:17:0x004c, B:19:0x005c, B:20:0x005e, B:22:0x006a, B:23:0x006c, B:25:0x0072, B:29:0x007c, B:34:0x008c, B:36:0x0094, B:37:0x0098, B:39:0x009e, B:43:0x00ab, B:46:0x00b2, B:50:0x00cf, B:52:0x00d5, B:54:0x00dc, B:55:0x00e0, B:60:0x0178, B:61:0x0192, B:62:0x0117, B:64:0x0121, B:66:0x012e, B:68:0x014a, B:70:0x0168, B:73:0x0193, B:74:0x01b4, B:75:0x0136, B:76:0x0139, B:77:0x01b5, B:78:0x01bc, B:79:0x00c2, B:80:0x00c5, B:83:0x00ae), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5 A[Catch: IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01bd, IndexOutOfBoundsException -> 0x01bf, NumberFormatException -> 0x01c1, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01bd, blocks: (B:2:0x0000, B:4:0x0012, B:5:0x0014, B:7:0x0020, B:8:0x0022, B:10:0x0031, B:12:0x0037, B:17:0x004c, B:19:0x005c, B:20:0x005e, B:22:0x006a, B:23:0x006c, B:25:0x0072, B:29:0x007c, B:34:0x008c, B:36:0x0094, B:37:0x0098, B:39:0x009e, B:43:0x00ab, B:46:0x00b2, B:50:0x00cf, B:52:0x00d5, B:54:0x00dc, B:55:0x00e0, B:60:0x0178, B:61:0x0192, B:62:0x0117, B:64:0x0121, B:66:0x012e, B:68:0x014a, B:70:0x0168, B:73:0x0193, B:74:0x01b4, B:75:0x0136, B:76:0x0139, B:77:0x01b5, B:78:0x01bc, B:79:0x00c2, B:80:0x00c5, B:83:0x00ae), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date LIZIZ(java.lang.String r14, java.text.ParsePosition r15) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61706OJq.LIZIZ(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean LIZ(char c, int i, String str) {
        if (i < str.length() && str.charAt(i) == c) {
            return true;
        }
        return false;
    }

    public static int LIZJ(int i, int i2, String str) {
        int i3;
        int i4;
        if (i >= 0 && i2 <= str.length() && i <= i2) {
            if (i < i2) {
                i4 = i + 1;
                int digit = Character.digit(str.charAt(i), 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Invalid number: ");
                    LIZ2.append(str.substring(i, i2));
                    throw new NumberFormatException(X1D.LIZIZ(LIZ2));
                }
            } else {
                i3 = 0;
                i4 = i;
            }
            while (i4 < i2) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(str.charAt(i4), 10);
                if (digit2 >= 0) {
                    i3 = (i3 * 10) - digit2;
                    i4 = i5;
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Invalid number: ");
                    LIZ3.append(str.substring(i, i2));
                    throw new NumberFormatException(X1D.LIZIZ(LIZ3));
                }
            }
            return -i3;
        }
        throw new NumberFormatException(str);
    }
}
