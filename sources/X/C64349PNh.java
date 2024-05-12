package X;

import Y.ARunnableS47S0100000_11;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import kotlin.jvm.internal.o;

/* renamed from: X.PNh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64349PNh {
    public final PH4 LIZ;
    public final C64350PNi LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final ARunnableS47S0100000_11 LJFF;

    public final void LIZIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LIZJ = SystemClock.uptimeMillis();
        this.LIZ.LIZLLL();
    }

    public final void LIZJ() {
        if (!this.LIZLLL) {
            return;
        }
        this.LIZLLL = false;
        if (this.LJ) {
            C1DH.LJIILIIL().removeCallbacks(this.LJFF);
        }
        this.LJ = false;
        this.LIZIZ.LJLJJI = SystemClock.uptimeMillis() - this.LIZJ;
        this.LIZ.LJ();
        this.LIZJ = 0L;
    }

    public C64349PNh(String scene) {
        o.LJIIIZ(scene, "scene");
        this.LJFF = new ARunnableS47S0100000_11(this, 165);
        C64350PNi c64350PNi = new C64350PNi(scene);
        this.LIZIZ = c64350PNi;
        PH4 ph4 = new PH4(scene, true);
        this.LIZ = ph4;
        ph4.LIZJ(c64350PNi);
        PH3 ph3 = ph4.LJ;
        if (ph3 != null) {
            ph3.LJ = c64350PNi;
        }
        ph4.LIZLLL = c64350PNi;
    }

    public final void LIZ(LagDataCallback lagDataCallback) {
        C64350PNi c64350PNi = this.LIZIZ;
        synchronized (c64350PNi) {
            c64350PNi.LJLILLLLZI = lagDataCallback;
        }
    }
}
