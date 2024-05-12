package X;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class LFS implements JC4 {
    public final /* synthetic */ C34K LJLIL;

    @Override // X.JC4
    public final void LIZ() {
    }

    @Override // X.JC4
    public final void onStart() {
        LFT.LJ = SystemClock.uptimeMillis();
    }

    public LFS(C34K c34k) {
        this.LJLIL = c34k;
    }

    @Override // X.JC4
    public final void LJIILIIL(long j) {
        C34K c34k = this.LJLIL;
        if (c34k.element) {
            c34k.element = false;
            return;
        }
        LFT.LIZ(LFT.LJFF);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("unknown_duration", Integer.valueOf(LFT.LIZIZ));
        c198517qh.LIZ.put("vertical_duration", Integer.valueOf(LFT.LIZLLL));
        c198517qh.LIZ.put("horizontal_duration", Integer.valueOf(LFT.LIZJ));
        FMX.LJIILJJIL("screen_time", c198517qh.LJ());
        LFT.LIZIZ = 0;
        LFT.LIZLLL = 0;
        LFT.LIZJ = 0;
        LFT.LJ = SystemClock.uptimeMillis();
    }
}
