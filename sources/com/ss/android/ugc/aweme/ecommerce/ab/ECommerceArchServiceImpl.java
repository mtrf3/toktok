package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C58096Mr6;
import X.E9D;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;

/* loaded from: classes7.dex */
public final class ECommerceArchServiceImpl implements IECommerceArchService {
    public static IECommerceArchService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IECommerceArchService.class, false);
        if (LIZ != null) {
            return (IECommerceArchService) LIZ;
        }
        if (C58096Mr6.G == null) {
            synchronized (IECommerceArchService.class) {
                if (C58096Mr6.G == null) {
                    C58096Mr6.G = new ECommerceArchServiceImpl();
                }
            }
        }
        return C58096Mr6.G;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService
    public final boolean LIZ() {
        if (E9D.LIZ().pageSourceEnable == 1) {
            return true;
        }
        return false;
    }
}
