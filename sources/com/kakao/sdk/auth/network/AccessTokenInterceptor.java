package com.kakao.sdk.auth.network;

import X.InterfaceC48121Iub;
import com.kakao.sdk.auth.AuthApiManager;
import com.kakao.sdk.auth.TokenManagerProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AccessTokenInterceptor implements InterfaceC48121Iub {
    public final AuthApiManager manager;
    public final TokenManagerProvider tokenManagerProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public AccessTokenInterceptor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        if (r3 == null) goto L5;
     */
    @Override // X.InterfaceC48121Iub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C64598PWw intercept(X.PXZ r8) {
        /*
            r7 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.kakao.sdk.auth.TokenManagerProvider r0 = r7.tokenManagerProvider
            com.kakao.sdk.auth.TokenManageable r0 = r0.getManager()
            com.kakao.sdk.auth.model.OAuthToken r0 = r0.getToken()
            r6 = 0
            if (r0 != 0) goto Lb7
            r4 = r6
        L13:
            okhttp3.Request r3 = r8.request()
        L17:
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.PWw r5 = r8.LIZ(r3)
            X.PVM r0 = r5.LJLJL
            if (r0 != 0) goto Lb1
            r2 = r6
        L25:
            X.PWv r1 = new X.PWv
            r1.<init>(r5)
            if (r0 != 0) goto Lab
        L2c:
            if (r2 != 0) goto La9
            java.lang.String r0 = ""
        L30:
            X.PVM r0 = X.PVM.create(r6, r0)
            r1.LJI = r0
            X.PWw r5 = r1.LIZ()
            boolean r0 = r5.LIZIZ()
            if (r0 != 0) goto L42
            if (r2 != 0) goto L43
        L42:
            return r5
        L43:
            com.kakao.sdk.common.util.KakaoJson r1 = com.kakao.sdk.common.util.KakaoJson.INSTANCE
            java.lang.Class<com.kakao.sdk.common.model.ApiErrorResponse> r0 = com.kakao.sdk.common.model.ApiErrorResponse.class
            java.lang.Object r6 = r1.fromJson(r2, r0)
            com.kakao.sdk.common.model.ApiErrorResponse r6 = (com.kakao.sdk.common.model.ApiErrorResponse) r6
            if (r6 != 0) goto L50
            goto L42
        L50:
            com.kakao.sdk.common.util.KakaoJson r2 = com.kakao.sdk.common.util.KakaoJson.INSTANCE
            int r0 = r6.getCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Class<com.kakao.sdk.common.model.ApiErrorCause> r0 = com.kakao.sdk.common.model.ApiErrorCause.class
            java.lang.Object r2 = r2.fromJson(r1, r0)
            com.kakao.sdk.common.model.ApiErrorCause r2 = (com.kakao.sdk.common.model.ApiErrorCause) r2
            if (r2 == 0) goto L42
            com.kakao.sdk.common.model.ApiError r1 = new com.kakao.sdk.common.model.ApiError
            int r0 = r5.LJLJI
            r1.<init>(r0, r2, r6)
            com.kakao.sdk.common.model.ApiErrorCause r1 = r1.getReason()
            com.kakao.sdk.common.model.ApiErrorCause r0 = com.kakao.sdk.common.model.ApiErrorCause.InvalidToken
            if (r1 != r0) goto L42
            monitor-enter(r7)
            com.kakao.sdk.auth.TokenManagerProvider r0 = r7.tokenManagerProvider     // Catch: java.lang.Throwable -> Ld9
            com.kakao.sdk.auth.TokenManageable r0 = r0.getManager()     // Catch: java.lang.Throwable -> Ld9
            com.kakao.sdk.auth.model.OAuthToken r1 = r0.getToken()     // Catch: java.lang.Throwable -> Ld9
            if (r1 == 0) goto La7
            java.lang.String r0 = r1.getAccessToken()     // Catch: java.lang.Throwable -> Ld9
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)     // Catch: java.lang.Throwable -> Ld9
            if (r0 != 0) goto L9c
            java.lang.String r0 = r1.getAccessToken()     // Catch: java.lang.Throwable -> Ld9
        L8e:
            okhttp3.Request r0 = com.kakao.sdk.auth.network.AccessTokenInterceptorKt.withAccessToken(r3, r0)     // Catch: java.lang.Throwable -> Ld9
            X.PWw r1 = r8.LIZ(r0)     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r0 = "chain.proceed(request.withAccessToken(accessToken))"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Ld9
            goto Ld0
        L9c:
            com.kakao.sdk.auth.AuthApiManager r0 = r7.manager     // Catch: java.lang.Throwable -> Ld2
            com.kakao.sdk.auth.model.OAuthToken r0 = r0.refreshToken$auth_release(r1)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r0 = r0.getAccessToken()     // Catch: java.lang.Throwable -> Ld2
            goto L8e
        La7:
            monitor-exit(r7)
            goto L42
        La9:
            r0 = r2
            goto L30
        Lab:
            X.Fin r6 = r0.contentType()
            goto L2c
        Lb1:
            java.lang.String r2 = r0.string()
            goto L25
        Lb7:
            java.lang.String r4 = r0.getAccessToken()
            if (r4 != 0) goto Lbf
            goto L13
        Lbf:
            okhttp3.Request r1 = r8.request()
            java.lang.String r0 = "chain.request()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            okhttp3.Request r3 = com.kakao.sdk.auth.network.AccessTokenInterceptorKt.withAccessToken(r1, r4)
            if (r3 != 0) goto L17
            goto L13
        Ld0:
            monitor-exit(r7)
            return r1
        Ld2:
            r1 = move-exception
            com.kakao.sdk.network.ExceptionWrapper r0 = new com.kakao.sdk.network.ExceptionWrapper     // Catch: java.lang.Throwable -> Ld9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld9
            throw r0     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.sdk.auth.network.AccessTokenInterceptor.intercept(X.PXZ):X.PWw");
    }

    public AccessTokenInterceptor(TokenManagerProvider tokenManagerProvider, AuthApiManager manager) {
        o.LJIIIZ(tokenManagerProvider, "tokenManagerProvider");
        o.LJIIIZ(manager, "manager");
        this.tokenManagerProvider = tokenManagerProvider;
        this.manager = manager;
    }

    public /* synthetic */ AccessTokenInterceptor(TokenManagerProvider tokenManagerProvider, AuthApiManager authApiManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TokenManagerProvider.Companion.getInstance() : tokenManagerProvider, (i & 2) != 0 ? AuthApiManager.Companion.getInstance() : authApiManager);
    }
}
