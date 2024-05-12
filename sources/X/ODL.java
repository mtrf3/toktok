package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class ODL {
    public final InterfaceC61585OEz LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public final void LIZ() {
        this.LIZIZ = this.LIZIZ + 1;
        long floor = (long) Math.floor(Math.pow(2.0d, Math.min(r2 - 2, 8)) * (Math.random() + 0.5d) * 5.0d);
        int i = (int) (this.LIZJ + floor);
        this.LIZJ = i;
        if (i > 5115) {
            LIZIZ();
        } else {
            C61572OEm.LIZ.LIZIZ(new C61559ODz(this), floor * 1000);
        }
    }

    public final void LIZIZ() {
        if (this.LIZLLL.get()) {
            this.LIZIZ = 0;
            C61572OEm.LIZ.LIZ(2);
            this.LIZLLL.set(false);
        }
    }

    public ODL(OEV oev) {
        this.LIZ = oev;
    }
}
