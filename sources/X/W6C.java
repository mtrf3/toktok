package X;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* loaded from: classes15.dex */
public final class W6C implements WAF {
    public static final Class<?> LJFF = W6C.class;
    public final W6D LIZ;
    public final boolean LIZIZ;
    public C81392Vwy<W5A> LIZLLL;
    public int LJ = -1;
    public final SparseArray<C81392Vwy<W5A>> LIZJ = new SparseArray<>();

    @Override // X.WAF
    public final synchronized C81392Vwy LIZIZ() {
        return LJI(C81392Vwy.LIZJ(this.LIZLLL));
    }

    @Override // X.WAF
    public final synchronized C81392Vwy LIZJ() {
        if (!this.LIZIZ) {
            return null;
        }
        return LJI(this.LIZ.LIZJ());
    }

    @Override // X.WAF
    public final synchronized void clear() {
        C81392Vwy.LJ(this.LIZLLL);
        this.LIZ.LIZ(this.LJ);
        this.LIZLLL = null;
        this.LJ = -1;
        for (int i = 0; i < this.LIZJ.size(); i++) {
            C81392Vwy<W5A> valueAt = this.LIZJ.valueAt(i);
            if (valueAt != null) {
                C81392Vwy.LJ(valueAt);
                this.LIZ.LIZ(this.LIZJ.keyAt(i));
            }
        }
        this.LIZJ.clear();
    }

    public static C81392Vwy<Bitmap> LJI(C81392Vwy<W5A> c81392Vwy) {
        W5C w5c;
        try {
            if (C81392Vwy.LJIIJJI(c81392Vwy) && (c81392Vwy.LJI() instanceof W5C) && (w5c = (W5C) c81392Vwy.LJI()) != null) {
                return w5c.cloneUnderlyingBitmapReference();
            }
            C81392Vwy.LJ(c81392Vwy);
            return null;
        } finally {
            C81392Vwy.LJ(c81392Vwy);
        }
    }

    @Override // X.WAF
    public final synchronized boolean LIZLLL(int i) {
        boolean z;
        if (!this.LIZ.LIZIZ(i)) {
            if (this.LIZJ.get(i) == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // X.WAF
    public final synchronized C81392Vwy<Bitmap> LJ(int i) {
        if (this.LIZ.LIZIZ(i)) {
            W6D w6d = this.LIZ;
            return LJI(w6d.LIZIZ.LJFF(new C81723W5n(w6d.LIZ, i)));
        }
        return LJI(C81392Vwy.LIZJ(this.LIZJ.get(i)));
    }

    public final synchronized void LJII(int i) {
        C81392Vwy<W5A> c81392Vwy = this.LIZJ.get(i);
        if (c81392Vwy != null) {
            this.LIZJ.delete(i);
            C81392Vwy.LJ(c81392Vwy);
            W58.LJIIL(LJFF, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.LIZJ);
        }
    }

    public W6C(W6D w6d, boolean z) {
        this.LIZ = w6d;
        this.LIZIZ = z;
    }

    @Override // X.WAF
    public final synchronized void LIZ(int i, C81392Vwy c81392Vwy) {
        C81392Vwy c81392Vwy2;
        c81392Vwy.getClass();
        try {
            c81392Vwy2 = C81392Vwy.LJIIL(new W5C(c81392Vwy, W8A.LIZLLL, 0));
            if (c81392Vwy2 == null) {
                C81392Vwy.LJ(c81392Vwy2);
                return;
            }
            try {
                W6D w6d = this.LIZ;
                C81392Vwy<W5A> LJI = w6d.LIZIZ.LJI(new C81723W5n(w6d.LIZ, i), c81392Vwy2, w6d.LIZJ);
                if (C81392Vwy.LJIIJJI(LJI)) {
                    C81392Vwy.LJ(this.LIZJ.get(i));
                } else {
                    LJI = c81392Vwy2.clone();
                    C81392Vwy.LJ(this.LIZJ.get(i));
                }
                this.LIZJ.put(i, LJI);
                W58.LJIIL(LJFF, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.LIZJ);
                C81392Vwy.LJ(c81392Vwy2);
            } catch (Throwable th) {
                th = th;
                C81392Vwy.LJ(c81392Vwy2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c81392Vwy2 = null;
        }
    }

    @Override // X.WAF
    public final synchronized void LJFF(int i, C81392Vwy c81392Vwy) {
        C81392Vwy c81392Vwy2;
        c81392Vwy.getClass();
        LJII(i);
        try {
            c81392Vwy2 = C81392Vwy.LJIIL(new W5C(c81392Vwy, W8A.LIZLLL, 0));
            if (c81392Vwy2 != null) {
                try {
                    C81392Vwy.LJ(this.LIZLLL);
                    W6D w6d = this.LIZ;
                    this.LIZLLL = w6d.LIZIZ.LJI(new C81723W5n(w6d.LIZ, i), c81392Vwy2, w6d.LIZJ);
                    this.LJ = i;
                } catch (Throwable th) {
                    th = th;
                    C81392Vwy.LJ(c81392Vwy2);
                    throw th;
                }
            }
            C81392Vwy.LJ(c81392Vwy2);
        } catch (Throwable th2) {
            th = th2;
            c81392Vwy2 = null;
        }
    }
}
