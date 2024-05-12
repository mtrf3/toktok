package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class AddressInfo {

    @InterfaceC65349Pkn("address")
    public final String address;

    @InterfaceC65349Pkn("adm1")
    public final Area adm1;

    @InterfaceC65349Pkn("adm2")
    public final Area adm2;

    @InterfaceC65349Pkn("adm3")
    public final Area adm3;

    @InterfaceC65349Pkn("adm4")
    public final Area adm4;

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("lat")
    public final Double lat;

    @InterfaceC65349Pkn("lng")
    public final Double lng;

    @InterfaceC65349Pkn("postcode")
    public final String postcode;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AddressInfo copy$default(AddressInfo addressInfo, String str, String str2, String str3, Area area, Area area2, Area area3, Area area4, String str4, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = addressInfo.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = addressInfo.postcode;
        }
        if ((i & 8) != 0) {
            area = addressInfo.adm1;
        }
        if ((i & 16) != 0) {
            area2 = addressInfo.adm2;
        }
        if ((i & 32) != 0) {
            area3 = addressInfo.adm3;
        }
        if ((i & 64) != 0) {
            area4 = addressInfo.adm4;
        }
        if ((i & 128) != 0) {
            str4 = addressInfo.address;
        }
        if ((i & 256) != 0) {
            d = addressInfo.lng;
        }
        if ((i & 512) != 0) {
            d2 = addressInfo.lat;
        }
        return addressInfo.copy(str, str2, str3, area, area2, area3, area4, str4, d, d2);
    }

    public final AddressInfo copy(String str, String str2, String str3, Area area, Area area2, Area area3, Area area4, String str4, Double d, Double d2) {
        return new AddressInfo(str, str2, str3, area, area2, area3, area4, str4, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressInfo)) {
            return false;
        }
        AddressInfo addressInfo = (AddressInfo) obj;
        return o.LJ(this.id, addressInfo.id) && o.LJ(this.countryCode, addressInfo.countryCode) && o.LJ(this.postcode, addressInfo.postcode) && o.LJ(this.adm1, addressInfo.adm1) && o.LJ(this.adm2, addressInfo.adm2) && o.LJ(this.adm3, addressInfo.adm3) && o.LJ(this.adm4, addressInfo.adm4) && o.LJ(this.address, addressInfo.address) && o.LJ(this.lng, addressInfo.lng) && o.LJ(this.lat, addressInfo.lat);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postcode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Area area = this.adm1;
        int hashCode4 = (hashCode3 + (area == null ? 0 : area.hashCode())) * 31;
        Area area2 = this.adm2;
        int hashCode5 = (hashCode4 + (area2 == null ? 0 : area2.hashCode())) * 31;
        Area area3 = this.adm3;
        int hashCode6 = (hashCode5 + (area3 == null ? 0 : area3.hashCode())) * 31;
        Area area4 = this.adm4;
        int hashCode7 = (hashCode6 + (area4 == null ? 0 : area4.hashCode())) * 31;
        String str4 = this.address;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.lng;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.lat;
        return hashCode9 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressInfo(id=");
        LIZ.append((Object) this.id);
        LIZ.append(", countryCode=");
        LIZ.append((Object) this.countryCode);
        LIZ.append(", postcode=");
        LIZ.append((Object) this.postcode);
        LIZ.append(", adm1=");
        LIZ.append(this.adm1);
        LIZ.append(", adm2=");
        LIZ.append(this.adm2);
        LIZ.append(", adm3=");
        LIZ.append(this.adm3);
        LIZ.append(", adm4=");
        LIZ.append(this.adm4);
        LIZ.append(", address=");
        LIZ.append((Object) this.address);
        LIZ.append(", lng=");
        LIZ.append(this.lng);
        LIZ.append(", lat=");
        LIZ.append(this.lat);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAddress() {
        return this.address;
    }

    public final Area getAdm1() {
        return this.adm1;
    }

    public final Area getAdm2() {
        return this.adm2;
    }

    public final Area getAdm3() {
        return this.adm3;
    }

    public final Area getAdm4() {
        return this.adm4;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLng() {
        return this.lng;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public AddressInfo(String str, String str2, String str3, Area area, Area area2, Area area3, Area area4, String str4, Double d, Double d2) {
        this.id = str;
        this.countryCode = str2;
        this.postcode = str3;
        this.adm1 = area;
        this.adm2 = area2;
        this.adm3 = area3;
        this.adm4 = area4;
        this.address = str4;
        this.lng = d;
        this.lat = d2;
    }

    public /* synthetic */ AddressInfo(String str, String str2, String str3, Area area, Area area2, Area area3, Area area4, String str4, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : area, (i & 16) != 0 ? null : area2, (i & 32) != 0 ? null : area3, (i & 64) != 0 ? null : area4, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : d, (i & 512) == 0 ? d2 : null);
    }
}
