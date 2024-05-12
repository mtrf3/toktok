package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C27427Apb;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LocateDistrictData implements Parcelable {
    public static final Parcelable.Creator<LocateDistrictData> CREATOR = new C27427Apb();

    @InterfaceC65349Pkn("district")
    public final District district;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocateDistrictData) && o.LJ(this.district, ((LocateDistrictData) obj).district);
    }

    public final int hashCode() {
        District district = this.district;
        if (district == null) {
            return 0;
        }
        return district.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocateDistrictData(district=");
        LIZ.append(this.district);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        District district = this.district;
        if (district == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            district.writeToParcel(out, i);
        }
    }

    public LocateDistrictData(District district) {
        this.district = district;
    }
}
