package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C69633RUn;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DiscountView implements Parcelable, Serializable {
    public static final Parcelable.Creator<DiscountView> CREATOR = new C69633RUn();

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscountView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DiscountView copy$default(DiscountView discountView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountView.discountText;
        }
        return discountView.copy(str);
    }

    public final DiscountView copy(String str) {
        return new DiscountView(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DiscountView) && o.LJ(this.discountText, ((DiscountView) obj).discountText);
    }

    public int hashCode() {
        String str = this.discountText;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.discountText);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiscountView(discountText=");
        return q.LIZIZ(LIZ, this.discountText, ')', LIZ);
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public DiscountView(String str) {
        this.discountText = str;
    }

    public /* synthetic */ DiscountView(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
