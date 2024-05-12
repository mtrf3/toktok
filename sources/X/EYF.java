package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.RestrictiveRuleReporter;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EYF extends C39586FgE {
    public EYF() {
        super(9);
    }

    @Override // X.C39586FgE
    public final void LJIIJ(String str) {
        WebView webView = this.LJLJJI;
        o.LJIIIIZZ(webView, "webView");
        webView.addJavascriptInterface(new RestrictiveRuleReporter(webView), "WebReport");
        super.LJIIJ(str);
    }

    @Override // X.C39586FgE
    public final void LJIIJJI(String str, java.util.Map<String, String> map) {
        WebView webView = this.LJLJJI;
        o.LJIIIIZZ(webView, "webView");
        webView.addJavascriptInterface(new RestrictiveRuleReporter(webView), "WebReport");
        super.LJIIJJI(str, map);
    }
}
