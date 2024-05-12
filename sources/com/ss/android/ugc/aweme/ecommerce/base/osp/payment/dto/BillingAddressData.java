package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillingAddressData {

    @InterfaceC65349Pkn("billingAddressLine")
    public final String billingAddressLine;

    @InterfaceC65349Pkn("billingCity")
    public final String billingCity;

    @InterfaceC65349Pkn("billingCountryRegionCode")
    public final String billingCountryRegionCode;

    @InterfaceC65349Pkn("billingCountryRegionDisplay")
    public final String billingCountryRegionDisplay;

    @InterfaceC65349Pkn("billingPostalCode")
    public final String billingPostalCode;

    @InterfaceC65349Pkn("billingState")
    public final String billingState;

    @InterfaceC65349Pkn("selectedRegion")
    public final List<Region> selectedRegion;

    /* JADX WARN: Multi-variable type inference failed */
    public BillingAddressData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillingAddressData copy$default(BillingAddressData billingAddressData, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingAddressData.billingAddressLine;
        }
        if ((i & 2) != 0) {
            str2 = billingAddressData.billingCity;
        }
        if ((i & 4) != 0) {
            str3 = billingAddressData.billingCountryRegionDisplay;
        }
        if ((i & 8) != 0) {
            str4 = billingAddressData.billingCountryRegionCode;
        }
        if ((i & 16) != 0) {
            str5 = billingAddressData.billingPostalCode;
        }
        if ((i & 32) != 0) {
            str6 = billingAddressData.billingState;
        }
        if ((i & 64) != 0) {
            list = billingAddressData.selectedRegion;
        }
        return billingAddressData.copy(str, str2, str3, str4, str5, str6, list);
    }

    public final BillingAddressData copy(String str, String str2, String str3, String str4, String str5, String str6, List<Region> list) {
        return new BillingAddressData(str, str2, str3, str4, str5, str6, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingAddressData)) {
            return false;
        }
        BillingAddressData billingAddressData = (BillingAddressData) obj;
        return o.LJ(this.billingAddressLine, billingAddressData.billingAddressLine) && o.LJ(this.billingCity, billingAddressData.billingCity) && o.LJ(this.billingCountryRegionDisplay, billingAddressData.billingCountryRegionDisplay) && o.LJ(this.billingCountryRegionCode, billingAddressData.billingCountryRegionCode) && o.LJ(this.billingPostalCode, billingAddressData.billingPostalCode) && o.LJ(this.billingState, billingAddressData.billingState) && o.LJ(this.selectedRegion, billingAddressData.selectedRegion);
    }

    public int hashCode() {
        String str = this.billingAddressLine;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billingCity;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingCountryRegionDisplay;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingCountryRegionCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billingPostalCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billingState;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Region> list = this.selectedRegion;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillingAddressData(billingAddressLine=");
        LIZ.append(this.billingAddressLine);
        LIZ.append(", billingCity=");
        LIZ.append(this.billingCity);
        LIZ.append(", billingCountryRegionDisplay=");
        LIZ.append(this.billingCountryRegionDisplay);
        LIZ.append(", billingCountryRegionCode=");
        LIZ.append(this.billingCountryRegionCode);
        LIZ.append(", billingPostalCode=");
        LIZ.append(this.billingPostalCode);
        LIZ.append(", billingState=");
        LIZ.append(this.billingState);
        LIZ.append(", selectedRegion=");
        return C1NE.LIZIZ(LIZ, this.selectedRegion, ')', LIZ);
    }

    public final String getBillingAddressLine() {
        return this.billingAddressLine;
    }

    public final String getBillingCity() {
        return this.billingCity;
    }

    public final String getBillingCountryRegionCode() {
        return this.billingCountryRegionCode;
    }

    public final String getBillingCountryRegionDisplay() {
        return this.billingCountryRegionDisplay;
    }

    public final String getBillingPostalCode() {
        return this.billingPostalCode;
    }

    public final String getBillingState() {
        return this.billingState;
    }

    public final List<Region> getSelectedRegion() {
        return this.selectedRegion;
    }

    public BillingAddressData(String str, String str2, String str3, String str4, String str5, String str6, List<Region> list) {
        this.billingAddressLine = str;
        this.billingCity = str2;
        this.billingCountryRegionDisplay = str3;
        this.billingCountryRegionCode = str4;
        this.billingPostalCode = str5;
        this.billingState = str6;
        this.selectedRegion = list;
    }

    public /* synthetic */ BillingAddressData(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? list : null);
    }
}
