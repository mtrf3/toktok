package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WTA implements WTM {
    public WIY LIZ = WIY.ENTER_FROM_SINGLE_CLICK;

    @Override // X.WTM
    public final boolean LIZJ() {
        return C60903NvH.LJIIJJI().LJJIL().getSpeedPanelOpen(false);
    }

    @Override // X.WTM
    public final WIY LIZ() {
        return this.LIZ;
    }

    @Override // X.WTM
    public final void LIZIZ(boolean z) {
        C60903NvH.LJIIJJI().LJJIL().setSpeedPanelOpen(z);
    }

    @Override // X.WTM
    public final void LIZLLL(WIY wiy) {
        o.LJIIIZ(wiy, "<set-?>");
        this.LIZ = wiy;
    }
}
