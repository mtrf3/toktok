package com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem;

/* loaded from: classes5.dex */
public final class DefaultRegionSelectHelperStyle implements IRegionSelectHelperStyle {
    public boolean titleGrayedInUneditable = true;
    public boolean showErrorWhenClickSaveButton = true;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IRegionSelectHelperStyle
    public boolean getShowErrorWhenClickSaveButton() {
        return this.showErrorWhenClickSaveButton;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IRegionSelectHelperStyle
    public boolean getTitleGrayedInUneditable() {
        return this.titleGrayedInUneditable;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IRegionSelectHelperStyle
    public void setShowErrorWhenClickSaveButton(boolean z) {
        this.showErrorWhenClickSaveButton = z;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.dynamicstyle.addressitem.IRegionSelectHelperStyle
    public void setTitleGrayedInUneditable(boolean z) {
        this.titleGrayedInUneditable = z;
    }
}
