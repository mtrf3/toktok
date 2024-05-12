package X;

import com.kakao.sdk.auth.model.OAuthToken;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PlD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65375PlD {
    public final String LIZ;
    public final Date LIZIZ;
    public final List<String> LIZJ;

    public C65375PlD() {
        throw null;
    }

    public C65375PlD(OAuthToken delegate) {
        o.LJIIIZ(delegate, "delegate");
        String accessToken = delegate.getAccessToken();
        Date accessTokenExpiresAt = delegate.getAccessTokenExpiresAt();
        String refreshToken = delegate.getRefreshToken();
        Date refreshTokenExpiresAt = delegate.getRefreshTokenExpiresAt();
        delegate.getIdToken();
        List<String> scopes = delegate.getScopes();
        o.LJIIIZ(accessToken, "accessToken");
        o.LJIIIZ(accessTokenExpiresAt, "accessTokenExpiresAt");
        o.LJIIIZ(refreshToken, "refreshToken");
        o.LJIIIZ(refreshTokenExpiresAt, "refreshTokenExpiresAt");
        this.LIZ = accessToken;
        this.LIZIZ = accessTokenExpiresAt;
        this.LIZJ = scopes;
    }
}
