package com.kakao.sdk.network;

import X.C64598PWw;
import X.C64618PXq;
import X.InterfaceC48121Iub;
import X.PXZ;
import com.kakao.sdk.common.KakaoSdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AppKeyInterceptor implements InterfaceC48121Iub {
    public final String appKey;

    /* JADX WARN: Multi-variable type inference failed */
    public AppKeyInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AppKeyInterceptor(String appKey) {
        o.LJIIIZ(appKey, "appKey");
        this.appKey = appKey;
    }

    @Override // X.InterfaceC48121Iub
    public C64598PWw intercept(PXZ chain) {
        o.LJIIIZ(chain, "chain");
        C64618PXq newBuilder = chain.request().newBuilder();
        newBuilder.LIZJ.LIZ("Authorization", o.LJIILLIIL(this.appKey, "KakaoAK "));
        C64598PWw LIZ = chain.LIZ(newBuilder.LIZIZ());
        o.LJIIIIZZ(LIZ, "chain.proceed(request)");
        return LIZ;
    }

    public /* synthetic */ AppKeyInterceptor(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KakaoSdk.INSTANCE.getApplicationContextInfo().getAppKey() : str);
    }
}
