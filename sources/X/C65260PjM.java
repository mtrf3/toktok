package X;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.GuestTokenResponse;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

/* renamed from: X.PjM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65260PjM extends AbstractC65259PjL<GuestTokenResponse> {
    public final /* synthetic */ OAuth2Token LIZ;
    public final /* synthetic */ C65258PjK LIZIZ;

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        C65265PjR.LIZIZ().getClass();
        this.LIZIZ.LIZ.LIZ(c65053Pg1);
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        OAuth2Token oAuth2Token = this.LIZ;
        this.LIZIZ.LIZ.LIZIZ(new H4F(new GuestAuthToken(oAuth2Token.tokenType, oAuth2Token.accessToken, ((GuestTokenResponse) h4f.LIZ).guestToken), null));
    }

    public C65260PjM(C65258PjK c65258PjK, OAuth2Token oAuth2Token) {
        this.LIZIZ = c65258PjK;
        this.LIZ = oAuth2Token;
    }
}
