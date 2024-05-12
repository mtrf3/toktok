package com.kakao.sdk.network;

import X.AbstractC65781Prl;
import X.C64601PWz;
import X.C65018PfS;
import X.InterfaceC65784Pro;
import com.kakao.sdk.common.KakaoSdk;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiFactory$kapi$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C65018PfS> {
    public static final ApiFactory$kapi$2 INSTANCE = new ApiFactory$kapi$2();

    public ApiFactory$kapi$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final C65018PfS invoke() {
        ApiFactory apiFactory = ApiFactory.INSTANCE;
        String LJIILLIIL = o.LJIILLIIL(KakaoSdk.INSTANCE.getHosts().getKapi(), "https://");
        C64601PWz c64601PWz = new C64601PWz();
        c64601PWz.addInterceptor(new KakaoAgentInterceptor(null, 1, null));
        c64601PWz.addInterceptor(new AppKeyInterceptor(null, 1, null));
        c64601PWz.addInterceptor(apiFactory.getLoggingInterceptor());
        o.LJIIIIZZ(c64601PWz, "Builder()\n                .addInterceptor(KakaoAgentInterceptor())\n                .addInterceptor(AppKeyInterceptor())\n                .addInterceptor(loggingInterceptor)");
        return ApiFactory.withClientAndAdapter$default(apiFactory, LJIILLIIL, c64601PWz, null, 4, null);
    }
}
