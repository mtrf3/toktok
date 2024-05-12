package com.ss.android.ugc.aweme.services;

import X.C46104I7o;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;

/* loaded from: classes7.dex */
public class RetrofitService implements IRetrofitService {
    public static IRetrofitService createIRetrofitServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IRetrofitService.class, z);
        if (LIZ != null) {
            return (IRetrofitService) LIZ;
        }
        if (C58096Mr6.Z5 == null) {
            synchronized (IRetrofitService.class) {
                if (C58096Mr6.Z5 == null) {
                    C58096Mr6.Z5 = new RetrofitService();
                }
            }
        }
        return C58096Mr6.Z5;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IRetrofitService
    public IRetrofit createNewRetrofit(final String str) {
        return new IRetrofit() { // from class: com.ss.android.ugc.aweme.services.RetrofitService.1
            @Override // com.ss.android.ugc.aweme.framework.services.IRetrofit
            public <T> T create(Class<T> cls) {
                return (T) C46104I7o.LJIILL(str).create(cls);
            }
        };
    }
}
