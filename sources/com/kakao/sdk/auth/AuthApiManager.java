package com.kakao.sdk.auth;

import X.C221108m2;
import X.C5H3;
import X.C64653PYz;
import X.C65352Pkq;
import X.C76800UCe;
import X.InterfaceC64642PYo;
import X.InterfaceC65079PgR;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.PZF;
import X.TBT;
import com.kakao.sdk.auth.AuthApi;
import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import com.kakao.sdk.auth.model.CertTokenInfo;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ApplicationInfo;
import com.kakao.sdk.common.model.ApprovalType;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.ContextInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthApiManager {
    public static final Companion Companion = new Companion();
    public static final C5H3<AuthApiManager> instance$delegate = C221108m2.LIZIZ(AuthApiManager$Companion$instance$2.INSTANCE);
    public final ApplicationInfo applicationInfo;
    public final ApprovalType approvalType;
    public final AuthApi authApi;
    public final ContextInfo contextInfo;
    public final TokenManagerProvider tokenManagerProvider;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthApiManager;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final AuthApiManager getInstance() {
            return AuthApiManager.instance$delegate.getValue();
        }

        public Companion() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:5|(8:24|9|10|11|12|(1:14)|15|16)|8|9|10|11|12|(0)|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        
            r2 = X.C141335gf.LIZ(r0);
            X.C3C5.m7constructorimpl(r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Throwable translateError(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.String r0 = "t"
                kotlin.jvm.internal.o.LJIIIZ(r5, r0)
                boolean r0 = r5 instanceof X.PZF     // Catch: java.lang.Throwable -> L5a
                if (r0 == 0) goto L59
                r0 = r5
                X.PZF r0 = (X.PZF) r0     // Catch: java.lang.Throwable -> L5a
                X.PYz r0 = r0.response()     // Catch: java.lang.Throwable -> L5a
                if (r0 != 0) goto L13
                goto L17
            L13:
                X.PVM r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L5a
                if (r0 != 0) goto L19
            L17:
                r1 = 0
                goto L1d
            L19:
                java.lang.String r1 = r0.string()     // Catch: java.lang.Throwable -> L5a
            L1d:
                com.kakao.sdk.common.util.KakaoJson r2 = com.kakao.sdk.common.util.KakaoJson.INSTANCE     // Catch: java.lang.Throwable -> L5a
                kotlin.jvm.internal.o.LJI(r1)     // Catch: java.lang.Throwable -> L5a
                java.lang.Class<com.kakao.sdk.common.model.AuthErrorResponse> r0 = com.kakao.sdk.common.model.AuthErrorResponse.class
                java.lang.Object r3 = r2.fromJson(r1, r0)     // Catch: java.lang.Throwable -> L5a
                com.kakao.sdk.common.model.AuthErrorResponse r3 = (com.kakao.sdk.common.model.AuthErrorResponse) r3     // Catch: java.lang.Throwable -> L5a
                java.lang.String r1 = r3.getError()     // Catch: java.lang.Throwable -> L3a
                java.lang.Class<com.kakao.sdk.common.model.AuthErrorCause> r0 = com.kakao.sdk.common.model.AuthErrorCause.class
                java.lang.Object r2 = r2.fromJson(r1, r0)     // Catch: java.lang.Throwable -> L3a
                com.kakao.sdk.common.model.AuthErrorCause r2 = (com.kakao.sdk.common.model.AuthErrorCause) r2     // Catch: java.lang.Throwable -> L3a
                X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L3a
                goto L42
            L3a:
                r0 = move-exception
                X.3C4 r2 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L5a
                X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L5a
            L42:
                com.kakao.sdk.common.model.AuthErrorCause r1 = com.kakao.sdk.common.model.AuthErrorCause.Unknown     // Catch: java.lang.Throwable -> L5a
                boolean r0 = X.C3C5.m12isFailureimpl(r2)     // Catch: java.lang.Throwable -> L5a
                if (r0 == 0) goto L4b
                r2 = r1
            L4b:
                com.kakao.sdk.common.model.AuthErrorCause r2 = (com.kakao.sdk.common.model.AuthErrorCause) r2     // Catch: java.lang.Throwable -> L5a
                com.kakao.sdk.common.model.AuthError r1 = new com.kakao.sdk.common.model.AuthError     // Catch: java.lang.Throwable -> L5a
                X.PZF r5 = (X.PZF) r5     // Catch: java.lang.Throwable -> L5a
                int r0 = r5.code()     // Catch: java.lang.Throwable -> L5a
                r1.<init>(r0, r2, r3)     // Catch: java.lang.Throwable -> L5a
                return r1
            L59:
                return r5
            L5a:
                r0 = move-exception
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.auth.AuthApiManager.Companion.translateError(java.lang.Throwable):java.lang.Throwable");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthApiManager() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static final AuthApiManager getInstance() {
        return Companion.getInstance();
    }

    public final void refreshToken$auth_release(InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        refreshToken$auth_release$default(this, null, callback, 1, null);
    }

    public final boolean hasToken$auth_release() {
        if (this.tokenManagerProvider.getManager().getToken() != null) {
            return true;
        }
        return false;
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final ApprovalType getApprovalType() {
        return this.approvalType;
    }

    public final ContextInfo getContextInfo() {
        return this.contextInfo;
    }

    public final TokenManagerProvider getTokenManagerProvider() {
        return this.tokenManagerProvider;
    }

    public final void agt$auth_release(final InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        String accessToken;
        o.LJIIIZ(callback, "callback");
        OAuthToken token = this.tokenManagerProvider.getManager().getToken();
        if (token != null && (accessToken = token.getAccessToken()) != null) {
            this.authApi.agt(getApplicationInfo().getAppKey(), accessToken).LLLZ(new InterfaceC64642PYo<AgtResponse>() { // from class: com.kakao.sdk.auth.AuthApiManager$agt$1$1
                @Override // X.InterfaceC64642PYo
                public void onFailure(InterfaceC65079PgR<AgtResponse> call, Throwable t) {
                    o.LJIIIZ(call, "call");
                    o.LJIIIZ(t, "t");
                    callback.invoke(null, t);
                }

                @Override // X.InterfaceC64642PYo
                public void onResponse(InterfaceC65079PgR<AgtResponse> call, C64653PYz<AgtResponse> response) {
                    o.LJIIIZ(call, "call");
                    o.LJIIIZ(response, "response");
                    AgtResponse agtResponse = response.LIZIZ;
                    if (agtResponse == null) {
                        callback.invoke(null, AuthApiManager.Companion.translateError(new PZF(response)));
                    } else {
                        callback.invoke(agtResponse.getAgt(), null);
                    }
                }
            });
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        callback.invoke(null, new ClientError(ClientErrorCause.TokenNotFound, "Access token not found. You must login first."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OAuthToken refreshToken$auth_release(OAuthToken oldToken) {
        OAuthToken fromResponse;
        o.LJIIIZ(oldToken, "oldToken");
        C64653PYz execute = AuthApi.DefaultImpls.refreshToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), oldToken.getRefreshToken(), this.approvalType.getValue(), null, 16, null).execute();
        AccessTokenResponse accessTokenResponse = (AccessTokenResponse) execute.LIZIZ;
        if (accessTokenResponse == null || (fromResponse = OAuthToken.Companion.fromResponse(accessTokenResponse, oldToken)) == null) {
            throw Companion.translateError(new PZF(execute));
        }
        this.tokenManagerProvider.getManager().setToken(fromResponse);
        return fromResponse;
    }

    public final void refreshToken$auth_release(final OAuthToken oldToken, final InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(oldToken, "oldToken");
        o.LJIIIZ(callback, "callback");
        AuthApi.DefaultImpls.refreshToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), oldToken.getRefreshToken(), this.approvalType.getValue(), null, 16, null).LLLZ(new InterfaceC64642PYo<AccessTokenResponse>() { // from class: com.kakao.sdk.auth.AuthApiManager$refreshToken$1
            @Override // X.InterfaceC64642PYo
            public void onFailure(InterfaceC65079PgR<AccessTokenResponse> call, Throwable t) {
                o.LJIIIZ(call, "call");
                o.LJIIIZ(t, "t");
                callback.invoke(null, t);
            }

            @Override // X.InterfaceC64642PYo
            public void onResponse(InterfaceC65079PgR<AccessTokenResponse> call, C64653PYz<AccessTokenResponse> response) {
                o.LJIIIZ(call, "call");
                o.LJIIIZ(response, "response");
                if (response.LIZ()) {
                    AccessTokenResponse accessTokenResponse = response.LIZIZ;
                    if (accessTokenResponse == null) {
                        callback.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                        return;
                    }
                    OAuthToken oAuthToken = oldToken;
                    AuthApiManager authApiManager = this;
                    InterfaceC88471Ynr<OAuthToken, Throwable, C76800UCe> interfaceC88471Ynr = callback;
                    OAuthToken fromResponse = OAuthToken.Companion.fromResponse(accessTokenResponse, oAuthToken);
                    authApiManager.getTokenManagerProvider().getManager().setToken(fromResponse);
                    interfaceC88471Ynr.invoke(fromResponse, null);
                    return;
                }
                callback.invoke(null, AuthApiManager.Companion.translateError(new PZF(response)));
            }
        });
    }

    public final void issueAccessToken$auth_release(String code, String str, final InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(callback, "callback");
        AuthApi.DefaultImpls.issueAccessToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), code, this.applicationInfo.getRedirectUri(), str, this.approvalType.getValue(), null, 64, null).LLLZ(new InterfaceC64642PYo<AccessTokenResponse>() { // from class: com.kakao.sdk.auth.AuthApiManager$issueAccessToken$1
            @Override // X.InterfaceC64642PYo
            public void onFailure(InterfaceC65079PgR<AccessTokenResponse> call, Throwable t) {
                o.LJIIIZ(call, "call");
                o.LJIIIZ(t, "t");
                callback.invoke(null, t);
            }

            @Override // X.InterfaceC64642PYo
            public void onResponse(InterfaceC65079PgR<AccessTokenResponse> call, C64653PYz<AccessTokenResponse> response) {
                o.LJIIIZ(call, "call");
                o.LJIIIZ(response, "response");
                if (response.LIZ()) {
                    AccessTokenResponse accessTokenResponse = response.LIZIZ;
                    if (accessTokenResponse == null) {
                        callback.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                        return;
                    }
                    AuthApiManager authApiManager = this;
                    InterfaceC88471Ynr<OAuthToken, Throwable, C76800UCe> interfaceC88471Ynr = callback;
                    OAuthToken fromResponse$default = OAuthToken.Companion.fromResponse$default(OAuthToken.Companion, accessTokenResponse, null, 2, null);
                    authApiManager.getTokenManagerProvider().getManager().setToken(fromResponse$default);
                    interfaceC88471Ynr.invoke(fromResponse$default, null);
                    return;
                }
                callback.invoke(null, AuthApiManager.Companion.translateError(new PZF(response)));
            }
        });
    }

    public final void issueAccessTokenWithCert$auth_release(String code, String str, final InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(callback, "callback");
        AuthApi.DefaultImpls.issueAccessToken$default(this.authApi, this.applicationInfo.getAppKey(), this.contextInfo.getSigningKeyHash(), code, this.applicationInfo.getRedirectUri(), str, this.approvalType.getValue(), null, 64, null).LLLZ(new InterfaceC64642PYo<AccessTokenResponse>() { // from class: com.kakao.sdk.auth.AuthApiManager$issueAccessTokenWithCert$1
            @Override // X.InterfaceC64642PYo
            public void onFailure(InterfaceC65079PgR<AccessTokenResponse> call, Throwable t) {
                o.LJIIIZ(call, "call");
                o.LJIIIZ(t, "t");
                callback.invoke(null, t);
            }

            @Override // X.InterfaceC64642PYo
            public void onResponse(InterfaceC65079PgR<AccessTokenResponse> call, C64653PYz<AccessTokenResponse> response) {
                o.LJIIIZ(call, "call");
                o.LJIIIZ(response, "response");
                if (response.LIZ()) {
                    AccessTokenResponse accessTokenResponse = response.LIZIZ;
                    if (accessTokenResponse == null) {
                        callback.invoke(null, new ClientError(ClientErrorCause.Unknown, "No body"));
                        return;
                    }
                    InterfaceC88471Ynr<CertTokenInfo, Throwable, C76800UCe> interfaceC88471Ynr = callback;
                    AuthApiManager authApiManager = this;
                    OAuthToken fromResponse$default = OAuthToken.Companion.fromResponse$default(OAuthToken.Companion, accessTokenResponse, null, 2, null);
                    String txId = accessTokenResponse.getTxId();
                    if (txId == null) {
                        interfaceC88471Ynr.invoke(null, new ClientError(ClientErrorCause.Unknown, "txId is null"));
                        return;
                    } else {
                        authApiManager.getTokenManagerProvider().getManager().setToken(fromResponse$default);
                        interfaceC88471Ynr.invoke(new CertTokenInfo(fromResponse$default, txId), null);
                        return;
                    }
                }
                callback.invoke(null, AuthApiManager.Companion.translateError(new PZF(response)));
            }
        });
    }

    public static /* synthetic */ OAuthToken refreshToken$auth_release$default(AuthApiManager authApiManager, OAuthToken oAuthToken, int i, Object obj) {
        if ((i & 1) == 0 || (oAuthToken = authApiManager.tokenManagerProvider.getManager().getToken()) != null) {
            return authApiManager.refreshToken$auth_release(oAuthToken);
        }
        throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
    }

    public AuthApiManager(AuthApi authApi, TokenManagerProvider tokenManagerProvider, ApplicationInfo applicationInfo, ContextInfo contextInfo, ApprovalType approvalType) {
        o.LJIIIZ(authApi, "authApi");
        o.LJIIIZ(tokenManagerProvider, "tokenManagerProvider");
        o.LJIIIZ(applicationInfo, "applicationInfo");
        o.LJIIIZ(contextInfo, "contextInfo");
        o.LJIIIZ(approvalType, "approvalType");
        this.authApi = authApi;
        this.tokenManagerProvider = tokenManagerProvider;
        this.applicationInfo = applicationInfo;
        this.contextInfo = contextInfo;
        this.approvalType = approvalType;
    }

    public static /* synthetic */ void refreshToken$auth_release$default(AuthApiManager authApiManager, OAuthToken oAuthToken, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) == 0 || (oAuthToken = authApiManager.tokenManagerProvider.getManager().getToken()) != null) {
            authApiManager.refreshToken$auth_release(oAuthToken, interfaceC88471Ynr);
            return;
        }
        throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
    }

    public static /* synthetic */ void issueAccessToken$auth_release$default(AuthApiManager authApiManager, String str, String str2, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        authApiManager.issueAccessToken$auth_release(str, str2, interfaceC88471Ynr);
    }

    public static /* synthetic */ void issueAccessTokenWithCert$auth_release$default(AuthApiManager authApiManager, String str, String str2, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        authApiManager.issueAccessTokenWithCert$auth_release(str, str2, interfaceC88471Ynr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AuthApiManager(com.kakao.sdk.auth.AuthApi r3, com.kakao.sdk.auth.TokenManagerProvider r4, com.kakao.sdk.common.model.ApplicationInfo r5, com.kakao.sdk.common.model.ContextInfo r6, com.kakao.sdk.common.model.ApprovalType r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r0 = r8 & 1
            if (r0 == 0) goto L17
            com.kakao.sdk.network.ApiFactory r0 = com.kakao.sdk.network.ApiFactory.INSTANCE
            X.PfS r1 = com.kakao.sdk.auth.network.ApiFactoryKt.getKauth(r0)
            java.lang.Class<com.kakao.sdk.auth.AuthApi> r0 = com.kakao.sdk.auth.AuthApi.class
            java.lang.Object r3 = r1.LIZIZ(r0)
            java.lang.String r0 = "ApiFactory.kauth.create(AuthApi::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            com.kakao.sdk.auth.AuthApi r3 = (com.kakao.sdk.auth.AuthApi) r3
        L17:
            r0 = r8 & 2
            if (r0 == 0) goto L21
            com.kakao.sdk.auth.TokenManagerProvider$Companion r0 = com.kakao.sdk.auth.TokenManagerProvider.Companion
            com.kakao.sdk.auth.TokenManagerProvider r4 = r0.getInstance()
        L21:
            r0 = r8 & 4
            if (r0 == 0) goto L2b
            com.kakao.sdk.common.KakaoSdk r0 = com.kakao.sdk.common.KakaoSdk.INSTANCE
            com.kakao.sdk.common.model.ApplicationContextInfo r5 = r0.getApplicationContextInfo()
        L2b:
            r0 = r8 & 8
            if (r0 == 0) goto L35
            com.kakao.sdk.common.KakaoSdk r0 = com.kakao.sdk.common.KakaoSdk.INSTANCE
            com.kakao.sdk.common.model.ApplicationContextInfo r6 = r0.getApplicationContextInfo()
        L35:
            r0 = r8 & 16
            if (r0 == 0) goto L3f
            com.kakao.sdk.common.KakaoSdk r0 = com.kakao.sdk.common.KakaoSdk.INSTANCE
            com.kakao.sdk.common.model.ApprovalType r7 = r0.getApprovalType()
        L3f:
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.auth.AuthApiManager.<init>(com.kakao.sdk.auth.AuthApi, com.kakao.sdk.auth.TokenManagerProvider, com.kakao.sdk.common.model.ApplicationInfo, com.kakao.sdk.common.model.ContextInfo, com.kakao.sdk.common.model.ApprovalType, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
