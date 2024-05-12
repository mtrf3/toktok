package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewNewConfig;
import ujb.o;

/* loaded from: classes11.dex */
public final class NWS {
    public static final /* synthetic */ int LIZ = 0;

    public static AdSparkHybridContext LIZ(String str, Bundle bundle, C59222NMc c59222NMc, InterfaceC60770Nt8 interfaceC60770Nt8, InterfaceC59499NWt interfaceC59499NWt, NZ2 nz2) {
        String LIZIZ;
        AdSparkHybridContext adSparkHybridContext = new AdSparkHybridContext();
        if (o.LJJJLIIL(str, "http", false) || o.LJJJLIIL(str, "https", false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("aweme://webview?url=");
            LIZ2.append(android.net.Uri.encode(str));
            LIZIZ = X1D.LIZIZ(LIZ2);
        } else {
            LIZIZ = str;
        }
        adSparkHybridContext.LJJIJLIJ(C39916FlY.LIZ(LIZIZ));
        adSparkHybridContext.LJJIIJ("container_bg_color", "FFFFFF");
        adSparkHybridContext.LJJIFFI(AdSparkWebViewNewConfig.LIZ() ? 1 : 0, "webview_progress_bar");
        if (AdSparkWebViewNewConfig.LIZ()) {
            adSparkHybridContext.LJII(InterfaceC60721NsL.class, new NXD());
        }
        adSparkHybridContext.LJJIFFI(((Boolean) AdSparkWebViewNewConfig.LJI.getValue()).booleanValue() ? 1 : 0, "hide_loading");
        adSparkHybridContext.enableAutoHideLoadingScript = ((Boolean) AdSparkWebViewNewConfig.LIZIZ.getValue()).booleanValue();
        adSparkHybridContext.fmpValueForAutoHideLoadingScript = Integer.valueOf(((Number) AdSparkWebViewNewConfig.LIZJ.getValue()).intValue());
        adSparkHybridContext.LJII(NX8.class, new C63081OpJ());
        adSparkHybridContext.LJII(Bundle.class, bundle);
        if (c59222NMc != null) {
            adSparkHybridContext.LJII(C59222NMc.class, c59222NMc);
        }
        if (interfaceC60770Nt8 != null) {
            adSparkHybridContext.LJII(InterfaceC60770Nt8.class, interfaceC60770Nt8);
        }
        if ((c59222NMc == null || (!c59222NMc.LJIJJLI && !c59222NMc.LJIL)) && interfaceC59499NWt != null) {
            adSparkHybridContext.LJII(InterfaceC59499NWt.class, interfaceC59499NWt);
            adSparkHybridContext.LJII(InterfaceC59494NWo.class, interfaceC59499NWt.LIZIZ());
            adSparkHybridContext.LJII(NUM.class, interfaceC59499NWt.LIZ());
            adSparkHybridContext.LJII(AbstractC59790NdK.class, new C59787NdH(adSparkHybridContext, interfaceC59499NWt));
        }
        if (nz2 != null) {
            adSparkHybridContext.LJII(NZ2.class, nz2);
        }
        adSparkHybridContext.LJJ(new C59806Nda(str, adSparkHybridContext));
        adSparkHybridContext.LJJIL(new NWT(adSparkHybridContext));
        return adSparkHybridContext;
    }
}
