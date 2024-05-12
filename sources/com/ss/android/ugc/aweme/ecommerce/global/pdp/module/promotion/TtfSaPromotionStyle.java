package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.promotion;

import X.C70759Rpr;
import X.C7MY;
import X.S3L;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class TtfSaPromotionStyle implements IPromotionStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getArrowColor() {
        return R.attr.gv;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle, X.InterfaceC27521Ar7
    public int getCouponThresholdColor() {
        return R.attr.gu;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle, X.InterfaceC27521Ar7
    public int getCouponThresholdFont() {
        return 71;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle, X.InterfaceC27521Ar7
    public int getCouponTitleColor() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle, X.InterfaceC27521Ar7
    public int getCouponTitleFont() {
        return 42;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getCouponViewMarginTop() {
        return C7MY.LIZIZ(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getImagePriceTextFont() {
        return 52;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getItemViewPaddingTop() {
        return C7MY.LIZIZ(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public boolean getNeedLimitText() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getPromotionButtonTextFont() {
        return 61;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getPromotionDescColor() {
        return R.attr.eb;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getPromotionDescFont() {
        return 42;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public boolean getShowCouponBottomInfo() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getArrowSize() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public float getCouponRadius() {
        return C7MY.LIZIZ(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getImageHeight() {
        return C7MY.LIZIZ(80);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getImageWidth() {
        return C7MY.LIZIZ(80);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public int getPaddingBottomWithoutPromotionEntrance() {
        return C7MY.LIZIZ(24);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle
    public S3L getImageRadiusOptions() {
        return C70759Rpr.LIZIZ;
    }
}
