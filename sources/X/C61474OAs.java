package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.OAs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61474OAs extends C60413NnN {
    public final /* synthetic */ ActivityC61947OSx LJLILLLLZI;

    public C61474OAs(ActivityC61947OSx activityC61947OSx) {
        this.LJLILLLLZI = activityC61947OSx;
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIJJLI(WebView webView, WebResourceRequest request) {
        o.LJIIIZ(request, "request");
        String str = this.LJLILLLLZI.redirectUri;
        String str2 = null;
        if (str != null) {
            android.net.Uri url = request.getUrl();
            if (url != null) {
                str2 = url.toString();
            }
            if (str2 == null || !ujb.o.LJJJLIIL(str2, str, false)) {
                return false;
            }
            this.LJLILLLLZI.buildAndSendAuthResponseFromWebviewRedirect(str2);
            return true;
        }
        o.LJIJI("redirectUri");
        throw null;
    }
}
