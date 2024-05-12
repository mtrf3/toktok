package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NWO implements InterfaceC59573NZp {
    public final /* synthetic */ NWF LIZ;

    @Override // X.InterfaceC59573NZp
    public final void LIZ() {
        NWF nwf = this.LIZ;
        if (nwf.LJLJJL) {
            if (nwf.LJLJJLL) {
                WebKitView webKitView = ((C59232NMm) nwf.LIZ(R.id.hxj)).LJLJJL;
                if (webKitView != null && webKitView.canGoBack()) {
                    webKitView.goBack();
                    return;
                }
                return;
            }
            C59614NaU c59614NaU = ((NWH) nwf.LIZ(R.id.hxi)).LLI;
            if (c59614NaU == null || !c59614NaU.LJLLLL()) {
                return;
            }
            c59614NaU.goBack();
            return;
        }
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            return;
        }
        ((NZQ) this.LIZ.LIZ(R.id.hxh)).goBack();
    }

    @Override // X.InterfaceC59573NZp
    public final void LIZIZ() {
        NWF nwf = this.LIZ;
        if (nwf.LJLJJL) {
            if (nwf.LJLJJLL) {
                WebKitView webKitView = ((C59232NMm) nwf.LIZ(R.id.hxj)).LJLJJL;
                if (webKitView != null && webKitView.canGoForward()) {
                    webKitView.goForward();
                    return;
                }
                return;
            }
            C59614NaU c59614NaU = ((NWH) nwf.LIZ(R.id.hxi)).LLI;
            if (c59614NaU == null || !c59614NaU.canGoForward()) {
                return;
            }
            c59614NaU.goForward();
            return;
        }
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            return;
        }
        ((NZQ) this.LIZ.LIZ(R.id.hxh)).goForward();
    }

    public NWO(NWF nwf) {
        this.LIZ = nwf;
    }
}
