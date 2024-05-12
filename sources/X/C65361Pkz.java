package X;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

/* renamed from: X.Pkz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65361Pkz extends AbstractC65259PjL<OAuthResponse> {
    public final /* synthetic */ C65363Pl1 LIZ;

    public C65361Pkz(C65363Pl1 c65363Pl1) {
        this.LIZ = c65363Pl1;
    }

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        C65265PjR.LIZIZ().getClass();
        this.LIZ.LIZ(1, new C65288Pjo("Failed to get request token"));
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        C65363Pl1 c65363Pl1 = this.LIZ;
        TwitterAuthToken twitterAuthToken = ((OAuthResponse) h4f.LIZ).authToken;
        c65363Pl1.LIZIZ = twitterAuthToken;
        String[] strArr = {"oauth", "authorize"};
        Uri.Builder buildUpon = UriProtector.parse(c65363Pl1.LJFF.LIZIZ.LIZ).buildUpon();
        int i = 0;
        do {
            buildUpon.appendPath(strArr[i]);
            i++;
        } while (i < 2);
        String uri = buildUpon.appendQueryParameter("oauth_token", twitterAuthToken.token).build().toString();
        C65265PjR.LIZIZ().getClass();
        WebView webView = this.LIZ.LIZLLL;
        C65363Pl1 c65363Pl12 = this.LIZ;
        C65362Pl0 c65362Pl0 = new C65362Pl0(c65363Pl12.LJFF.LIZ(c65363Pl12.LJ), this.LIZ);
        C60175NjX c60175NjX = new C60175NjX();
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        C16880lQ.LLZLI(webView, c65362Pl0);
        C16880lQ.LLZZ(webView, uri);
        webView.setVisibility(4);
        webView.setWebChromeClient(c60175NjX);
    }
}
