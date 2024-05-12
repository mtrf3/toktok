package X;

import android.graphics.Bitmap;
import android.webkit.WebView;
import java.util.Iterator;
import ujb.s;

/* renamed from: X.a9t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92385a9t extends C60413NnN {
    public final /* synthetic */ C92386a9u LJLILLLLZI;

    public C92385a9t(C92386a9u c92386a9u) {
        this.LJLILLLLZI = c92386a9u;
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        super.LJFF(webView, str, bitmap);
        C92386a9u c92386a9u = this.LJLILLLLZI;
        c92386a9u.getClass();
        boolean z = true;
        if (str != null && str.length() != 0) {
            Iterator<String> it = c92386a9u.LJLJI.iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(str, it.next(), false)) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            if (webView != null) {
                webView.addJavascriptInterface(new C91661ZyD(this.LJLILLLLZI.LJLILLLLZI), "webview");
                webView.addJavascriptInterface(new C91659ZyB(this.LJLILLLLZI.LJLILLLLZI), "LocalStorage");
                return;
            }
            return;
        }
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("webview");
        webView.removeJavascriptInterface("LocalStorage");
    }
}
