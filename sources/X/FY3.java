package X;

import defpackage.b0;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class FY3 {
    public volatile boolean LIZ;
    public final FY7[] LIZIZ;
    public int LIZJ;

    public FY3() {
        FY7[] fy7Arr = new FY7[5];
        this.LIZIZ = fy7Arr;
        for (int length = fy7Arr.length - 1; length >= 0; length--) {
            this.LIZIZ[length] = new FY7();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BigJankPool{isUse=");
        LIZ.append(this.LIZ);
        LIZ.append(", bigJankInfos=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(", index=");
        return b0.LIZJ(LIZ, this.LIZJ, '}', LIZ);
    }
}
