package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C27367Aod;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchDistrictRequest implements Parcelable {
    public static final Parcelable.Creator<SearchDistrictRequest> CREATOR = new C27367Aod();

    @InterfaceC65349Pkn("geoname_ids")
    public final List<String> geoNameIds;

    @InterfaceC65349Pkn("key")
    public final String key;

    @InterfaceC65349Pkn("search_districts_type")
    public final Integer searchType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDistrictRequest)) {
            return false;
        }
        SearchDistrictRequest searchDistrictRequest = (SearchDistrictRequest) obj;
        return o.LJ(this.searchType, searchDistrictRequest.searchType) && o.LJ(this.geoNameIds, searchDistrictRequest.geoNameIds) && o.LJ(this.key, searchDistrictRequest.key);
    }

    public final int hashCode() {
        Integer num = this.searchType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.geoNameIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.key;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.searchType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeStringList(this.geoNameIds);
        out.writeString(this.key);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchDistrictRequest(searchType=");
        LIZ.append(this.searchType);
        LIZ.append(", geoNameIds=");
        LIZ.append(this.geoNameIds);
        LIZ.append(", key=");
        return q.LIZIZ(LIZ, this.key, ')', LIZ);
    }

    public SearchDistrictRequest(Integer num, List<String> list, String str) {
        this.searchType = num;
        this.geoNameIds = list;
        this.key = str;
    }
}
