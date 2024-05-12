package com.kakao.sdk.auth;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.C76800UCe;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.TBT;
import com.kakao.sdk.auth.model.CertTokenInfo;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AuthApiClient {
    public static final Companion Companion = new Companion();
    public static final C5H3<AuthApiClient> instance$delegate = C221108m2.LIZIZ(AuthApiClient$Companion$instance$2.INSTANCE);
    public final AuthApiManager manager;
    public final TokenManagerProvider tokenManagerProvider;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;

        static {
            TBT tbt = new TBT(C65352Pkq.LIZ(Companion.class), "instance", "getInstance()Lcom/kakao/sdk/auth/AuthApiClient;");
            C65352Pkq.LIZ.getClass();
            $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final AuthApiClient getInstance() {
            return AuthApiClient.instance$delegate.getValue();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthApiClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final AuthApiClient getInstance() {
        return Companion.getInstance();
    }

    public final void refreshAccessToken(InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        refreshAccessToken$default(this, null, callback, 1, null);
    }

    public final void refreshToken(InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        refreshToken$default(this, null, callback, 1, null);
    }

    public final boolean hasToken() {
        return this.manager.hasToken$auth_release();
    }

    public final TokenManagerProvider getTokenManagerProvider() {
        return this.tokenManagerProvider;
    }

    public final void agt(InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.manager.agt$auth_release(callback);
    }

    public AuthApiClient(AuthApiManager manager, TokenManagerProvider tokenManagerProvider) {
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(tokenManagerProvider, "tokenManagerProvider");
        this.manager = manager;
        this.tokenManagerProvider = tokenManagerProvider;
    }

    public final void refreshAccessToken(OAuthToken oldToken, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(oldToken, "oldToken");
        o.LJIIIZ(callback, "callback");
        this.manager.refreshToken$auth_release(oldToken, callback);
    }

    public final void refreshToken(OAuthToken oldToken, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(oldToken, "oldToken");
        o.LJIIIZ(callback, "callback");
        this.manager.refreshToken$auth_release(oldToken, callback);
    }

    public final void issueAccessToken(String code, String str, InterfaceC88471Ynr<? super OAuthToken, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(callback, "callback");
        this.manager.issueAccessToken$auth_release(code, str, callback);
    }

    public final void issueAccessTokenWithCert(String code, String str, InterfaceC88471Ynr<? super CertTokenInfo, ? super Throwable, C76800UCe> callback) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(callback, "callback");
        this.manager.issueAccessTokenWithCert$auth_release(code, str, callback);
    }

    public /* synthetic */ AuthApiClient(AuthApiManager authApiManager, TokenManagerProvider tokenManagerProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AuthApiManager.Companion.getInstance() : authApiManager, (i & 2) != 0 ? TokenManagerProvider.Companion.getInstance() : tokenManagerProvider);
    }

    public static /* synthetic */ void refreshAccessToken$default(AuthApiClient authApiClient, OAuthToken oAuthToken, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) == 0 || (oAuthToken = authApiClient.tokenManagerProvider.getManager().getToken()) != null) {
            authApiClient.refreshAccessToken(oAuthToken, interfaceC88471Ynr);
            return;
        }
        throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
    }

    public static /* synthetic */ void refreshToken$default(AuthApiClient authApiClient, OAuthToken oAuthToken, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 1) == 0 || (oAuthToken = authApiClient.tokenManagerProvider.getManager().getToken()) != null) {
            authApiClient.refreshToken(oAuthToken, interfaceC88471Ynr);
            return;
        }
        throw new ClientError(ClientErrorCause.TokenNotFound, "Refresh token not found. You must login first.");
    }

    public static /* synthetic */ void issueAccessToken$default(AuthApiClient authApiClient, String str, String str2, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        authApiClient.issueAccessToken(str, str2, interfaceC88471Ynr);
    }

    public static /* synthetic */ void issueAccessTokenWithCert$default(AuthApiClient authApiClient, String str, String str2, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        authApiClient.issueAccessTokenWithCert(str, str2, interfaceC88471Ynr);
    }
}
