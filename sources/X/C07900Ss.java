package X;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.0Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07900Ss {
    public static PackageInfo LIZ() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean LIZIZ(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebChromeClient LIZJ(WebView webView) {
        return webView.getWebChromeClient();
    }

    public static WebViewClient LIZLLL(WebView webView) {
        return webView.getWebViewClient();
    }

    public static void LJ(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
