package X;

import android.util.SparseArray;

/* renamed from: X.08M, reason: invalid class name */
/* loaded from: classes.dex */
public class C08M {
    public final SparseArray<C08M> LIZ;
    public C08E LIZIZ;

    public C08M() {
        this(1);
    }

    public C08M(int i) {
        this.LIZ = new SparseArray<>(i);
    }

    public final void LIZ(C08E c08e, int i, int i2) {
        C08M c08m;
        int LIZ = c08e.LIZ(i);
        SparseArray<C08M> sparseArray = this.LIZ;
        if (sparseArray == null || (c08m = sparseArray.get(LIZ)) == null) {
            c08m = new C08M();
            this.LIZ.put(c08e.LIZ(i), c08m);
        }
        if (i2 > i) {
            c08m.LIZ(c08e, i + 1, i2);
        } else {
            c08m.LIZIZ = c08e;
        }
    }
}
