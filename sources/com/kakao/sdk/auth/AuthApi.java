package com.kakao.sdk.auth;

import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC65079PgR;
import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;

/* loaded from: classes12.dex */
public interface AuthApi {
    @InterfaceC195787mI
    @E4T("api/agt")
    InterfaceC65079PgR<AgtResponse> agt(@InterfaceC64987Pex("client_id") String str, @InterfaceC64987Pex("access_token") String str2);

    @InterfaceC195787mI
    @E4T("oauth/token")
    InterfaceC65079PgR<AccessTokenResponse> issueAccessToken(@InterfaceC64987Pex("client_id") String str, @InterfaceC64987Pex("android_key_hash") String str2, @InterfaceC64987Pex("code") String str3, @InterfaceC64987Pex("redirect_uri") String str4, @InterfaceC64987Pex("code_verifier") String str5, @InterfaceC64987Pex("approval_type") String str6, @InterfaceC64987Pex("grant_type") String str7);

    @InterfaceC195787mI
    @E4T("oauth/token")
    InterfaceC65079PgR<AccessTokenResponse> refreshToken(@InterfaceC64987Pex("client_id") String str, @InterfaceC64987Pex("android_key_hash") String str2, @InterfaceC64987Pex("refresh_token") String str3, @InterfaceC64987Pex("approval_type") String str4, @InterfaceC64987Pex("grant_type") String str5);

    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC65079PgR refreshToken$default(AuthApi authApi, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str4 = null;
                }
                if ((i & 16) != 0) {
                    str5 = "refresh_token";
                }
                return authApi.refreshToken(str, str2, str3, str4, str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshToken");
        }

        public static /* synthetic */ InterfaceC65079PgR issueAccessToken$default(AuthApi authApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            String str8 = str7;
            String str9 = str5;
            if (obj == null) {
                String str10 = null;
                if ((i & 16) != 0) {
                    str9 = null;
                }
                if ((i & 32) == 0) {
                    str10 = str6;
                }
                if ((i & 64) != 0) {
                    str8 = "authorization_code";
                }
                return authApi.issueAccessToken(str, str2, str3, str4, str9, str10, str8);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueAccessToken");
        }
    }
}
