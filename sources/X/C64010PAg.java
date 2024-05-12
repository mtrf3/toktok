package X;

import Y.ARunnableS30S0200000_11;
import android.text.TextUtils;
import java.util.LinkedList;

/* renamed from: X.PAg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64010PAg {
    public final LinkedList<C64014PAk> LIZ = new LinkedList<>();
    public final LinkedList<C64021PAr> LIZIZ = new LinkedList<>();
    public final LinkedList<C64013PAj> LIZJ = new LinkedList<>();
    public final int LIZLLL = 200;
    public boolean LJ;

    public final void LIZIZ(C64009PAf c64009PAf) {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        C48661J7x.LIZ.LIZIZ(new ARunnableS30S0200000_11(this, c64009PAf, 29));
    }

    public final void LIZJ(C64013PAj c64013PAj) {
        synchronized (this.LIZJ) {
            if (this.LIZJ.size() > this.LIZLLL) {
                this.LIZJ.poll();
            }
            this.LIZJ.add(c64013PAj);
        }
    }

    public final void LIZLLL(C64014PAk c64014PAk) {
        synchronized (this.LIZ) {
            if (this.LIZ.size() > this.LIZLLL) {
                this.LIZ.poll();
            }
            this.LIZ.add(c64014PAk);
        }
    }

    public static void LIZ(C64009PAf c64009PAf, C64013PAj c64013PAj) {
        if (c64013PAj == null || TextUtils.isEmpty(c64013PAj.LIZ)) {
            return;
        }
        if (c64013PAj.LIZ.equals("api_error")) {
            c64009PAf.LJIIIZ(c64013PAj.LIZIZ, c64013PAj.LIZJ, c64013PAj.LIZLLL, c64013PAj.LJ, c64013PAj.LJFF, c64013PAj.LJI, c64013PAj.LJII);
        } else {
            if (!c64013PAj.LIZ.equals("api_all")) {
                return;
            }
            c64009PAf.LJIIJJI(c64013PAj.LIZIZ, c64013PAj.LIZJ, c64013PAj.LIZLLL, c64013PAj.LJ, c64013PAj.LJFF, c64013PAj.LJI, c64013PAj.LJII);
        }
    }
}
