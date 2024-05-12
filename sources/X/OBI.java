package X;

import android.webkit.WebView;

/* loaded from: classes11.dex */
public final class OBI {
    static {
        new OBJ();
    }

    public static void LIZ(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        if (str != null && str.startsWith("javascript:")) {
            try {
                webView.evaluateJavascript(str, null);
                return;
            } catch (Throwable unused) {
            }
        }
        try {
            C16880lQ.LLZZ(webView, str);
        } catch (Throwable unused2) {
        }
    }
}
