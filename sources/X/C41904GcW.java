package X;

/* renamed from: X.GcW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41904GcW {
    public static int[] LIZ(int i, int i2, int i3) {
        if (i3 <= 3) {
            return null;
        }
        int i4 = i3 - 1;
        int i5 = (i2 - i) / i4;
        int[] iArr = new int[i3];
        iArr[0] = i;
        iArr[i4] = i2;
        int i6 = i3 - 2;
        int i7 = 1;
        if (1 <= i6) {
            while (true) {
                int i8 = i7 * i5;
                if (i8 > i2) {
                    i8 = i2;
                }
                iArr[i7] = i8 + i;
                if (i7 == i6) {
                    break;
                }
                i7++;
            }
        }
        return iArr;
    }
}
