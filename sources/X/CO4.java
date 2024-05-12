package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;

/* loaded from: classes6.dex */
public final class CO4 {
    public static final boolean LIZ = FCD.LJII();
    public static final int LIZIZ = -1;
    public static final int LIZJ = -1;

    public static void LIZ(WebView webView, boolean z) {
        if (webView == null) {
            return;
        }
        webView.setWebChromeClient(null);
        C16880lQ.LLZLI(webView, null);
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(webView, (ViewGroup) parent);
            if (z) {
                try {
                    webView.destroy();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
