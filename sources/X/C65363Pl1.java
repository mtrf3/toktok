package X;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;

/* renamed from: X.Pl1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65363Pl1 implements InterfaceC65368Pl6 {
    public final InterfaceC65360Pky LIZ;
    public TwitterAuthToken LIZIZ;
    public final ProgressBar LIZJ;
    public final WebView LIZLLL;
    public final TwitterAuthConfig LJ;
    public final OAuth1aService LJFF;

    public final void LIZ(int i, C65288Pjo c65288Pjo) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", c65288Pjo);
        Activity activity = (Activity) this.LIZ;
        activity.setResult(i, intent);
        activity.finish();
    }

    public C65363Pl1(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, InterfaceC65360Pky interfaceC65360Pky) {
        this.LIZJ = progressBar;
        this.LIZLLL = webView;
        this.LJ = twitterAuthConfig;
        this.LJFF = oAuth1aService;
        this.LIZ = interfaceC65360Pky;
    }
}
