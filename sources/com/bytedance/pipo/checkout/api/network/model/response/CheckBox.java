package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CheckBox {

    @InterfaceC65349Pkn("display")
    public Boolean display;

    @InterfaceC65349Pkn("is_select")
    public Boolean isSelect;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckBox() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CheckBox copy$default(CheckBox checkBox, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = checkBox.display;
        }
        if ((i & 2) != 0) {
            bool2 = checkBox.isSelect;
        }
        return checkBox.copy(bool, bool2);
    }

    public final CheckBox copy(Boolean bool, Boolean bool2) {
        return new CheckBox(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckBox)) {
            return false;
        }
        CheckBox checkBox = (CheckBox) obj;
        return o.LJ(this.display, checkBox.display) && o.LJ(this.isSelect, checkBox.isSelect);
    }

    public int hashCode() {
        Boolean bool = this.display;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isSelect;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckBox(display=");
        LIZ.append(this.display);
        LIZ.append(", isSelect=");
        LIZ.append(this.isSelect);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Boolean getDisplay() {
        return this.display;
    }

    public final Boolean isSelect() {
        return this.isSelect;
    }

    public final void setDisplay(Boolean bool) {
        this.display = bool;
    }

    public final void setSelect(Boolean bool) {
        this.isSelect = bool;
    }

    public CheckBox(Boolean bool, Boolean bool2) {
        this.display = bool;
        this.isSelect = bool2;
    }

    public /* synthetic */ CheckBox(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
