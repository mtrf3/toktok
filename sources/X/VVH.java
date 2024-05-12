package X;

import Y.IDrS52S0100000_14;

/* loaded from: classes15.dex */
public final class VVH {
    public static final /* synthetic */ int LJ = 0;
    public int LIZIZ;
    public VVB LIZJ;
    public int LIZ = -1;
    public final IDrS52S0100000_14 LIZLLL = new IDrS52S0100000_14(this, 8);

    public final void LIZ(int i, int i2) {
        if (i2 - i >= 0) {
            int i3 = this.LIZ;
            if (i3 == -1) {
                this.LIZ = i;
                this.LIZIZ = i2;
                while (i < i2 + 1) {
                    i++;
                }
                return;
            }
            if (i != i3) {
                if (i > i3) {
                    while (i3 < i) {
                        i3++;
                    }
                } else {
                    for (int i4 = i; i4 < i3; i4++) {
                    }
                }
                this.LIZ = i;
            }
            int i5 = this.LIZIZ;
            if (i2 != i5) {
                if (i2 > i5) {
                    while (i5 < i2) {
                        i5++;
                    }
                } else {
                    for (int i6 = i2; i6 < i5; i6++) {
                    }
                }
                this.LIZIZ = i2;
            }
        }
    }
}
