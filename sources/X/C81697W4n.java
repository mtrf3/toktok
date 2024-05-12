package X;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W4n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81697W4n<T> extends AbstractC48384Iyq<T> {
    public int LJI;
    public W4W<T> LJII;
    public W4W<T> LJIIIIZZ;
    public final /* synthetic */ C81687W4d LJIIIZ;

    @Override // X.AbstractC48384Iyq, X.W4W
    public final synchronized boolean LIZJ() {
        boolean z;
        W4W<T> LJIILL = LJIILL();
        if (LJIILL != null) {
            if (LJIILL.LIZJ()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized W4W<T> LJIILL() {
        return this.LJIIIIZZ;
    }

    public final boolean LJIJ() {
        W4W<T> w4w;
        synchronized (this) {
            w4w = null;
            if (!LJIIIIZZ() && this.LJI < this.LJIIIZ.LIZ.size()) {
                List<W4P<W4W<T>>> list = this.LJIIIZ.LIZ;
                int i = this.LJI;
                this.LJI = i + 1;
                W4P<W4W<T>> w4p = list.get(i);
                if (w4p != null) {
                    w4w = w4p.get();
                }
            }
        }
        if (LJIIZILJ(w4w)) {
            if (w4w != null) {
                w4w.LJ(new C81699W4p(this), C79561VKj.LJLIL);
                return true;
            }
            return false;
        }
        if (w4w != null) {
            w4w.close();
            return false;
        }
        return false;
    }

    @Override // X.AbstractC48384Iyq, X.W4W
    public final boolean close() {
        synchronized (this) {
            if (!super.close()) {
                return false;
            }
            W4W<T> w4w = this.LJII;
            this.LJII = null;
            W4W<T> w4w2 = this.LJIIIIZZ;
            this.LJIIIIZZ = null;
            if (w4w2 != null) {
                w4w2.close();
            }
            if (w4w != null) {
                w4w.close();
                return true;
            }
            return true;
        }
    }

    @Override // X.AbstractC48384Iyq, X.W4W
    public final synchronized T getResult() {
        T t;
        W4W<T> LJIILL = LJIILL();
        if (LJIILL != null) {
            t = LJIILL.getResult();
        } else {
            t = null;
        }
        return t;
    }

    public final W4P<W4W<T>> LJIILJJIL() {
        if (!LJIIIIZZ() && this.LJI <= this.LJIIIZ.LIZ.size()) {
            return this.LJIIIZ.LIZ.get(this.LJI - 1);
        }
        return null;
    }

    public C81697W4n(C81687W4d c81687W4d) {
        this.LJIIIZ = c81687W4d;
        if (!LJIJ()) {
            LJIIJ(new RuntimeException("No data source supplier or supplier returned null."));
        }
    }

    public final void LJIILLIIL(W4W<T> w4w) {
        synchronized (this) {
            if (!LJIIIIZZ() && w4w == this.LJII) {
                this.LJII = null;
                if (w4w != LJIILL() && w4w != null) {
                    w4w.close();
                }
                if (w4w.LJFF() instanceof OutOfMemoryError) {
                    LJIIJ(w4w.LJFF());
                }
                if (!LJIJ()) {
                    LJIIJ(w4w.LJFF());
                }
            }
        }
    }

    public final synchronized boolean LJIIZILJ(W4W<T> w4w) {
        if (LJIIIIZZ()) {
            return false;
        }
        this.LJII = w4w;
        return true;
    }
}
