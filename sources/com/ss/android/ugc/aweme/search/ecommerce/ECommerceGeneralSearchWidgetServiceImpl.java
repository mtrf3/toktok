package com.ss.android.ugc.aweme.search.ecommerce;

import X.C58096Mr6;
import X.C78927UyJ;
import X.K22;

/* loaded from: classes9.dex */
public final class ECommerceGeneralSearchWidgetServiceImpl implements IECommerceGeneralSearchWidgetService {
    public static IECommerceGeneralSearchWidgetService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IECommerceGeneralSearchWidgetService.class, false);
        if (LIZ != null) {
            return (IECommerceGeneralSearchWidgetService) LIZ;
        }
        if (C58096Mr6.H4 == null) {
            synchronized (IECommerceGeneralSearchWidgetService.class) {
                if (C58096Mr6.H4 == null) {
                    C58096Mr6.H4 = new ECommerceGeneralSearchWidgetServiceImpl();
                }
            }
        }
        return C58096Mr6.H4;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService
    public final C78927UyJ LIZ() {
        return new C78927UyJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IECommerceGeneralSearchWidgetService
    public final K22 LIZIZ() {
        return new K22();
    }
}
