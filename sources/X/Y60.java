package X;

import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class Y60 {
    public final C79566VKo LIZ;
    public Y6G LIZIZ;
    public final C86830Y5y LIZJ;
    public Handler LIZLLL;
    public Y6A LJ;
    public volatile boolean LJFF;
    public final Handler LJII;
    public boolean LJI = true;
    public VK2 LJIIIIZZ = new VK2();
    public final ARunnableS51S0100000_15 LJIIIZ = new ARunnableS51S0100000_15(this, 73);
    public final ARunnableS51S0100000_15 LJIIJ = new ARunnableS51S0100000_15(this, 74);
    public final ARunnableS51S0100000_15 LJIIJJI = new ARunnableS51S0100000_15(this, 75);
    public final ARunnableS51S0100000_15 LJIIL = new ARunnableS51S0100000_15(this, 76);
    public final RunnableC86812Y5g LJIILIIL = new RunnableC86812Y5g(this);
    public final ARunnableS51S0100000_15 LJIILJJIL = new ARunnableS51S0100000_15(this, 77);

    public Y60() {
        C79043V0l.LJJIIJZLJL();
        if (C79566VKo.LJ == null) {
            C79566VKo.LJ = new C79566VKo();
        }
        this.LIZ = C79566VKo.LJ;
        C86830Y5y c86830Y5y = new C86830Y5y();
        this.LIZJ = c86830Y5y;
        c86830Y5y.LJFF = this.LJIIIIZZ;
        this.LJII = new Handler();
    }

    public final void LIZ(Exception exc) {
        Handler handler = this.LIZLLL;
        if (handler != null) {
            handler.obtainMessage(R.id.nl0, exc).sendToTarget();
        }
    }
}
