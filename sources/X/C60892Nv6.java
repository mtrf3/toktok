package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business.BioUserWebSiteComponent;
import ujb.o;

/* renamed from: X.Nv6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60892Nv6 extends C60413NnN {
    public final /* synthetic */ BioUserWebSiteComponent LJLILLLLZI;

    public C60892Nv6(BioUserWebSiteComponent bioUserWebSiteComponent) {
        this.LJLILLLLZI = bioUserWebSiteComponent;
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
                this.LJLILLLLZI.F3(webView);
                return true;
            }
        }
        return super.LJIJJLI(webView, webResourceRequest);
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIL(WebView webView, String str) {
        if (str != null && (o.LJJJLIIL(str, "http", false) || o.LJJJLIIL(str, "https", false))) {
            return super.LJIL(webView, str);
        }
        this.LJLILLLLZI.F3(webView);
        return true;
    }
}
