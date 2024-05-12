package com.ss.android.ugc.aweme.ecommerce.global.sku.widget;

import X.C45804HyK;
import X.C70064Ree;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class GlobalSpecListLayoutStyle implements ISpecListLayoutStyle {
    public final boolean foldSingleSpec;
    public final int groupValueVisibility;
    public final boolean showDividerLine;
    public final boolean showLowStockView;
    public final int specVerticalMargin = (int) C45804HyK.LJJ(12);
    public final int groupValueColor = R.attr.gv;
    public final int groupValueFont = 41;
    public final int groupTitleColor = R.attr.go;
    public final int groupTitleFont = 42;
    public final boolean forceFlowLayout = true;
    public final boolean imageItemCountAdapt = true;
    public final ISpecUiStyle specItemStyle = new GlobalSpecUiStyle();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getFoldSingleSpec() {
        return this.foldSingleSpec;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getForceFlowLayout() {
        return this.forceFlowLayout;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getGroupTitleColor() {
        return this.groupTitleColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getGroupTitleFont() {
        return this.groupTitleFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getGroupValueColor() {
        return this.groupValueColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getGroupValueFont() {
        return this.groupValueFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getGroupValueVisibility() {
        return this.groupValueVisibility;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getImageItemCountAdapt() {
        return this.imageItemCountAdapt;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getShowDividerLine() {
        return this.showDividerLine;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getShowLowStockView() {
        return this.showLowStockView;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public ISpecUiStyle getSpecItemStyle() {
        return this.specItemStyle;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getSpecVerticalMargin() {
        return this.specVerticalMargin;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public View createSizeGuideView(ViewGroup container, SizeGuide sizeGuide) {
        o.LJIIIZ(container, "container");
        return C70064Ree.LIZ(container, sizeGuide);
    }
}
