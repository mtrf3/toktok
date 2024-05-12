package X;

import java.lang.reflect.Array;

/* renamed from: X.Uzt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79025Uzt {
    public final V01[] LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final V01 LIZ() {
        return this.LIZ[this.LIZIZ];
    }

    public C79025Uzt(int i, int i2) {
        V01[] v01Arr = new V01[i];
        this.LIZ = v01Arr;
        int length = v01Arr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.LIZ[i3] = new V01(C0EH.LIZ(i2, 4, 17, 1));
        }
        this.LIZLLL = i2 * 17;
        this.LIZJ = i;
        this.LIZIZ = -1;
    }

    public final byte[][] LIZIZ(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.LIZJ * i2, this.LIZLLL * i);
        int i3 = this.LIZJ * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            V01 v01 = this.LIZ[i4 / i2];
            int length = v01.LIZ.length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = v01.LIZ[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }
}
