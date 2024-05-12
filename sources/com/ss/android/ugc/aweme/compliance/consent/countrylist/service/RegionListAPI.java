package com.ss.android.ugc.aweme.compliance.consent.countrylist.service;

import X.AbstractC73672Svk;
import X.C35931E8h;
import X.E4Q;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public interface RegionListAPI {
    public static final C35931E8h LIZ = C35931E8h.LIZ;

    @E4Q("/passport/app/region/register_region_list/")
    AbstractC73672Svk<RegionListAPIResponse> getRegionList();

    /* loaded from: classes7.dex */
    public static final class Country {

        @InterfaceC65349Pkn("country_code")
        public final String countryCode;

        @InterfaceC65349Pkn("localized_country_name")
        public final String countryName;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Country)) {
                return false;
            }
            Country country = (Country) obj;
            return o.LJ(this.countryCode, country.countryCode) && o.LJ(this.countryName, country.countryName);
        }

        public final int hashCode() {
            return this.countryName.hashCode() + (this.countryCode.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Country(countryCode=");
            LIZ.append(this.countryCode);
            LIZ.append(", countryName=");
            return q.LIZIZ(LIZ, this.countryName, ')', LIZ);
        }

        public Country(String countryCode, String countryName) {
            o.LJIIIZ(countryCode, "countryCode");
            o.LJIIIZ(countryName, "countryName");
            this.countryCode = countryCode;
            this.countryName = countryName;
        }
    }

    /* loaded from: classes7.dex */
    public static final class RegionList {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("region_list")
        public final List<Country> regionList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegionList)) {
                return false;
            }
            RegionList regionList = (RegionList) obj;
            return o.LJ(this.regionList, regionList.regionList) && o.LJ(this.description, regionList.description);
        }

        public final int hashCode() {
            List<Country> list = this.regionList;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.description;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RegionList(regionList=");
            LIZ.append(this.regionList);
            LIZ.append(", description=");
            return q.LIZIZ(LIZ, this.description, ')', LIZ);
        }

        public RegionList(List<Country> list, String str) {
            this.regionList = list;
            this.description = str;
        }
    }

    /* loaded from: classes7.dex */
    public static final class RegionListAPIResponse {

        @InterfaceC65349Pkn("data")
        public final RegionList data;

        @InterfaceC65349Pkn("message")
        public final String message;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegionListAPIResponse)) {
                return false;
            }
            RegionListAPIResponse regionListAPIResponse = (RegionListAPIResponse) obj;
            return o.LJ(this.data, regionListAPIResponse.data) && o.LJ(this.message, regionListAPIResponse.message);
        }

        public final int hashCode() {
            RegionList regionList = this.data;
            int hashCode = (regionList == null ? 0 : regionList.hashCode()) * 31;
            String str = this.message;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RegionListAPIResponse(data=");
            LIZ.append(this.data);
            LIZ.append(", message=");
            return q.LIZIZ(LIZ, this.message, ')', LIZ);
        }

        public RegionListAPIResponse(RegionList regionList, String str) {
            this.data = regionList;
            this.message = str;
        }
    }
}
