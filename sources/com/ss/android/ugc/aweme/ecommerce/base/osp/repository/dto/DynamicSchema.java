package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C28015Az5;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DynamicSchema implements Serializable, Parcelable {
    public static final Parcelable.Creator<DynamicSchema> CREATOR = new C28015Az5();

    @InterfaceC65349Pkn("address_edit_schema")
    public final String addressEditSchema;

    @InterfaceC65349Pkn("address_list_schema")
    public final String addressListSchema;

    @InterfaceC65349Pkn("buy_now_schema")
    public final String buyNowSchema;

    @InterfaceC65349Pkn("popup_schema")
    public final String popupSchema;

    public static /* synthetic */ DynamicSchema copy$default(DynamicSchema dynamicSchema, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicSchema.buyNowSchema;
        }
        if ((i & 2) != 0) {
            str2 = dynamicSchema.addressListSchema;
        }
        if ((i & 4) != 0) {
            str3 = dynamicSchema.addressEditSchema;
        }
        if ((i & 8) != 0) {
            str4 = dynamicSchema.popupSchema;
        }
        return dynamicSchema.copy(str, str2, str3, str4);
    }

    public final DynamicSchema copy(String str, String str2, String str3, String str4) {
        return new DynamicSchema(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSchema)) {
            return false;
        }
        DynamicSchema dynamicSchema = (DynamicSchema) obj;
        return o.LJ(this.buyNowSchema, dynamicSchema.buyNowSchema) && o.LJ(this.addressListSchema, dynamicSchema.addressListSchema) && o.LJ(this.addressEditSchema, dynamicSchema.addressEditSchema) && o.LJ(this.popupSchema, dynamicSchema.popupSchema);
    }

    public int hashCode() {
        String str = this.buyNowSchema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.addressListSchema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressEditSchema;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.popupSchema;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.buyNowSchema);
        out.writeString(this.addressListSchema);
        out.writeString(this.addressEditSchema);
        out.writeString(this.popupSchema);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSchema(buyNowSchema=");
        LIZ.append(this.buyNowSchema);
        LIZ.append(", addressListSchema=");
        LIZ.append(this.addressListSchema);
        LIZ.append(", addressEditSchema=");
        LIZ.append(this.addressEditSchema);
        LIZ.append(", popupSchema=");
        return q.LIZIZ(LIZ, this.popupSchema, ')', LIZ);
    }

    public final String getAddressEditSchema() {
        return this.addressEditSchema;
    }

    public final String getAddressListSchema() {
        return this.addressListSchema;
    }

    public final String getBuyNowSchema() {
        return this.buyNowSchema;
    }

    public final String getPopupSchema() {
        return this.popupSchema;
    }

    public final DynamicSchema merge(DynamicSchema dynamicSchema) {
        if (dynamicSchema == null) {
            return this;
        }
        String str = dynamicSchema.buyNowSchema;
        if (str == null) {
            str = this.buyNowSchema;
        }
        String str2 = dynamicSchema.addressListSchema;
        if (str2 == null) {
            str2 = this.addressListSchema;
        }
        String str3 = dynamicSchema.addressEditSchema;
        if (str3 == null) {
            str3 = this.addressEditSchema;
        }
        String str4 = dynamicSchema.popupSchema;
        if (str4 == null) {
            str4 = this.popupSchema;
        }
        return new DynamicSchema(str, str2, str3, str4);
    }

    public DynamicSchema(String str, String str2, String str3, String str4) {
        this.buyNowSchema = str;
        this.addressListSchema = str2;
        this.addressEditSchema = str3;
        this.popupSchema = str4;
    }
}
