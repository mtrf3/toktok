package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PmsParams {

    @InterfaceC65349Pkn("amount_value")
    public String amountValue;

    @InterfaceC65349Pkn("country_code")
    public String countryCode;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("sdk_type")
    public String sdkType;

    @InterfaceC65349Pkn("sdk_version")
    public String sdkVersion;

    @InterfaceC65349Pkn("transaction_time")
    public String transactionTime;

    /* JADX WARN: Multi-variable type inference failed */
    public PmsParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PmsParams copy$default(PmsParams pmsParams, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pmsParams.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = pmsParams.currency;
        }
        if ((i & 4) != 0) {
            str3 = pmsParams.amountValue;
        }
        if ((i & 8) != 0) {
            str4 = pmsParams.sdkType;
        }
        if ((i & 16) != 0) {
            str5 = pmsParams.sdkVersion;
        }
        if ((i & 32) != 0) {
            str6 = pmsParams.transactionTime;
        }
        return pmsParams.copy(str, str2, str3, str4, str5, str6);
    }

    public final PmsParams copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new PmsParams(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PmsParams)) {
            return false;
        }
        PmsParams pmsParams = (PmsParams) obj;
        return o.LJ(this.countryCode, pmsParams.countryCode) && o.LJ(this.currency, pmsParams.currency) && o.LJ(this.amountValue, pmsParams.amountValue) && o.LJ(this.sdkType, pmsParams.sdkType) && o.LJ(this.sdkVersion, pmsParams.sdkVersion) && o.LJ(this.transactionTime, pmsParams.transactionTime);
    }

    public int hashCode() {
        String str = this.countryCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amountValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sdkType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sdkVersion;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transactionTime;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PmsParams(countryCode=");
        LIZ.append((Object) this.countryCode);
        LIZ.append(", currency=");
        LIZ.append((Object) this.currency);
        LIZ.append(", amountValue=");
        LIZ.append((Object) this.amountValue);
        LIZ.append(", sdkType=");
        LIZ.append((Object) this.sdkType);
        LIZ.append(", sdkVersion=");
        LIZ.append((Object) this.sdkVersion);
        LIZ.append(", transactionTime=");
        LIZ.append((Object) this.transactionTime);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAmountValue() {
        return this.amountValue;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getTransactionTime() {
        return this.transactionTime;
    }

    public final void setAmountValue(String str) {
        this.amountValue = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setSdkType(String str) {
        this.sdkType = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public final void setTransactionTime(String str) {
        this.transactionTime = str;
    }

    public PmsParams(String str, String str2, String str3, String str4, String str5, String str6) {
        this.countryCode = str;
        this.currency = str2;
        this.amountValue = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.transactionTime = str6;
    }

    public /* synthetic */ PmsParams(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
