package com.ss.android.ugc.aweme.ecommerce.us.osp.dynamicstyle.payment;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class USPaymentFragmentStyle implements IPaymentFragmentStyle {
    public final boolean paymentDividerShow;
    public final boolean bottomDividerLineShow = true;
    public final boolean ccdcAddCardInHarfFragment = true;
    public final boolean showSecurePayment = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle
    public int getPageTitle() {
        return R.string.fbj;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle
    public boolean getBottomDividerLineShow() {
        return this.bottomDividerLineShow;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle
    public boolean getCcdcAddCardInHarfFragment() {
        return this.ccdcAddCardInHarfFragment;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle
    public boolean getPaymentDividerShow() {
        return this.paymentDividerShow;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle
    public boolean getShowSecurePayment() {
        return this.showSecurePayment;
    }
}
