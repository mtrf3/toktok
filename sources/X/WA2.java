package X;

import android.graphics.Bitmap;

/* loaded from: classes15.dex */
public class WA2 implements Runnable {
    public final WAF LJLIL;
    public final WAA LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final /* synthetic */ WA3 LJLJJL;

    public final void LIZ() {
        try {
            if (this.LJLIL.LIZLLL(this.LJLJI)) {
                W58.LJIIJJI(WA3.LJFF, "Frame %d is cached already.", Integer.valueOf(this.LJLJI));
                synchronized (this.LJLJJL.LJ) {
                    this.LJLJJL.LJ.remove(this.LJLJJI);
                }
                return;
            }
            if (LIZIZ(this.LJLJI, 1)) {
                W58.LJIIJJI(WA3.LJFF, "Prepared frame frame %d.", Integer.valueOf(this.LJLJI));
            } else {
                W58.LJFF(WA3.LJFF, "Could not prepare frame %d.", Integer.valueOf(this.LJLJI));
            }
            synchronized (this.LJLJJL.LJ) {
                this.LJLJJL.LJ.remove(this.LJLJJI);
            }
        } catch (Throwable th) {
            synchronized (this.LJLJJL.LJ) {
                this.LJLJJL.LJ.remove(this.LJLJJI);
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final boolean LIZIZ(int i, int i2) {
        int i3 = 2;
        C81392Vwy c81392Vwy = null;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return false;
                }
                try {
                    c81392Vwy = this.LJLJJL.LIZ.LJ(this.LJLILLLLZI.LIZLLL(), this.LJLILLLLZI.LJFF(), this.LJLJJL.LIZJ);
                    i3 = -1;
                } catch (RuntimeException e) {
                    W58.LJIILLIIL(WA3.LJFF, "Failed to create frame bitmap", e);
                    return false;
                }
            } else {
                WAF waf = this.LJLIL;
                this.LJLILLLLZI.LIZLLL();
                this.LJLILLLLZI.LJFF();
                c81392Vwy = waf.LIZJ();
            }
            boolean LIZJ = LIZJ(i, c81392Vwy, i2);
            if (LIZJ || i3 == -1) {
                return LIZJ;
            }
            return LIZIZ(i, i3);
        } finally {
            C81392Vwy.LJ(c81392Vwy);
        }
    }

    public final boolean LIZJ(int i, C81392Vwy<Bitmap> c81392Vwy, int i2) {
        if (!C81392Vwy.LJIIJJI(c81392Vwy)) {
            return false;
        }
        if (!((C81837W9x) this.LJLJJL.LIZIZ).LIZ(i, c81392Vwy.LJI())) {
            return false;
        }
        W58.LJIIJJI(WA3.LJFF, "Frame %d ready.", Integer.valueOf(this.LJLJI));
        synchronized (this.LJLJJL.LJ) {
            this.LJLIL.LIZ(this.LJLJI, c81392Vwy);
        }
        return true;
    }

    public WA2(WA3 wa3, WAA waa, WAF waf, int i, int i2) {
        this.LJLJJL = wa3;
        this.LJLILLLLZI = waa;
        this.LJLIL = waf;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
