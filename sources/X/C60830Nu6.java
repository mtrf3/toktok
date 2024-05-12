package X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* renamed from: X.Nu6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60830Nu6 extends WebViewClient {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView instanceof WebKitView) {
            C39836FkG.LJII.getClass();
            C1JI.LJIIIIZZ((InterfaceC60761Nsz) webView, C38262Ezy.LIZ().LIZIZ());
        }
        C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
        return true;
    }
}
