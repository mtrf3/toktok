package X;

import android.util.Pair;

/* renamed from: X.Pcy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC64864Pcy implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ PXW LJLJJI;
    public final /* synthetic */ Pair LJLJJL;
    public final /* synthetic */ C64863Pcx LJLJJLL;

    public final void LIZ() {
        C64869Pd3 c64869Pd3 = this.LJLJJLL.LJLIL.LJLLI;
        if (c64869Pd3 != null) {
            c64869Pd3.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        }
        C64862Pcw c64862Pcw = this.LJLJJLL.LJLIL;
        if (c64862Pcw.LJLLJ) {
            c64862Pcw.LJLLJ = false;
            c64862Pcw.LJIIL(c64862Pcw.LJLJI.LIZJ());
            return;
        }
        if (c64862Pcw.LJLLILLLL != this.LJLJJI) {
            return;
        }
        int i = this.LJLILLLLZI;
        if (i <= 0 || i == 414 || i == 511 || i == 512 || i == 513) {
            c64862Pcw.LJLLL.LIZLLL();
            this.LJLJJLL.LJLIL.LJIILIIL(((Long) this.LJLJJL.second).longValue(), (String) this.LJLJJL.first, false);
            return;
        }
        c64862Pcw.LJIIJ(2);
        C48130Iuk c48130Iuk = this.LJLJJLL.LJLIL.LJLJI;
        if (c48130Iuk == null) {
            return;
        }
        c48130Iuk.LIZLLL();
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

    public RunnableC64864Pcy(C64863Pcx c64863Pcx, String str, int i, String str2, PXW pxw, Pair pair) {
        this.LJLJJLL = c64863Pcx;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
        this.LJLJJI = pxw;
        this.LJLJJL = pair;
    }
}
