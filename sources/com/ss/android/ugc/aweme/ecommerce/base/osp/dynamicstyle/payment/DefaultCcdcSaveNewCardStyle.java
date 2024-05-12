package com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment;

/* loaded from: classes13.dex */
public final class DefaultCcdcSaveNewCardStyle implements ICcdcSaveNewCardStyle {
    public int checkBoxPosition;
    public int checkBoxSize;
    public int saveDisplayTextFont = 41;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle
    public int getCheckBoxPosition() {
        return this.checkBoxPosition;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle
    public int getCheckBoxSize() {
        return this.checkBoxSize;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle
    public int getSaveDisplayTextFont() {
        return this.saveDisplayTextFont;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle
    public void setCheckBoxPosition(int i) {
        this.checkBoxPosition = i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle
    public void setCheckBoxSize(int i) {
        this.checkBoxSize = i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.ICcdcSaveNewCardStyle
    public void setSaveDisplayTextFont(int i) {
        this.saveDisplayTextFont = i;
    }
}
