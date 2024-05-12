package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C40127Fox;
import X.C40129Foz;
import X.C47261Igj;
import X.C61878OQg;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService;
import java.util.List;

/* loaded from: classes7.dex */
public final class BusinessEcomSparkMatcherProvider implements IEcomHybridSparkMatchService {
    public final List<C40129Foz> LIZ = C47261Igj.LJJIJ(new C40129Foz());

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService
    public final List<ISparkRouterInterceptor> LIZ() {
        C40127Fox.LIZ.getClass();
        if (C40127Fox.LIZ().enableSparkContainer) {
            return this.LIZ;
        }
        return C61878OQg.INSTANCE;
    }
}
