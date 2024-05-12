package com.bytedance.pipo.checkout.api.network.model.request;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes20.dex */
public final class CashierBasicInfo {

    @InterfaceC65349Pkn("config_mode_code")
    public List<String> configModelCode;

    @InterfaceC65349Pkn("configuration")
    public Configuration configuration;

    @InterfaceC65349Pkn("country_or_region")
    public String countryOrRegion;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public String nonce;

    @InterfaceC65349Pkn("pms_params")
    public PmsParams pmsParams;

    @InterfaceC65349Pkn("product_code")
    public String productCode;

    public CashierBasicInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final List<String> getConfigModelCode() {
        return this.configModelCode;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final String getCountryOrRegion() {
        return this.countryOrRegion;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final PmsParams getPmsParams() {
        return this.pmsParams;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final void setConfigModelCode(List<String> list) {
        this.configModelCode = list;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setCountryOrRegion(String str) {
        this.countryOrRegion = str;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setPmsParams(PmsParams pmsParams) {
        this.pmsParams = pmsParams;
    }

    public final void setProductCode(String str) {
        this.productCode = str;
    }

    public CashierBasicInfo(String str, Configuration configuration, String str2, List<String> list, String str3, PmsParams pmsParams, String str4) {
        this.merchantUserId = str;
        this.configuration = configuration;
        this.nonce = str2;
        this.configModelCode = list;
        this.countryOrRegion = str3;
        this.pmsParams = pmsParams;
        this.productCode = str4;
    }

    public CashierBasicInfo(String str, Configuration configuration, String str2, List list, String str3, PmsParams pmsParams, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new Configuration(null, null, null, null, null, null, 63, null) : configuration, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? C61878OQg.INSTANCE : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? new PmsParams(null, null, null, null, null, null, 63, null) : pmsParams, (i & 64) == 0 ? str4 : null);
    }
}
