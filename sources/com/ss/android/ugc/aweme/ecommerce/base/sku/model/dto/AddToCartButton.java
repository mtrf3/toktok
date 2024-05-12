package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RW8;
import X.RW9;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddToCartButton implements Parcelable {
    public static final RW9 AddToCartButtonStatus = new RW9();
    public static final Parcelable.Creator<AddToCartButton> CREATOR = new RW8();

    @InterfaceC65349Pkn("available_count")
    public final Integer availableCount;

    @InterfaceC65349Pkn("button_style")
    public final Integer buttonStyle;

    @InterfaceC65349Pkn("click_hint")
    public final String clickHint;

    @InterfaceC65349Pkn("click_hint_toast_name")
    public final String clickHintToastName;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButton)) {
            return false;
        }
        AddToCartButton addToCartButton = (AddToCartButton) obj;
        return o.LJ(this.status, addToCartButton.status) && o.LJ(this.clickHint, addToCartButton.clickHint) && o.LJ(this.clickHintToastName, addToCartButton.clickHintToastName) && o.LJ(this.availableCount, addToCartButton.availableCount) && o.LJ(this.buttonStyle, addToCartButton.buttonStyle);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.clickHint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickHintToastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.availableCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buttonStyle;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddToCartButton(status=");
        LIZ.append(this.status);
        LIZ.append(", clickHint=");
        LIZ.append(this.clickHint);
        LIZ.append(", clickHintToastName=");
        LIZ.append(this.clickHintToastName);
        LIZ.append(", availableCount=");
        LIZ.append(this.availableCount);
        LIZ.append(", buttonStyle=");
        return s0.LIZJ(LIZ, this.buttonStyle, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.status;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.clickHint);
        out.writeString(this.clickHintToastName);
        Integer num2 = this.availableCount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.buttonStyle;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
    }

    public AddToCartButton(Integer num, String str, String str2, Integer num2, Integer num3) {
        this.status = num;
        this.clickHint = str;
        this.clickHintToastName = str2;
        this.availableCount = num2;
        this.buttonStyle = num3;
    }
}
