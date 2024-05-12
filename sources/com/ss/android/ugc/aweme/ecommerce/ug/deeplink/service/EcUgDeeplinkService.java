package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service;

import X.C47261Igj;
import X.C58096Mr6;
import X.LUT;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router.EcUgRouterInterceptor;
import java.util.List;

/* loaded from: classes10.dex */
public final class EcUgDeeplinkService implements IEcUgDeeplinkService {
    public static IEcUgDeeplinkService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IEcUgDeeplinkService.class, false);
        if (LIZ != null) {
            return (IEcUgDeeplinkService) LIZ;
        }
        if (C58096Mr6.f0 == null) {
            synchronized (IEcUgDeeplinkService.class) {
                if (C58096Mr6.f0 == null) {
                    C58096Mr6.f0 = new EcUgDeeplinkService();
                }
            }
        }
        return C58096Mr6.f0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService
    public final List<IInterceptor> LIZIZ() {
        return C47261Igj.LJJIJ(new EcUgRouterInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService
    public final String LIZ(String str, String str2) {
        return LUT.LIZ(str, str2);
    }
}
