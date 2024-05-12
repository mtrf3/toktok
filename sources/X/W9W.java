package X;

import android.util.SparseIntArray;

/* loaded from: classes15.dex */
public final class W9W {
    public final int LIZ;
    public final int LIZIZ;
    public final SparseIntArray LIZJ;
    public final int LIZLLL;

    public W9W(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, -1);
    }

    public W9W(int i, int i2, SparseIntArray sparseIntArray, int i3) {
        boolean z;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        this.LIZIZ = i;
        this.LIZ = i2;
        this.LIZJ = sparseIntArray;
        this.LIZLLL = i3;
    }
}
