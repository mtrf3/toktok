package com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsSpecUiStyle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsSpecListLayoutStyle extends GlobalSpecListLayoutStyle {
    public final boolean imageItemCountAdapt;
    public final boolean showDividerLine = true;
    public final boolean foldSingleSpec = true;
    public final boolean forceFlowLayout = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public int getGroupValueColor() {
        return R.attr.gx;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public ISpecUiStyle getSpecItemStyle() {
        return new UsSpecUiStyle();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getFoldSingleSpec() {
        return this.foldSingleSpec;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getForceFlowLayout() {
        return this.forceFlowLayout;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getImageItemCountAdapt() {
        return this.imageItemCountAdapt;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public boolean getShowDividerLine() {
        return this.showDividerLine;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.sku.widget.GlobalSpecListLayoutStyle, com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle
    public View createSizeGuideView(ViewGroup container, SizeGuide sizeGuide) {
        o.LJIIIZ(container, "container");
        if (sizeGuide == null) {
            return null;
        }
        Context context = container.getContext();
        o.LJIIIIZZ(context, "container.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.bx);
        String str = sizeGuide.skuSizeGuideButtonText;
        if (str == null) {
            str = sizeGuide.skuSizeGuideTitle;
        }
        tuxTextView.setText(str);
        return tuxTextView;
    }
}
