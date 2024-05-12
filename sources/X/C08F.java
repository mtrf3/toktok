package X;

import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: X.08F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08F {
    public int LIZ = 1;
    public final C08M LIZIZ;
    public C08M LIZJ;
    public C08M LIZLLL;
    public int LJ;
    public int LJFF;
    public final boolean LJI;
    public final int[] LJII;

    public final void LIZIZ() {
        this.LIZ = 1;
        this.LIZJ = this.LIZIZ;
        this.LJFF = 0;
    }

    public final boolean LIZJ() {
        C29351Df LIZJ = this.LIZJ.LIZIZ.LIZJ();
        int LIZ = LIZJ.LIZ(6);
        if ((LIZ != 0 && LIZJ.LIZIZ.get(LIZ + LIZJ.LIZ) != 0) || this.LJ == 65039) {
            return true;
        }
        if (this.LJI) {
            if (this.LJII == null) {
                return true;
            }
            if (Arrays.binarySearch(this.LJII, this.LIZJ.LIZIZ.LIZ(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    public final int LIZ(int i) {
        C08M c08m;
        SparseArray<C08M> sparseArray = this.LIZJ.LIZ;
        if (sparseArray == null) {
            c08m = null;
        } else {
            c08m = sparseArray.get(i);
        }
        int i2 = 2;
        if (this.LIZ != 2) {
            if (c08m == null) {
                LIZIZ();
                i2 = 1;
            } else {
                this.LIZ = 2;
                this.LIZJ = c08m;
                this.LJFF = 1;
            }
        } else if (c08m != null) {
            this.LIZJ = c08m;
            this.LJFF++;
        } else {
            if (i == 65038) {
                LIZIZ();
            } else if (i != 65039) {
                C08M c08m2 = this.LIZJ;
                if (c08m2.LIZIZ != null) {
                    if (this.LJFF == 1) {
                        if (LIZJ()) {
                            this.LIZLLL = this.LIZJ;
                            LIZIZ();
                        } else {
                            LIZIZ();
                        }
                    } else {
                        this.LIZLLL = c08m2;
                        LIZIZ();
                    }
                    i2 = 3;
                } else {
                    LIZIZ();
                }
            }
            i2 = 1;
        }
        this.LJ = i;
        return i2;
    }

    public C08F(C08M c08m, boolean z, int[] iArr) {
        this.LIZIZ = c08m;
        this.LIZJ = c08m;
        this.LJI = z;
        this.LJII = iArr;
    }
}
