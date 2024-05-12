package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F4D implements K10 {
    public final /* synthetic */ WebView LIZ;
    public final /* synthetic */ JSInjectConfig LIZIZ;

    @Override // X.K10
    public final boolean isForMainFrame() {
        return false;
    }

    @Override // X.K10
    public final java.util.Map<String, String> getRequestHeaders() {
        o.LJFF(null, "super.getRequestHeaders()");
        throw null;
    }

    @Override // X.K10
    public final android.net.Uri getUrl() {
        android.net.Uri parse = UriProtector.parse(this.LIZIZ.geckoUrl);
        o.LJFF(parse, "Uri.parse(config.geckoUrl)");
        return parse;
    }

    @Override // X.K10
    public final WebView LIZ() {
        return this.LIZ;
    }

    public F4D(F4M f4m, WebView webView, JSInjectConfig jSInjectConfig) {
        this.LIZ = webView;
        this.LIZIZ = jSInjectConfig;
    }
}
