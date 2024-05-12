package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RX1;
import X.RX3;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SaleProp implements Parcelable {

    @InterfaceC65349Pkn("has_image")
    public final Boolean hasImage;

    @InterfaceC65349Pkn("prop_id")
    public final String propId;

    @InterfaceC65349Pkn("prop_name")
    public final String propName;

    @InterfaceC65349Pkn("sale_prop_type")
    public final Integer salePropType;

    @InterfaceC65349Pkn("sale_prop_values")
    public final List<SalePropValue> salePropValueList;

    @InterfaceC65349Pkn("size_show_type")
    public final int showType;
    public static final RX3 ShowType = new RX3();
    public static final Parcelable.Creator<SaleProp> CREATOR = new RX1();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleProp)) {
            return false;
        }
        SaleProp saleProp = (SaleProp) obj;
        return o.LJ(this.propId, saleProp.propId) && o.LJ(this.propName, saleProp.propName) && o.LJ(this.hasImage, saleProp.hasImage) && o.LJ(this.salePropValueList, saleProp.salePropValueList) && this.showType == saleProp.showType && o.LJ(this.salePropType, saleProp.salePropType);
    }

    public final int hashCode() {
        String str = this.propId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasImage;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SalePropValue> list = this.salePropValueList;
        int hashCode4 = (((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.showType) * 31;
        Integer num = this.salePropType;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaleProp(propId=");
        LIZ.append(this.propId);
        LIZ.append(", propName=");
        LIZ.append(this.propName);
        LIZ.append(", hasImage=");
        LIZ.append(this.hasImage);
        LIZ.append(", salePropValueList=");
        LIZ.append(this.salePropValueList);
        LIZ.append(", showType=");
        LIZ.append(this.showType);
        LIZ.append(", salePropType=");
        return s0.LIZJ(LIZ, this.salePropType, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.propId);
        out.writeString(this.propName);
        Boolean bool = this.hasImage;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        List<SalePropValue> list = this.salePropValueList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SalePropValue) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeInt(this.showType);
        Integer num = this.salePropType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public SaleProp(String str, String str2, Boolean bool, List<SalePropValue> list, int i, Integer num) {
        this.propId = str;
        this.propName = str2;
        this.hasImage = bool;
        this.salePropValueList = list;
        this.showType = i;
        this.salePropType = num;
    }
}
