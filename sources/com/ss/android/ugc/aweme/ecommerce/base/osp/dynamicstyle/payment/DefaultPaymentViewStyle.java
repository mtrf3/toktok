package com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment;

import X.C45804HyK;

/* loaded from: classes5.dex */
public final class DefaultPaymentViewStyle implements IPaymentViewStyle {
    public boolean iconAddVisible;
    public boolean ischeckBoxStart;
    public int paymentMethodIconMarginStart = C45804HyK.LJJI(16);
    public int paymentMethodNameMarginStart = C45804HyK.LJJI(12);
    public int paymentMethodNameFont = 41;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public boolean getIconAddVisible() {
        return this.iconAddVisible;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public boolean getIscheckBoxStart() {
        return this.ischeckBoxStart;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public int getPaymentMethodIconMarginStart() {
        return this.paymentMethodIconMarginStart;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public int getPaymentMethodNameFont() {
        return this.paymentMethodNameFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public int getPaymentMethodNameMarginStart() {
        return this.paymentMethodNameMarginStart;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public void setIconAddVisible(boolean z) {
        this.iconAddVisible = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public void setIscheckBoxStart(boolean z) {
        this.ischeckBoxStart = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public void setPaymentMethodIconMarginStart(int i) {
        this.paymentMethodIconMarginStart = i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public void setPaymentMethodNameFont(int i) {
        this.paymentMethodNameFont = i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentViewStyle
    public void setPaymentMethodNameMarginStart(int i) {
        this.paymentMethodNameMarginStart = i;
    }
}
