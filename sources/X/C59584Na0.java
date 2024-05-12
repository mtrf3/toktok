package X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Na0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59584Na0 implements NZX {
    public final /* synthetic */ C59580NZw LJLIL;

    public C59584Na0(C59580NZw c59580NZw) {
        this.LJLIL = c59580NZw;
    }

    @Override // X.NZX
    public final void LIZ(WebView webView, String str) {
        C59591Na7.LIZ().LIZ(webView, str);
        Iterator it = ((ArrayList) this.LJLIL.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((NZX) it.next()).LIZ(webView, str);
        }
    }

    @Override // X.NZX
    public final void onPageCommitVisible(WebView webView, String str) {
        Iterator<NZX> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().onPageCommitVisible(webView, str);
        }
    }

    @Override // X.NZX
    public final void LJ(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C59591Na7.LIZ().LJII(webView, webResourceRequest, webResourceError);
        Iterator it = ((ArrayList) this.LJLIL.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((NZX) it.next()).LJ(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // X.NZX
    public final void LJIIL(WebView webView, String str, Bitmap bitmap) {
        C59591Na7.LIZ().LIZIZ(webView, str);
        Iterator it = ((ArrayList) this.LJLIL.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((NZX) it.next()).LJIIL(webView, str, bitmap);
        }
    }

    @Override // X.NZX
    public final void LJIILIIL(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Iterator<NZX> it = this.LJLIL.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LJIILIIL(webView, sslErrorHandler, sslError);
        }
    }

    @Override // X.NZX
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C59591Na7.LIZ().LJIIIZ(webView, webResourceRequest, webResourceResponse);
        Iterator it = ((ArrayList) this.LJLIL.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((NZX) it.next()).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // X.NZX
    public final void LJFF(WebView webView, int i, String str, String str2) {
        C59591Na7.LIZ().LJIIJ(webView, i, str, str2);
        Iterator it = ((ArrayList) this.LJLIL.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((NZX) it.next()).LJFF(webView, i, str, str2);
        }
    }

    @Override // X.NZX
    public final boolean LJIILJJIL(WebView webView, String str, WebResourceRequest webResourceRequest, boolean z) {
        Iterator it = ((ArrayList) this.LJLIL.LJLILLLLZI).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((NZX) it.next()).LJIILJJIL(webView, str, webResourceRequest, z)) {
                z2 = true;
            }
        }
        return z2;
    }
}
