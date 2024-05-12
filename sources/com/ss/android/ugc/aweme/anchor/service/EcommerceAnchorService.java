package com.ss.android.ugc.aweme.anchor.service;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* loaded from: classes4.dex */
public final class EcommerceAnchorService implements IEcommerceAnchorService {
    public static IEcommerceAnchorService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IEcommerceAnchorService.class, false);
        if (LIZ != null) {
            return (IEcommerceAnchorService) LIZ;
        }
        if (C58096Mr6.LLIIIJ == null) {
            synchronized (IEcommerceAnchorService.class) {
                if (C58096Mr6.LLIIIJ == null) {
                    C58096Mr6.LLIIIJ = new EcommerceAnchorService();
                }
            }
        }
        return C58096Mr6.LLIIIJ;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService
    public final boolean LIZLLL() {
        return ECommerceAnchorService.LJJJJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IEcommerceAnchorService
    public final Map<String, Object> LJ(Aweme aweme) {
        return ECommerceAnchorService.LJJJJI().LIZJ(aweme);
    }
}
