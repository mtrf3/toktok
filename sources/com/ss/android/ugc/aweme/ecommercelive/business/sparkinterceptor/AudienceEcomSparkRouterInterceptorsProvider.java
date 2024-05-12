package com.ss.android.ugc.aweme.ecommercelive.business.sparkinterceptor;

import X.C40131Fp1;
import X.C40133Fp3;
import X.C47261Igj;
import X.C61878OQg;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.LiveSparkSwitchConfig;
import java.util.List;

/* loaded from: classes7.dex */
public final class AudienceEcomSparkRouterInterceptorsProvider implements IEComHybridSparkInterceptorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List<ISparkRouterInterceptor> LIZ(String str) {
        C40131Fp1.LIZ.getClass();
        if (((LiveSparkSwitchConfig) C40131Fp1.LIZJ.getValue()).enableSparkInterceptor) {
            return C47261Igj.LJJIJ(C40133Fp3.LIZ.getValue());
        }
        return C61878OQg.INSTANCE;
    }
}
