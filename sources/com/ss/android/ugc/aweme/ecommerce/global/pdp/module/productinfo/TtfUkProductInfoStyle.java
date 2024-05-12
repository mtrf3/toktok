package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.productinfo;

import X.C04270Et;
import X.C7MY;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TtfUkProductInfoStyle implements IProductInfoStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getGoodDescFont() {
        return 32;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getGoodDescMaxLine() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getIntervalPriceFont() {
        return 12;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getMarketPriceFont() {
        return 61;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getNormalPriceFont() {
        return 12;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getShowFavoriteBtn() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getUseExpandTitle() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getUsePriceSSB() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getUseProductLogos() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getLogosHeight() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getMarketPriceLayout() {
        IProductInfoStyle.Companion.getClass();
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getPriceMarginTop() {
        return C7MY.LIZIZ(24);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getPricePaddingBottom() {
        return C7MY.LIZIZ(24);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public Drawable freeShippingTagSkeletonBg(Context context) {
        o.LJIIIZ(context, "context");
        return C04270Et.LIZIZ(context, R.drawable.abu);
    }
}
