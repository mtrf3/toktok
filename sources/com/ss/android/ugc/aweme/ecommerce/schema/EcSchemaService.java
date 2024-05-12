package com.ss.android.ugc.aweme.ecommerce.schema;

import X.C47261Igj;
import X.C58096Mr6;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckInterceptor;
import java.util.List;

/* loaded from: classes7.dex */
public final class EcSchemaService implements IEcSchemaService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService
    public final List<ISparkRouterInterceptor> LIZ() {
        return C47261Igj.LJJIJIIJI(new EcSchemaVerifyInterceptor(), new SmartCheckInterceptor());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService
    public final List<IInterceptor> LIZIZ() {
        return C47261Igj.LJJIJIIJI(new EcSchemaVerifyInterceptor(), new SmartCheckInterceptor());
    }

    public static IEcSchemaService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IEcSchemaService.class, false);
        if (LIZ != null) {
            return (IEcSchemaService) LIZ;
        }
        if (C58096Mr6.f83Y == null) {
            synchronized (IEcSchemaService.class) {
                if (C58096Mr6.f83Y == null) {
                    C58096Mr6.f83Y = new EcSchemaService();
                }
            }
        }
        return C58096Mr6.f83Y;
    }
}
