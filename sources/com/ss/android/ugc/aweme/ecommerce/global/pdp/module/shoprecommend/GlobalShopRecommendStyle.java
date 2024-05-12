package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shoprecommend;

import X.C7MY;
import X.S3I;
import X.S3L;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GlobalShopRecommendStyle implements IShopRecommendStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public boolean getBigArrowIcon() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductPriceFont() {
        return 42;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductPriceTextColor() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getTitleFont() {
        return 42;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getTitleTextColor() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getPaddingTop() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductImageSize() {
        return C7MY.LIZIZ(92);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public int getProductMarginTop() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.IShopRecommendStyle
    public S3L getProductImageOption(Context context) {
        o.LJIIIZ(context, "context");
        S3I s3i = new S3I();
        s3i.LIZLLL = C7MY.LIZIZ(8);
        return s3i.LIZ();
    }
}
