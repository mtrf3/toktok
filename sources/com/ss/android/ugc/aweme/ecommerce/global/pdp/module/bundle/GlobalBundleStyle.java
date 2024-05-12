package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.bundle;

import X.C7MY;
import X.S3I;
import X.S3L;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class GlobalBundleStyle implements IBundleStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public boolean getAddToCartBtnNewRadius() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public boolean getHideTitle() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public int getProductPriceFont() {
        return 42;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public int getProductPriceTextColor() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public int getTotalRealPriceFont() {
        return 32;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public int getAddIconSize() {
        return C7MY.LIZIZ(12);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public S3L getProductImageOptions() {
        S3I s3i = new S3I();
        s3i.LIZLLL = C7MY.LIZIZ(8);
        return s3i.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public int getProductPriceMarginTop() {
        return C7MY.LIZIZ(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.bundledeal.IBundleStyle
    public int getTotalPriceLayoutMarginTop() {
        return C7MY.LIZIZ(16);
    }
}
