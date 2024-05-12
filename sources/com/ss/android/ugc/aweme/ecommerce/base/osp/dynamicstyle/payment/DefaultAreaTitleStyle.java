package com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment;

import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class DefaultAreaTitleStyle implements IAreaTitleStyle {
    public int tuxFont = 62;
    public int tuxColor = R.attr.gv;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IAreaTitleStyle
    public int getTuxColor() {
        return this.tuxColor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IAreaTitleStyle
    public int getTuxFont() {
        return this.tuxFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IAreaTitleStyle
    public void setTuxColor(int i) {
        this.tuxColor = i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IAreaTitleStyle
    public void setTuxFont(int i) {
        this.tuxFont = i;
    }
}
