package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo;

import X.C79045V0n;
import X.C7MY;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ProductInfoDefaultStyle implements IProductInfoStyle {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getGoodDescFont() {
        return 41;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getGoodDescMaxLine() {
        return Integer.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getIntervalPriceFont() {
        return 32;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getLogosHeight() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getMarketPriceFont() {
        return 61;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getNormalPriceFont() {
        return 22;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getShowFavoriteBtn() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getUseExpandTitle() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getUsePriceSSB() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public boolean getUseProductLogos() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getMarketPriceLayout() {
        IProductInfoStyle.Companion.getClass();
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getPriceMarginTop() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public int getPricePaddingBottom() {
        return C7MY.LIZIZ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo.IProductInfoStyle
    public Drawable freeShippingTagSkeletonBg(Context context) {
        o.LJIIIZ(context, "context");
        return C79045V0n.LJIIIIZZ(R.attr.cj, context);
    }
}
