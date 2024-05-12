package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile;

import X.C7MY;

/* loaded from: classes5.dex */
public final class DefaultShopProfileStyle implements IShopProfileStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public boolean getOfficialInSimple() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public boolean getShowVisitBtn() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public int getPaddingBottom() {
        return C7MY.LIZIZ(20);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public int getShopImageSize() {
        return C7MY.LIZIZ(56);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public int getSicMarginTop() {
        return C7MY.LIZIZ(20);
    }
}
