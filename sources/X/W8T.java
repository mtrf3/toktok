package X;

import android.util.SparseArray;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class W8T<T> {
    public final SparseArray<W8U<T>> LIZ = new SparseArray<>();
    public W8U<T> LIZIZ;
    public W8U<T> LIZJ;

    public final synchronized void LIZ(W8U<T> w8u) {
        W8U w8u2 = (W8U<T>) w8u.LIZ;
        W8U w8u3 = (W8U<T>) w8u.LIZLLL;
        if (w8u2 != null) {
            w8u2.LIZLLL = w8u3;
        }
        if (w8u3 != null) {
            w8u3.LIZ = w8u2;
        }
        w8u.LIZ = null;
        w8u.LIZLLL = null;
        if (w8u == this.LIZIZ) {
            this.LIZIZ = w8u3;
        }
        if (w8u == this.LIZJ) {
            this.LIZJ = w8u2;
        }
    }

    public final synchronized void LIZIZ(int i, T t) {
        W8U<T> w8u = this.LIZ.get(i);
        if (w8u == null) {
            w8u = (W8U<T>) new W8U(i, new LinkedList());
            this.LIZ.put(i, w8u);
        }
        w8u.LIZJ.addLast(t);
        if (this.LIZIZ != w8u) {
            LIZ(w8u);
            W8U<T> w8u2 = this.LIZIZ;
            if (w8u2 == 0) {
                this.LIZIZ = (W8U<T>) w8u;
                this.LIZJ = (W8U<T>) w8u;
            } else {
                w8u.LIZLLL = w8u2;
                w8u2.LIZ = (W8U<I>) w8u;
                this.LIZIZ = (W8U<T>) w8u;
            }
        }
    }
}
