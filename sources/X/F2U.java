package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class F2U implements F48, F4P {
    public boolean LIZ(WebView webView, String url, JSInjectConfig jSInjectConfig) {
        o.LJIIJ(webView, "webView");
        o.LJIIJ(url, "url");
        return false;
    }

    @Override // X.F48
    public String LIZLLL() {
        return null;
    }

    @Override // X.F48
    public String LJ(android.net.Uri uri, WebView webView) {
        o.LJIIJ(webView, "webView");
        return null;
    }

    public String LJFF() {
        return "";
    }

    public void LJI(WebView webView, F4E code) {
        o.LJIIJ(webView, "webView");
        o.LJIIJ(code, "code");
    }
}
