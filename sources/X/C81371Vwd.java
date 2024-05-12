package X;

import android.graphics.Bitmap;

/* renamed from: X.Vwd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81371Vwd implements WAF {
    public int LIZ = -1;
    public C81392Vwy<Bitmap> LIZIZ;

    @Override // X.WAF
    public final void LIZ(int i, C81392Vwy c81392Vwy) {
    }

    @Override // X.WAF
    public final synchronized C81392Vwy LIZIZ() {
        return C81392Vwy.LIZJ(this.LIZIZ);
    }

    @Override // X.WAF
    public final synchronized C81392Vwy LIZJ() {
        try {
        } finally {
            LJI();
        }
        return C81392Vwy.LIZJ(this.LIZIZ);
    }

    public final synchronized void LJI() {
        C81392Vwy.LJ(this.LIZIZ);
        this.LIZIZ = null;
        this.LIZ = -1;
    }

    @Override // X.WAF
    public final synchronized void clear() {
        LJI();
    }

    @Override // X.WAF
    public final synchronized boolean LIZLLL(int i) {
        boolean z;
        if (i == this.LIZ) {
            if (C81392Vwy.LJIIJJI(this.LIZIZ)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // X.WAF
    public final synchronized C81392Vwy<Bitmap> LJ(int i) {
        if (this.LIZ == i) {
            return C81392Vwy.LIZJ(this.LIZIZ);
        }
        return null;
    }

    @Override // X.WAF
    public final synchronized void LJFF(int i, C81392Vwy c81392Vwy) {
        if (c81392Vwy != null) {
            if (this.LIZIZ != null && ((Bitmap) c81392Vwy.LJI()).equals(this.LIZIZ.LJI())) {
                return;
            }
        }
        C81392Vwy.LJ(this.LIZIZ);
        this.LIZIZ = C81392Vwy.LIZJ(c81392Vwy);
        this.LIZ = i;
    }
}
