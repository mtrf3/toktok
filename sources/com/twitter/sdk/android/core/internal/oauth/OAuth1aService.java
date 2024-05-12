package com.twitter.sdk.android.core.internal.oauth;

import X.AbstractC65029Pfd;
import X.C65051Pfz;
import X.C65263PjP;
import X.C65287Pjn;
import X.C65314PkE;
import X.C65359Pkx;
import X.C65361Pkz;
import X.C78999UzT;
import X.E4T;
import X.InterfaceC64989Pez;
import X.InterfaceC65002PfC;
import X.InterfaceC65079PgR;
import X.JBR;
import X.PVM;
import X.X1D;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.TreeMap;

/* loaded from: classes12.dex */
public final class OAuth1aService extends AbstractC65029Pfd {
    public final OAuthApi LJ;

    /* loaded from: classes12.dex */
    public interface OAuthApi {
        @E4T("/oauth/access_token")
        InterfaceC65079PgR<PVM> getAccessToken(@InterfaceC65002PfC("Authorization") String str, @InterfaceC64989Pez("oauth_verifier") String str2);

        @E4T("/oauth/request_token")
        InterfaceC65079PgR<PVM> getTempToken(@InterfaceC65002PfC("Authorization") String str);
    }

    public static OAuthResponse LIZIZ(String str) {
        long j;
        TreeMap LJIILIIL = C78999UzT.LJIILIIL(str, false);
        String str2 = (String) LJIILIIL.get("oauth_token");
        String str3 = (String) LJIILIIL.get("oauth_token_secret");
        String str4 = (String) LJIILIIL.get("screen_name");
        if (LJIILIIL.containsKey("user_id")) {
            j = CastLongProtector.parseLong((String) LJIILIIL.get("user_id"));
        } else {
            j = 0;
        }
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), j, str4);
    }

    public final String LIZ(TwitterAuthConfig twitterAuthConfig) {
        Uri.Builder buildUpon = UriProtector.parse("twittersdk://callback").buildUpon();
        this.LIZ.getClass();
        return buildUpon.appendQueryParameter("version", "3.2.0.11").appendQueryParameter("app", twitterAuthConfig.consumerKey).build().toString();
    }

    public final void LIZLLL(C65361Pkz c65361Pkz) {
        TwitterAuthConfig twitterAuthConfig = this.LIZ.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        this.LJ.getTempToken(C65314PkE.LJFF(twitterAuthConfig, null, LIZ(twitterAuthConfig), "POST", JBR.LJFF(LIZ, this.LIZIZ.LIZ, "/oauth/request_token", LIZ), null)).LLLZ(new C65287Pjn(c65361Pkz));
    }

    public OAuth1aService(C65263PjP c65263PjP, C65051Pfz c65051Pfz) {
        super(c65263PjP, c65051Pfz);
        this.LJ = (OAuthApi) this.LIZLLL.LIZIZ(OAuthApi.class);
    }

    public final void LIZJ(C65359Pkx c65359Pkx, TwitterAuthToken twitterAuthToken, String str) {
        StringBuilder LIZ = X1D.LIZ();
        this.LJ.getAccessToken(C65314PkE.LJFF(this.LIZ.LIZLLL, twitterAuthToken, null, "POST", JBR.LJFF(LIZ, this.LIZIZ.LIZ, "/oauth/access_token", LIZ), null), str).LLLZ(new C65287Pjn(c65359Pkx));
    }
}
