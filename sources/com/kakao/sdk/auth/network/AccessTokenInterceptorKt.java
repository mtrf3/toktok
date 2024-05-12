package com.kakao.sdk.auth.network;

import X.C64618PXq;
import kotlin.jvm.internal.o;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class AccessTokenInterceptorKt {
    public static final Request withAccessToken(Request request, String accessToken) {
        o.LJIIIZ(request, "<this>");
        o.LJIIIZ(accessToken, "accessToken");
        C64618PXq newBuilder = request.newBuilder();
        newBuilder.LIZJ.LIZLLL("Authorization");
        newBuilder.LIZJ.LIZ("Authorization", o.LJIILLIIL(accessToken, "Bearer "));
        return newBuilder.LIZIZ();
    }
}
