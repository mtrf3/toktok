package X;

import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;

/* loaded from: classes11.dex */
public final class NPE implements InterfaceC58691N1r {
    public final /* synthetic */ FrameLayout LIZ;
    public final /* synthetic */ NWF LIZIZ;
    public final /* synthetic */ NOJ LIZJ;

    public final void LIZIZ() {
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(4);
    }

    @Override // X.InterfaceC58691N1r
    public final void show() {
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        this.LIZIZ.LJJ(this.LIZJ);
    }

    @Override // X.InterfaceC58691N1r
    public final int LIZ() {
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            WebKitView adWebSparkView = this.LIZIZ.getAdWebSparkView();
            if (adWebSparkView == null) {
                return -1;
            }
            return adWebSparkView.getProgress();
        }
        NZR webView = this.LIZIZ.getWebView();
        if (webView == null) {
            return -1;
        }
        return webView.getLoadingProgress();
    }

    @Override // X.InterfaceC58691N1r
    public final void release() {
        if (CommerceWebCrossToSparkExt.LIZIZ()) {
            WebKitView adWebSparkView = this.LIZIZ.getAdWebSparkView();
            if (adWebSparkView != null) {
                adWebSparkView.destroy();
                return;
            }
            return;
        }
        NZR webView = this.LIZIZ.getWebView();
        if (webView == null) {
            return;
        }
        webView.destroy();
    }

    public NPE(FrameLayout frameLayout, NWF nwf, NOJ noj) {
        this.LIZ = frameLayout;
        this.LIZIZ = nwf;
        this.LIZJ = noj;
    }
}
