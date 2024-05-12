package X;

import Y.ARunnableS33S0200000_14;
import android.os.Looper;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes15.dex */
public final class W6Z<V> implements VWQ<V> {
    public final /* synthetic */ C81736W6a LJLIL;
    public final /* synthetic */ W6X LJLILLLLZI;

    @Override // X.VWQ
    public final void LIZ(V v) {
        boolean LJIILJJIL;
        C81392Vwy<V> LJIL;
        boolean LJIILJJIL2;
        C81392Vwy<V> LJIL2;
        W6X w6x = this.LJLILLLLZI;
        C81736W6a c81736W6a = this.LJLIL;
        w6x.getClass();
        c81736W6a.getClass();
        if (W6X.LJLJLJ) {
            if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
                synchronized (w6x) {
                    w6x.LJIIIIZZ(c81736W6a);
                    LJIILJJIL2 = w6x.LJIILJJIL(c81736W6a);
                    LJIL2 = w6x.LJIL(c81736W6a);
                }
                C81392Vwy.LJ(LJIL2);
                if (!LJIILJJIL2) {
                    c81736W6a = null;
                }
                W6X.LJIIZILJ(c81736W6a);
                w6x.LJIJJ();
                w6x.LJIILLIIL();
                return;
            }
            C81740W6e.LIZ().execute(new ARunnableS33S0200000_14(w6x, c81736W6a, 77));
            return;
        }
        synchronized (w6x) {
            w6x.LJIIIIZZ(c81736W6a);
            LJIILJJIL = w6x.LJIILJJIL(c81736W6a);
            LJIL = w6x.LJIL(c81736W6a);
        }
        C81392Vwy.LJ(LJIL);
        if (!LJIILJJIL) {
            c81736W6a = null;
        }
        W6X.LJIIZILJ(c81736W6a);
        w6x.LJIJJ();
        w6x.LJIILLIIL();
    }

    public W6Z(W6X w6x, C81736W6a c81736W6a) {
        this.LJLILLLLZI = w6x;
        this.LJLIL = c81736W6a;
    }
}
