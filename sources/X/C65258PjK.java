package X;

import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

/* renamed from: X.PjK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65258PjK extends AbstractC65259PjL<OAuth2Token> {
    public final /* synthetic */ AbstractC65259PjL LIZ;
    public final /* synthetic */ OAuth2Service LIZIZ;

    @Override // X.AbstractC65259PjL
    public final void LIZ(C65053Pg1 c65053Pg1) {
        C65265PjR.LIZIZ().getClass();
        AbstractC65259PjL abstractC65259PjL = this.LIZ;
        if (abstractC65259PjL != null) {
            abstractC65259PjL.LIZ(c65053Pg1);
        }
    }

    @Override // X.AbstractC65259PjL
    public final void LIZIZ(H4F h4f) {
        OAuth2Token oAuth2Token = (OAuth2Token) h4f.LIZ;
        C65260PjM c65260PjM = new C65260PjM(this, oAuth2Token);
        OAuth2Service.OAuth2Api oAuth2Api = this.LIZIZ.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bearer ");
        LIZ.append(oAuth2Token.accessToken);
        oAuth2Api.getGuestToken(X1D.LIZIZ(LIZ)).LLLZ(c65260PjM);
    }

    public C65258PjK(OAuth2Service oAuth2Service, C65257PjJ c65257PjJ) {
        this.LIZIZ = oAuth2Service;
        this.LIZ = c65257PjJ;
    }
}
