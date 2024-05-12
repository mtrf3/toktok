package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RVX;
import X.RVY;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductUnavailableInfo implements Parcelable {

    @InterfaceC65349Pkn("action")
    public final Integer action;

    @InterfaceC65349Pkn("action_redirect_type")
    public final Integer actionRedirectType;

    @InterfaceC65349Pkn("action_text")
    public final String actionText;

    @InterfaceC65349Pkn("link_schema")
    public final String linkSchema;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("reason")
    public final Integer unavailableReason;
    public static final RVY UnavailableEnum = new RVY();
    public static final Parcelable.Creator<ProductUnavailableInfo> CREATOR = new RVX();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductUnavailableInfo)) {
            return false;
        }
        ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) obj;
        return o.LJ(this.text, productUnavailableInfo.text) && o.LJ(this.linkSchema, productUnavailableInfo.linkSchema) && o.LJ(this.unavailableReason, productUnavailableInfo.unavailableReason) && o.LJ(this.action, productUnavailableInfo.action) && o.LJ(this.actionText, productUnavailableInfo.actionText) && o.LJ(this.actionRedirectType, productUnavailableInfo.actionRedirectType);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkSchema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.unavailableReason;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.action;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.actionText;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.actionRedirectType;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductUnavailableInfo(text=");
        LIZ.append(this.text);
        LIZ.append(", linkSchema=");
        LIZ.append(this.linkSchema);
        LIZ.append(", unavailableReason=");
        LIZ.append(this.unavailableReason);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(", actionText=");
        LIZ.append(this.actionText);
        LIZ.append(", actionRedirectType=");
        return s0.LIZJ(LIZ, this.actionRedirectType, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        out.writeString(this.linkSchema);
        Integer num = this.unavailableReason;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.action;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.actionText);
        Integer num3 = this.actionRedirectType;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
    }

    public ProductUnavailableInfo(String str, String str2, Integer num, Integer num2, String str3, Integer num3) {
        this.text = str;
        this.linkSchema = str2;
        this.unavailableReason = num;
        this.action = num2;
        this.actionText = str3;
        this.actionRedirectType = num3;
    }
}
