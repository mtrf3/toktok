package com.ss.android.ugc.aweme.poi;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PokerBundle extends F9E {

    @InterfaceC65349Pkn("adcode")
    public String adcode;

    @InterfaceC65349Pkn("city")
    public String city;

    @InterfaceC65349Pkn("country")
    public String country;

    @InterfaceC65349Pkn("district")
    public String district;

    @InterfaceC65349Pkn("province")
    public String province;

    /* JADX WARN: Multi-variable type inference failed */
    public PokerBundle() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PokerBundle copy$default(PokerBundle pokerBundle, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pokerBundle.adcode;
        }
        if ((i & 2) != 0) {
            str2 = pokerBundle.district;
        }
        if ((i & 4) != 0) {
            str3 = pokerBundle.country;
        }
        if ((i & 8) != 0) {
            str4 = pokerBundle.province;
        }
        if ((i & 16) != 0) {
            str5 = pokerBundle.city;
        }
        return pokerBundle.copy(str, str2, str3, str4, str5);
    }

    public final PokerBundle copy(String adcode, String district, String country, String province, String city) {
        o.LJIIIZ(adcode, "adcode");
        o.LJIIIZ(district, "district");
        o.LJIIIZ(country, "country");
        o.LJIIIZ(province, "province");
        o.LJIIIZ(city, "city");
        return new PokerBundle(adcode, district, country, province, city);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.adcode, this.district, this.country, this.province, this.city};
    }

    public final String getAdcode() {
        return this.adcode;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getProvince() {
        return this.province;
    }

    public final void setAdcode(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.adcode = str;
    }

    public final void setCity(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.city = str;
    }

    public final void setCountry(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.country = str;
    }

    public final void setDistrict(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.district = str;
    }

    public final void setProvince(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.province = str;
    }

    public PokerBundle(String adcode, String district, String country, String province, String city) {
        o.LJIIIZ(adcode, "adcode");
        o.LJIIIZ(district, "district");
        o.LJIIIZ(country, "country");
        o.LJIIIZ(province, "province");
        o.LJIIIZ(city, "city");
        this.adcode = adcode;
        this.district = district;
        this.country = country;
        this.province = province;
        this.city = city;
    }

    public /* synthetic */ PokerBundle(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
