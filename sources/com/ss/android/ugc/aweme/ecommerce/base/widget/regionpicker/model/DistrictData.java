package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C1FL;
import X.C1NE;
import X.C27383Aot;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictData implements Parcelable {
    public static final Parcelable.Creator<DistrictData> CREATOR = new C27383Aot();

    @InterfaceC65349Pkn("districts")
    public final List<District> districts;

    @InterfaceC65349Pkn("has_next_level")
    public final Boolean hasNextLevel;

    @InterfaceC65349Pkn("matched_address_list")
    public final List<MatchedAddress> matchedAddressList;

    @InterfaceC65349Pkn("placeholder_hint")
    public final String placeholderHint;

    @InterfaceC65349Pkn("searchbar_hint")
    public final String searchbarHint;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_en")
    public final String titleEn;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictData)) {
            return false;
        }
        DistrictData districtData = (DistrictData) obj;
        return o.LJ(this.districts, districtData.districts) && o.LJ(this.hasNextLevel, districtData.hasNextLevel) && o.LJ(this.title, districtData.title) && o.LJ(this.titleEn, districtData.titleEn) && o.LJ(this.placeholderHint, districtData.placeholderHint) && o.LJ(this.searchbarHint, districtData.searchbarHint) && o.LJ(this.matchedAddressList, districtData.matchedAddressList);
    }

    public final int hashCode() {
        List<District> list = this.districts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasNextLevel;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleEn;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholderHint;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchbarHint;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<MatchedAddress> list2 = this.matchedAddressList;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DistrictData(districts=");
        LIZ.append(this.districts);
        LIZ.append(", hasNextLevel=");
        LIZ.append(this.hasNextLevel);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", titleEn=");
        LIZ.append(this.titleEn);
        LIZ.append(", placeholderHint=");
        LIZ.append(this.placeholderHint);
        LIZ.append(", searchbarHint=");
        LIZ.append(this.searchbarHint);
        LIZ.append(", matchedAddressList=");
        return C1NE.LIZIZ(LIZ, this.matchedAddressList, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<District> list = this.districts;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((District) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Boolean bool = this.hasNextLevel;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.title);
        out.writeString(this.titleEn);
        out.writeString(this.placeholderHint);
        out.writeString(this.searchbarHint);
        List<MatchedAddress> list2 = this.matchedAddressList;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
        while (LIZIZ2.hasNext()) {
            ((MatchedAddress) LIZIZ2.next()).writeToParcel(out, i);
        }
    }

    public DistrictData(List<District> list, Boolean bool, String str, String str2, String str3, String str4, List<MatchedAddress> list2) {
        this.districts = list;
        this.hasNextLevel = bool;
        this.title = str;
        this.titleEn = str2;
        this.placeholderHint = str3;
        this.searchbarHint = str4;
        this.matchedAddressList = list2;
    }
}
