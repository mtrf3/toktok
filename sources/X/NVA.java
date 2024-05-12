package X;

import com.ss.android.ugc.aweme.bullet.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;

/* loaded from: classes11.dex */
public final class NVA {
    public final /* synthetic */ NVB LIZ;

    public NVA(NVB nvb) {
        this.LIZ = nvb;
    }

    @QD3
    public final void onEvent(C40307Frr c40307Frr) {
        C59451NUx rootContainer;
        NUT nut;
        PreRenderWebViewBusiness LIZ;
        if (c40307Frr == null) {
            return;
        }
        NVB nvb = this.LIZ;
        if (nvb.LJLJLLL && (rootContainer = nvb.getMBulletWebView().getRootContainer()) != null && (nut = rootContainer.LJLILLLLZI) != null && (LIZ = NUW.LIZ(nut)) != null) {
            LIZ.LIZIZ(c40307Frr);
        }
    }

    @QD3
    public final void onEvent(C40292Frc c40292Frc) {
        CommercializeWebViewHelper commercializeWebViewHelper;
        com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness LIZ;
        if (c40292Frc != null && (commercializeWebViewHelper = this.LIZ.LJZL) != null && (LIZ = NV9.LIZ(commercializeWebViewHelper)) != null) {
            LIZ.LIZJ(this.LIZ.getMWebView(), c40292Frc);
        }
    }
}
