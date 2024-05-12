package X;

import java.util.TimerTask;

/* renamed from: X.E1x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35765E1x extends TimerTask {
    public final /* synthetic */ C35759E1r LJLIL;

    public final void LIZ() {
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LJLIL.LIZJ, "send_delay");
        c188727au.LIZLLL(this.LJLIL.LJIIL, "num_events");
        FMX.LJIIL("config_trigger_events_skipped", c188727au.LIZ);
        C35759E1r c35759E1r = this.LJLIL;
        synchronized (this) {
            c35759E1r.LJIIL = 0;
            c35759E1r.LJIILIIL = null;
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C35765E1x(C35759E1r c35759E1r) {
        this.LJLIL = c35759E1r;
    }
}
