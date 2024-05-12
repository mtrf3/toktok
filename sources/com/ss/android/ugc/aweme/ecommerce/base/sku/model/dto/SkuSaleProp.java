package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C69693RWv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuSaleProp implements Parcelable {
    public static final Parcelable.Creator<SkuSaleProp> CREATOR = new C69693RWv();

    @InterfaceC65349Pkn("prop_id")
    public final String propId;

    @InterfaceC65349Pkn("prop_name")
    public final String propName;

    @InterfaceC65349Pkn("prop_value")
    public final String propValue;

    @InterfaceC65349Pkn("prop_value_id")
    public final String propValueId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuSaleProp)) {
            return false;
        }
        SkuSaleProp skuSaleProp = (SkuSaleProp) obj;
        return o.LJ(this.propId, skuSaleProp.propId) && o.LJ(this.propName, skuSaleProp.propName) && o.LJ(this.propValueId, skuSaleProp.propValueId) && o.LJ(this.propValue, skuSaleProp.propValue);
    }

    public final int hashCode() {
        String str = this.propId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propValueId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.propValue;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.propId);
        out.writeString(this.propName);
        out.writeString(this.propValueId);
        out.writeString(this.propValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuSaleProp(propId=");
        LIZ.append(this.propId);
        LIZ.append(", propName=");
        LIZ.append(this.propName);
        LIZ.append(", propValueId=");
        LIZ.append(this.propValueId);
        LIZ.append(", propValue=");
        return q.LIZIZ(LIZ, this.propValue, ')', LIZ);
    }

    public SkuSaleProp(String str, String str2, String str3, String str4) {
        this.propId = str;
        this.propName = str2;
        this.propValueId = str3;
        this.propValue = str4;
    }
}
