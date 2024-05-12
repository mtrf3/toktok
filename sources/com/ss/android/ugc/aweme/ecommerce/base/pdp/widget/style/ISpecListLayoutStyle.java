package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import wg5.b;

/* loaded from: classes13.dex */
public interface ISpecListLayoutStyle extends b {
    View createSizeGuideView(ViewGroup viewGroup, SizeGuide sizeGuide);

    boolean getFoldSingleSpec();

    boolean getForceFlowLayout();

    int getGroupTitleColor();

    int getGroupTitleFont();

    int getGroupValueColor();

    int getGroupValueFont();

    int getGroupValueVisibility();

    boolean getImageItemCountAdapt();

    boolean getShowDividerLine();

    boolean getShowLowStockView();

    ISpecUiStyle getSpecItemStyle();

    int getSpecVerticalMargin();
}
