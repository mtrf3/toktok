package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillingAddress {

    @InterfaceC65349Pkn("billing_address_line")
    public String billingAddressLine;

    @InterfaceC65349Pkn("billing_city")
    public String billingCity;

    @InterfaceC65349Pkn("billing_country_region")
    public String billingCountryRegion;

    @InterfaceC65349Pkn("billing_postal_code")
    public String billingPostalCode;

    @InterfaceC65349Pkn("billing_state")
    public String billingState;

    /* JADX WARN: Multi-variable type inference failed */
    public BillingAddress() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingAddress.billingCountryRegion;
        }
        if ((i & 2) != 0) {
            str2 = billingAddress.billingState;
        }
        if ((i & 4) != 0) {
            str3 = billingAddress.billingCity;
        }
        if ((i & 8) != 0) {
            str4 = billingAddress.billingAddressLine;
        }
        if ((i & 16) != 0) {
            str5 = billingAddress.billingPostalCode;
        }
        return billingAddress.copy(str, str2, str3, str4, str5);
    }

    public final BillingAddress copy(String str, String str2, String str3, String str4, String str5) {
        return new BillingAddress(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) obj;
        return o.LJ(this.billingCountryRegion, billingAddress.billingCountryRegion) && o.LJ(this.billingState, billingAddress.billingState) && o.LJ(this.billingCity, billingAddress.billingCity) && o.LJ(this.billingAddressLine, billingAddress.billingAddressLine) && o.LJ(this.billingPostalCode, billingAddress.billingPostalCode);
    }

    public int hashCode() {
        String str = this.billingCountryRegion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billingState;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingCity;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingAddressLine;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billingPostalCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillingAddress(billingCountryRegion=");
        LIZ.append((Object) this.billingCountryRegion);
        LIZ.append(", billingState=");
        LIZ.append((Object) this.billingState);
        LIZ.append(", billingCity=");
        LIZ.append((Object) this.billingCity);
        LIZ.append(", billingAddressLine=");
        LIZ.append((Object) this.billingAddressLine);
        LIZ.append(", billingPostalCode=");
        LIZ.append((Object) this.billingPostalCode);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getBillingAddressLine() {
        return this.billingAddressLine;
    }

    public final String getBillingCity() {
        return this.billingCity;
    }

    public final String getBillingCountryRegion() {
        return this.billingCountryRegion;
    }

    public final String getBillingPostalCode() {
        return this.billingPostalCode;
    }

    public final String getBillingState() {
        return this.billingState;
    }

    public final void setBillingAddressLine(String str) {
        this.billingAddressLine = str;
    }

    public final void setBillingCity(String str) {
        this.billingCity = str;
    }

    public final void setBillingCountryRegion(String str) {
        this.billingCountryRegion = str;
    }

    public final void setBillingPostalCode(String str) {
        this.billingPostalCode = str;
    }

    public final void setBillingState(String str) {
        this.billingState = str;
    }

    public BillingAddress(String str, String str2, String str3, String str4, String str5) {
        this.billingCountryRegion = str;
        this.billingState = str2;
        this.billingCity = str3;
        this.billingAddressLine = str4;
        this.billingPostalCode = str5;
    }

    public /* synthetic */ BillingAddress(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
