package com.ss.android.ugc.aweme.ecommerce.mall;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.ShopIconServiceImpl;

/* loaded from: classes10.dex */
public final class MallServiceManager implements IMallServiceManager {
    public static IMallServiceManager LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IMallServiceManager.class, false);
        if (LIZ != null) {
            return (IMallServiceManager) LIZ;
        }
        if (C58096Mr6.W == null) {
            synchronized (IMallServiceManager.class) {
                if (C58096Mr6.W == null) {
                    C58096Mr6.W = new MallServiceManager();
                }
            }
        }
        return C58096Mr6.W;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager
    public final IShopIconService LIZ() {
        return ShopIconServiceImpl.LJFF();
    }
}
