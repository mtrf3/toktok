package X;

import kotlin.jvm.internal.AqS101S0101000_14;
import kotlin.jvm.internal.AqS15S0102000_14;

/* loaded from: classes15.dex */
public final class WOI implements InterfaceC81987WFr {
    public final /* synthetic */ WOB LIZ;

    public WOI(WOB wob) {
        this.LIZ = wob;
    }

    @Override // X.InterfaceC81987WFr
    public final void LIZ(int i) {
        WOX wox;
        WOB wob = this.LIZ;
        C73157SnR.LJIIJJI(wob.LJLL, new AqS101S0101000_14(wob, i, 1));
        if (C52306Kfu.LIZ() && (wox = this.LIZ.LJLJI) != null) {
            wox.LIZ();
        }
    }

    @Override // X.InterfaceC81987WFr
    public final void LIZIZ(int i, int i2) {
        WOB wob = this.LIZ;
        C73157SnR.LJIIJJI(wob.LJLL, new AqS15S0102000_14(wob, i, i2, 2));
    }
}
