package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.Nj3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60145Nj3 extends C60413NnN {
    public final /* synthetic */ C60144Nj2 LJLILLLLZI;

    public C60145Nj3(C60144Nj2 c60144Nj2) {
        this.LJLILLLLZI = c60144Nj2;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest webResourceRequest) {
        android.net.Uri uri;
        android.net.Uri uri2 = null;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        if (!o.LJJJLIIL(String.valueOf(uri), "http", false)) {
            if (webResourceRequest != null) {
                uri2 = webResourceRequest.getUrl();
            }
            if (!o.LJJJLIIL(String.valueOf(uri2), "https", false)) {
                C60144Nj2 c60144Nj2 = this.LJLILLLLZI;
                c60144Nj2.getClass();
                if (webView == null) {
                    return true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - c60144Nj2.LJLILLLLZI < 3000) {
                    return true;
                }
                c60144Nj2.LJLILLLLZI = currentTimeMillis;
                C26045AKb c26045AKb = new C26045AKb(webView);
                c26045AKb.LIZLLL(2000L);
                c26045AKb.LJIIIIZZ(R.string.ef9);
                c26045AKb.LJIIJ();
                return true;
            }
        }
        return super.LJIJJLI(webView, webResourceRequest);
    }
}
