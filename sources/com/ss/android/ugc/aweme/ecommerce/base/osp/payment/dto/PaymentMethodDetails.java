package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentMethodDetails {

    @InterfaceC65349Pkn("billing_address_line")
    public final String billingAddressLine;

    @InterfaceC65349Pkn("billing_city")
    public final String billingCity;

    @InterfaceC65349Pkn("billing_country_region")
    public final String billingCountryRegion;

    @InterfaceC65349Pkn("billing_postal_code")
    public final String billingPostalCode;

    @InterfaceC65349Pkn("billing_state")
    public final String billingState;

    @InterfaceC65349Pkn("bind_time")
    public final String bindTime;

    @InterfaceC65349Pkn("card_brand")
    public final String cardBrand;

    @InterfaceC65349Pkn("card_organization")
    public final String cardOrganization;

    @InterfaceC65349Pkn("channel_pi_info")
    public final Object channelPiInfo;

    @InterfaceC65349Pkn("dark_mode_icon_url")
    public final String darkModeIconUrl;

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("expiration_month")
    public final String expirationMonth;

    @InterfaceC65349Pkn("expiration_year")
    public final String expirationYear;

    @InterfaceC65349Pkn("expiry_date")
    public final Integer expiryDate;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("is_expired")
    public final Boolean isExpired;

    @InterfaceC65349Pkn("is_primary")
    public final Boolean isPrimary;

    @InterfaceC65349Pkn("is_recent_used")
    public final Boolean isRecentUsed;

    @InterfaceC65349Pkn("is_valid")
    public final Boolean isValid;

    @InterfaceC65349Pkn("issuing_country_or_region")
    public final String issuingCountryOrRegion;

    @InterfaceC65349Pkn("last_four")
    public final String lastFour;

    @InterfaceC65349Pkn("method_type")
    public final String methodType;

    @InterfaceC65349Pkn("need_cvv")
    public final Boolean needCvv;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_starling")
    public final String paymentMethodStarling;

    @InterfaceC65349Pkn("payment_method_token")
    public final String paymentMethodToken;

    @InterfaceC65349Pkn("payment_method_type")
    public final String paymentMethodType;

    @InterfaceC65349Pkn("recent_used_time")
    public final String recentUsedTime;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodDetails() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 536870911, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentMethodDetails copy$default(PaymentMethodDetails paymentMethodDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Object obj, String str9, String str10, String str11, String str12, Integer num, String str13, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str14, String str15, String str16, Boolean bool5, String str17, String str18, String str19, String str20, String str21, String str22, int i, Object obj2) {
        String str23 = str12;
        String str24 = str11;
        String str25 = str10;
        String str26 = str9;
        Object obj3 = obj;
        Integer num2 = num;
        String str27 = str8;
        String str28 = str7;
        String str29 = str2;
        String str30 = str;
        String str31 = str3;
        String str32 = str4;
        String str33 = str5;
        String str34 = str6;
        String str35 = str22;
        String str36 = str20;
        String str37 = str19;
        String str38 = str18;
        String str39 = str17;
        Boolean bool6 = bool5;
        String str40 = str16;
        String str41 = str15;
        Boolean bool7 = bool;
        String str42 = str21;
        String str43 = str13;
        Boolean bool8 = bool2;
        Boolean bool9 = bool3;
        Boolean bool10 = bool4;
        String str44 = str14;
        if ((i & 1) != 0) {
            str30 = paymentMethodDetails.billingAddressLine;
        }
        if ((i & 2) != 0) {
            str29 = paymentMethodDetails.billingCity;
        }
        if ((i & 4) != 0) {
            str31 = paymentMethodDetails.billingCountryRegion;
        }
        if ((i & 8) != 0) {
            str32 = paymentMethodDetails.billingPostalCode;
        }
        if ((i & 16) != 0) {
            str33 = paymentMethodDetails.billingState;
        }
        if ((i & 32) != 0) {
            str34 = paymentMethodDetails.bindTime;
        }
        if ((i & 64) != 0) {
            str28 = paymentMethodDetails.cardBrand;
        }
        if ((i & 128) != 0) {
            str27 = paymentMethodDetails.cardOrganization;
        }
        if ((i & 256) != 0) {
            obj3 = paymentMethodDetails.channelPiInfo;
        }
        if ((i & 512) != 0) {
            str26 = paymentMethodDetails.darkModeIconUrl;
        }
        if ((i & 1024) != 0) {
            str25 = paymentMethodDetails.displayName;
        }
        if ((i & 2048) != 0) {
            str24 = paymentMethodDetails.expirationMonth;
        }
        if ((i & 4096) != 0) {
            str23 = paymentMethodDetails.expirationYear;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num2 = paymentMethodDetails.expiryDate;
        }
        if ((i & 16384) != 0) {
            str43 = paymentMethodDetails.iconUrl;
        }
        if ((32768 & i) != 0) {
            bool7 = paymentMethodDetails.isExpired;
        }
        if ((65536 & i) != 0) {
            bool8 = paymentMethodDetails.isPrimary;
        }
        if ((131072 & i) != 0) {
            bool9 = paymentMethodDetails.isRecentUsed;
        }
        if ((262144 & i) != 0) {
            bool10 = paymentMethodDetails.isValid;
        }
        if ((524288 & i) != 0) {
            str44 = paymentMethodDetails.issuingCountryOrRegion;
        }
        if ((1048576 & i) != 0) {
            str41 = paymentMethodDetails.lastFour;
        }
        if ((2097152 & i) != 0) {
            str40 = paymentMethodDetails.methodType;
        }
        if ((4194304 & i) != 0) {
            bool6 = paymentMethodDetails.needCvv;
        }
        if ((8388608 & i) != 0) {
            str39 = paymentMethodDetails.paymentMethodId;
        }
        if ((16777216 & i) != 0) {
            str38 = paymentMethodDetails.paymentMethodStarling;
        }
        if ((33554432 & i) != 0) {
            str37 = paymentMethodDetails.paymentMethodToken;
        }
        if ((67108864 & i) != 0) {
            str36 = paymentMethodDetails.paymentMethodType;
        }
        if ((134217728 & i) != 0) {
            str42 = paymentMethodDetails.recentUsedTime;
        }
        if ((i & 268435456) != 0) {
            str35 = paymentMethodDetails.type;
        }
        return paymentMethodDetails.copy(str30, str29, str31, str32, str33, str34, str28, str27, obj3, str26, str25, str24, str23, num2, str43, bool7, bool8, bool9, bool10, str44, str41, str40, bool6, str39, str38, str37, str36, str42, str35);
    }

    public final PaymentMethodDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Object obj, String str9, String str10, String str11, String str12, Integer num, String str13, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str14, String str15, String str16, Boolean bool5, String str17, String str18, String str19, String str20, String str21, String str22) {
        return new PaymentMethodDetails(str, str2, str3, str4, str5, str6, str7, str8, obj, str9, str10, str11, str12, num, str13, bool, bool2, bool3, bool4, str14, str15, str16, bool5, str17, str18, str19, str20, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodDetails)) {
            return false;
        }
        PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) obj;
        return o.LJ(this.billingAddressLine, paymentMethodDetails.billingAddressLine) && o.LJ(this.billingCity, paymentMethodDetails.billingCity) && o.LJ(this.billingCountryRegion, paymentMethodDetails.billingCountryRegion) && o.LJ(this.billingPostalCode, paymentMethodDetails.billingPostalCode) && o.LJ(this.billingState, paymentMethodDetails.billingState) && o.LJ(this.bindTime, paymentMethodDetails.bindTime) && o.LJ(this.cardBrand, paymentMethodDetails.cardBrand) && o.LJ(this.cardOrganization, paymentMethodDetails.cardOrganization) && o.LJ(this.channelPiInfo, paymentMethodDetails.channelPiInfo) && o.LJ(this.darkModeIconUrl, paymentMethodDetails.darkModeIconUrl) && o.LJ(this.displayName, paymentMethodDetails.displayName) && o.LJ(this.expirationMonth, paymentMethodDetails.expirationMonth) && o.LJ(this.expirationYear, paymentMethodDetails.expirationYear) && o.LJ(this.expiryDate, paymentMethodDetails.expiryDate) && o.LJ(this.iconUrl, paymentMethodDetails.iconUrl) && o.LJ(this.isExpired, paymentMethodDetails.isExpired) && o.LJ(this.isPrimary, paymentMethodDetails.isPrimary) && o.LJ(this.isRecentUsed, paymentMethodDetails.isRecentUsed) && o.LJ(this.isValid, paymentMethodDetails.isValid) && o.LJ(this.issuingCountryOrRegion, paymentMethodDetails.issuingCountryOrRegion) && o.LJ(this.lastFour, paymentMethodDetails.lastFour) && o.LJ(this.methodType, paymentMethodDetails.methodType) && o.LJ(this.needCvv, paymentMethodDetails.needCvv) && o.LJ(this.paymentMethodId, paymentMethodDetails.paymentMethodId) && o.LJ(this.paymentMethodStarling, paymentMethodDetails.paymentMethodStarling) && o.LJ(this.paymentMethodToken, paymentMethodDetails.paymentMethodToken) && o.LJ(this.paymentMethodType, paymentMethodDetails.paymentMethodType) && o.LJ(this.recentUsedTime, paymentMethodDetails.recentUsedTime) && o.LJ(this.type, paymentMethodDetails.type);
    }

    public int hashCode() {
        String str = this.billingAddressLine;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billingCity;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingCountryRegion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingPostalCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billingState;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bindTime;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cardBrand;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cardOrganization;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj = this.channelPiInfo;
        int hashCode9 = (hashCode8 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str9 = this.darkModeIconUrl;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.displayName;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.expirationMonth;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.expirationYear;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.expiryDate;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str13 = this.iconUrl;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.isExpired;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPrimary;
        int hashCode17 = (hashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isRecentUsed;
        int hashCode18 = (hashCode17 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isValid;
        int hashCode19 = (hashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str14 = this.issuingCountryOrRegion;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastFour;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.methodType;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool5 = this.needCvv;
        int hashCode23 = (hashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str17 = this.paymentMethodId;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.paymentMethodStarling;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.paymentMethodToken;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.paymentMethodType;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.recentUsedTime;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.type;
        return hashCode28 + (str22 != null ? str22.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodDetails(billingAddressLine=");
        sb.append(this.billingAddressLine);
        sb.append(", billingCity=");
        sb.append(this.billingCity);
        sb.append(", billingCountryRegion=");
        sb.append(this.billingCountryRegion);
        sb.append(", billingPostalCode=");
        sb.append(this.billingPostalCode);
        sb.append(", billingState=");
        sb.append(this.billingState);
        sb.append(", bindTime=");
        sb.append(this.bindTime);
        sb.append(", cardBrand=");
        sb.append(this.cardBrand);
        sb.append(", cardOrganization=");
        sb.append(this.cardOrganization);
        sb.append(", channelPiInfo=");
        sb.append(this.channelPiInfo);
        sb.append(", darkModeIconUrl=");
        sb.append(this.darkModeIconUrl);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", expirationMonth=");
        sb.append(this.expirationMonth);
        sb.append(", expirationYear=");
        sb.append(this.expirationYear);
        sb.append(", expiryDate=");
        sb.append(this.expiryDate);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", isExpired=");
        sb.append(this.isExpired);
        sb.append(", isPrimary=");
        sb.append(this.isPrimary);
        sb.append(", isRecentUsed=");
        sb.append(this.isRecentUsed);
        sb.append(", isValid=");
        sb.append(this.isValid);
        sb.append(", issuingCountryOrRegion=");
        sb.append(this.issuingCountryOrRegion);
        sb.append(", lastFour=");
        sb.append(this.lastFour);
        sb.append(", methodType=");
        sb.append(this.methodType);
        sb.append(", needCvv=");
        sb.append(this.needCvv);
        sb.append(", paymentMethodId=");
        sb.append(this.paymentMethodId);
        sb.append(", paymentMethodStarling=");
        sb.append(this.paymentMethodStarling);
        sb.append(", paymentMethodToken=");
        sb.append(this.paymentMethodToken);
        sb.append(", paymentMethodType=");
        sb.append(this.paymentMethodType);
        sb.append(", recentUsedTime=");
        sb.append(this.recentUsedTime);
        sb.append(", type=");
        return C07670Rv.LIZIZ(sb, this.type, ')');
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

    public final String getBindTime() {
        return this.bindTime;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardOrganization() {
        return this.cardOrganization;
    }

    public final Object getChannelPiInfo() {
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

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIssuingCountryOrRegion() {
        return this.issuingCountryOrRegion;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getMethodType() {
        return this.methodType;
    }

    public final Boolean getNeedCvv() {
        return this.needCvv;
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

    public final String getRecentUsedTime() {
        return this.recentUsedTime;
    }

    public final String getType() {
        return this.type;
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

    public final List<PaymentElement> convertToElements(List<ElementDTO> list) {
        String str;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ElementDTO elementDTO : list) {
            PaymentElement LIZ = elementDTO.LIZ();
            String str2 = elementDTO.id;
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1675358935:
                        if (str2.equals("eg_ccdc_global_billing_address_state")) {
                            str = this.billingState;
                            break;
                        }
                        break;
                    case -437890200:
                        if (str2.equals("eg_ccdc_global_billing_address_country_regin")) {
                            str = this.billingCountryRegion;
                            break;
                        }
                        break;
                    case -396027285:
                        if (str2.equals("eg_ccdc_global_billing_address_street")) {
                            str = this.billingAddressLine;
                            break;
                        }
                        break;
                    case -304863367:
                        if (str2.equals("eg_ccdc_global_billing_address_postal_code")) {
                            str = this.billingPostalCode;
                            break;
                        }
                        break;
                    case -193077805:
                        if (str2.equals("eg_ccdc_global_billing_address_city")) {
                            str = this.billingCity;
                            break;
                        }
                        break;
                }
            }
            str = null;
            LIZ.setParamValue(str);
            String paramValue = LIZ.getParamValue();
            if (paramValue != null && paramValue.length() != 0) {
                arrayList.add(LIZ);
            }
        }
        return arrayList;
    }

    public PaymentMethodDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Object obj, String str9, String str10, String str11, String str12, Integer num, String str13, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str14, String str15, String str16, Boolean bool5, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.billingAddressLine = str;
        this.billingCity = str2;
        this.billingCountryRegion = str3;
        this.billingPostalCode = str4;
        this.billingState = str5;
        this.bindTime = str6;
        this.cardBrand = str7;
        this.cardOrganization = str8;
        this.channelPiInfo = obj;
        this.darkModeIconUrl = str9;
        this.displayName = str10;
        this.expirationMonth = str11;
        this.expirationYear = str12;
        this.expiryDate = num;
        this.iconUrl = str13;
        this.isExpired = bool;
        this.isPrimary = bool2;
        this.isRecentUsed = bool3;
        this.isValid = bool4;
        this.issuingCountryOrRegion = str14;
        this.lastFour = str15;
        this.methodType = str16;
        this.needCvv = bool5;
        this.paymentMethodId = str17;
        this.paymentMethodStarling = str18;
        this.paymentMethodToken = str19;
        this.paymentMethodType = str20;
        this.recentUsedTime = str21;
        this.type = str22;
    }

    public /* synthetic */ PaymentMethodDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Object obj, String str9, String str10, String str11, String str12, Integer num, String str13, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str14, String str15, String str16, Boolean bool5, String str17, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : obj, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & FileUtils.BUFFER_SIZE) != 0 ? null : num, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? null : bool, (65536 & i) != 0 ? null : bool2, (131072 & i) != 0 ? null : bool3, (262144 & i) != 0 ? null : bool4, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : str15, (2097152 & i) != 0 ? null : str16, (4194304 & i) != 0 ? null : bool5, (8388608 & i) != 0 ? null : str17, (16777216 & i) != 0 ? null : str18, (33554432 & i) != 0 ? null : str19, (67108864 & i) != 0 ? null : str20, (134217728 & i) != 0 ? null : str21, (i & 268435456) != 0 ? null : str22);
    }
}
