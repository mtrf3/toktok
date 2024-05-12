package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NwX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60981NwX implements InterfaceC60132Niq {
    public final /* synthetic */ FP9 LIZ;
    public final /* synthetic */ WebView LIZIZ;

    @Override // X.InterfaceC60132Niq
    public final void LIZ() {
        String str;
        C60983NwZ.LIZIZ(C60983NwZ.LJFF);
        String str2 = C60983NwZ.LIZ;
        if (o.LJ(str2, "protection")) {
            this.LIZ.LIZJ(C60983NwZ.LIZJ);
            WebView webView = this.LIZIZ;
            if (webView != null) {
                str = webView.getUrl();
            } else {
                str = null;
            }
            if (o.LJ(str, C60983NwZ.LIZJ)) {
                this.LIZIZ.reload();
            } else {
                WebView webView2 = this.LIZIZ;
                if (webView2 != null) {
                    C16880lQ.LLZZ(webView2, C60983NwZ.LIZJ);
                }
            }
            C60977NwT.LIZ("open_anyway");
            C60983NwZ.LIZ = "safe";
            SearchLandingPageViewModel searchLandingPageViewModel = C60983NwZ.LJI;
            if (searchLandingPageViewModel != null) {
                searchLandingPageViewModel.gv0("loading");
                return;
            } else {
                o.LJIJI("pageViewModel");
                throw null;
            }
        }
        if (!o.LJ(str2, "not_secure")) {
            return;
        }
        SparkContext sparkContext = C60983NwZ.LIZIZ;
        if (sparkContext != null) {
            C78983UzD.LJJLIIIJLJLI(sparkContext);
        }
        C60977NwT.LIZ("go_back");
    }

    public C60981NwX(WebView webView, FP9 fp9) {
        this.LIZ = fp9;
        this.LIZIZ = webView;
    }
}
