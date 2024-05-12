package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIBasicInfo {

    @InterfaceC65349Pkn("configuration")
    public Configuration configuration;

    @InterfaceC65349Pkn("country_or_region")
    public String countryOrRegion;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public String nonce;

    @InterfaceC65349Pkn("product_code")
    public String productCode;

    @InterfaceC65349Pkn("sdk_type")
    public String sdkType;

    @InterfaceC65349Pkn("sdk_vesion")
    public String sdkVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public PIBasicInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PIBasicInfo copy$default(PIBasicInfo pIBasicInfo, String str, String str2, String str3, String str4, String str5, String str6, Configuration configuration, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pIBasicInfo.countryOrRegion;
        }
        if ((i & 2) != 0) {
            str2 = pIBasicInfo.currency;
        }
        if ((i & 4) != 0) {
            str3 = pIBasicInfo.sdkType;
        }
        if ((i & 8) != 0) {
            str4 = pIBasicInfo.sdkVersion;
        }
        if ((i & 16) != 0) {
            str5 = pIBasicInfo.merchantUserId;
        }
        if ((i & 32) != 0) {
            str6 = pIBasicInfo.nonce;
        }
        if ((i & 64) != 0) {
            configuration = pIBasicInfo.configuration;
        }
        if ((i & 128) != 0) {
            str7 = pIBasicInfo.productCode;
        }
        return pIBasicInfo.copy(str, str2, str3, str4, str5, str6, configuration, str7);
    }

    public final PIBasicInfo copy(String str, String str2, String str3, String str4, String str5, String str6, Configuration configuration, String str7) {
        return new PIBasicInfo(str, str2, str3, str4, str5, str6, configuration, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIBasicInfo)) {
            return false;
        }
        PIBasicInfo pIBasicInfo = (PIBasicInfo) obj;
        return o.LJ(this.countryOrRegion, pIBasicInfo.countryOrRegion) && o.LJ(this.currency, pIBasicInfo.currency) && o.LJ(this.sdkType, pIBasicInfo.sdkType) && o.LJ(this.sdkVersion, pIBasicInfo.sdkVersion) && o.LJ(this.merchantUserId, pIBasicInfo.merchantUserId) && o.LJ(this.nonce, pIBasicInfo.nonce) && o.LJ(this.configuration, pIBasicInfo.configuration) && o.LJ(this.productCode, pIBasicInfo.productCode);
    }

    public int hashCode() {
        String str = this.countryOrRegion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sdkVersion;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.merchantUserId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nonce;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int hashCode7 = (hashCode6 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        String str7 = this.productCode;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PIBasicInfo(countryOrRegion=");
        LIZ.append((Object) this.countryOrRegion);
        LIZ.append(", currency=");
        LIZ.append((Object) this.currency);
        LIZ.append(", sdkType=");
        LIZ.append((Object) this.sdkType);
        LIZ.append(", sdkVersion=");
        LIZ.append((Object) this.sdkVersion);
        LIZ.append(", merchantUserId=");
        LIZ.append((Object) this.merchantUserId);
        LIZ.append(", nonce=");
        LIZ.append((Object) this.nonce);
        LIZ.append(", configuration=");
        LIZ.append(this.configuration);
        LIZ.append(", productCode=");
        LIZ.append((Object) this.productCode);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final String getCountryOrRegion() {
        return this.countryOrRegion;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setCountryOrRegion(String str) {
        this.countryOrRegion = str;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setProductCode(String str) {
        this.productCode = str;
    }

    public final void setSdkType(String str) {
        this.sdkType = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public PIBasicInfo(String str, String str2, String str3, String str4, String str5, String str6, Configuration configuration, String str7) {
        this.countryOrRegion = str;
        this.currency = str2;
        this.sdkType = str3;
        this.sdkVersion = str4;
        this.merchantUserId = str5;
        this.nonce = str6;
        this.configuration = configuration;
        this.productCode = str7;
    }

    public /* synthetic */ PIBasicInfo(String str, String str2, String str3, String str4, String str5, String str6, Configuration configuration, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : configuration, (i & 128) == 0 ? str7 : null);
    }
}
