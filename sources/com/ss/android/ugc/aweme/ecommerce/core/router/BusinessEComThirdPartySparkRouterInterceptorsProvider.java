package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C40114Fok;
import X.C40127Fox;
import X.C47261Igj;
import X.C61878OQg;
import com.ss.android.ugc.aweme.ecommerce.router.IThirdPartySparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService;
import java.util.List;
import ujb.s;

/* loaded from: classes7.dex */
public final class BusinessEComThirdPartySparkRouterInterceptorsProvider implements IEComThirdPartyHybridSparkInterceptorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComThirdPartyHybridSparkInterceptorService
    public final List<IThirdPartySparkRouterInterceptor> LIZ(String str) {
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer || (str != null && s.LJJJLZIJ(str, "use_spark=1", true))) {
            return C47261Igj.LJJIJ(new C40114Fok());
        }
        return C61878OQg.INSTANCE;
    }
}
