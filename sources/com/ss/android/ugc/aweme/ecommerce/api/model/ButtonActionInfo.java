package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C64479PSh;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ButtonActionInfo implements Parcelable {
    public static final Parcelable.Creator<ButtonActionInfo> CREATOR = new C64479PSh();

    @InterfaceC65349Pkn("fetch_info")
    public final FetchInfo fetchInfo;

    @InterfaceC65349Pkn("location_info")
    public final LocationInfo locationInfo;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    public static /* synthetic */ ButtonActionInfo copy$default(ButtonActionInfo buttonActionInfo, String str, FetchInfo fetchInfo, LocationInfo locationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonActionInfo.schema;
        }
        if ((i & 2) != 0) {
            fetchInfo = buttonActionInfo.fetchInfo;
        }
        if ((i & 4) != 0) {
            locationInfo = buttonActionInfo.locationInfo;
        }
        return buttonActionInfo.copy(str, fetchInfo, locationInfo);
    }

    public final ButtonActionInfo copy(String str, FetchInfo fetchInfo, LocationInfo locationInfo) {
        return new ButtonActionInfo(str, fetchInfo, locationInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionInfo)) {
            return false;
        }
        ButtonActionInfo buttonActionInfo = (ButtonActionInfo) obj;
        return o.LJ(this.schema, buttonActionInfo.schema) && o.LJ(this.fetchInfo, buttonActionInfo.fetchInfo) && o.LJ(this.locationInfo, buttonActionInfo.locationInfo);
    }

    public int hashCode() {
        String str = this.schema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FetchInfo fetchInfo = this.fetchInfo;
        int hashCode2 = (hashCode + (fetchInfo == null ? 0 : fetchInfo.hashCode())) * 31;
        LocationInfo locationInfo = this.locationInfo;
        return hashCode2 + (locationInfo != null ? locationInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ButtonActionInfo(schema=");
        LIZ.append(this.schema);
        LIZ.append(", fetchInfo=");
        LIZ.append(this.fetchInfo);
        LIZ.append(", locationInfo=");
        LIZ.append(this.locationInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.schema);
        FetchInfo fetchInfo = this.fetchInfo;
        if (fetchInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            fetchInfo.writeToParcel(out, i);
        }
        LocationInfo locationInfo = this.locationInfo;
        if (locationInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            locationInfo.writeToParcel(out, i);
        }
    }

    public final FetchInfo getFetchInfo() {
        return this.fetchInfo;
    }

    public final LocationInfo getLocationInfo() {
        return this.locationInfo;
    }

    public final String getSchema() {
        return this.schema;
    }

    public ButtonActionInfo(String str, FetchInfo fetchInfo, LocationInfo locationInfo) {
        this.schema = str;
        this.fetchInfo = fetchInfo;
        this.locationInfo = locationInfo;
    }
}
