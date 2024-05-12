package com.ss.android.ugc.aweme.ecommerce.us.osp.dynamicstyle.payment;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.addcard.IAddCardStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class USAddCardStyle implements IAddCardStyle {
    public final int btnTextIdForAddCard = R.string.f37;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.addcard.IAddCardStyle
    public float getCcdcScreenRatio() {
        return 0.9f;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.addcard.IAddCardStyle
    public boolean getShowSecurePayment() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.addcard.IAddCardStyle
    public int getBtnTextIdForAddCard() {
        return this.btnTextIdForAddCard;
    }
}
