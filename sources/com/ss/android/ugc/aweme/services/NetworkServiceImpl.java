package com.ss.android.ugc.aweme.services;

import X.C65087PgZ;
import X.EFJ;
import X.InterfaceC36395EQd;
import X.InterfaceC37216Ej6;
import X.QJY;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NetworkServiceImpl implements InterfaceC36395EQd {
    public static final int $stable = 0;

    @Override // X.InterfaceC36395EQd
    public String getApiHost() {
        String API_URL_PREFIX_API = EFJ.LIZIZ;
        o.LJIIIIZZ(API_URL_PREFIX_API, "API_URL_PREFIX_API");
        return API_URL_PREFIX_API;
    }

    @Override // X.InterfaceC36395EQd
    public Gson getRetrofitFactoryGson() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().getGson()");
        return LIZ;
    }

    @Override // X.InterfaceC36395EQd
    public <T> T createDefaultRetrofit(Class<T> api) {
        o.LJIIIZ(api, "api");
        return (T) RetrofitFactory.LIZLLL().create(getApiHost()).create(api);
    }

    @Override // X.InterfaceC36395EQd
    public void putCommonParams(HashMap<String, String> params, boolean z) {
        o.LJIIIZ(params, "params");
        QJY.LJI(params, z);
    }

    @Override // X.InterfaceC36395EQd
    public <T> T retrofitCreate(String baseUrl, Class<T> api) {
        o.LJIIIZ(baseUrl, "baseUrl");
        o.LJIIIZ(api, "api");
        return (T) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(baseUrl).create(api);
    }

    @Override // X.InterfaceC36395EQd
    public <T> T createRetrofit(String baseUrl, boolean z, Class<T> api) {
        o.LJIIIZ(baseUrl, "baseUrl");
        o.LJIIIZ(api, "api");
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(baseUrl);
        if (!z) {
            LIZ.LIZJ = true;
        } else {
            LIZ.getClass();
        }
        return (T) LIZ.LJFF().LIZ.LIZ(api);
    }

    @Override // X.InterfaceC36395EQd
    public <T> T createRetrofitWithInterceptors(String baseUrl, boolean z, Class<T> api, List<? extends InterfaceC37216Ej6> interceptors) {
        o.LJIIIZ(baseUrl, "baseUrl");
        o.LJIIIZ(api, "api");
        o.LJIIIZ(interceptors, "interceptors");
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(baseUrl);
        if (!z) {
            LIZ.LIZJ = true;
        } else {
            LIZ.getClass();
        }
        LIZ.LIZJ(interceptors);
        return (T) LIZ.LJFF().LIZ.LIZ(api);
    }
}
