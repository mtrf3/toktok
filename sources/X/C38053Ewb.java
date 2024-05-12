package X;

import android.webkit.WebView;

/* renamed from: X.Ewb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38053Ewb {
    static {
        new C38054Ewc();
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
