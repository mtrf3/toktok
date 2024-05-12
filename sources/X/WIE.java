package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes15.dex */
public final class WIE implements WKQ {
    public final /* synthetic */ WID LIZ;

    @Override // X.WKQ
    public final void LIZ() {
        if (((LifecycleOwner) this.LIZ.LIZ.LJ(LifecycleOwner.class, null)).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        WIF wif = (WIF) this.LIZ.LIZ.LJ(WIF.class, null);
        wif.h1(true);
        wif.t3(WIY.ENTER_FROM_LONG_PRESS);
        C78609UtB.LJJJJZ(this.LIZ.LJIILIIL());
    }

    public WIE(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.WKQ
    public final void LIZJ(int i, int i2) {
        ((WIF) this.LIZ.LIZ.LJ(WIF.class, null)).s7(i, i2);
    }

    @Override // X.WKQ
    public final void LIZIZ(int i, int i2, int i3, int i4) {
        ((WIF) this.LIZ.LIZ.LJ(WIF.class, null)).I(i, i2, i3, i4);
    }
}
