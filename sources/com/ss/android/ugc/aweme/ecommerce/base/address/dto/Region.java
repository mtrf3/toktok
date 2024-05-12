package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27199Alv;
import X.C27200Alw;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Region implements Parcelable {

    @InterfaceC65349Pkn("code")
    public final String code;

    @InterfaceC65349Pkn("district_key")
    public final String districtKey;

    @InterfaceC65349Pkn("geoname_id")
    public final String geoNameId;

    @InterfaceC65349Pkn("latitude")
    public final String latitude;

    @InterfaceC65349Pkn("longitude")
    public final String longitude;

    @InterfaceC65349Pkn("name")
    public final String name;
    public static final C27200Alw Companion = new C27200Alw();
    public static final Parcelable.Creator<Region> CREATOR = new C27199Alv();

    /* JADX WARN: Multi-variable type inference failed */
    public Region() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Region)) {
            return false;
        }
        Region region = (Region) obj;
        return o.LJ(this.name, region.name) && o.LJ(this.geoNameId, region.geoNameId) && o.LJ(this.code, region.code) && o.LJ(this.districtKey, region.districtKey) && o.LJ(this.longitude, region.longitude) && o.LJ(this.latitude, region.latitude);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.geoNameId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.districtKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.longitude;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.latitude;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.geoNameId);
        out.writeString(this.code);
        out.writeString(this.districtKey);
        out.writeString(this.longitude);
        out.writeString(this.latitude);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Region(name=");
        LIZ.append(this.name);
        LIZ.append(", geoNameId=");
        LIZ.append(this.geoNameId);
        LIZ.append(", code=");
        LIZ.append(this.code);
        LIZ.append(", districtKey=");
        LIZ.append(this.districtKey);
        LIZ.append(", longitude=");
        LIZ.append(this.longitude);
        LIZ.append(", latitude=");
        return q.LIZIZ(LIZ, this.latitude, ')', LIZ);
    }

    public static Region LIZ(Region region, String str) {
        return new Region(region.name, region.geoNameId, str, region.districtKey, region.longitude, region.latitude);
    }

    public Region(String str, String str2, String str3, String str4, String str5, String str6) {
        this.name = str;
        this.geoNameId = str2;
        this.code = str3;
        this.districtKey = str4;
        this.longitude = str5;
        this.latitude = str6;
    }

    public /* synthetic */ Region(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
