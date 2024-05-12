package com.ss.android.ugc.aweme.ecommerce.us.osp.dynamicstyle.ospbottomwidget;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class USBottomBarStyle extends DefaultBottomBarStyle {
    public final int buyerProtectionProgramVisibility;
    public final boolean showGuaranteeIcon;
    public final int cashBackTextColor = R.attr.bx;
    public final boolean forceShowItemCount = true;
    public final int totalPriceFont = 32;
    public final boolean checkPlaceOrderEnableState = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle, com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public int getBuyerProtectionProgramVisibility() {
        return this.buyerProtectionProgramVisibility;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle, com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public int getCashBackTextColor() {
        return this.cashBackTextColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle, com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public boolean getCheckPlaceOrderEnableState() {
        return this.checkPlaceOrderEnableState;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle, com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public boolean getForceShowItemCount() {
        return this.forceShowItemCount;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle, com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public boolean getShowGuaranteeIcon() {
        return this.showGuaranteeIcon;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.DefaultBottomBarStyle, com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public int getTotalPriceFont() {
        return this.totalPriceFont;
    }
}
