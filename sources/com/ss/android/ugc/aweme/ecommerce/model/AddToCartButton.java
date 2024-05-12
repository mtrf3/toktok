package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddToCartButton {

    @InterfaceC65349Pkn("available_count")
    public final Integer availableCount;

    @InterfaceC65349Pkn("click_hint")
    public final String clickHint;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public AddToCartButton() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButton)) {
            return false;
        }
        AddToCartButton addToCartButton = (AddToCartButton) obj;
        return o.LJ(this.status, addToCartButton.status) && o.LJ(this.clickHint, addToCartButton.clickHint) && o.LJ(this.availableCount, addToCartButton.availableCount);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.clickHint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.availableCount;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddToCartButton(status=");
        LIZ.append(this.status);
        LIZ.append(", clickHint=");
        LIZ.append(this.clickHint);
        LIZ.append(", availableCount=");
        return s0.LIZJ(LIZ, this.availableCount, ')', LIZ);
    }

    public AddToCartButton(Integer num, String str, Integer num2) {
        this.status = num;
        this.clickHint = str;
        this.availableCount = num2;
    }

    public /* synthetic */ AddToCartButton(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
    }
}
