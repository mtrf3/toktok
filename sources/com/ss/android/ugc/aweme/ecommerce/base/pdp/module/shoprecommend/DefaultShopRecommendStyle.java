package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend;

import X.C70759Rpr;
import X.C7MY;
import X.S3L;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DefaultShopRecommendStyle implements IShopRecommendStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public boolean getBigArrowIcon() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductPriceFont() {
        return 62;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductPriceTextColor() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getTitleFont() {
        return 62;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getTitleTextColor() {
        return R.attr.gu;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getPaddingTop() {
        return C7MY.LIZIZ(20);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductImageSize() {
        return C7MY.LIZIZ(96);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductMarginTop() {
        return C7MY.LIZIZ(12);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public S3L getProductImageOption(Context context) {
        o.LJIIIZ(context, "context");
        return C70759Rpr.LIZIZ;
    }
}
