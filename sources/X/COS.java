package X;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.hybrid.WebOfflineEnabledSetting;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class COS implements InterfaceC31244COa {
    @Override // X.InterfaceC31244COa
    public final WebResourceResponse LIZ(android.net.Uri uri, WebView webView) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(webView, "webView");
        if (!WebOfflineEnabledSetting.INSTANCE.getValue()) {
            return null;
        }
        return ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).GG(webView, uri.toString());
    }
}
