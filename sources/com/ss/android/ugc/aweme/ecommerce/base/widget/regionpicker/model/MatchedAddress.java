package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C1NE;
import X.C27385Aov;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MatchedAddress implements Parcelable {
    public static final Parcelable.Creator<MatchedAddress> CREATOR = new C27385Aov();

    @InterfaceC65349Pkn("multilevel_districts")
    public final List<District> multilevelDistricts;

    @InterfaceC65349Pkn("related_city_info")
    public final String relatedCityInfo;

    @InterfaceC65349Pkn("zipcode_info")
    public final String zipcodeInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedAddress)) {
            return false;
        }
        MatchedAddress matchedAddress = (MatchedAddress) obj;
        return o.LJ(this.zipcodeInfo, matchedAddress.zipcodeInfo) && o.LJ(this.relatedCityInfo, matchedAddress.relatedCityInfo) && o.LJ(this.multilevelDistricts, matchedAddress.multilevelDistricts);
    }

    public final int hashCode() {
        String str = this.zipcodeInfo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.relatedCityInfo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<District> list = this.multilevelDistricts;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchedAddress(zipcodeInfo=");
        LIZ.append(this.zipcodeInfo);
        LIZ.append(", relatedCityInfo=");
        LIZ.append(this.relatedCityInfo);
        LIZ.append(", multilevelDistricts=");
        return C1NE.LIZIZ(LIZ, this.multilevelDistricts, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.zipcodeInfo);
        out.writeString(this.relatedCityInfo);
        List<District> list = this.multilevelDistricts;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((District) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public MatchedAddress(String str, String str2, List<District> list) {
        this.zipcodeInfo = str;
        this.relatedCityInfo = str2;
        this.multilevelDistricts = list;
    }
}
