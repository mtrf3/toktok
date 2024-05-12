package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.dynamicstyle.addressitem;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle;

/* loaded from: classes5.dex */
public final class USTextInputHelperStyle implements ITextInputHelperStyle {
    public boolean showErrorWhenClickSaveButton;
    public boolean titleGrayedInUneditable;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle
    public boolean getShowErrorWhenClickSaveButton() {
        return this.showErrorWhenClickSaveButton;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle
    public boolean getTitleGrayedInUneditable() {
        return this.titleGrayedInUneditable;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle
    public void setShowErrorWhenClickSaveButton(boolean z) {
        this.showErrorWhenClickSaveButton = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.ITextInputHelperStyle
    public void setTitleGrayedInUneditable(boolean z) {
        this.titleGrayedInUneditable = z;
    }
}
