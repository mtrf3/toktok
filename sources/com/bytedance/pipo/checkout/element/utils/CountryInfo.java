package com.bytedance.pipo.checkout.element.utils;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CountryInfo {

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("country_name")
    public final String countryName;

    @InterfaceC65349Pkn("country_of_residence")
    public final String countryOfResidence;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("nationality_and_citizenship")
    public final String nationalityAndCitizenship;

    @InterfaceC65349Pkn("phone_country_code")
    public final String phoneCountryCode;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryInfo)) {
            return false;
        }
        CountryInfo countryInfo = (CountryInfo) obj;
        return o.LJ(this.countryName, countryInfo.countryName) && o.LJ(this.countryCode, countryInfo.countryCode) && o.LJ(this.countryOfResidence, countryInfo.countryOfResidence) && o.LJ(this.nationalityAndCitizenship, countryInfo.nationalityAndCitizenship) && o.LJ(this.currency, countryInfo.currency) && o.LJ(this.phoneCountryCode, countryInfo.phoneCountryCode);
    }

    public final int hashCode() {
        String str = this.countryName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryOfResidence;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nationalityAndCitizenship;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phoneCountryCode;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CountryInfo(countryName=");
        LIZ.append((Object) this.countryName);
        LIZ.append(", countryCode=");
        LIZ.append((Object) this.countryCode);
        LIZ.append(", countryOfResidence=");
        LIZ.append((Object) this.countryOfResidence);
        LIZ.append(", nationalityAndCitizenship=");
        LIZ.append((Object) this.nationalityAndCitizenship);
        LIZ.append(", currency=");
        LIZ.append((Object) this.currency);
        LIZ.append(", phoneCountryCode=");
        LIZ.append((Object) this.phoneCountryCode);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CountryInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.countryName = str;
        this.countryCode = str2;
        this.countryOfResidence = str3;
        this.nationalityAndCitizenship = str4;
        this.currency = str5;
        this.phoneCountryCode = str6;
    }

    public /* synthetic */ CountryInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
