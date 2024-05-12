package com.ss.android.ugc.aweme.ecommerce.us.logistic.dynamicstyle;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class USAddressSelectFragmentStyle implements IAddressSelectFragmentStyle {
    public boolean bottomShowButton;
    public boolean navigatinShowCloseIcon;
    public int navigationTitleRes = R.string.fag;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle
    public boolean getBottomShowButton() {
        return this.bottomShowButton;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle
    public boolean getNavigatinShowCloseIcon() {
        return this.navigatinShowCloseIcon;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle
    public int getNavigationTitleRes() {
        return this.navigationTitleRes;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle
    public void setBottomShowButton(boolean z) {
        this.bottomShowButton = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle
    public void setNavigatinShowCloseIcon(boolean z) {
        this.navigatinShowCloseIcon = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle
    public void setNavigationTitleRes(int i) {
        this.navigationTitleRes = i;
    }
}
