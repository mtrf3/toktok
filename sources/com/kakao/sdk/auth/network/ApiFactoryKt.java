package com.kakao.sdk.auth.network;

import X.C221108m2;
import X.C5H3;
import X.C65018PfS;
import com.kakao.sdk.network.ApiFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiFactoryKt {
    public static final C5H3 kapiWithOAuth$delegate = C221108m2.LIZIZ(ApiFactoryKt$kapiWithOAuth$2.INSTANCE);
    public static final C5H3 kauth$delegate = C221108m2.LIZIZ(ApiFactoryKt$kauth$2.INSTANCE);

    public static final C65018PfS getKapiWithOAuth(ApiFactory apiFactory) {
        o.LJIIIZ(apiFactory, "<this>");
        return (C65018PfS) kapiWithOAuth$delegate.getValue();
    }

    public static final C65018PfS getKauth(ApiFactory apiFactory) {
        o.LJIIIZ(apiFactory, "<this>");
        return (C65018PfS) kauth$delegate.getValue();
    }
}
