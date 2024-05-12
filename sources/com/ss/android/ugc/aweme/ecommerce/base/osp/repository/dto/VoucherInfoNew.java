package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.UC7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VoucherInfoNew {

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("claim_user_type")
    public final Integer claimUserType;

    @InterfaceC65349Pkn("cost_role")
    public final Integer costRole;

    @InterfaceC65349Pkn("cost_type")
    public final Integer costType;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("discount_level")
    public final Integer discountLevel;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    @InterfaceC65349Pkn("promotion_reduction_type")
    public final Integer promotionReductionType;

    @InterfaceC65349Pkn("selected")
    public final Boolean selected;

    @InterfaceC65349Pkn("threshold_text")
    public final String thresholdText;

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
        if (!(obj instanceof VoucherInfoNew)) {
            return false;
        }
        VoucherInfoNew voucherInfoNew = (VoucherInfoNew) obj;
        return o.LJ(this.voucherId, voucherInfoNew.voucherId) && o.LJ(this.promotionId, voucherInfoNew.promotionId) && o.LJ(this.voucherTypeId, voucherInfoNew.voucherTypeId) && o.LJ(this.selected, voucherInfoNew.selected) && o.LJ(this.voucherBusinessType, voucherInfoNew.voucherBusinessType) && o.LJ(this.discountText, voucherInfoNew.discountText) && o.LJ(this.costRole, voucherInfoNew.costRole) && o.LJ(this.costType, voucherInfoNew.costType) && o.LJ(this.thresholdText, voucherInfoNew.thresholdText) && o.LJ(this.validTimeText, voucherInfoNew.validTimeText) && o.LJ(this.buttonText, voucherInfoNew.buttonText) && o.LJ(this.promotionReductionType, voucherInfoNew.promotionReductionType) && o.LJ(this.daInfo, voucherInfoNew.daInfo) && o.LJ(this.claimUserType, voucherInfoNew.claimUserType) && o.LJ(this.discountLevel, voucherInfoNew.discountLevel);
    }

    public final int hashCode() {
        String str = this.voucherId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promotionId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.voucherTypeId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.selected;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.voucherBusinessType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discountText;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.costRole;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.costType;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.thresholdText;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.validTimeText;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.buttonText;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num3 = this.promotionReductionType;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.daInfo;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num4 = this.claimUserType;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.discountLevel;
        return hashCode14 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoucherInfoNew(voucherId=");
        sb.append(this.voucherId);
        sb.append(", promotionId=");
        sb.append(this.promotionId);
        sb.append(", voucherTypeId=");
        sb.append(this.voucherTypeId);
        sb.append(", selected=");
        sb.append(this.selected);
        sb.append(", voucherBusinessType=");
        sb.append(this.voucherBusinessType);
        sb.append(", discountText=");
        sb.append(this.discountText);
        sb.append(", costRole=");
        sb.append(this.costRole);
        sb.append(", costType=");
        sb.append(this.costType);
        sb.append(", thresholdText=");
        sb.append(this.thresholdText);
        sb.append(", validTimeText=");
        sb.append(this.validTimeText);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", promotionReductionType=");
        sb.append(this.promotionReductionType);
        sb.append(", daInfo=");
        sb.append(this.daInfo);
        sb.append(", claimUserType=");
        sb.append(this.claimUserType);
        sb.append(", discountLevel=");
        return UC7.LIZ(sb, this.discountLevel, ')');
    }

    public VoucherInfoNew(String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, Integer num3, String str9, Integer num4, Integer num5) {
        this.voucherId = str;
        this.promotionId = str2;
        this.voucherTypeId = str3;
        this.selected = bool;
        this.voucherBusinessType = str4;
        this.discountText = str5;
        this.costRole = num;
        this.costType = num2;
        this.thresholdText = str6;
        this.validTimeText = str7;
        this.buttonText = str8;
        this.promotionReductionType = num3;
        this.daInfo = str9;
        this.claimUserType = num4;
        this.discountLevel = num5;
    }

    public /* synthetic */ VoucherInfoNew(String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, Integer num3, String str9, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bool, str4, str5, (i & 64) != 0 ? 2 : num, (i & 128) != 0 ? 1 : num2, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? num3 : null, str9, num4, num5);
    }
}
