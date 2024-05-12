package X;

import Y.ARunnableS47S0100000_11;
import Y.ARunnableS7S0200100_11;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.PNj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64351PNj {
    public final String LIZ;
    public final C64353PNl LIZIZ;
    public C64353PNl LIZJ;
    public LinkedList<C64353PNl> LIZLLL;
    public final ARunnableS47S0100000_11 LJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public LagDataCallback LJIIIIZZ;
    public int LJIIIZ;

    public final void LIZJ() {
        if (!this.LJFF) {
            return;
        }
        this.LJFF = false;
        if (this.LJI) {
            C1DH.LJIILIIL().removeCallbacks(this.LJ);
        }
        this.LJI = false;
        C64352PNk c64352PNk = (C64352PNk) C64352PNk.LJLJJI.getValue();
        if (c64352PNk != null) {
            ((ArrayList) c64352PNk.LJLILLLLZI).remove(this);
            if (((ArrayList) c64352PNk.LJLILLLLZI).isEmpty() && c64352PNk.LJLJI) {
                C36381bm.LJIL.LJIIL(c64352PNk);
                c64352PNk.LJLJI = false;
            }
        }
        LinkedList<C64353PNl> linkedList = this.LIZLLL;
        this.LIZLLL = new LinkedList<>();
        F9U.LIZ.LIZJ(new ARunnableS7S0200100_11(this, linkedList, SystemClock.uptimeMillis() - this.LJII, 3));
        this.LJII = 0L;
        C64353PNl c64353PNl = this.LIZIZ;
        c64353PNl.LIZ = -1L;
        c64353PNl.LIZIZ = null;
        c64353PNl.LIZJ = -1L;
        c64353PNl.LIZLLL = false;
        c64353PNl.LJ = false;
        c64353PNl.LJFF = false;
    }

    public final void LIZIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        this.LJII = SystemClock.uptimeMillis();
        this.LIZLLL.clear();
        C64352PNk c64352PNk = (C64352PNk) C64352PNk.LJLJJI.getValue();
        if (c64352PNk != null) {
            ((ArrayList) c64352PNk.LJLILLLLZI).add(this);
            if (!c64352PNk.LJLJI) {
                C36381bm.LJIL.LIZLLL(c64352PNk);
                c64352PNk.LJLJI = true;
            }
        }
    }

    public C64351PNj(String mScene) {
        o.LJIIIZ(mScene, "mScene");
        this.LIZ = mScene;
        this.LIZIZ = new C64353PNl(-1L, null);
        this.LIZLLL = new LinkedList<>();
        this.LJ = new ARunnableS47S0100000_11(this, 163);
        this.LJIIIZ = 1000;
    }

    public final void LIZ(LagDataCallback lagDataCallback) {
        synchronized (this) {
            this.LJIIIIZZ = lagDataCallback;
        }
    }
}
