package com.byted.cast.sdk.utils;

/* loaded from: classes29.dex */
public class HexDump {
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] HEX_LOWER_CASE_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] toByteArray(byte b) {
        return new byte[]{b};
    }

    public static byte[] toByteArray(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static String dumpHexString(byte[] bArr) {
        if (bArr == null) {
            return "(null)";
        }
        return dumpHexString(bArr, 0, bArr.length);
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((toByte(str.charAt(i)) << 4) | toByte(str.charAt(i + 1)));
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        if (r3 <= 'f') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int toByte(char r3) {
        /*
            r1 = 48
            if (r3 < r1) goto L1f
            r0 = 57
            if (r3 > r0) goto La
            int r3 = r3 - r1
            return r3
        La:
            r1 = 65
            if (r3 < r1) goto L1f
            r0 = 70
            if (r3 > r0) goto L16
        L12:
            int r3 = r3 - r1
            int r0 = r3 + 10
            return r0
        L16:
            r1 = 97
            if (r3 < r1) goto L1f
            r0 = 102(0x66, float:1.43E-43)
            if (r3 > r0) goto L1f
            goto L12
        L1f:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Invalid hex char '"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sdk.utils.HexDump.toByte(char):int");
    }

    public static String toHexString(byte b) {
        return toHexString(toByteArray(b));
    }

    public static String toHexString(int i) {
        return toHexString(toByteArray(i));
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length, true);
    }

    public static String toHexString(byte[] bArr, boolean z) {
        return toHexString(bArr, 0, bArr.length, z);
    }

    public static StringBuilder appendByteAsHex(StringBuilder sb, byte b, boolean z) {
        char[] cArr;
        if (z) {
            cArr = HEX_DIGITS;
        } else {
            cArr = HEX_LOWER_CASE_DIGITS;
        }
        sb.append(cArr[(b >> 4) & 15]);
        sb.append(cArr[b & 15]);
        return sb;
    }

    public static String dumpHexString(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "(null)";
        }
        StringBuilder sb = new StringBuilder("\n0x");
        byte[] bArr2 = new byte[16];
        sb.append(toHexString(i));
        int i3 = i;
        int i4 = 0;
        while (i3 < i + i2) {
            if (i4 == 16) {
                sb.append(" ");
                int i5 = 0;
                do {
                    byte b = bArr2[i5];
                    if (b > 32 && b < 126) {
                        sb.append(new String(bArr2, i5, 1));
                    } else {
                        sb.append(".");
                    }
                    i5++;
                } while (i5 < 16);
                sb.append("\n0x");
                sb.append(toHexString(i3));
                i4 = 0;
            }
            byte b2 = bArr[i3];
            sb.append(" ");
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(b2 >>> 4) & 15]);
            sb.append(cArr[b2 & 15]);
            bArr2[i4] = b2;
            i3++;
            i4++;
        }
        if (i4 != 16) {
            int i6 = ((16 - i4) * 3) + 1;
            for (int i7 = 0; i7 < i6; i7++) {
                sb.append(" ");
            }
            for (int i8 = 0; i8 < i4; i8++) {
                byte b3 = bArr2[i8];
                if (b3 > 32 && b3 < 126) {
                    sb.append(new String(bArr2, i8, 1));
                } else {
                    sb.append(".");
                }
            }
        }
        return sb.toString();
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        return toHexString(bArr, i, i2, true);
    }

    public static String toHexString(byte[] bArr, int i, int i2, boolean z) {
        char[] cArr;
        if (z) {
            cArr = HEX_DIGITS;
        } else {
            cArr = HEX_LOWER_CASE_DIGITS;
        }
        char[] cArr2 = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            byte b = bArr[i4];
            int i5 = i3 + 1;
            cArr2[i3] = cArr[(b >>> 4) & 15];
            i3 = i5 + 1;
            cArr2[i5] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
