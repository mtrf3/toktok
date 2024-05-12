package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;

/* renamed from: X.Rkt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70451Rkt implements InterfaceC70458Rl0 {
    public final /* synthetic */ PdpBodyWidget LIZ;

    @Override // X.InterfaceC70458Rl0
    public final void LIZIZ() {
        C70452Rku c70452Rku = new C70452Rku(this.LIZ.getViewModel().jw0());
        c70452Rku.LJIIL(EnumC70453Rkv.STOP, null);
        c70452Rku.LJIIJ();
    }

    @Override // X.InterfaceC70458Rl0
    public final void LIZJ() {
        C70452Rku c70452Rku = new C70452Rku(this.LIZ.getViewModel().jw0());
        c70452Rku.LJIIL(EnumC70453Rkv.DRAG, null);
        c70452Rku.LJIIJ();
    }

    public C70451Rkt(PdpBodyWidget pdpBodyWidget) {
        this.LIZ = pdpBodyWidget;
    }

    @Override // X.InterfaceC70458Rl0
    public final void LIZ(boolean z) {
        C70452Rku c70452Rku = new C70452Rku(this.LIZ.getViewModel().jw0());
        c70452Rku.LJIIL(EnumC70453Rkv.FLING, Boolean.valueOf(z));
        c70452Rku.LJIIJ();
    }
}
