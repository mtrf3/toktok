package X;

/* renamed from: X.PWd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64579PWd {
    public int LIZ;
    public final int[] LIZIZ = new int[10];

    public final int LIZ() {
        if ((this.LIZ & 128) != 0) {
            return this.LIZIZ[7];
        }
        return 65535;
    }

    public final void LIZIZ(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.LIZIZ;
            if (i >= iArr.length) {
                return;
            }
            this.LIZ = (1 << i) | this.LIZ;
            iArr[i] = i2;
        }
    }
}
