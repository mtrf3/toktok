package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentMethodInfo {

    @InterfaceC65349Pkn("agreement_tag")
    public String agreementTag;

    @InterfaceC65349Pkn("card_type")
    public String cardType;

    @InterfaceC65349Pkn("configuration")
    public String configuration;

    @InterfaceC65349Pkn("dark_mode_icon_url")
    public String darkModeIconUrl;

    @InterfaceC65349Pkn("display_name")
    public String displayName;

    @InterfaceC65349Pkn("elements")
    public List<Elements> elements;

    @InterfaceC65349Pkn("extra_msg")
    public String extraMsg;

    @InterfaceC65349Pkn("fee_under_taker")
    public String feeUnderTaker;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("integration_method")
    public String integrationMethod;

    @InterfaceC65349Pkn("mandate_elements")
    public List<MandateElement> mandateElements;

    @InterfaceC65349Pkn("marketing_events")
    public MarketingEvents marketingEvents;

    @InterfaceC65349Pkn("max_limited_amount")
    public String maxLimitedAmount;

    @InterfaceC65349Pkn("min_limited_amount")
    public String minLimitedAmount;

    @InterfaceC65349Pkn("model")
    public String model;

    @InterfaceC65349Pkn("package_name")
    public String packageName;

    @InterfaceC65349Pkn("payment_fee_amount")
    public String paymentFeeAmount;

    @InterfaceC65349Pkn("payment_method")
    public String paymentMethod;

    @InterfaceC65349Pkn("payment_method_extra")
    public String paymentMethodExtra;

    @InterfaceC65349Pkn("payment_method_id")
    public String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_type")
    public String paymentMethodType;

    @InterfaceC65349Pkn("pci_sensitive")
    public Boolean pciSensitive;

    @InterfaceC65349Pkn("quote_fee_amount")
    public String quoteFeeAmount;

    @InterfaceC65349Pkn("redirect_method")
    public String redirectMethod;

    @InterfaceC65349Pkn("saveable")
    public Boolean saveable;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    @InterfaceC65349Pkn("unavailable_code")
    public String unavailableCode;

    @InterfaceC65349Pkn("unavailable_msg")
    public String unavailableMsg;

    @InterfaceC65349Pkn("user_type")
    public String userType;

    public PaymentMethodInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public static /* synthetic */ PaymentMethodInfo copy$default(PaymentMethodInfo paymentMethodInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List list2, MarketingEvents marketingEvents, int i, Object obj) {
        Boolean bool3 = bool;
        String str26 = str11;
        String str27 = str10;
        String str28 = str9;
        Boolean bool4 = bool2;
        String str29 = str8;
        List list3 = list;
        String str30 = str7;
        String str31 = str2;
        String str32 = str;
        String str33 = str3;
        String str34 = str4;
        String str35 = str5;
        String str36 = str6;
        String str37 = str17;
        String str38 = str16;
        String str39 = str15;
        String str40 = str14;
        String str41 = str12;
        MarketingEvents marketingEvents2 = marketingEvents;
        String str42 = str13;
        String str43 = str18;
        String str44 = str19;
        String str45 = str20;
        String str46 = str21;
        List list4 = list2;
        String str47 = str22;
        String str48 = str23;
        String str49 = str24;
        String str50 = str25;
        if ((i & 1) != 0) {
            str32 = paymentMethodInfo.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str31 = paymentMethodInfo.paymentMethod;
        }
        if ((i & 4) != 0) {
            str33 = paymentMethodInfo.iconUrl;
        }
        if ((i & 8) != 0) {
            str34 = paymentMethodInfo.darkModeIconUrl;
        }
        if ((i & 16) != 0) {
            str35 = paymentMethodInfo.paymentMethodType;
        }
        if ((i & 32) != 0) {
            str36 = paymentMethodInfo.displayName;
        }
        if ((i & 64) != 0) {
            str30 = paymentMethodInfo.starlingKey;
        }
        if ((i & 128) != 0) {
            list3 = paymentMethodInfo.elements;
        }
        if ((i & 256) != 0) {
            str29 = paymentMethodInfo.maxLimitedAmount;
        }
        if ((i & 512) != 0) {
            str28 = paymentMethodInfo.minLimitedAmount;
        }
        if ((i & 1024) != 0) {
            str27 = paymentMethodInfo.packageName;
        }
        if ((i & 2048) != 0) {
            str26 = paymentMethodInfo.schema;
        }
        if ((i & 4096) != 0) {
            bool3 = paymentMethodInfo.pciSensitive;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            bool4 = paymentMethodInfo.saveable;
        }
        if ((i & 16384) != 0) {
            str41 = paymentMethodInfo.paymentMethodExtra;
        }
        if ((32768 & i) != 0) {
            str42 = paymentMethodInfo.configuration;
        }
        if ((65536 & i) != 0) {
            str40 = paymentMethodInfo.extraMsg;
        }
        if ((131072 & i) != 0) {
            str39 = paymentMethodInfo.integrationMethod;
        }
        if ((262144 & i) != 0) {
            str38 = paymentMethodInfo.redirectMethod;
        }
        if ((524288 & i) != 0) {
            str37 = paymentMethodInfo.userType;
        }
        if ((1048576 & i) != 0) {
            str43 = paymentMethodInfo.unavailableCode;
        }
        if ((2097152 & i) != 0) {
            str44 = paymentMethodInfo.unavailableMsg;
        }
        if ((4194304 & i) != 0) {
            str45 = paymentMethodInfo.model;
        }
        if ((8388608 & i) != 0) {
            str46 = paymentMethodInfo.agreementTag;
        }
        if ((16777216 & i) != 0) {
            str47 = paymentMethodInfo.cardType;
        }
        if ((33554432 & i) != 0) {
            str48 = paymentMethodInfo.paymentFeeAmount;
        }
        if ((67108864 & i) != 0) {
            str49 = paymentMethodInfo.quoteFeeAmount;
        }
        if ((134217728 & i) != 0) {
            str50 = paymentMethodInfo.feeUnderTaker;
        }
        if ((268435456 & i) != 0) {
            list4 = paymentMethodInfo.mandateElements;
        }
        if ((i & 536870912) != 0) {
            marketingEvents2 = paymentMethodInfo.marketingEvents;
        }
        return paymentMethodInfo.copy(str32, str31, str33, str34, str35, str36, str30, list3, str29, str28, str27, str26, bool3, bool4, str41, str42, str40, str39, str38, str37, str43, str44, str45, str46, str47, str48, str49, str50, list4, marketingEvents2);
    }

    public final PaymentMethodInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Elements> list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List<MandateElement> list2, MarketingEvents marketingEvents) {
        return new PaymentMethodInfo(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11, bool, bool2, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, list2, marketingEvents);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodInfo)) {
            return false;
        }
        PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) obj;
        return o.LJ(this.paymentMethodId, paymentMethodInfo.paymentMethodId) && o.LJ(this.paymentMethod, paymentMethodInfo.paymentMethod) && o.LJ(this.iconUrl, paymentMethodInfo.iconUrl) && o.LJ(this.darkModeIconUrl, paymentMethodInfo.darkModeIconUrl) && o.LJ(this.paymentMethodType, paymentMethodInfo.paymentMethodType) && o.LJ(this.displayName, paymentMethodInfo.displayName) && o.LJ(this.starlingKey, paymentMethodInfo.starlingKey) && o.LJ(this.elements, paymentMethodInfo.elements) && o.LJ(this.maxLimitedAmount, paymentMethodInfo.maxLimitedAmount) && o.LJ(this.minLimitedAmount, paymentMethodInfo.minLimitedAmount) && o.LJ(this.packageName, paymentMethodInfo.packageName) && o.LJ(this.schema, paymentMethodInfo.schema) && o.LJ(this.pciSensitive, paymentMethodInfo.pciSensitive) && o.LJ(this.saveable, paymentMethodInfo.saveable) && o.LJ(this.paymentMethodExtra, paymentMethodInfo.paymentMethodExtra) && o.LJ(this.configuration, paymentMethodInfo.configuration) && o.LJ(this.extraMsg, paymentMethodInfo.extraMsg) && o.LJ(this.integrationMethod, paymentMethodInfo.integrationMethod) && o.LJ(this.redirectMethod, paymentMethodInfo.redirectMethod) && o.LJ(this.userType, paymentMethodInfo.userType) && o.LJ(this.unavailableCode, paymentMethodInfo.unavailableCode) && o.LJ(this.unavailableMsg, paymentMethodInfo.unavailableMsg) && o.LJ(this.model, paymentMethodInfo.model) && o.LJ(this.agreementTag, paymentMethodInfo.agreementTag) && o.LJ(this.cardType, paymentMethodInfo.cardType) && o.LJ(this.paymentFeeAmount, paymentMethodInfo.paymentFeeAmount) && o.LJ(this.quoteFeeAmount, paymentMethodInfo.quoteFeeAmount) && o.LJ(this.feeUnderTaker, paymentMethodInfo.feeUnderTaker) && o.LJ(this.mandateElements, paymentMethodInfo.mandateElements) && o.LJ(this.marketingEvents, paymentMethodInfo.marketingEvents);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethod;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkModeIconUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethodType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.starlingKey;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<Elements> list = this.elements;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.maxLimitedAmount;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.minLimitedAmount;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.packageName;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.schema;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.pciSensitive;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.saveable;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str12 = this.paymentMethodExtra;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.configuration;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.extraMsg;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.integrationMethod;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.redirectMethod;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.userType;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.unavailableCode;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.unavailableMsg;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.model;
        int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.agreementTag;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.cardType;
        int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.paymentFeeAmount;
        int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.quoteFeeAmount;
        int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.feeUnderTaker;
        int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        List<MandateElement> list2 = this.mandateElements;
        int hashCode29 = (hashCode28 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketingEvents marketingEvents = this.marketingEvents;
        return hashCode29 + (marketingEvents != null ? marketingEvents.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodInfo(paymentMethodId=" + ((Object) this.paymentMethodId) + ", paymentMethod=" + ((Object) this.paymentMethod) + ", iconUrl=" + ((Object) this.iconUrl) + ", darkModeIconUrl=" + ((Object) this.darkModeIconUrl) + ", paymentMethodType=" + ((Object) this.paymentMethodType) + ", displayName=" + ((Object) this.displayName) + ", starlingKey=" + ((Object) this.starlingKey) + ", elements=" + this.elements + ", maxLimitedAmount=" + ((Object) this.maxLimitedAmount) + ", minLimitedAmount=" + ((Object) this.minLimitedAmount) + ", packageName=" + ((Object) this.packageName) + ", schema=" + ((Object) this.schema) + ", pciSensitive=" + this.pciSensitive + ", saveable=" + this.saveable + ", paymentMethodExtra=" + ((Object) this.paymentMethodExtra) + ", configuration=" + ((Object) this.configuration) + ", extraMsg=" + ((Object) this.extraMsg) + ", integrationMethod=" + ((Object) this.integrationMethod) + ", redirectMethod=" + ((Object) this.redirectMethod) + ", userType=" + ((Object) this.userType) + ", unavailableCode=" + ((Object) this.unavailableCode) + ", unavailableMsg=" + ((Object) this.unavailableMsg) + ", model=" + ((Object) this.model) + ", agreementTag=" + ((Object) this.agreementTag) + ", cardType=" + ((Object) this.cardType) + ", paymentFeeAmount=" + ((Object) this.paymentFeeAmount) + ", quoteFeeAmount=" + ((Object) this.quoteFeeAmount) + ", feeUnderTaker=" + ((Object) this.feeUnderTaker) + ", mandateElements=" + this.mandateElements + ", marketingEvents=" + this.marketingEvents + ')';
    }

    public final String getAgreementTag() {
        return this.agreementTag;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getConfiguration() {
        return this.configuration;
    }

    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<Elements> getElements() {
        return this.elements;
    }

    public final String getExtraMsg() {
        return this.extraMsg;
    }

    public final String getFeeUnderTaker() {
        return this.feeUnderTaker;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIntegrationMethod() {
        return this.integrationMethod;
    }

    public final List<MandateElement> getMandateElements() {
        return this.mandateElements;
    }

    public final MarketingEvents getMarketingEvents() {
        return this.marketingEvents;
    }

    public final String getMaxLimitedAmount() {
        return this.maxLimitedAmount;
    }

    public final String getMinLimitedAmount() {
        return this.minLimitedAmount;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPaymentFeeAmount() {
        return this.paymentFeeAmount;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodExtra() {
        return this.paymentMethodExtra;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final Boolean getPciSensitive() {
        return this.pciSensitive;
    }

    public final String getQuoteFeeAmount() {
        return this.quoteFeeAmount;
    }

    public final String getRedirectMethod() {
        return this.redirectMethod;
    }

    public final Boolean getSaveable() {
        return this.saveable;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final String getUnavailableCode() {
        return this.unavailableCode;
    }

    public final String getUnavailableMsg() {
        return this.unavailableMsg;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final void setAgreementTag(String str) {
        this.agreementTag = str;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setConfiguration(String str) {
        this.configuration = str;
    }

    public final void setDarkModeIconUrl(String str) {
        this.darkModeIconUrl = str;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setElements(List<Elements> list) {
        this.elements = list;
    }

    public final void setExtraMsg(String str) {
        this.extraMsg = str;
    }

    public final void setFeeUnderTaker(String str) {
        this.feeUnderTaker = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setIntegrationMethod(String str) {
        this.integrationMethod = str;
    }

    public final void setMandateElements(List<MandateElement> list) {
        this.mandateElements = list;
    }

    public final void setMarketingEvents(MarketingEvents marketingEvents) {
        this.marketingEvents = marketingEvents;
    }

    public final void setMaxLimitedAmount(String str) {
        this.maxLimitedAmount = str;
    }

    public final void setMinLimitedAmount(String str) {
        this.minLimitedAmount = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setPaymentFeeAmount(String str) {
        this.paymentFeeAmount = str;
    }

    public final void setPaymentMethod(String str) {
        this.paymentMethod = str;
    }

    public final void setPaymentMethodExtra(String str) {
        this.paymentMethodExtra = str;
    }

    public final void setPaymentMethodId(String str) {
        this.paymentMethodId = str;
    }

    public final void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setPciSensitive(Boolean bool) {
        this.pciSensitive = bool;
    }

    public final void setQuoteFeeAmount(String str) {
        this.quoteFeeAmount = str;
    }

    public final void setRedirectMethod(String str) {
        this.redirectMethod = str;
    }

    public final void setSaveable(Boolean bool) {
        this.saveable = bool;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public final void setUnavailableCode(String str) {
        this.unavailableCode = str;
    }

    public final void setUnavailableMsg(String str) {
        this.unavailableMsg = str;
    }

    public final void setUserType(String str) {
        this.userType = str;
    }

    public PaymentMethodInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Elements> list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List<MandateElement> list2, MarketingEvents marketingEvents) {
        this.paymentMethodId = str;
        this.paymentMethod = str2;
        this.iconUrl = str3;
        this.darkModeIconUrl = str4;
        this.paymentMethodType = str5;
        this.displayName = str6;
        this.starlingKey = str7;
        this.elements = list;
        this.maxLimitedAmount = str8;
        this.minLimitedAmount = str9;
        this.packageName = str10;
        this.schema = str11;
        this.pciSensitive = bool;
        this.saveable = bool2;
        this.paymentMethodExtra = str12;
        this.configuration = str13;
        this.extraMsg = str14;
        this.integrationMethod = str15;
        this.redirectMethod = str16;
        this.userType = str17;
        this.unavailableCode = str18;
        this.unavailableMsg = str19;
        this.model = str20;
        this.agreementTag = str21;
        this.cardType = str22;
        this.paymentFeeAmount = str23;
        this.quoteFeeAmount = str24;
        this.feeUnderTaker = str25;
        this.mandateElements = list2;
        this.marketingEvents = marketingEvents;
    }

    public PaymentMethodInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List list2, MarketingEvents marketingEvents, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? C61878OQg.INSTANCE : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : bool, (i & FileUtils.BUFFER_SIZE) != 0 ? null : bool2, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : str13, (65536 & i) != 0 ? null : str14, (131072 & i) != 0 ? null : str15, (262144 & i) != 0 ? null : str16, (524288 & i) != 0 ? null : str17, (1048576 & i) != 0 ? null : str18, (2097152 & i) != 0 ? null : str19, (4194304 & i) != 0 ? null : str20, (8388608 & i) != 0 ? null : str21, (16777216 & i) != 0 ? null : str22, (33554432 & i) != 0 ? null : str23, (67108864 & i) != 0 ? null : str24, (134217728 & i) != 0 ? null : str25, (268435456 & i) != 0 ? C61878OQg.INSTANCE : list2, (i & 536870912) != 0 ? null : marketingEvents);
    }
}
