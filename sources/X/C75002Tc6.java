package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import kotlin.jvm.internal.o;

/* renamed from: X.Tc6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75002Tc6 extends AbstractC75001Tc5 {
    public final C74648TRk LIZJ;

    @Override // X.AbstractC75001Tc5, X.InterfaceC74935Tb1
    public final void destroy() {
        super.destroy();
        this.LIZJ.LIZ();
    }

    public C75002Tc6(C74994Tby c74994Tby) {
        super(c74994Tby);
        this.LIZJ = new C74648TRk(this, c74994Tby);
    }

    @Override // X.AbstractC75001Tc5, X.InterfaceC74935Tb1
    public final void LIZIZ(SeiAppData seiAppData) {
        C74995Tbz c74995Tbz = this.LIZ;
        o.LJII(c74995Tbz, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.audience.ZoomAudienceModel");
        ((C74994Tby) c74995Tbz).LJIIZILJ(seiAppData, C77412UZs.LJJIIJZLJL());
    }

    @Override // X.InterfaceC74935Tb1
    public final void LJ(String linkMicId, InterfaceC75014TcI interfaceC75014TcI, boolean z, boolean z2, EnumC74929Tav zoomSource) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(zoomSource, "zoomSource");
        if (!C30922CBq.LIZIZ) {
        } else {
            throw new IllegalStateException(" audience can not be zoomed!!");
        }
    }
}
