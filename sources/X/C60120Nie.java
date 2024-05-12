package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nie, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60120Nie implements InterfaceC60115NiZ {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ WebView LIZIZ;

    @Override // X.InterfaceC60115NiZ
    public final void LIZ() {
        SparkContext sparkContext;
        WebKitView webKitView;
        String str;
        C60119Nid.LIZIZ(C60119Nid.LJFF);
        String str2 = C60119Nid.LIZ;
        if (o.LJ(str2, "protection")) {
            this.LIZ.invoke(C60119Nid.LIZJ);
            WebView webView = this.LIZIZ;
            if (webView != null) {
                str = webView.getUrl();
            } else {
                str = null;
            }
            if (o.LJ(str, C60119Nid.LIZJ)) {
                webView.reload();
            } else if (webView != null) {
                C16880lQ.LLZZ(webView, C60119Nid.LIZJ);
            }
            C60119Nid.LIZ = "safe";
            MusicLandingPageViewModel musicLandingPageViewModel = C60119Nid.LJI;
            if (musicLandingPageViewModel != null) {
                musicLandingPageViewModel.gv0("loading");
                return;
            } else {
                o.LJIJI("safeStatusViewModel");
                throw null;
            }
        }
        if (!o.LJ(str2, "not_secure") || (sparkContext = C60119Nid.LIZIZ) == null) {
            return;
        }
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str3 = sparkContext.containerId;
        c31999Ch9.getClass();
        InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str3);
        if (LIZIZ != null && (LIZIZ instanceof WebKitView) && (webKitView = (WebKitView) LIZIZ) != null && webKitView.canGoBack()) {
            webKitView.goBack();
            return;
        }
        InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
        if (LJIILL == null || !(LJIILL instanceof SparkActivity)) {
            return;
        }
        ((SparkActivity) LJIILL).finish();
    }

    public C60120Nie(WebView webView, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = webView;
    }
}
