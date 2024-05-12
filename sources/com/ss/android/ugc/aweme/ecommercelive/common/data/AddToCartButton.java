package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddToCartButton {

    @InterfaceC65349Pkn("click_hint")
    public final String clickHint;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public AddToCartButton() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButton)) {
            return false;
        }
        AddToCartButton addToCartButton = (AddToCartButton) obj;
        return o.LJ(this.clickHint, addToCartButton.clickHint) && o.LJ(this.status, addToCartButton.status);
    }

    public final int hashCode() {
        String str = this.clickHint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddToCartButton(clickHint=");
        LIZ.append(this.clickHint);
        LIZ.append(", status=");
        return s0.LIZJ(LIZ, this.status, ')', LIZ);
    }

    public AddToCartButton(String str, Integer num) {
        this.clickHint = str;
        this.status = num;
    }

    public /* synthetic */ AddToCartButton(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
