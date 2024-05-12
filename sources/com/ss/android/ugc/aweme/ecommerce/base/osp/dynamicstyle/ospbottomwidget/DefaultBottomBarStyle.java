package com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget;

import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class DefaultBottomBarStyle implements IOspBottomBarStyle {
    public final boolean checkPlaceOrderEnableState;
    public final boolean forceShowItemCount;
    public final int cashBackTextColor = R.attr.go;
    public final int buyerProtectionProgramVisibility = 8;
    public final int totalPriceFont = 32;
    public final boolean showGuaranteeIcon = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public int getBuyerProtectionProgramVisibility() {
        return this.buyerProtectionProgramVisibility;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public int getCashBackTextColor() {
        return this.cashBackTextColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public boolean getCheckPlaceOrderEnableState() {
        return this.checkPlaceOrderEnableState;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public boolean getForceShowItemCount() {
        return this.forceShowItemCount;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public boolean getShowGuaranteeIcon() {
        return this.showGuaranteeIcon;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle
    public int getTotalPriceFont() {
        return this.totalPriceFont;
    }
}
