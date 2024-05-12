package com.ss.android.ugc.aweme.ecommerce.global.osp.dynamicstyle.payment;

import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IAreaTitleStyle;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class GlobalAreaTitleStyle implements IAreaTitleStyle {
    public int tuxFont = 61;
    public int tuxColor = R.attr.gx;

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
