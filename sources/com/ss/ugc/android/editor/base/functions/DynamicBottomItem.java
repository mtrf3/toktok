package com.ss.ugc.android.editor.base.functions;

import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class DynamicBottomItem {

    @InterfaceC65349Pkn("item_type")
    public String itemType;

    @InterfaceC65349Pkn("left_to")
    public String leftTo;

    @InterfaceC65349Pkn("pin_index")
    public int pinIndex;

    @InterfaceC65349Pkn("right_to")
    public String rightTo;

    public final String getItemType() {
        return this.itemType;
    }

    public final String getLeftTo() {
        return this.leftTo;
    }

    public final int getPinIndex() {
        return this.pinIndex;
    }

    public final String getRightTo() {
        return this.rightTo;
    }

    public final void setItemType(String str) {
        this.itemType = str;
    }

    public final void setLeftTo(String str) {
        this.leftTo = str;
    }

    public final void setPinIndex(int i) {
        this.pinIndex = i;
    }

    public final void setRightTo(String str) {
        this.rightTo = str;
    }
}
