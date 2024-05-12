package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget.PdpBodyAssem;

/* renamed from: X.Rkw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70454Rkw implements InterfaceC70564Rmi {
    public final /* synthetic */ PdpBodyAssem LIZ;

    @Override // X.InterfaceC70564Rmi
    public final void LIZIZ() {
        this.LIZ.LJLLI.getValue();
        C70452Rku c70452Rku = new C70452Rku(this.LIZ.I3());
        c70452Rku.LJIIL(EnumC70453Rkv.STOP, null);
        c70452Rku.LJIIJ();
    }

    @Override // X.InterfaceC70564Rmi
    public final void LIZJ() {
        this.LIZ.LJLLI.getValue();
        C70452Rku c70452Rku = new C70452Rku(this.LIZ.I3());
        c70452Rku.LJIIL(EnumC70453Rkv.DRAG, null);
        c70452Rku.LJIIJ();
    }

    public C70454Rkw(PdpBodyAssem pdpBodyAssem) {
        this.LIZ = pdpBodyAssem;
    }

    @Override // X.InterfaceC70564Rmi
    public final void LIZ(boolean z) {
        C70452Rku c70452Rku = new C70452Rku(this.LIZ.I3());
        c70452Rku.LJIIL(EnumC70453Rkv.FLING, Boolean.valueOf(z));
        c70452Rku.LJIIJ();
    }
}
