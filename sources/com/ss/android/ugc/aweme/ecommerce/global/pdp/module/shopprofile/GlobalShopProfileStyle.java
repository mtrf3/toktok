package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shopprofile;

import X.C7MY;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle;

/* loaded from: classes16.dex */
public class GlobalShopProfileStyle implements IShopProfileStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public boolean getOfficialInSimple() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public boolean getShowVisitBtn() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public int getPaddingBottom() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public int getShopImageSize() {
        return C7MY.LIZIZ(64);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.IShopProfileStyle
    public int getSicMarginTop() {
        return C7MY.LIZIZ(16);
    }
}
