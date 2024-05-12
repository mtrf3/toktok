package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Rlr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70511Rlr implements InterfaceC74055T4p {
    public final /* synthetic */ PdpHeadNavBarWidget LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C70511Rlr(PdpHeadNavBarWidget pdpHeadNavBarWidget) {
        this.LIZ = pdpHeadNavBarWidget;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        int i;
        C70519Rlz c70519Rlz;
        o.LJIIIZ(tab, "tab");
        if (V3N.LJIIL(tab) == EnumC27721AuL.RECOMMENDATION.getValue()) {
            this.LIZ.getViewModel().LLLIIIIL = true;
        }
        this.LIZ.getViewModel().LLJLL = true;
        this.LIZ.getViewModel().tx0(V3N.LJIIL(tab), true);
        C70414RkI c70414RkI = this.LIZ.getViewModel().LLFII;
        if (c70414RkI != null) {
            PdpHeadNavBarWidget pdpHeadNavBarWidget = this.LIZ;
            Object obj = tab.LIZ;
            if ((obj instanceof C70519Rlz) && (c70519Rlz = (C70519Rlz) obj) != null) {
                i = c70519Rlz.LJLILLLLZI;
            } else {
                i = 0;
            }
            c70414RkI.LJJI(pdpHeadNavBarWidget.getTabDefaultName(i), null);
        }
    }
}
