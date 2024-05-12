package com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address;

import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class DefaultAddressSelectFragmentStyle implements IAddressSelectFragmentStyle {
    public boolean bottomShowButton = true;
    public int navigationTitleRes = R.string.f33;
    public boolean navigatinShowCloseIcon = true;

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
