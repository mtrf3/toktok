package X;

import Y.AfS26S1100000_13;
import Y.AfS4S1210000_13;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import kotlin.jvm.internal.o;

/* renamed from: X.Tc1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74997Tc1 extends AbstractC75001Tc5 {
    public final String LIZJ;
    public final C74648TRk LIZLLL;

    @Override // X.AbstractC75001Tc5, X.InterfaceC74935Tb1
    public final void destroy() {
        super.destroy();
        this.LIZLLL.LIZ();
    }

    public C74997Tc1(C74992Tbw c74992Tbw) {
        super(c74992Tbw);
        this.LIZJ = "Zoom/ZoomGuestPresent";
        this.LIZLLL = new C74648TRk(this, c74992Tbw);
    }

    @Override // X.InterfaceC74935Tb1
    public final void LJ(String linkMicId, InterfaceC75014TcI interfaceC75014TcI, boolean z, boolean z2, EnumC74929Tav zoomSource) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(zoomSource, "zoomSource");
        if (C19N.LIZLLL()) {
            this.LIZ.getClass();
            if (o.LJ(linkMicId, C74995Tbz.LJII())) {
                int LJIIIZ = C74995Tbz.LJIIIZ(this.LIZ, linkMicId);
                C74995Tbz.LJII.getClass();
                if (LJIIIZ != C74995Tbz.LJIIIZ && LIZJ()) {
                    int LIZ = this.LIZ.LIZ(linkMicId, z2);
                    this.LIZ.getClass();
                    java.util.Map<String, String> LIZLLL = C74995Tbz.LIZLLL(LIZ, linkMicId, z);
                    C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                    String str = this.LIZJ;
                    java.util.Map<String, ?> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("action", "tryZoomToMin"), new OSZ("linkMicId", linkMicId), new OSZ("noMoreZoom", Boolean.valueOf(z)), new OSZ(WM7.SCENE_SERVICE, Integer.valueOf(LIZ)));
                    LJJLIIIIJ.putAll(LIZLLL);
                    LJIILIIL.LJIIIIZZ(str, LJJLIIIIJ);
                    this.LIZIZ.LIZ(C1EW.LIZ(((MultiLiveApi) Q7L.LIZIZ(MultiLiveApi.class)).zoom(LIZLLL)).LJJJLIIL(new AfS4S1210000_13(interfaceC75014TcI, linkMicId, this, z, 1), new AfS26S1100000_13(interfaceC75014TcI, linkMicId, 13)));
                    return;
                }
            }
        }
        if (interfaceC75014TcI != null) {
            C75013TcH.LIZ(interfaceC75014TcI, linkMicId, EnumC75004Tc8.E_C_GUEST_REJECT_ZOOM.ordinal(), null, 12);
        }
    }
}
