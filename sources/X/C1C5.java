package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: X.1C5, reason: invalid class name */
/* loaded from: classes.dex */
public class C1C5 implements C0B9 {
    public final SparseArray<C0AQ> LIZ = new SparseArray<>();
    public int LIZIZ = 0;

    @Override // X.C0B9
    public final C0AQ LIZ(int i) {
        C0AQ c0aq = this.LIZ.get(i);
        if (c0aq != null) {
            return c0aq;
        }
        throw new IllegalArgumentException(KMP.LJ("Cannot find the wrapper for global view type ", i));
    }

    @Override // X.C0B9
    public final C0B8 LIZIZ(final C0AQ c0aq) {
        return new C0B8(c0aq) { // from class: X.1C4
            public final SparseIntArray LIZ = new SparseIntArray(1);
            public final SparseIntArray LIZIZ = new SparseIntArray(1);
            public final C0AQ LIZJ;

            @Override // X.C0B8
            public final void dispose() {
                C1C5 c1c5 = C1C5.this;
                C0AQ c0aq2 = this.LIZJ;
                int size = c1c5.LIZ.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (c1c5.LIZ.valueAt(size) == c0aq2) {
                            c1c5.LIZ.removeAt(size);
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // X.C0B8
            public final int LIZ(int i) {
                int indexOfKey = this.LIZ.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.LIZ.valueAt(indexOfKey);
                }
                C1C5 c1c5 = C1C5.this;
                C0AQ c0aq2 = this.LIZJ;
                int i2 = c1c5.LIZIZ;
                c1c5.LIZIZ = i2 + 1;
                c1c5.LIZ.put(i2, c0aq2);
                this.LIZ.put(i, i2);
                this.LIZIZ.put(i2, i);
                return i2;
            }

            @Override // X.C0B8
            public final int LIZIZ(int i) {
                int indexOfKey = this.LIZIZ.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.LIZIZ.valueAt(indexOfKey);
                }
                StringBuilder LJ = C7MY.LJ("requested global type ", i, " does not belong to the adapter:");
                LJ.append(this.LIZJ.LIZJ);
                throw new IllegalStateException(X1D.LIZIZ(LJ));
            }

            {
                this.LIZJ = c0aq;
            }
        };
    }
}
