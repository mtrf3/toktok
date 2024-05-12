package com.kakao.sdk.network;

import X.AbstractC65025PfZ;
import X.C03880Dg;
import X.C221108m2;
import X.C39519Ff9;
import X.C5H3;
import X.C64575PVz;
import X.C64600PWy;
import X.C64601PWz;
import X.C65018PfS;
import X.C65027Pfb;
import X.C65138PhO;
import X.C65239Pj1;
import X.C65300Pk0;
import com.google.gson.Gson;
import com.kakao.sdk.common.util.KakaoJson;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiFactory {
    public static final ApiFactory INSTANCE = new ApiFactory();
    public static final C5H3 loggingInterceptor$delegate = C221108m2.LIZIZ(ApiFactory$loggingInterceptor$2.INSTANCE);
    public static final C5H3 kapi$delegate = C221108m2.LIZIZ(ApiFactory$kapi$2.INSTANCE);

    public static C64600PWy com_kakao_sdk_network_ApiFactory_okhttp3_OkHttpClient$Builder_build(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-5416685737571013440"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    public static C65018PfS com_kakao_sdk_network_ApiFactory_retrofit2_Retrofit$Builder_build(C65027Pfb c65027Pfb) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400200, "retrofit2/Retrofit$Builder", "build", c65027Pfb, new Object[0], "retrofit2.Retrofit", new C65300Pk0(false, "()Lretrofit2/Retrofit;", "-5416685737571013440"));
        return LIZJ.LIZ ? (C65018PfS) LIZJ.LIZIZ : c65027Pfb.LIZJ();
    }

    public final C65018PfS getKapi() {
        return (C65018PfS) kapi$delegate.getValue();
    }

    public final C64575PVz getLoggingInterceptor() {
        return (C64575PVz) loggingInterceptor$delegate.getValue();
    }

    public final C65018PfS withClientAndAdapter(String url, C64601PWz clientBuilder, AbstractC65025PfZ abstractC65025PfZ) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(clientBuilder, "clientBuilder");
        C65027Pfb c65027Pfb = new C65027Pfb();
        c65027Pfb.LIZIZ(url);
        c65027Pfb.LIZ(new KakaoRetrofitConverterFactory());
        Gson base = KakaoJson.INSTANCE.getBase();
        if (base != null) {
            c65027Pfb.LIZ(new C65239Pj1(base));
            C64600PWy com_kakao_sdk_network_ApiFactory_okhttp3_OkHttpClient$Builder_build = com_kakao_sdk_network_ApiFactory_okhttp3_OkHttpClient$Builder_build(clientBuilder);
            C65138PhO.LIZ(com_kakao_sdk_network_ApiFactory_okhttp3_OkHttpClient$Builder_build, "client == null");
            c65027Pfb.LIZIZ = com_kakao_sdk_network_ApiFactory_okhttp3_OkHttpClient$Builder_build;
            if (abstractC65025PfZ != null) {
                ((ArrayList) c65027Pfb.LJ).add(abstractC65025PfZ);
            }
            C65018PfS com_kakao_sdk_network_ApiFactory_retrofit2_Retrofit$Builder_build = com_kakao_sdk_network_ApiFactory_retrofit2_Retrofit$Builder_build(c65027Pfb);
            o.LJIIIIZZ(com_kakao_sdk_network_ApiFactory_retrofit2_Retrofit$Builder_build, "builder.build()");
            return com_kakao_sdk_network_ApiFactory_retrofit2_Retrofit$Builder_build;
        }
        throw new NullPointerException("gson == null");
    }

    public static /* synthetic */ C65018PfS withClientAndAdapter$default(ApiFactory apiFactory, String str, C64601PWz c64601PWz, AbstractC65025PfZ abstractC65025PfZ, int i, Object obj) {
        if ((i & 4) != 0) {
            abstractC65025PfZ = null;
        }
        return apiFactory.withClientAndAdapter(str, c64601PWz, abstractC65025PfZ);
    }
}
