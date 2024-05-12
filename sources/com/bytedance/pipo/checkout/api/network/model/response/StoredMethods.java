package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StoredMethods {

    @InterfaceC65349Pkn("bind_time")
    public String bindTime;

    @InterfaceC65349Pkn("card_brand")
    public String cardBrand;

    @InterfaceC65349Pkn("card_organization")
    public String cardOrganization;

    @InterfaceC65349Pkn("card_type")
    public String cardType;

    @InterfaceC65349Pkn("channel_pi_info")
    public ChannelPIInfo channelPiInfo;

    @InterfaceC65349Pkn("dark_mode_icon_url")
    public String darkModeIconUrl;

    @InterfaceC65349Pkn("display_name")
    public String displayName;

    @InterfaceC65349Pkn("expiration_month")
    public String expirationMonth;

    @InterfaceC65349Pkn("expiration_year")
    public String expirationYear;

    @InterfaceC65349Pkn("expiry_date")
    public Integer expiryDate;

    @InterfaceC65349Pkn("fee_under_taker")
    public String feeUnderTaker;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("is_default")
    public Boolean isDefault;

    @InterfaceC65349Pkn("is_expired")
    public Boolean isExpired;

    @InterfaceC65349Pkn("is_primary")
    public Boolean isPrimary;

    @InterfaceC65349Pkn("is_recent_used")
    public Boolean isRecentUsed;

    @InterfaceC65349Pkn("is_valid")
    public Boolean isValid;

    @InterfaceC65349Pkn("issuing_country_or_region")
    public String issuingCountryOrRegion;

    @InterfaceC65349Pkn("last_four")
    public String lastFour;

    @InterfaceC65349Pkn("masked_identity")
    public String maskedIdentity;

    @InterfaceC65349Pkn("method_type")
    public String methodType;

    @InterfaceC65349Pkn("need_cvv")
    public Boolean needCvv;

    @InterfaceC65349Pkn("needed_elements")
    public List<Elements> neededElements;

    @InterfaceC65349Pkn("payment_fee_amount")
    public String paymentFeeAmount;

    @InterfaceC65349Pkn("payment_method")
    public String paymentMethod;

    @InterfaceC65349Pkn("payment_method_id")
    public String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_starling")
    public String paymentMethodStarling;

    @InterfaceC65349Pkn("payment_method_token")
    public String paymentMethodToken;

    @InterfaceC65349Pkn("payment_method_type")
    public String paymentMethodType;

    @InterfaceC65349Pkn("pci_sensitive")
    public Boolean pciSensitive;

    @InterfaceC65349Pkn("quote_fee_amount")
    public String quoteFeeAmount;

    @InterfaceC65349Pkn("recent_used_time")
    public String recentUsedTime;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("unavailable_code")
    public String unavailableCode;

    @InterfaceC65349Pkn("unavailable_msg")
    public String unavailableMsg;

    public StoredMethods() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    public static /* synthetic */ StoredMethods copy$default(StoredMethods storedMethods, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, String str7, Boolean bool3, Boolean bool4, String str8, String str9, String str10, String str11, String str12, String str13, ChannelPIInfo channelPIInfo, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool5, Boolean bool6, List list, String str21, String str22, String str23, Boolean bool7, String str24, String str25, int i, int i2, Object obj) {
        String str26 = str10;
        String str27 = str9;
        String str28 = str8;
        Boolean bool8 = bool4;
        Boolean bool9 = bool3;
        String str29 = str7;
        String str30 = str6;
        String str31 = str5;
        String str32 = str2;
        String str33 = str;
        Boolean bool10 = bool;
        Boolean bool11 = bool2;
        String str34 = str3;
        String str35 = str4;
        Boolean bool12 = bool7;
        String str36 = str23;
        String str37 = str14;
        Integer num2 = num;
        ChannelPIInfo channelPIInfo2 = channelPIInfo;
        String str38 = str13;
        String str39 = str11;
        String str40 = str12;
        String str41 = str15;
        String str42 = str16;
        String str43 = str17;
        String str44 = str24;
        String str45 = str22;
        String str46 = str18;
        String str47 = str25;
        String str48 = str19;
        String str49 = str20;
        Boolean bool13 = bool5;
        Boolean bool14 = bool6;
        List list2 = list;
        String str50 = str21;
        if ((i & 1) != 0) {
            str33 = storedMethods.type;
        }
        if ((i & 2) != 0) {
            str32 = storedMethods.paymentMethodToken;
        }
        if ((i & 4) != 0) {
            bool10 = storedMethods.isExpired;
        }
        if ((i & 8) != 0) {
            bool11 = storedMethods.isValid;
        }
        if ((i & 16) != 0) {
            str34 = storedMethods.paymentMethodId;
        }
        if ((i & 32) != 0) {
            str35 = storedMethods.methodType;
        }
        if ((i & 64) != 0) {
            str31 = storedMethods.paymentMethod;
        }
        if ((i & 128) != 0) {
            str30 = storedMethods.paymentMethodStarling;
        }
        if ((i & 256) != 0) {
            str29 = storedMethods.maskedIdentity;
        }
        if ((i & 512) != 0) {
            bool9 = storedMethods.isPrimary;
        }
        if ((i & 1024) != 0) {
            bool8 = storedMethods.isRecentUsed;
        }
        if ((i & 2048) != 0) {
            str28 = storedMethods.displayName;
        }
        if ((i & 4096) != 0) {
            str27 = storedMethods.iconUrl;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str26 = storedMethods.paymentMethodType;
        }
        if ((i & 16384) != 0) {
            str39 = storedMethods.darkModeIconUrl;
        }
        if ((32768 & i) != 0) {
            str40 = storedMethods.bindTime;
        }
        if ((65536 & i) != 0) {
            str38 = storedMethods.recentUsedTime;
        }
        if ((131072 & i) != 0) {
            channelPIInfo2 = storedMethods.channelPiInfo;
        }
        if ((262144 & i) != 0) {
            num2 = storedMethods.expiryDate;
        }
        if ((524288 & i) != 0) {
            str37 = storedMethods.cardType;
        }
        if ((1048576 & i) != 0) {
            str41 = storedMethods.lastFour;
        }
        if ((2097152 & i) != 0) {
            str42 = storedMethods.issuingCountryOrRegion;
        }
        if ((4194304 & i) != 0) {
            str43 = storedMethods.cardOrganization;
        }
        if ((8388608 & i) != 0) {
            str46 = storedMethods.expirationMonth;
        }
        if ((16777216 & i) != 0) {
            str48 = storedMethods.expirationYear;
        }
        if ((33554432 & i) != 0) {
            str49 = storedMethods.cardBrand;
        }
        if ((67108864 & i) != 0) {
            bool13 = storedMethods.needCvv;
        }
        if ((134217728 & i) != 0) {
            bool14 = storedMethods.pciSensitive;
        }
        if ((268435456 & i) != 0) {
            list2 = storedMethods.neededElements;
        }
        if ((536870912 & i) != 0) {
            str50 = storedMethods.paymentFeeAmount;
        }
        if ((1073741824 & i) != 0) {
            str45 = storedMethods.quoteFeeAmount;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            str36 = storedMethods.feeUnderTaker;
        }
        if ((i2 & 1) != 0) {
            bool12 = storedMethods.isDefault;
        }
        if ((i2 & 2) != 0) {
            str44 = storedMethods.unavailableCode;
        }
        if ((i2 & 4) != 0) {
            str47 = storedMethods.unavailableMsg;
        }
        return storedMethods.copy(str33, str32, bool10, bool11, str34, str35, str31, str30, str29, bool9, bool8, str28, str27, str26, str39, str40, str38, channelPIInfo2, num2, str37, str41, str42, str43, str46, str48, str49, bool13, bool14, list2, str50, str45, str36, bool12, str44, str47);
    }

    public final StoredMethods copy(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, String str7, Boolean bool3, Boolean bool4, String str8, String str9, String str10, String str11, String str12, String str13, ChannelPIInfo channelPIInfo, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool5, Boolean bool6, List<Elements> list, String str21, String str22, String str23, Boolean bool7, String str24, String str25) {
        return new StoredMethods(str, str2, bool, bool2, str3, str4, str5, str6, str7, bool3, bool4, str8, str9, str10, str11, str12, str13, channelPIInfo, num, str14, str15, str16, str17, str18, str19, str20, bool5, bool6, list, str21, str22, str23, bool7, str24, str25);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredMethods)) {
            return false;
        }
        StoredMethods storedMethods = (StoredMethods) obj;
        return o.LJ(this.type, storedMethods.type) && o.LJ(this.paymentMethodToken, storedMethods.paymentMethodToken) && o.LJ(this.isExpired, storedMethods.isExpired) && o.LJ(this.isValid, storedMethods.isValid) && o.LJ(this.paymentMethodId, storedMethods.paymentMethodId) && o.LJ(this.methodType, storedMethods.methodType) && o.LJ(this.paymentMethod, storedMethods.paymentMethod) && o.LJ(this.paymentMethodStarling, storedMethods.paymentMethodStarling) && o.LJ(this.maskedIdentity, storedMethods.maskedIdentity) && o.LJ(this.isPrimary, storedMethods.isPrimary) && o.LJ(this.isRecentUsed, storedMethods.isRecentUsed) && o.LJ(this.displayName, storedMethods.displayName) && o.LJ(this.iconUrl, storedMethods.iconUrl) && o.LJ(this.paymentMethodType, storedMethods.paymentMethodType) && o.LJ(this.darkModeIconUrl, storedMethods.darkModeIconUrl) && o.LJ(this.bindTime, storedMethods.bindTime) && o.LJ(this.recentUsedTime, storedMethods.recentUsedTime) && o.LJ(this.channelPiInfo, storedMethods.channelPiInfo) && o.LJ(this.expiryDate, storedMethods.expiryDate) && o.LJ(this.cardType, storedMethods.cardType) && o.LJ(this.lastFour, storedMethods.lastFour) && o.LJ(this.issuingCountryOrRegion, storedMethods.issuingCountryOrRegion) && o.LJ(this.cardOrganization, storedMethods.cardOrganization) && o.LJ(this.expirationMonth, storedMethods.expirationMonth) && o.LJ(this.expirationYear, storedMethods.expirationYear) && o.LJ(this.cardBrand, storedMethods.cardBrand) && o.LJ(this.needCvv, storedMethods.needCvv) && o.LJ(this.pciSensitive, storedMethods.pciSensitive) && o.LJ(this.neededElements, storedMethods.neededElements) && o.LJ(this.paymentFeeAmount, storedMethods.paymentFeeAmount) && o.LJ(this.quoteFeeAmount, storedMethods.quoteFeeAmount) && o.LJ(this.feeUnderTaker, storedMethods.feeUnderTaker) && o.LJ(this.isDefault, storedMethods.isDefault) && o.LJ(this.unavailableCode, storedMethods.unavailableCode) && o.LJ(this.unavailableMsg, storedMethods.unavailableMsg);
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isExpired;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isValid;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.paymentMethodId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.methodType;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethod;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentMethodStarling;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.maskedIdentity;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.isPrimary;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isRecentUsed;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str8 = this.displayName;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.iconUrl;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentMethodType;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.darkModeIconUrl;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bindTime;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.recentUsedTime;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        ChannelPIInfo channelPIInfo = this.channelPiInfo;
        int hashCode18 = (hashCode17 + (channelPIInfo == null ? 0 : channelPIInfo.hashCode())) * 31;
        Integer num = this.expiryDate;
        int hashCode19 = (hashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.cardType;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastFour;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.issuingCountryOrRegion;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cardOrganization;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.expirationMonth;
        int hashCode24 = (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.expirationYear;
        int hashCode25 = (hashCode24 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.cardBrand;
        int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool5 = this.needCvv;
        int hashCode27 = (hashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.pciSensitive;
        int hashCode28 = (hashCode27 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List<Elements> list = this.neededElements;
        int hashCode29 = (hashCode28 + (list == null ? 0 : list.hashCode())) * 31;
        String str21 = this.paymentFeeAmount;
        int hashCode30 = (hashCode29 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.quoteFeeAmount;
        int hashCode31 = (hashCode30 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.feeUnderTaker;
        int hashCode32 = (hashCode31 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool7 = this.isDefault;
        int hashCode33 = (hashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str24 = this.unavailableCode;
        int hashCode34 = (hashCode33 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.unavailableMsg;
        return hashCode34 + (str25 != null ? str25.hashCode() : 0);
    }

    public String toString() {
        return "StoredMethods(type=" + ((Object) this.type) + ", paymentMethodToken=" + ((Object) this.paymentMethodToken) + ", isExpired=" + this.isExpired + ", isValid=" + this.isValid + ", paymentMethodId=" + ((Object) this.paymentMethodId) + ", methodType=" + ((Object) this.methodType) + ", paymentMethod=" + ((Object) this.paymentMethod) + ", paymentMethodStarling=" + ((Object) this.paymentMethodStarling) + ", maskedIdentity=" + ((Object) this.maskedIdentity) + ", isPrimary=" + this.isPrimary + ", isRecentUsed=" + this.isRecentUsed + ", displayName=" + ((Object) this.displayName) + ", iconUrl=" + ((Object) this.iconUrl) + ", paymentMethodType=" + ((Object) this.paymentMethodType) + ", darkModeIconUrl=" + ((Object) this.darkModeIconUrl) + ", bindTime=" + ((Object) this.bindTime) + ", recentUsedTime=" + ((Object) this.recentUsedTime) + ", channelPiInfo=" + this.channelPiInfo + ", expiryDate=" + this.expiryDate + ", cardType=" + ((Object) this.cardType) + ", lastFour=" + ((Object) this.lastFour) + ", issuingCountryOrRegion=" + ((Object) this.issuingCountryOrRegion) + ", cardOrganization=" + ((Object) this.cardOrganization) + ", expirationMonth=" + ((Object) this.expirationMonth) + ", expirationYear=" + ((Object) this.expirationYear) + ", cardBrand=" + ((Object) this.cardBrand) + ", needCvv=" + this.needCvv + ", pciSensitive=" + this.pciSensitive + ", neededElements=" + this.neededElements + ", paymentFeeAmount=" + ((Object) this.paymentFeeAmount) + ", quoteFeeAmount=" + ((Object) this.quoteFeeAmount) + ", feeUnderTaker=" + ((Object) this.feeUnderTaker) + ", isDefault=" + this.isDefault + ", unavailableCode=" + ((Object) this.unavailableCode) + ", unavailableMsg=" + ((Object) this.unavailableMsg) + ')';
    }

    public final String getBindTime() {
        return this.bindTime;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardOrganization() {
        return this.cardOrganization;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final ChannelPIInfo getChannelPiInfo() {
        return this.channelPiInfo;
    }

    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    public final String getExpirationYear() {
        return this.expirationYear;
    }

    public final Integer getExpiryDate() {
        return this.expiryDate;
    }

    public final String getFeeUnderTaker() {
        return this.feeUnderTaker;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIssuingCountryOrRegion() {
        return this.issuingCountryOrRegion;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getMaskedIdentity() {
        return this.maskedIdentity;
    }

    public final String getMethodType() {
        return this.methodType;
    }

    public final Boolean getNeedCvv() {
        return this.needCvv;
    }

    public final List<Elements> getNeededElements() {
        return this.neededElements;
    }

    public final String getPaymentFeeAmount() {
        return this.paymentFeeAmount;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodStarling() {
        return this.paymentMethodStarling;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
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

    public final String getRecentUsedTime() {
        return this.recentUsedTime;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUnavailableCode() {
        return this.unavailableCode;
    }

    public final String getUnavailableMsg() {
        return this.unavailableMsg;
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    public final Boolean isExpired() {
        return this.isExpired;
    }

    public final Boolean isPrimary() {
        return this.isPrimary;
    }

    public final Boolean isRecentUsed() {
        return this.isRecentUsed;
    }

    public final Boolean isValid() {
        return this.isValid;
    }

    public final void setBindTime(String str) {
        this.bindTime = str;
    }

    public final void setCardBrand(String str) {
        this.cardBrand = str;
    }

    public final void setCardOrganization(String str) {
        this.cardOrganization = str;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setChannelPiInfo(ChannelPIInfo channelPIInfo) {
        this.channelPiInfo = channelPIInfo;
    }

    public final void setDarkModeIconUrl(String str) {
        this.darkModeIconUrl = str;
    }

    public final void setDefault(Boolean bool) {
        this.isDefault = bool;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setExpirationMonth(String str) {
        this.expirationMonth = str;
    }

    public final void setExpirationYear(String str) {
        this.expirationYear = str;
    }

    public final void setExpired(Boolean bool) {
        this.isExpired = bool;
    }

    public final void setExpiryDate(Integer num) {
        this.expiryDate = num;
    }

    public final void setFeeUnderTaker(String str) {
        this.feeUnderTaker = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setIssuingCountryOrRegion(String str) {
        this.issuingCountryOrRegion = str;
    }

    public final void setLastFour(String str) {
        this.lastFour = str;
    }

    public final void setMaskedIdentity(String str) {
        this.maskedIdentity = str;
    }

    public final void setMethodType(String str) {
        this.methodType = str;
    }

    public final void setNeedCvv(Boolean bool) {
        this.needCvv = bool;
    }

    public final void setNeededElements(List<Elements> list) {
        this.neededElements = list;
    }

    public final void setPaymentFeeAmount(String str) {
        this.paymentFeeAmount = str;
    }

    public final void setPaymentMethod(String str) {
        this.paymentMethod = str;
    }

    public final void setPaymentMethodId(String str) {
        this.paymentMethodId = str;
    }

    public final void setPaymentMethodStarling(String str) {
        this.paymentMethodStarling = str;
    }

    public final void setPaymentMethodToken(String str) {
        this.paymentMethodToken = str;
    }

    public final void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setPciSensitive(Boolean bool) {
        this.pciSensitive = bool;
    }

    public final void setPrimary(Boolean bool) {
        this.isPrimary = bool;
    }

    public final void setQuoteFeeAmount(String str) {
        this.quoteFeeAmount = str;
    }

    public final void setRecentUsed(Boolean bool) {
        this.isRecentUsed = bool;
    }

    public final void setRecentUsedTime(String str) {
        this.recentUsedTime = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUnavailableCode(String str) {
        this.unavailableCode = str;
    }

    public final void setUnavailableMsg(String str) {
        this.unavailableMsg = str;
    }

    public final void setValid(Boolean bool) {
        this.isValid = bool;
    }

    public StoredMethods(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, String str7, Boolean bool3, Boolean bool4, String str8, String str9, String str10, String str11, String str12, String str13, ChannelPIInfo channelPIInfo, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool5, Boolean bool6, List<Elements> list, String str21, String str22, String str23, Boolean bool7, String str24, String str25) {
        this.type = str;
        this.paymentMethodToken = str2;
        this.isExpired = bool;
        this.isValid = bool2;
        this.paymentMethodId = str3;
        this.methodType = str4;
        this.paymentMethod = str5;
        this.paymentMethodStarling = str6;
        this.maskedIdentity = str7;
        this.isPrimary = bool3;
        this.isRecentUsed = bool4;
        this.displayName = str8;
        this.iconUrl = str9;
        this.paymentMethodType = str10;
        this.darkModeIconUrl = str11;
        this.bindTime = str12;
        this.recentUsedTime = str13;
        this.channelPiInfo = channelPIInfo;
        this.expiryDate = num;
        this.cardType = str14;
        this.lastFour = str15;
        this.issuingCountryOrRegion = str16;
        this.cardOrganization = str17;
        this.expirationMonth = str18;
        this.expirationYear = str19;
        this.cardBrand = str20;
        this.needCvv = bool5;
        this.pciSensitive = bool6;
        this.neededElements = list;
        this.paymentFeeAmount = str21;
        this.quoteFeeAmount = str22;
        this.feeUnderTaker = str23;
        this.isDefault = bool7;
        this.unavailableCode = str24;
        this.unavailableMsg = str25;
    }

    public StoredMethods(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, String str7, Boolean bool3, Boolean bool4, String str8, String str9, String str10, String str11, String str12, String str13, ChannelPIInfo channelPIInfo, Integer num, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Boolean bool5, Boolean bool6, List list, String str21, String str22, String str23, Boolean bool7, String str24, String str25, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : bool4, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (131072 & i) != 0 ? null : channelPIInfo, (262144 & i) != 0 ? null : num, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : str15, (2097152 & i) != 0 ? null : str16, (4194304 & i) != 0 ? null : str17, (8388608 & i) != 0 ? null : str18, (16777216 & i) != 0 ? null : str19, (33554432 & i) != 0 ? null : str20, (67108864 & i) != 0 ? null : bool5, (134217728 & i) != 0 ? null : bool6, (268435456 & i) != 0 ? C61878OQg.INSTANCE : list, (536870912 & i) != 0 ? null : str21, (1073741824 & i) != 0 ? null : str22, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str23, (i2 & 1) != 0 ? null : bool7, (i2 & 2) != 0 ? null : str24, (i2 & 4) != 0 ? null : str25);
    }
}
