package com.ss.android.ugc.aweme.ecommerce.fashionmall;

import X.C53380KxE;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.bottomtab.BottomTabCustomDotHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IShopTabIconService;

/* loaded from: classes10.dex */
public final class FashionMallTabIconService implements IShopTabIconService {
    @Override // com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IShopTabIconService
    public final CustomDotAssem LIZ() {
        if (C53380KxE.LIZ()) {
            return new CustomDotAssem(new BottomTabCustomDotHandler());
        }
        return null;
    }
}
