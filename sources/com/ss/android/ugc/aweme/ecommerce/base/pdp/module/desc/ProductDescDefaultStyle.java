package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc;

import X.C45804HyK;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class ProductDescDefaultStyle implements IProductDescStyle {
    public final int titleFont = 42;
    public final int subTitleFont = 62;
    public final int textFont = 61;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getImageDescMargin() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getProductDescTitle() {
        return R.string.f4s;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getProductTitle() {
        return R.string.f3d;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getSpecTitle() {
        return R.string.f3s;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getSubTitleColorId() {
        return R.attr.gu;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getTextColorId() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getTitleColorId() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getTitleWithTextPaddingBottom() {
        return C45804HyK.LJJ(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getVhPaddingBottom() {
        return C45804HyK.LJJ(0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getVideoDescMargin() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getVideoRadius() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public boolean getVideoSubTitleVisible() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getViewMoreIconColorRes() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getViewMoreText() {
        return R.string.ffr;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getViewMoreTextColorRes() {
        return R.attr.go;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public boolean isVideoNeedRadius() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getLastPaddingBottom() {
        return C45804HyK.LJJ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getSubTitlePaddingBottom() {
        return C45804HyK.LJJ(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getSubTitlePaddingTop() {
        return C45804HyK.LJJ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getTextDefaultPadding() {
        return C45804HyK.LJJ(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getTitlePaddingBottom() {
        return C45804HyK.LJJ(11);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getTitlePaddingTop() {
        return C45804HyK.LJJ(20);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getVideoMarginBottom() {
        return (int) C45804HyK.LJJ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getViewMoreIconHeight() {
        return C45804HyK.LJJ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public float getViewMoreIconWidth() {
        return C45804HyK.LJJ(16);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getSubTitleFont() {
        return this.subTitleFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getTextFont() {
        return this.textFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle
    public int getTitleFont() {
        return this.titleFont;
    }
}
