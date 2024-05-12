package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.RWE;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StandardSaleProps implements Parcelable {
    public static final Parcelable.Creator<StandardSaleProps> CREATOR = new RWE();

    @InterfaceC65349Pkn("default_local_sign")
    public final String defaultStandardSign;

    @InterfaceC65349Pkn("sale_props")
    public final Map<String, SaleProp> standardSaleProp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardSaleProps)) {
            return false;
        }
        StandardSaleProps standardSaleProps = (StandardSaleProps) obj;
        return o.LJ(this.defaultStandardSign, standardSaleProps.defaultStandardSign) && o.LJ(this.standardSaleProp, standardSaleProps.standardSaleProp);
    }

    public final int hashCode() {
        String str = this.defaultStandardSign;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, SaleProp> map = this.standardSaleProp;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.defaultStandardSign);
        Map<String, SaleProp> map = this.standardSaleProp;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, SaleProp> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            entry.getValue().writeToParcel(out, i);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StandardSaleProps(defaultStandardSign=");
        LIZ.append(this.defaultStandardSign);
        LIZ.append(", standardSaleProp=");
        return C15890jp.LIZ(LIZ, this.standardSaleProp, ')', LIZ);
    }

    public StandardSaleProps(String str, Map<String, SaleProp> map) {
        this.defaultStandardSign = str;
        this.standardSaleProp = map;
    }
}
