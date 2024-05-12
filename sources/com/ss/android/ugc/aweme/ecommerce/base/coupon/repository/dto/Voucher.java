package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C69632RUm;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Voucher implements Parcelable, Serializable {
    public static final Parcelable.Creator<Voucher> CREATOR = new C69632RUm();

    @InterfaceC65349Pkn("button_text")
    public String buttonText;

    @InterfaceC65349Pkn("claim_time")
    public final Long claimTime;

    @InterfaceC65349Pkn("claim_user_type")
    public final Integer claimUserType;

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

    @InterfaceC65349Pkn("discount_limit_text")
    public final String discountLimitText;

    @InterfaceC65349Pkn("discount_text")
    public final String discountText;

    @InterfaceC65349Pkn("discount_view")
    public final List<DiscountView> discountViews;

    @InterfaceC65349Pkn("exclusions_text")
    public final String exclusionsText;

    @InterfaceC65349Pkn("full_vap_schema")
    public final String fullVapSchema;

    @InterfaceC65349Pkn("voucher_interactive_info")
    public final VoucherInteractiveInfo interactiveInfo;

    @InterfaceC65349Pkn("is_best")
    public final Boolean isBest;

    @InterfaceC65349Pkn("labels")
    public final List<VoucherLabel> labels;

    @InterfaceC65349Pkn("main_order_id")
    public final String mainOrderID;

    @InterfaceC65349Pkn("odp_schema")
    public final String odpSchema;

    @InterfaceC65349Pkn("orientation_text")
    public final String orientationText;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionID;

    @InterfaceC65349Pkn("reduction_type")
    public final Integer reductionType;

    @InterfaceC65349Pkn("scope_text")
    public final String scopeText;

    @InterfaceC65349Pkn("selected")
    public final Boolean selected;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("status_text")
    public final String statusText;

    @InterfaceC65349Pkn("threshold_text")
    public final String thresholdText;

    @InterfaceC65349Pkn("title")
    public final String title;

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

    @InterfaceC65349Pkn("valid_time_text_style")
    public final Integer validTimeTextStyle;

    @InterfaceC65349Pkn("vap_schema")
    public String vapSchema;

    @InterfaceC65349Pkn("vap_schema_type")
    public final Integer vapSchemaType;

    @InterfaceC65349Pkn("voucher_business_type")
    public final String voucherBusinessType;

    @InterfaceC65349Pkn("voucher_display_type")
    public final Integer voucherDisplayType;

    @InterfaceC65349Pkn("voucher_id")
    public String voucherID;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeID;

    /* JADX WARN: Multi-variable type inference failed */
    public Voucher() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Voucher copy$default(Voucher voucher, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num7, String str18, String str19, List list, String str20, Integer num8, Integer num9, VoucherInteractiveInfo voucherInteractiveInfo, String str21, String str22, List list2, int i, int i2, Object obj) {
        String str23 = str4;
        String str24 = str3;
        Long l4 = l3;
        Long l5 = l2;
        Long l6 = l;
        Integer num10 = num6;
        Integer num11 = num5;
        Boolean bool3 = bool;
        String str25 = str2;
        String str26 = str;
        Integer num12 = num;
        Integer num13 = num2;
        Integer num14 = num3;
        Integer num15 = num4;
        VoucherInteractiveInfo voucherInteractiveInfo2 = voucherInteractiveInfo;
        Integer num16 = num9;
        String str27 = str20;
        List list3 = list;
        String str28 = str9;
        String str29 = str8;
        String str30 = str7;
        String str31 = str21;
        String str32 = str6;
        String str33 = str5;
        Boolean bool4 = bool2;
        String str34 = str10;
        String str35 = str11;
        String str36 = str19;
        String str37 = str12;
        Integer num17 = num8;
        String str38 = str13;
        List list4 = list2;
        String str39 = str14;
        String str40 = str15;
        String str41 = str22;
        String str42 = str16;
        String str43 = str17;
        Integer num18 = num7;
        String str44 = str18;
        if ((i & 1) != 0) {
            str26 = voucher.voucherID;
        }
        if ((i & 2) != 0) {
            str25 = voucher.voucherTypeID;
        }
        if ((i & 4) != 0) {
            num12 = voucher.status;
        }
        if ((i & 8) != 0) {
            num13 = voucher.costType;
        }
        if ((i & 16) != 0) {
            num14 = voucher.costRole;
        }
        if ((i & 32) != 0) {
            num15 = voucher.reductionType;
        }
        if ((i & 64) != 0) {
            num11 = voucher.claimUserType;
        }
        if ((i & 128) != 0) {
            num10 = voucher.useLimitType;
        }
        if ((i & 256) != 0) {
            l6 = voucher.claimTime;
        }
        if ((i & 512) != 0) {
            l5 = voucher.usableStartTime;
        }
        if ((i & 1024) != 0) {
            l4 = voucher.usableEndTime;
        }
        if ((i & 2048) != 0) {
            str24 = voucher.mainOrderID;
        }
        if ((i & 4096) != 0) {
            str23 = voucher.voucherBusinessType;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            bool3 = voucher.selected;
        }
        if ((i & 16384) != 0) {
            str33 = voucher.promotionID;
        }
        if ((32768 & i) != 0) {
            bool4 = voucher.isBest;
        }
        if ((65536 & i) != 0) {
            str32 = voucher.statusText;
        }
        if ((131072 & i) != 0) {
            str30 = voucher.costRoleText;
        }
        if ((262144 & i) != 0) {
            str29 = voucher.discountText;
        }
        if ((524288 & i) != 0) {
            str28 = voucher.thresholdText;
        }
        if ((1048576 & i) != 0) {
            str34 = voucher.useLimitText;
        }
        if ((2097152 & i) != 0) {
            str35 = voucher.orientationText;
        }
        if ((4194304 & i) != 0) {
            str37 = voucher.odpSchema;
        }
        if ((8388608 & i) != 0) {
            str38 = voucher.scopeText;
        }
        if ((16777216 & i) != 0) {
            str39 = voucher.exclusionsText;
        }
        if ((33554432 & i) != 0) {
            str40 = voucher.currencySymbol;
        }
        if ((67108864 & i) != 0) {
            str42 = voucher.buttonText;
        }
        if ((134217728 & i) != 0) {
            str43 = voucher.validTimeText;
        }
        if ((268435456 & i) != 0) {
            num18 = voucher.validTimeTextStyle;
        }
        if ((536870912 & i) != 0) {
            str44 = voucher.vapSchema;
        }
        if ((1073741824 & i) != 0) {
            str36 = voucher.fullVapSchema;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            list3 = voucher.discountViews;
        }
        if ((i2 & 1) != 0) {
            str27 = voucher.daInfo;
        }
        if ((i2 & 2) != 0) {
            num17 = voucher.vapSchemaType;
        }
        if ((i2 & 4) != 0) {
            num16 = voucher.voucherDisplayType;
        }
        if ((i2 & 8) != 0) {
            voucherInteractiveInfo2 = voucher.interactiveInfo;
        }
        if ((i2 & 16) != 0) {
            str31 = voucher.title;
        }
        if ((i2 & 32) != 0) {
            str41 = voucher.discountLimitText;
        }
        if ((i2 & 64) != 0) {
            list4 = voucher.labels;
        }
        return voucher.copy(str26, str25, num12, num13, num14, num15, num11, num10, l6, l5, l4, str24, str23, bool3, str33, bool4, str32, str30, str29, str28, str34, str35, str37, str38, str39, str40, str42, str43, num18, str44, str36, list3, str27, num17, num16, voucherInteractiveInfo2, str31, str41, list4);
    }

    public final Voucher copy(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num7, String str18, String str19, List<DiscountView> list, String str20, Integer num8, Integer num9, VoucherInteractiveInfo voucherInteractiveInfo, String str21, String str22, List<VoucherLabel> list2) {
        return new Voucher(str, str2, num, num2, num3, num4, num5, num6, l, l2, l3, str3, str4, bool, str5, bool2, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, num7, str18, str19, list, str20, num8, num9, voucherInteractiveInfo, str21, str22, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) obj;
        return o.LJ(this.voucherID, voucher.voucherID) && o.LJ(this.voucherTypeID, voucher.voucherTypeID) && o.LJ(this.status, voucher.status) && o.LJ(this.costType, voucher.costType) && o.LJ(this.costRole, voucher.costRole) && o.LJ(this.reductionType, voucher.reductionType) && o.LJ(this.claimUserType, voucher.claimUserType) && o.LJ(this.useLimitType, voucher.useLimitType) && o.LJ(this.claimTime, voucher.claimTime) && o.LJ(this.usableStartTime, voucher.usableStartTime) && o.LJ(this.usableEndTime, voucher.usableEndTime) && o.LJ(this.mainOrderID, voucher.mainOrderID) && o.LJ(this.voucherBusinessType, voucher.voucherBusinessType) && o.LJ(this.selected, voucher.selected) && o.LJ(this.promotionID, voucher.promotionID) && o.LJ(this.isBest, voucher.isBest) && o.LJ(this.statusText, voucher.statusText) && o.LJ(this.costRoleText, voucher.costRoleText) && o.LJ(this.discountText, voucher.discountText) && o.LJ(this.thresholdText, voucher.thresholdText) && o.LJ(this.useLimitText, voucher.useLimitText) && o.LJ(this.orientationText, voucher.orientationText) && o.LJ(this.odpSchema, voucher.odpSchema) && o.LJ(this.scopeText, voucher.scopeText) && o.LJ(this.exclusionsText, voucher.exclusionsText) && o.LJ(this.currencySymbol, voucher.currencySymbol) && o.LJ(this.buttonText, voucher.buttonText) && o.LJ(this.validTimeText, voucher.validTimeText) && o.LJ(this.validTimeTextStyle, voucher.validTimeTextStyle) && o.LJ(this.vapSchema, voucher.vapSchema) && o.LJ(this.fullVapSchema, voucher.fullVapSchema) && o.LJ(this.discountViews, voucher.discountViews) && o.LJ(this.daInfo, voucher.daInfo) && o.LJ(this.vapSchemaType, voucher.vapSchemaType) && o.LJ(this.voucherDisplayType, voucher.voucherDisplayType) && o.LJ(this.interactiveInfo, voucher.interactiveInfo) && o.LJ(this.title, voucher.title) && o.LJ(this.discountLimitText, voucher.discountLimitText) && o.LJ(this.labels, voucher.labels);
    }

    public int hashCode() {
        String str = this.voucherID;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.voucherTypeID;
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
        String str3 = this.mainOrderID;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voucherBusinessType;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.selected;
        int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.promotionID;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isBest;
        int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.statusText;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.costRoleText;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discountText;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.thresholdText;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.useLimitText;
        int hashCode21 = (hashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.orientationText;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.odpSchema;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.scopeText;
        int hashCode24 = (hashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.exclusionsText;
        int hashCode25 = (hashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.currencySymbol;
        int hashCode26 = (hashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.buttonText;
        int hashCode27 = (hashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.validTimeText;
        int hashCode28 = (hashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num7 = this.validTimeTextStyle;
        int hashCode29 = (hashCode28 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str18 = this.vapSchema;
        int hashCode30 = (hashCode29 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.fullVapSchema;
        int hashCode31 = (hashCode30 + (str19 == null ? 0 : str19.hashCode())) * 31;
        List<DiscountView> list = this.discountViews;
        int hashCode32 = (hashCode31 + (list == null ? 0 : list.hashCode())) * 31;
        String str20 = this.daInfo;
        int hashCode33 = (hashCode32 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num8 = this.vapSchemaType;
        int hashCode34 = (hashCode33 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.voucherDisplayType;
        int hashCode35 = (hashCode34 + (num9 == null ? 0 : num9.hashCode())) * 31;
        VoucherInteractiveInfo voucherInteractiveInfo = this.interactiveInfo;
        int hashCode36 = (hashCode35 + (voucherInteractiveInfo == null ? 0 : voucherInteractiveInfo.hashCode())) * 31;
        String str21 = this.title;
        int hashCode37 = (hashCode36 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.discountLimitText;
        int hashCode38 = (hashCode37 + (str22 == null ? 0 : str22.hashCode())) * 31;
        List<VoucherLabel> list2 = this.labels;
        return hashCode38 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Voucher(voucherID=" + this.voucherID + ", voucherTypeID=" + this.voucherTypeID + ", status=" + this.status + ", costType=" + this.costType + ", costRole=" + this.costRole + ", reductionType=" + this.reductionType + ", claimUserType=" + this.claimUserType + ", useLimitType=" + this.useLimitType + ", claimTime=" + this.claimTime + ", usableStartTime=" + this.usableStartTime + ", usableEndTime=" + this.usableEndTime + ", mainOrderID=" + this.mainOrderID + ", voucherBusinessType=" + this.voucherBusinessType + ", selected=" + this.selected + ", promotionID=" + this.promotionID + ", isBest=" + this.isBest + ", statusText=" + this.statusText + ", costRoleText=" + this.costRoleText + ", discountText=" + this.discountText + ", thresholdText=" + this.thresholdText + ", useLimitText=" + this.useLimitText + ", orientationText=" + this.orientationText + ", odpSchema=" + this.odpSchema + ", scopeText=" + this.scopeText + ", exclusionsText=" + this.exclusionsText + ", currencySymbol=" + this.currencySymbol + ", buttonText=" + this.buttonText + ", validTimeText=" + this.validTimeText + ", validTimeTextStyle=" + this.validTimeTextStyle + ", vapSchema=" + this.vapSchema + ", fullVapSchema=" + this.fullVapSchema + ", discountViews=" + this.discountViews + ", daInfo=" + this.daInfo + ", vapSchemaType=" + this.vapSchemaType + ", voucherDisplayType=" + this.voucherDisplayType + ", interactiveInfo=" + this.interactiveInfo + ", title=" + this.title + ", discountLimitText=" + this.discountLimitText + ", labels=" + this.labels + ')';
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Long getClaimTime() {
        return this.claimTime;
    }

    public final Integer getClaimUserType() {
        return this.claimUserType;
    }

    public final Integer getCostRole() {
        return this.costRole;
    }

    public final String getCostRoleText() {
        return this.costRoleText;
    }

    public final Integer getCostType() {
        return this.costType;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final String getDiscountLimitText() {
        return this.discountLimitText;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final List<DiscountView> getDiscountViews() {
        return this.discountViews;
    }

    public final String getExclusionsText() {
        return this.exclusionsText;
    }

    public final String getFullVapSchema() {
        return this.fullVapSchema;
    }

    public final VoucherInteractiveInfo getInteractiveInfo() {
        return this.interactiveInfo;
    }

    public final List<VoucherLabel> getLabels() {
        return this.labels;
    }

    public final String getMainOrderID() {
        return this.mainOrderID;
    }

    public final String getOdpSchema() {
        return this.odpSchema;
    }

    public final String getOrientationText() {
        return this.orientationText;
    }

    public final String getPromotionID() {
        return this.promotionID;
    }

    public final Integer getReductionType() {
        return this.reductionType;
    }

    public final String getScopeText() {
        return this.scopeText;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getThresholdText() {
        return this.thresholdText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUsableEndTime() {
        return this.usableEndTime;
    }

    public final Long getUsableStartTime() {
        return this.usableStartTime;
    }

    public final String getUseLimitText() {
        return this.useLimitText;
    }

    public final Integer getUseLimitType() {
        return this.useLimitType;
    }

    public final String getValidTimeText() {
        return this.validTimeText;
    }

    public final Integer getValidTimeTextStyle() {
        return this.validTimeTextStyle;
    }

    public final String getVapSchema() {
        return this.vapSchema;
    }

    public final Integer getVapSchemaType() {
        return this.vapSchemaType;
    }

    public final String getVoucherBusinessType() {
        return this.voucherBusinessType;
    }

    public final Integer getVoucherDisplayType() {
        return this.voucherDisplayType;
    }

    public final String getVoucherID() {
        return this.voucherID;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    public final Boolean isBest() {
        return this.isBest;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setVapSchema(String str) {
        this.vapSchema = str;
    }

    public final void setVoucherID(String str) {
        this.voucherID = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.voucherID);
        out.writeString(this.voucherTypeID);
        Integer num = this.status;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.costType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.costRole;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Integer num4 = this.reductionType;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        Integer num5 = this.claimUserType;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num5);
        }
        Integer num6 = this.useLimitType;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num6);
        }
        Long l = this.claimTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.usableStartTime;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        Long l3 = this.usableEndTime;
        if (l3 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l3);
        }
        out.writeString(this.mainOrderID);
        out.writeString(this.voucherBusinessType);
        Boolean bool = this.selected;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.promotionID);
        Boolean bool2 = this.isBest;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.statusText);
        out.writeString(this.costRoleText);
        out.writeString(this.discountText);
        out.writeString(this.thresholdText);
        out.writeString(this.useLimitText);
        out.writeString(this.orientationText);
        out.writeString(this.odpSchema);
        out.writeString(this.scopeText);
        out.writeString(this.exclusionsText);
        out.writeString(this.currencySymbol);
        out.writeString(this.buttonText);
        out.writeString(this.validTimeText);
        Integer num7 = this.validTimeTextStyle;
        if (num7 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num7);
        }
        out.writeString(this.vapSchema);
        out.writeString(this.fullVapSchema);
        List<DiscountView> list = this.discountViews;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((DiscountView) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.daInfo);
        Integer num8 = this.vapSchemaType;
        if (num8 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num8);
        }
        Integer num9 = this.voucherDisplayType;
        if (num9 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num9);
        }
        VoucherInteractiveInfo voucherInteractiveInfo = this.interactiveInfo;
        if (voucherInteractiveInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            voucherInteractiveInfo.writeToParcel(out, i);
        }
        out.writeString(this.title);
        out.writeString(this.discountLimitText);
        List<VoucherLabel> list2 = this.labels;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
        while (LIZIZ2.hasNext()) {
            ((VoucherLabel) LIZIZ2.next()).writeToParcel(out, i);
        }
    }

    public Voucher(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num7, String str18, String str19, List<DiscountView> list, String str20, Integer num8, Integer num9, VoucherInteractiveInfo voucherInteractiveInfo, String str21, String str22, List<VoucherLabel> list2) {
        this.voucherID = str;
        this.voucherTypeID = str2;
        this.status = num;
        this.costType = num2;
        this.costRole = num3;
        this.reductionType = num4;
        this.claimUserType = num5;
        this.useLimitType = num6;
        this.claimTime = l;
        this.usableStartTime = l2;
        this.usableEndTime = l3;
        this.mainOrderID = str3;
        this.voucherBusinessType = str4;
        this.selected = bool;
        this.promotionID = str5;
        this.isBest = bool2;
        this.statusText = str6;
        this.costRoleText = str7;
        this.discountText = str8;
        this.thresholdText = str9;
        this.useLimitText = str10;
        this.orientationText = str11;
        this.odpSchema = str12;
        this.scopeText = str13;
        this.exclusionsText = str14;
        this.currencySymbol = str15;
        this.buttonText = str16;
        this.validTimeText = str17;
        this.validTimeTextStyle = num7;
        this.vapSchema = str18;
        this.fullVapSchema = str19;
        this.discountViews = list;
        this.daInfo = str20;
        this.vapSchemaType = num8;
        this.voucherDisplayType = num9;
        this.interactiveInfo = voucherInteractiveInfo;
        this.title = str21;
        this.discountLimitText = str22;
        this.labels = list2;
    }

    public /* synthetic */ Voucher(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, Long l3, String str3, String str4, Boolean bool, String str5, Boolean bool2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num7, String str18, String str19, List list, String str20, Integer num8, Integer num9, VoucherInteractiveInfo voucherInteractiveInfo, String str21, String str22, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? 0 : num2, (i & 16) != 0 ? 0 : num3, (i & 32) != 0 ? 0 : num4, (i & 64) != 0 ? 0 : num5, (i & 128) != 0 ? 0 : num6, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : str4, (i & FileUtils.BUFFER_SIZE) != 0 ? null : bool, (i & 16384) != 0 ? null : str5, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? "" : str6, (131072 & i) != 0 ? "" : str7, (262144 & i) == 0 ? str8 : "", (524288 & i) != 0 ? null : str9, (1048576 & i) != 0 ? null : str10, (2097152 & i) != 0 ? null : str11, (4194304 & i) != 0 ? null : str12, (8388608 & i) != 0 ? null : str13, (16777216 & i) != 0 ? null : str14, (33554432 & i) != 0 ? null : str15, (67108864 & i) != 0 ? null : str16, (134217728 & i) != 0 ? null : str17, (268435456 & i) != 0 ? null : num7, (536870912 & i) != 0 ? null : str18, (1073741824 & i) != 0 ? null : str19, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : list, (i2 & 1) != 0 ? null : str20, (i2 & 2) != 0 ? null : num8, (i2 & 4) != 0 ? null : num9, (i2 & 8) != 0 ? null : voucherInteractiveInfo, (i2 & 16) != 0 ? null : str21, (i2 & 32) != 0 ? null : str22, (i2 & 64) != 0 ? null : list2);
    }
}
