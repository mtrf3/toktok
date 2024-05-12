package com.twitter.sdk.android.core.internal.oauth;

import X.AbstractC65029Pfd;
import X.C64537PUn;
import X.C65051Pfz;
import X.C65257PjJ;
import X.C65258PjK;
import X.C65263PjP;
import X.C78999UzT;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC36226EJq;
import X.InterfaceC64987Pex;
import X.InterfaceC65002PfC;
import X.InterfaceC65079PgR;
import X.X1D;
import com.twitter.sdk.android.core.TwitterAuthConfig;

/* loaded from: classes12.dex */
public final class OAuth2Service extends AbstractC65029Pfd {
    public final OAuth2Api LJ;

    /* loaded from: classes12.dex */
    public interface OAuth2Api {
        @InterfaceC36226EJq({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @InterfaceC195787mI
        @E4T("/oauth2/token")
        InterfaceC65079PgR<OAuth2Token> getAppAuthToken(@InterfaceC65002PfC("Authorization") String str, @InterfaceC64987Pex("grant_type") String str2);

        @E4T("/1.1/guest/activate.json")
        InterfaceC65079PgR<GuestTokenResponse> getGuestToken(@InterfaceC65002PfC("Authorization") String str);
    }

    public final void LIZ(C65257PjJ c65257PjJ) {
        C65258PjK c65258PjK = new C65258PjK(this, c65257PjJ);
        OAuth2Api oAuth2Api = this.LJ;
        TwitterAuthConfig twitterAuthConfig = this.LIZ.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C78999UzT.LJIJ(twitterAuthConfig.consumerKey));
        LIZ.append(":");
        LIZ.append(C78999UzT.LJIJ(twitterAuthConfig.consumerSecret));
        C64537PUn encodeUtf8 = C64537PUn.encodeUtf8(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Basic ");
        LIZ2.append(encodeUtf8.base64());
        oAuth2Api.getAppAuthToken(X1D.LIZIZ(LIZ2), "client_credentials").LLLZ(c65258PjK);
    }

    public OAuth2Service(C65263PjP c65263PjP, C65051Pfz c65051Pfz) {
        super(c65263PjP, c65051Pfz);
        this.LJ = (OAuth2Api) this.LIZLLL.LIZIZ(OAuth2Api.class);
    }
}
