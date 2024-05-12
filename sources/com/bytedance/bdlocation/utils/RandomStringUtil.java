package com.bytedance.bdlocation.utils;

import java.util.Random;

/* loaded from: classes7.dex */
public class RandomStringUtil {
    public static final Random RANDOM = new Random();

    public RandomStringUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String random(int i) {
        return random(i, false, false);
    }

    public static String randomAlphabetic(int i) {
        return random(i, true, false);
    }

    public static String randomAlphanumeric(int i) {
        return random(i, true, true);
    }

    public static String randomAscii(int i) {
        return random(i, 32, 127, false, false);
    }

    public static String randomGraph(int i) {
        return random(i, 33, 126, false, false);
    }

    public static String randomNumeric(int i) {
        return random(i, false, true);
    }

    public static String randomPrint(int i) {
        return random(i, 32, 126, false, false);
    }

    public static int nextInt(int i, int i2) {
        if (i2 >= i) {
            if (i >= 0) {
                if (i == i2) {
                    return i;
                }
                return RANDOM.nextInt(i2 - i) + i;
            }
            throw new IllegalArgumentException("Both range values must be non-negative.");
        }
        throw new IllegalArgumentException("Start value must be smaller or equal to end value.");
    }

    public static String random(int i, char... cArr) {
        if (cArr == null) {
            return random(i, 0, 0, false, false, null, RANDOM);
        }
        return random(i, 0, cArr.length, false, false, cArr, RANDOM);
    }

    public static String randomAlphabetic(int i, int i2) {
        return randomAlphabetic(nextInt(i, i2));
    }

    public static String randomAlphanumeric(int i, int i2) {
        return randomAlphanumeric(nextInt(i, i2));
    }

    public static String randomAscii(int i, int i2) {
        return randomAscii(nextInt(i, i2));
    }

    public static String randomGraph(int i, int i2) {
        return randomGraph(nextInt(i, i2));
    }

    public static String randomNumeric(int i, int i2) {
        return randomNumeric(nextInt(i, i2));
    }

    public static String randomPrint(int i, int i2) {
        return randomPrint(nextInt(i, i2));
    }

    public static String random(int i, String str) {
        if (str == null) {
            return random(i, 0, 0, false, false, null, RANDOM);
        }
        return random(i, str.toCharArray());
    }

    public static String random(int i, boolean z, boolean z2) {
        return random(i, 0, 0, z, z2);
    }

    public static String random(int i, int i2, int i3, boolean z, boolean z2) {
        return random(i, i2, i3, z, z2, null, RANDOM);
    }

    public static String random(int i, int i2, int i3, boolean z, boolean z2, char... cArr) {
        return random(i, i2, i3, z, z2, cArr, RANDOM);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0078, code lost:
    
        if (r11 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String random(int r6, int r7, int r8, boolean r9, boolean r10, char[] r11, java.util.Random r12) {
        /*
            if (r6 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            if (r6 < 0) goto Lb6
            if (r11 == 0) goto Lc
            int r0 = r11.length
            if (r0 == 0) goto Lae
        Lc:
            java.lang.String r5 = "Parameter end ("
            if (r7 != 0) goto L76
            if (r8 != 0) goto L76
            if (r11 == 0) goto L69
            int r8 = r11.length
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            int r8 = r8 - r7
        L1b:
            int r4 = r6 + (-1)
            if (r6 == 0) goto L87
            if (r11 != 0) goto L61
            int r3 = r12.nextInt(r8)
            int r3 = r3 + r7
            int r1 = java.lang.Character.getType(r3)
            if (r1 == 0) goto L3d
            r0 = 18
            if (r1 == r0) goto L3d
            r0 = 19
            if (r1 == r0) goto L3d
        L34:
            int r1 = java.lang.Character.charCount(r3)
            if (r4 != 0) goto L40
            r0 = 1
            if (r1 <= r0) goto L40
        L3d:
            int r6 = r4 + 1
            goto L1b
        L40:
            if (r9 == 0) goto L48
            boolean r0 = java.lang.Character.isLetter(r3)
            if (r0 != 0) goto L54
        L48:
            if (r10 == 0) goto L50
            boolean r0 = java.lang.Character.isDigit(r3)
            if (r0 != 0) goto L54
        L50:
            if (r9 != 0) goto L5e
            if (r10 != 0) goto L5e
        L54:
            r2.appendCodePoint(r3)
            r0 = 2
            if (r1 != r0) goto L5c
            int r4 = r4 + (-1)
        L5c:
            r6 = r4
            goto L1b
        L5e:
            int r4 = r4 + 1
            goto L5c
        L61:
            int r0 = r12.nextInt(r8)
            int r0 = r0 + r7
            char r3 = r11[r0]
            goto L34
        L69:
            if (r9 != 0) goto L71
            if (r10 != 0) goto L71
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            goto L15
        L71:
            r8 = 123(0x7b, float:1.72E-43)
            r7 = 32
            goto L7a
        L76:
            if (r8 <= r7) goto La0
            if (r11 != 0) goto L15
        L7a:
            r4 = 65
            r3 = 48
            if (r10 == 0) goto L82
            if (r8 <= r3) goto L8c
        L82:
            if (r9 == 0) goto L15
            if (r8 <= r4) goto L8c
            goto L15
        L87:
            java.lang.String r0 = r2.toString()
            return r0
        L8c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = ") must be greater then ("
            java.lang.String r0 = ") for generating digits or greater then ("
            java.lang.StringBuilder r1 = X.C06460Ne.LIZJ(r5, r8, r1, r3, r0)
            java.lang.String r0 = ") for generating letters."
            java.lang.String r0 = X.C08380Uo.LIZ(r1, r4, r0, r1)
            r2.<init>(r0)
            throw r2
        La0:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = ") must be greater than start ("
            java.lang.String r0 = ")"
            java.lang.String r0 = X.C48690J9a.LJIIJJI(r5, r8, r1, r7, r0)
            r2.<init>(r0)
            throw r2
        Lae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The chars array must not be empty"
            r1.<init>(r0)
            throw r1
        Lb6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requested random string length "
            java.lang.String r0 = " is less than 0."
            java.lang.String r0 = X.C0NY.LIZIZ(r1, r6, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdlocation.utils.RandomStringUtil.random(int, int, int, boolean, boolean, char[], java.util.Random):java.lang.String");
    }
}
