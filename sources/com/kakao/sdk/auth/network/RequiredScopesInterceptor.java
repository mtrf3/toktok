package com.kakao.sdk.auth.network;

import X.C39745Fin;
import X.C64597PWv;
import X.C64598PWw;
import X.C68322mC;
import X.InterfaceC48121Iub;
import X.PVM;
import X.PXZ;
import com.kakao.sdk.auth.AuthApiClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.common.KakaoSdk;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.model.ApplicationContextInfo;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.network.ExceptionWrapper;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class RequiredScopesInterceptor implements InterfaceC48121Iub {
    public final ApplicationContextInfo contextInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public RequiredScopesInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RequiredScopesInterceptor(ApplicationContextInfo contextInfo) {
        o.LJIIIZ(contextInfo, "contextInfo");
        this.contextInfo = contextInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48121Iub
    public C64598PWw intercept(PXZ chain) {
        String string;
        String str;
        ApiErrorResponse apiErrorResponse;
        ApiErrorCause apiErrorCause;
        String accessToken;
        o.LJIIIZ(chain, "chain");
        Request request = chain.request();
        o.LJIIIIZZ(request, "chain.request()");
        C64598PWw LIZ = chain.LIZ(request);
        PVM pvm = LIZ.LJLJL;
        C39745Fin c39745Fin = null;
        if (pvm == null) {
            string = null;
        } else {
            string = pvm.string();
        }
        C64597PWv c64597PWv = new C64597PWv(LIZ);
        if (pvm != null) {
            c39745Fin = pvm.contentType();
        }
        if (string == null) {
            str = "";
        } else {
            str = string;
        }
        c64597PWv.LJI = PVM.create(c39745Fin, str);
        C64598PWw LIZ2 = c64597PWv.LIZ();
        if (!LIZ2.LIZIZ() && string != null && (apiErrorResponse = (ApiErrorResponse) KakaoJson.INSTANCE.fromJson(string, ApiErrorResponse.class)) != null && (apiErrorCause = (ApiErrorCause) KakaoJson.INSTANCE.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class)) != null) {
            ApiError apiError = new ApiError(LIZ2.LJLJI, apiErrorCause, apiErrorResponse);
            List<String> requiredScopes = apiError.getResponse().getRequiredScopes();
            ApiErrorCause reason = apiError.getReason();
            ApiErrorCause apiErrorCause2 = ApiErrorCause.InsufficientScope;
            if (reason != apiErrorCause2 || requiredScopes == null || requiredScopes.isEmpty()) {
                if (apiError.getReason() == apiErrorCause2 && (requiredScopes == null || requiredScopes.isEmpty())) {
                    int statusCode = apiError.getStatusCode();
                    ApiErrorCause apiErrorCause3 = ApiErrorCause.Unknown;
                    throw new ExceptionWrapper(new ApiError(statusCode, apiErrorCause3, new ApiErrorResponse(apiErrorCause3.getErrorCode(), "requiredScopes not exist", null, apiError.getResponse().getRequiredScopes(), apiError.getResponse().getAllowedScopes(), 4, null)));
                }
            } else {
                C68322mC c68322mC = new C68322mC();
                C68322mC c68322mC2 = new C68322mC();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AuthApiClient.Companion.getInstance().agt(new RequiredScopesInterceptor$intercept$1$1(c68322mC2, countDownLatch, this, requiredScopes, c68322mC));
                countDownLatch.await();
                OAuthToken oAuthToken = (OAuthToken) c68322mC.element;
                if (oAuthToken != null && (accessToken = oAuthToken.getAccessToken()) != null) {
                    Request request2 = LIZ2.LJLIL;
                    o.LJIIIIZZ(request2, "response.request()");
                    C64598PWw LIZ3 = chain.LIZ(AccessTokenInterceptorKt.withAccessToken(request2, accessToken));
                    if (LIZ3 != null) {
                        return LIZ3;
                    }
                }
                T t = c68322mC2.element;
                o.LJI(t);
                throw new ExceptionWrapper((Throwable) t);
            }
        }
        return LIZ2;
    }

    public /* synthetic */ RequiredScopesInterceptor(ApplicationContextInfo applicationContextInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo() : applicationContextInfo);
    }
}
