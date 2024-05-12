package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class cu {
    public static void AFInAppEventType(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        int[][] iArr = cn.AFInAppEventType.values;
        int[] iArr2 = iArr[0];
        return ((iArr2[i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    public static int[] values(char[] cArr, int[] iArr, boolean z) {
        int values;
        int i = (cArr[0] << 16) + cArr[1];
        int i2 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            AFInAppEventType(iArr);
        }
        int i3 = 0;
        do {
            int i4 = i ^ iArr[i3];
            values = i2 ^ values(i4);
            i3++;
            i2 = i4;
            i = values;
        } while (i3 < 16);
        int i5 = values ^ iArr[16];
        int i6 = iArr[17] ^ i2;
        int[] iArr2 = {i6, i5};
        cArr[0] = (char) (i6 >>> 16);
        cArr[1] = (char) i6;
        cArr[2] = (char) (i5 >>> 16);
        cArr[3] = (char) i5;
        if (!z) {
            AFInAppEventType(iArr);
        }
        return iArr2;
    }
}
