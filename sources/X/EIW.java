package X;

import Y.ARunnableS25S0200000_6;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class EIW implements InterfaceC36227EJr {
    public final boolean LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC36227EJr
    public final void LIZ() {
        this.LIZIZ.set(true);
    }

    public EIW(String str, boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC36227EJr
    public final void LIZIZ(long j, String str) {
        if (this.LIZ && !this.LIZIZ.get()) {
            LIZJ(j, str);
        }
    }

    public void LIZJ(long j, String str) {
        HandlerThreadC36423ERf.LIZJ().LJ(new ARunnableS25S0200000_6(new EIX(str, j), this, 21));
    }
}
