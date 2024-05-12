package com.ss.android.ugc.aweme.ecommerce.base.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressForPay {

    @InterfaceC65349Pkn("billing_city")
    public final String city;

    @InterfaceC65349Pkn("billing_postal_code")
    public final String postalCode;

    @InterfaceC65349Pkn("billing_country_region")
    public final String region;

    @InterfaceC65349Pkn("billing_state")
    public final String state;

    @InterfaceC65349Pkn("billing_street")
    public final String street;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressForPay)) {
            return false;
        }
        AddressForPay addressForPay = (AddressForPay) obj;
        return o.LJ(this.region, addressForPay.region) && o.LJ(this.state, addressForPay.state) && o.LJ(this.city, addressForPay.city) && o.LJ(this.street, addressForPay.street) && o.LJ(this.postalCode, addressForPay.postalCode);
    }

    public final int hashCode() {
        String str = this.region;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressForPay(region=");
        LIZ.append(this.region);
        LIZ.append(", state=");
        LIZ.append(this.state);
        LIZ.append(", city=");
        LIZ.append(this.city);
        LIZ.append(", street=");
        LIZ.append(this.street);
        LIZ.append(", postalCode=");
        return q.LIZIZ(LIZ, this.postalCode, ')', LIZ);
    }

    public AddressForPay(String str, String str2, String str3, String str4, String str5) {
        this.region = str;
        this.state = str2;
        this.city = str3;
        this.street = str4;
        this.postalCode = str5;
    }
}
