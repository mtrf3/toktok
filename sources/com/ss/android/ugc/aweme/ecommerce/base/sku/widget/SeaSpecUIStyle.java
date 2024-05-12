package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C45804HyK;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SeaSpecUIStyle implements ISpecUiStyle {
    public final int normalSpecMinHeight;
    public final int normalSpecMinWidth;
    public final int specHorizontalImageMargin;
    public final float specImageRadius;
    public final boolean textStrikeThrough;
    public final int noStockBg = R.drawable.ac8;
    public final int checkedBg = R.drawable.ac5;
    public final int normalBg = R.drawable.ac8;
    public final int noStockAndCheckedBg = R.drawable.ac5;
    public final int noStockTextBg = R.drawable.ac8;
    public final int checkedTextBg = R.drawable.ac5;
    public final int normalTextBg = R.drawable.ac8;
    public final int noStockAndCheckedTextBg = R.drawable.ac5;
    public final int textNoStockColor = R.attr.gp;
    public final int textCheckedColor = R.attr.eb;
    public final int textNormalColor = R.attr.go;
    public final int textNoStockAndCheckColor = R.attr.gp;
    public final float textAlpha = 1.0f;
    public final float textNoStockAlpha = 0.5f;
    public final int specHorizontalMargin = (int) C45804HyK.LJJ(8);
    public final int specImageSize = (int) C45804HyK.LJJ(100);
    public final int specImagePadding = (int) C45804HyK.LJJ(1);
    public final int specTextPadding = C45804HyK.LJJI(12);
    public final int specTextFont = 61;

    public SeaSpecUIStyle() {
        float f = 2;
        this.specImageRadius = C45804HyK.LJJ(f);
        this.specHorizontalImageMargin = (int) C45804HyK.LJJ(f);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getCheckedBg() {
        return this.checkedBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getCheckedTextBg() {
        return this.checkedTextBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNoStockAndCheckedBg() {
        return this.noStockAndCheckedBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNoStockAndCheckedTextBg() {
        return this.noStockAndCheckedTextBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNoStockBg() {
        return this.noStockBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNoStockTextBg() {
        return this.noStockTextBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNormalBg() {
        return this.normalBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNormalSpecMinHeight() {
        return this.normalSpecMinHeight;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNormalSpecMinWidth() {
        return this.normalSpecMinWidth;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getNormalTextBg() {
        return this.normalTextBg;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getSpecHorizontalImageMargin() {
        return this.specHorizontalImageMargin;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getSpecHorizontalMargin() {
        return this.specHorizontalMargin;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getSpecImagePadding() {
        return this.specImagePadding;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public float getSpecImageRadius() {
        return this.specImageRadius;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getSpecImageSize() {
        return this.specImageSize;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getSpecTextFont() {
        return this.specTextFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getSpecTextPadding() {
        return this.specTextPadding;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public float getTextAlpha() {
        return this.textAlpha;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getTextCheckedColor() {
        return this.textCheckedColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public float getTextNoStockAlpha() {
        return this.textNoStockAlpha;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getTextNoStockAndCheckColor() {
        return this.textNoStockAndCheckColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getTextNoStockColor() {
        return this.textNoStockColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public int getTextNormalColor() {
        return this.textNormalColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle
    public boolean getTextStrikeThrough() {
        return this.textStrikeThrough;
    }
}
