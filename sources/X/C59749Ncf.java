package X;

import android.app.Activity;
import android.content.Intent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import ujb.o;

/* renamed from: X.Ncf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59749Ncf extends WebViewClient {
    public final Activity LIZ;

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C78688UuS.LJJJJI(webView, renderProcessGoneDetail);
    }

    public C59749Ncf(Activity activity) {
        this.LIZ = activity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (C59312NPo.LJFF(webView, str)) {
            return true;
        }
        if (str != null) {
            if (o.LJJJLIIL(str, "http://", false) || o.LJJJLIIL(str, "https://", false)) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ, "//webview");
                buildRoute.withParam(UriProtector.parse(str));
                buildRoute.withParam("use_webview_title", true);
                buildRoute.open();
                return true;
            }
            if (o.LJJJLIIL(str, "mailto:", false)) {
                Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(str));
                try {
                    try {
                        Activity activity = this.LIZ;
                        if (activity == null) {
                            return true;
                        }
                        C16880lQ.LIZIZ(activity, intent);
                        return true;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return true;
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
        return false;
    }
}
