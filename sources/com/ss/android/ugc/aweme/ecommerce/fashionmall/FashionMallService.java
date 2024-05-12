package com.ss.android.ugc.aweme.ecommerce.fashionmall;

import X.C221108m2;
import X.C53380KxE;
import X.C58096Mr6;
import X.C62822Ol8;
import X.EnumC53810L9y;
import X.LGZ;
import X.LIS;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService;
import java.util.List;

/* loaded from: classes10.dex */
public final class FashionMallService implements IECMallService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(LIS.LJLIL);

    public static IECMallService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IECMallService.class, false);
        if (LIZ != null) {
            return (IECMallService) LIZ;
        }
        if (C58096Mr6.T == null) {
            synchronized (IECMallService.class) {
                if (C58096Mr6.T == null) {
                    C58096Mr6.T = new FashionMallService();
                }
            }
        }
        return C58096Mr6.T;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService
    public final LGZ LIZ() {
        return new LGZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService
    public final List<IInterceptor> LJJL() {
        return (List) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService
    public final boolean LJJLI() {
        return C53380KxE.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService
    public final EnumC53810L9y LIZIZ() {
        return EnumC53810L9y.FASHION_MALL;
    }
}
