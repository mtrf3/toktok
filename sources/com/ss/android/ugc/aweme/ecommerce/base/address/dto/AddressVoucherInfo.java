package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddressVoucherInfo {

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("claim_time")
    public final Long claimTime;

    @InterfaceC65349Pkn("claim_user_type")
    public final Integer claimUserType;

    @InterfaceC65349Pkn("claimable_end_time")
    public final Long claimableEndTime;

    @InterfaceC65349Pkn("claimable_start_time")
    public final Long claimableStartTime;

    @InterfaceC65349Pkn("cost_role")
    public final Integer costRole;

    @InterfaceC65349Pkn("cost_role_text")
    public final String costRoleText;

    @InterfaceC65349Pkn("cost_type")
    public final Integer costType;

    @InterfaceC65349Pkn("currency_symbol")
    public final String currencySymbol;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @InterfaceC65349Pkn("exclusions_text")
    public final String exclusionsText;

    @InterfaceC65349Pkn("main_order_id")
    public final String mainOrderId;

    @InterfaceC65349Pkn("odp_schema")
    public final String odpSchema;

    @InterfaceC65349Pkn("orientation_text")
    public final String orientationText;

    @InterfaceC65349Pkn("reduction_type")
    public final Integer reductionType;

    @InterfaceC65349Pkn("scope_text")
    public final String scopeText;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("status_text")
    public final String statusText;

    @InterfaceC65349Pkn("threshold_text")
    public final String thresholdText;

    @InterfaceC65349Pkn("usable_end_time")
    public final Long usableEndTime;

    @InterfaceC65349Pkn("usable_start_time")
    public final Long usableStartTime;

    @InterfaceC65349Pkn("use_limit_text")
    public final String useLimitText;

    @InterfaceC65349Pkn("use_limit_type")
    public final Integer useLimitType;

    @InterfaceC65349Pkn("valid_time_text")
    public final String validTimeText;

    @InterfaceC65349Pkn("voucher_business_type")
    public final String voucherBusinessType;

    @InterfaceC65349Pkn("voucher_id")
    public final String voucherId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressVoucherInfo)) {
            return false;
        }
        AddressVoucherInfo addressVoucherInfo = (AddressVoucherInfo) obj;
        return o.LJ(this.voucherId, addressVoucherInfo.voucherId) && o.LJ(this.voucherTypeId, addressVoucherInfo.voucherTypeId) && o.LJ(this.status, addressVoucherInfo.status) && o.LJ(this.costType, addressVoucherInfo.costType) && o.LJ(this.costRole, addressVoucherInfo.costRole) && o.LJ(this.reductionType, addressVoucherInfo.reductionType) && o.LJ(this.claimUserType, addressVoucherInfo.claimUserType) && o.LJ(this.useLimitType, addressVoucherInfo.useLimitType) && o.LJ(this.claimTime, addressVoucherInfo.claimTime) && o.LJ(this.usableStartTime, addressVoucherInfo.usableStartTime) && o.LJ(this.usableEndTime, addressVoucherInfo.usableEndTime) && o.LJ(this.mainOrderId, addressVoucherInfo.mainOrderId) && o.LJ(this.voucherBusinessType, addressVoucherInfo.voucherBusinessType) && o.LJ(this.claimableStartTime, addressVoucherInfo.claimableStartTime) && o.LJ(this.claimableEndTime, addressVoucherInfo.claimableEndTime) && o.LJ(this.statusText, addressVoucherInfo.statusText) && o.LJ(this.costRoleText, addressVoucherInfo.costRoleText) && o.LJ(this.discountText, addressVoucherInfo.discountText) && o.LJ(this.thresholdText, addressVoucherInfo.thresholdText) && o.LJ(this.useLimitText, addressVoucherInfo.useLimitText) && o.LJ(this.orientationText, addressVoucherInfo.orientationText) && o.LJ(this.odpSchema, addressVoucherInfo.odpSchema) && o.LJ(this.scopeText, addressVoucherInfo.scopeText) && o.LJ(this.exclusionsText, addressVoucherInfo.exclusionsText) && o.LJ(this.currencySymbol, addressVoucherInfo.currencySymbol) && o.LJ(this.buttonText, addressVoucherInfo.buttonText) && o.LJ(this.validTimeText, addressVoucherInfo.validTimeText) && o.LJ(this.daInfo, addressVoucherInfo.daInfo);
    }

    public final int hashCode() {
        String str = this.voucherId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherTypeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.status;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.costType;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.costRole;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.reductionType;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.claimUserType;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.useLimitType;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.claimTime;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.usableStartTime;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.usableEndTime;
        int hashCode11 = (hashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.mainOrderId;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voucherBusinessType;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l4 = this.claimableStartTime;
        int hashCode14 = (hashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.claimableEndTime;
        int hashCode15 = (hashCode14 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str5 = this.statusText;
        int hashCode16 = (hashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.costRoleText;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.discountText;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.thresholdText;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.useLimitText;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.orientationText;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.odpSchema;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.scopeText;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.exclusionsText;
        int hashCode24 = (hashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.currencySymbol;
        int hashCode25 = (hashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.buttonText;
        int hashCode26 = (hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.validTimeText;
        int hashCode27 = (hashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.daInfo;
        return hashCode27 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressVoucherInfo(voucherId=");
        sb.append(this.voucherId);
        sb.append(", voucherTypeId=");
        sb.append(this.voucherTypeId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", costType=");
        sb.append(this.costType);
        sb.append(", costRole=");
        sb.append(this.costRole);
        sb.append(", reductionType=");
        sb.append(this.reductionType);
        sb.append(", claimUserType=");
        sb.append(this.claimUserType);
        sb.append(", useLimitType=");
        sb.append(this.useLimitType);
        sb.append(", claimTime=");
        sb.append(this.claimTime);
        sb.append(", usableStartTime=");
        sb.append(this.usableStartTime);
        sb.append(", usableEndTime=");
        sb.append(this.usableEndTime);
        sb.append(", mainOrderId=");
        sb.append(this.mainOrderId);
        sb.append(", voucherBusinessType=");
        sb.append(this.voucherBusinessType);
        sb.append(", claimableStartTime=");
        sb.append(this.claimableStartTime);
        sb.append(", claimableEndTime=");
        sb.append(this.claimableEndTime);
        sb.append(", statusText=");
        sb.append(this.statusText);
        sb.append(", costRoleText=");
        sb.append(this.costRoleText);
        sb.append(", discountText=");
        sb.append(this.discountText);
        sb.append(", thresholdText=");
        sb.append(this.thresholdText);
        sb.append(", useLimitText=");
        sb.append(this.useLimitText);
        sb.append(", orientationText=");
        sb.append(this.orientationText);
        sb.append(", odpSchema=");
        sb.append(this.odpSchema);
        sb.append(", scopeText=");
        sb.append(this.scopeText);
        sb.append(", exclusionsText=");
        sb.append(this.exclusionsText);
        sb.append(", currencySymbol=");
        sb.append(this.currencySymbol);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", validTimeText=");
        sb.append(this.validTimeText);
        sb.append(", daInfo=");
        return C07670Rv.LIZIZ(sb, this.daInfo, ')');
    }

    public AddressVoucherInfo(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Long l4, Long l5, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.voucherId = str;
        this.voucherTypeId = str2;
        this.status = num;
        this.costType = num2;
        this.costRole = num3;
        this.reductionType = num4;
        this.claimUserType = num5;
        this.useLimitType = num6;
        this.claimTime = l;
        this.usableStartTime = l2;
        this.usableEndTime = l3;
        this.mainOrderId = str3;
        this.voucherBusinessType = str4;
        this.claimableStartTime = l4;
        this.claimableEndTime = l5;
        this.statusText = str5;
        this.costRoleText = str6;
        this.discountText = str7;
        this.thresholdText = str8;
        this.useLimitText = str9;
        this.orientationText = str10;
        this.odpSchema = str11;
        this.scopeText = str12;
        this.exclusionsText = str13;
        this.currencySymbol = str14;
        this.buttonText = str15;
        this.validTimeText = str16;
        this.daInfo = str17;
    }
}
