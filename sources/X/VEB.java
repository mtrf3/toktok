package X;

import Y.ARunnableS14S0301000_14;
import Y.ARunnableS17S0201000_14;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VEB implements Runnable {
    public final /* synthetic */ VNU LJLIL;
    public final /* synthetic */ C40052Fnk LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ VEF LJLJJI;
    public final /* synthetic */ Handler LJLJJL;
    public final /* synthetic */ VEC LJLJJLL;

    public final void LIZ() {
        VEC vec = this.LJLJJLL;
        VNU vnu = this.LJLIL;
        C40052Fnk c40052Fnk = this.LJLILLLLZI;
        int i = this.LJLJI;
        VEF vef = this.LJLJJI;
        Handler handler = this.LJLJJL;
        synchronized (vec) {
            VED LIZIZ = vec.LIZIZ(c40052Fnk);
            if (LIZIZ != null) {
                c40052Fnk.LIZIZ = LIZIZ;
                vec.LIZ(c40052Fnk, LIZIZ);
                if (Build.VERSION.SDK_INT >= 28) {
                    Typeface LIZ = LIZIZ.LIZ(i);
                    if (vef != null) {
                        handler.post(new ARunnableS17S0201000_14(i, vef, LIZ, 12));
                    } else {
                        return;
                    }
                } else if (vef != null) {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS14S0301000_14(LIZIZ, handler, i, vef, 4));
                } else {
                    return;
                }
                return;
            }
            Iterator it = ((ArrayList) vec.LIZIZ).iterator();
            while (it.hasNext()) {
                VEA vea = (VEA) it.next();
                if (vea.LIZ(c40052Fnk)) {
                    ((HashSet) vea.LIZIZ).add(c40052Fnk);
                    ((ArrayList) vea.LIZ).add(new Pair(vef, Integer.valueOf(i)));
                    return;
                }
            }
            VEA vea2 = new VEA();
            ((ArrayList) vea2.LIZ).add(new Pair(vef, Integer.valueOf(i)));
            ((HashSet) vea2.LIZIZ).add(c40052Fnk);
            ((ArrayList) vec.LIZIZ).add(vea2);
            vec.LIZLLL(vnu, vea2, ((ArrayList) c40052Fnk.LIZ).iterator(), handler);
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

    public VEB(VEC vec, VNU vnu, C40052Fnk c40052Fnk, int i, VEF vef, Handler handler) {
        this.LJLJJLL = vec;
        this.LJLIL = vnu;
        this.LJLILLLLZI = c40052Fnk;
        this.LJLJI = i;
        this.LJLJJI = vef;
        this.LJLJJL = handler;
    }
}
