package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS19S2100000_12;

/* renamed from: X.Rkj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70441Rkj implements InterfaceC72263SXr {
    public final /* synthetic */ PdpBodyWidget LIZ;

    @Override // X.InterfaceC72263SXr
    public final void LIZ() {
        PdpBodyWidget pdpBodyWidget = this.LIZ;
        if (!pdpBodyWidget.mTouchDownReset) {
            pdpBodyWidget.getViewModel().Ov0(C77125UOr.LIZJ(this.LIZ), this.LIZ.getFragment());
        }
    }

    @Override // X.InterfaceC72263SXr
    public final boolean LIZIZ() {
        return this.LIZ.getViewModel().tw0();
    }

    @Override // X.InterfaceC72263SXr
    public final void LIZJ() {
        this.LIZ.mTouchDownReset = true;
    }

    @Override // X.InterfaceC72263SXr
    public final void LIZLLL() {
        String LIZLLL;
        ProductUnavailableInfo productUnavailableInfo;
        PdpBodyWidget pdpBodyWidget = this.LIZ;
        if (!pdpBodyWidget.mTouchDownReset) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(pdpBodyWidget.getFragment());
        ProductPackStruct productPackStruct = this.LIZ.getViewModel().LJLJLLL;
        if (productPackStruct == null || (productUnavailableInfo = productPackStruct.productUnavailableInfo) == null || (LIZLLL = productUnavailableInfo.text) == null || LIZLLL.length() <= 0) {
            LIZLLL = C1DD.LIZLLL(R.string.pc9, "{\n            AppContext…_not_available)\n        }");
        }
        c26045AKb.LJIIIZ(LIZLLL);
        c26045AKb.LJIIJ();
        C70414RkI c70414RkI = this.LIZ.getViewModel().LLFII;
        if (c70414RkI != null) {
            String dw0 = this.LIZ.getViewModel().dw0();
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70947Rst(), new AqS19S2100000_12(c70414RkI, dw0, 6));
            } else {
                C76542zS.LJ("tiktokec_toast_show", new AqS19S2100000_12(c70414RkI, dw0, 7));
            }
        }
    }

    public C70441Rkj(PdpBodyWidget pdpBodyWidget) {
        this.LIZ = pdpBodyWidget;
    }
}
