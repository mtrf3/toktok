package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddressTipButton {

    @InterfaceC65349Pkn("button_type")
    public final Integer buttonType;

    @InterfaceC65349Pkn("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressTipButton)) {
            return false;
        }
        AddressTipButton addressTipButton = (AddressTipButton) obj;
        return o.LJ(this.buttonType, addressTipButton.buttonType) && o.LJ(this.text, addressTipButton.text);
    }

    public final int hashCode() {
        Integer num = this.buttonType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressTipButton(buttonType=");
        LIZ.append(this.buttonType);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public AddressTipButton(Integer num, String str) {
        this.buttonType = num;
        this.text = str;
    }
}
