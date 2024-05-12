package X;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* renamed from: X.0Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07920Su {
    public static int LIZ(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    public static WebViewRenderProcess LIZIZ(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    public static WebViewRenderProcessClient LIZJ(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    public static boolean LJI(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }

    public static void LIZLLL(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    public static void LJ(WebView webView, C0R0 c0r0) {
        webView.setWebViewRenderProcessClient(null);
    }

    public static void LJFF(WebView webView, Executor executor, C0R0 c0r0) {
        webView.setWebViewRenderProcessClient(executor, null);
    }
}
