package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ArP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27539ArP implements InterfaceC70598RnG {
    public final /* synthetic */ PdpInfoViewHolder LIZ;

    @Override // X.InterfaceC70598RnG
    public final void LIZ() {
        PdpViewModel viewModel = this.LIZ.getViewModel();
        View itemView = this.LIZ.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        viewModel.Kw0(1, itemView, "rate", null, null);
    }

    @Override // X.InterfaceC70598RnG
    public final void LIZIZ() {
        C70414RkI c70414RkI = this.LIZ.getViewModel().LLFII;
        if (c70414RkI != null && !c70414RkI.LJJIIZI) {
            c70414RkI.LJJIIZI = true;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70920RsS(), new AqS170S0100000_4(c70414RkI, 1544));
            } else {
                C76542zS.LJ("tiktokec_module_show", new AqS170S0100000_4(c70414RkI, 1545));
            }
        }
    }

    public C27539ArP(PdpInfoViewHolder pdpInfoViewHolder) {
        this.LIZ = pdpInfoViewHolder;
    }
}
