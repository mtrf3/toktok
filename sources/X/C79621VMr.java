package X;

import android.webkit.WebView;

/* renamed from: X.VMr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79621VMr {
    static {
        new C79624VMu();
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
