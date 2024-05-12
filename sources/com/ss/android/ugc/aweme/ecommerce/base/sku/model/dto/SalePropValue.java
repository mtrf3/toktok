package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.InterfaceC65349Pkn;
import X.RX2;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SalePropValue implements Parcelable {
    public static final Parcelable.Creator<SalePropValue> CREATOR = new RX2();

    @InterfaceC65349Pkn("image")
    public final Image image;

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
        if (!(obj instanceof SalePropValue)) {
            return false;
        }
        SalePropValue salePropValue = (SalePropValue) obj;
        return o.LJ(this.propValueId, salePropValue.propValueId) && o.LJ(this.propValue, salePropValue.propValue) && o.LJ(this.image, salePropValue.image);
    }

    public final int hashCode() {
        String str = this.propValueId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.image;
        return hashCode2 + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SalePropValue(propValueId=");
        LIZ.append(this.propValueId);
        LIZ.append(", propValue=");
        LIZ.append(this.propValue);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.propValueId);
        out.writeString(this.propValue);
        out.writeParcelable(this.image, i);
    }

    public SalePropValue(String str, String str2, Image image) {
        this.propValueId = str;
        this.propValue = str2;
        this.image = image;
    }
}
