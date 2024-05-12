package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C64480PSi;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LocationInfo implements Parcelable {
    public static final Parcelable.Creator<LocationInfo> CREATOR = new C64480PSi();

    @InterfaceC65349Pkn("module")
    public final String moduleName;

    @InterfaceC65349Pkn("module_position_tag")
    public final String modulePositionTag;

    public static /* synthetic */ LocationInfo copy$default(LocationInfo locationInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = locationInfo.moduleName;
        }
        if ((i & 2) != 0) {
            str2 = locationInfo.modulePositionTag;
        }
        return locationInfo.copy(str, str2);
    }

    public final LocationInfo copy(String str, String str2) {
        return new LocationInfo(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationInfo)) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) obj;
        return o.LJ(this.moduleName, locationInfo.moduleName) && o.LJ(this.modulePositionTag, locationInfo.modulePositionTag);
    }

    public int hashCode() {
        String str = this.moduleName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.modulePositionTag;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.moduleName);
        out.writeString(this.modulePositionTag);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationInfo(moduleName=");
        LIZ.append(this.moduleName);
        LIZ.append(", modulePositionTag=");
        return q.LIZIZ(LIZ, this.modulePositionTag, ')', LIZ);
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final String getModulePositionTag() {
        return this.modulePositionTag;
    }

    public LocationInfo(String str, String str2) {
        this.moduleName = str;
        this.modulePositionTag = str2;
    }
}
