package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C0JT;
import X.C28034AzO;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillInfoRequest implements Serializable {

    @InterfaceC65349Pkn("activity_ids")
    public final List<String> activityIds;

    @InterfaceC65349Pkn("addon_product_infos")
    public final List<AddonProductInfo> addOnProductInfos;

    @InterfaceC65349Pkn("bill_info_server_params")
    public final String billInfoParams;
    public String bizType;

    @InterfaceC65349Pkn("buy_type")
    public final int buyType;

    @InterfaceC65349Pkn("buyer_addr_id")
    public final String buyerAddrId;

    @InterfaceC65349Pkn("change_info")
    public final ChangeInfo changeInfo;

    @InterfaceC65349Pkn("claim_voucher_type_ids")
    public final List<String> claimVoucherTypeIds;

    @InterfaceC65349Pkn("client_template")
    public final int clientTemplate;

    @InterfaceC65349Pkn("extra_info")
    public final AddonExtraInfo extraInfo;

    @InterfaceC65349Pkn("is_from_follow")
    public final Boolean isFromFollow;

    @InterfaceC65349Pkn("is_new_payment")
    public final boolean isNewPayment;

    @InterfaceC65349Pkn("notice_voucher_type_id")
    public final String noticeVoucherTypeId;

    @InterfaceC65349Pkn("one_step_order_type")
    public final Integer oneStepOrderType;

    @InterfaceC65349Pkn("order_request_params")
    public final HashMap<String, Object> orderRequestParams;

    @InterfaceC65349Pkn("order_shop")
    public final List<OrderShopDigest> orderShop;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("payment_method")
    public final PaymentMethodInfo paymentMethod;

    @InterfaceC65349Pkn("pre_log_id")
    public final String preLogId;

    @InterfaceC65349Pkn("promotion_ids")
    public final List<String> promotionIds;

    @InterfaceC65349Pkn("selected_addon_sku_ids")
    public final List<String> selectedAddonSKUIds;

    @InterfaceC65349Pkn("selected_voucher_metas")
    public final List<VoucherMeta> selectedVoucherMetas;

    @InterfaceC65349Pkn("server_issued_params")
    public final String serverIssuedParams;

    @InterfaceC65349Pkn("traffic_source_list")
    public final int[] trafficSourceList;

    @InterfaceC65349Pkn("use_bonus_redeem")
    public final boolean useBonusRedeem;

    @InterfaceC65349Pkn("use_user_selection")
    public final Boolean useUserSelection;

    @InterfaceC65349Pkn("with_address_input_item")
    public final boolean withAddressInputItem;

    @InterfaceC65349Pkn("with_pre_risk_param")
    public final boolean withPreRiskParam;

    @InterfaceC65349Pkn("with_product_info")
    public final boolean withProductInfo;

    @InterfaceC65349Pkn("with_seller_info")
    public final boolean withSellerInfo;

    public static /* synthetic */ BillInfoRequest copy$default(BillInfoRequest billInfoRequest, String str, int i, List list, boolean z, boolean z2, boolean z3, boolean z4, List list2, Boolean bool, List list3, boolean z5, PaymentMethodInfo paymentMethodInfo, HashMap hashMap, String str2, List list4, List list5, int[] iArr, String str3, List list6, Integer num, Boolean bool2, String str4, List list7, String str5, String str6, int i2, boolean z6, AddonExtraInfo addonExtraInfo, ChangeInfo changeInfo, int i3, Object obj) {
        HashMap hashMap2 = hashMap;
        PaymentMethodInfo paymentMethodInfo2 = paymentMethodInfo;
        boolean z7 = z5;
        List list8 = list3;
        Boolean bool3 = bool;
        String str7 = str2;
        List list9 = list2;
        boolean z8 = z4;
        int i4 = i;
        String str8 = str;
        List list10 = list;
        boolean z9 = z;
        boolean z10 = z2;
        boolean z11 = z3;
        ChangeInfo changeInfo2 = changeInfo;
        boolean z12 = z6;
        int i5 = i2;
        String str9 = str6;
        String str10 = str5;
        List list11 = list7;
        String str11 = str4;
        Boolean bool4 = bool2;
        List list12 = list5;
        AddonExtraInfo addonExtraInfo2 = addonExtraInfo;
        List list13 = list4;
        int[] iArr2 = iArr;
        String str12 = str3;
        List list14 = list6;
        Integer num2 = num;
        if ((i3 & 1) != 0) {
            str8 = billInfoRequest.buyerAddrId;
        }
        if ((i3 & 2) != 0) {
            i4 = billInfoRequest.buyType;
        }
        if ((i3 & 4) != 0) {
            list10 = billInfoRequest.orderShop;
        }
        if ((i3 & 8) != 0) {
            z9 = billInfoRequest.withProductInfo;
        }
        if ((i3 & 16) != 0) {
            z10 = billInfoRequest.withSellerInfo;
        }
        if ((i3 & 32) != 0) {
            z11 = billInfoRequest.withAddressInputItem;
        }
        if ((i3 & 64) != 0) {
            z8 = billInfoRequest.withPreRiskParam;
        }
        if ((i3 & 128) != 0) {
            list9 = billInfoRequest.promotionIds;
        }
        if ((i3 & 256) != 0) {
            bool3 = billInfoRequest.useUserSelection;
        }
        if ((i3 & 512) != 0) {
            list8 = billInfoRequest.claimVoucherTypeIds;
        }
        if ((i3 & 1024) != 0) {
            z7 = billInfoRequest.isNewPayment;
        }
        if ((i3 & 2048) != 0) {
            paymentMethodInfo2 = billInfoRequest.paymentMethod;
        }
        if ((i3 & 4096) != 0) {
            hashMap2 = billInfoRequest.orderRequestParams;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            str7 = billInfoRequest.serverIssuedParams;
        }
        if ((i3 & 16384) != 0) {
            list13 = billInfoRequest.activityIds;
        }
        if ((32768 & i3) != 0) {
            list12 = billInfoRequest.selectedAddonSKUIds;
        }
        if ((65536 & i3) != 0) {
            iArr2 = billInfoRequest.trafficSourceList;
        }
        if ((131072 & i3) != 0) {
            str12 = billInfoRequest.noticeVoucherTypeId;
        }
        if ((262144 & i3) != 0) {
            list14 = billInfoRequest.addOnProductInfos;
        }
        if ((524288 & i3) != 0) {
            num2 = billInfoRequest.oneStepOrderType;
        }
        if ((1048576 & i3) != 0) {
            bool4 = billInfoRequest.isFromFollow;
        }
        if ((2097152 & i3) != 0) {
            str11 = billInfoRequest.billInfoParams;
        }
        if ((4194304 & i3) != 0) {
            list11 = billInfoRequest.selectedVoucherMetas;
        }
        if ((8388608 & i3) != 0) {
            str10 = billInfoRequest.preLogId;
        }
        if ((16777216 & i3) != 0) {
            str9 = billInfoRequest.pageSourceInfo;
        }
        if ((33554432 & i3) != 0) {
            i5 = billInfoRequest.clientTemplate;
        }
        if ((67108864 & i3) != 0) {
            z12 = billInfoRequest.useBonusRedeem;
        }
        if ((134217728 & i3) != 0) {
            addonExtraInfo2 = billInfoRequest.extraInfo;
        }
        if ((i3 & 268435456) != 0) {
            changeInfo2 = billInfoRequest.changeInfo;
        }
        return billInfoRequest.copy(str8, i4, list10, z9, z10, z11, z8, list9, bool3, list8, z7, paymentMethodInfo2, hashMap2, str7, list13, list12, iArr2, str12, list14, num2, bool4, str11, list11, str10, str9, i5, z12, addonExtraInfo2, changeInfo2);
    }

    public final BillInfoRequest copy(String str, int i, List<OrderShopDigest> list, boolean z, boolean z2, boolean z3, boolean z4, List<String> list2, Boolean bool, List<String> list3, boolean z5, PaymentMethodInfo paymentMethodInfo, HashMap<String, Object> hashMap, String str2, List<String> list4, List<String> list5, int[] iArr, String str3, List<AddonProductInfo> list6, Integer num, Boolean bool2, String str4, List<VoucherMeta> list7, String str5, String str6, int i2, boolean z6, AddonExtraInfo addonExtraInfo, ChangeInfo changeInfo) {
        return new BillInfoRequest(str, i, list, z, z2, z3, z4, list2, bool, list3, z5, paymentMethodInfo, hashMap, str2, list4, list5, iArr, str3, list6, num, bool2, str4, list7, str5, str6, i2, z6, addonExtraInfo, changeInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfoRequest)) {
            return false;
        }
        BillInfoRequest billInfoRequest = (BillInfoRequest) obj;
        return o.LJ(this.buyerAddrId, billInfoRequest.buyerAddrId) && this.buyType == billInfoRequest.buyType && o.LJ(this.orderShop, billInfoRequest.orderShop) && this.withProductInfo == billInfoRequest.withProductInfo && this.withSellerInfo == billInfoRequest.withSellerInfo && this.withAddressInputItem == billInfoRequest.withAddressInputItem && this.withPreRiskParam == billInfoRequest.withPreRiskParam && o.LJ(this.promotionIds, billInfoRequest.promotionIds) && o.LJ(this.useUserSelection, billInfoRequest.useUserSelection) && o.LJ(this.claimVoucherTypeIds, billInfoRequest.claimVoucherTypeIds) && this.isNewPayment == billInfoRequest.isNewPayment && o.LJ(this.paymentMethod, billInfoRequest.paymentMethod) && o.LJ(this.orderRequestParams, billInfoRequest.orderRequestParams) && o.LJ(this.serverIssuedParams, billInfoRequest.serverIssuedParams) && o.LJ(this.activityIds, billInfoRequest.activityIds) && o.LJ(this.selectedAddonSKUIds, billInfoRequest.selectedAddonSKUIds) && o.LJ(this.trafficSourceList, billInfoRequest.trafficSourceList) && o.LJ(this.noticeVoucherTypeId, billInfoRequest.noticeVoucherTypeId) && o.LJ(this.addOnProductInfos, billInfoRequest.addOnProductInfos) && o.LJ(this.oneStepOrderType, billInfoRequest.oneStepOrderType) && o.LJ(this.isFromFollow, billInfoRequest.isFromFollow) && o.LJ(this.billInfoParams, billInfoRequest.billInfoParams) && o.LJ(this.selectedVoucherMetas, billInfoRequest.selectedVoucherMetas) && o.LJ(this.preLogId, billInfoRequest.preLogId) && o.LJ(this.pageSourceInfo, billInfoRequest.pageSourceInfo) && this.clientTemplate == billInfoRequest.clientTemplate && this.useBonusRedeem == billInfoRequest.useBonusRedeem && o.LJ(this.extraInfo, billInfoRequest.extraInfo) && o.LJ(this.changeInfo, billInfoRequest.changeInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.buyerAddrId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.buyType) * 31;
        List<OrderShopDigest> list = this.orderShop;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.withProductInfo;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.withSellerInfo;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.withAddressInputItem;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.withPreRiskParam;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        List<String> list2 = this.promotionIds;
        int hashCode3 = (i8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.useUserSelection;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list3 = this.claimVoucherTypeIds;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        boolean z5 = this.isNewPayment;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode5 + i9) * 31;
        PaymentMethodInfo paymentMethodInfo = this.paymentMethod;
        int hashCode6 = (i10 + (paymentMethodInfo == null ? 0 : paymentMethodInfo.hashCode())) * 31;
        HashMap<String, Object> hashMap = this.orderRequestParams;
        int hashCode7 = (hashCode6 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str2 = this.serverIssuedParams;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list4 = this.activityIds;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.selectedAddonSKUIds;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        int[] iArr = this.trafficSourceList;
        int hashCode11 = (hashCode10 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        String str3 = this.noticeVoucherTypeId;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AddonProductInfo> list6 = this.addOnProductInfos;
        int hashCode13 = (hashCode12 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Integer num = this.oneStepOrderType;
        int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isFromFollow;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.billInfoParams;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<VoucherMeta> list7 = this.selectedVoucherMetas;
        int hashCode17 = (hashCode16 + (list7 == null ? 0 : list7.hashCode())) * 31;
        String str5 = this.preLogId;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pageSourceInfo;
        int hashCode19 = (((((hashCode18 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.clientTemplate) * 31) + (this.useBonusRedeem ? 1 : 0)) * 31;
        AddonExtraInfo addonExtraInfo = this.extraInfo;
        int hashCode20 = (hashCode19 + (addonExtraInfo == null ? 0 : addonExtraInfo.hashCode())) * 31;
        ChangeInfo changeInfo = this.changeInfo;
        return hashCode20 + (changeInfo != null ? changeInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BillInfoRequest(buyerAddrId=");
        sb.append(this.buyerAddrId);
        sb.append(", buyType=");
        sb.append(this.buyType);
        sb.append(", orderShop=");
        sb.append(this.orderShop);
        sb.append(", withProductInfo=");
        sb.append(this.withProductInfo);
        sb.append(", withSellerInfo=");
        sb.append(this.withSellerInfo);
        sb.append(", withAddressInputItem=");
        sb.append(this.withAddressInputItem);
        sb.append(", withPreRiskParam=");
        sb.append(this.withPreRiskParam);
        sb.append(", promotionIds=");
        sb.append(this.promotionIds);
        sb.append(", useUserSelection=");
        sb.append(this.useUserSelection);
        sb.append(", claimVoucherTypeIds=");
        sb.append(this.claimVoucherTypeIds);
        sb.append(", isNewPayment=");
        sb.append(this.isNewPayment);
        sb.append(", paymentMethod=");
        sb.append(this.paymentMethod);
        sb.append(", orderRequestParams=");
        sb.append(this.orderRequestParams);
        sb.append(", serverIssuedParams=");
        sb.append(this.serverIssuedParams);
        sb.append(", activityIds=");
        sb.append(this.activityIds);
        sb.append(", selectedAddonSKUIds=");
        sb.append(this.selectedAddonSKUIds);
        sb.append(", trafficSourceList=");
        C0JT.LIZLLL(this.trafficSourceList, sb, ", noticeVoucherTypeId=");
        sb.append(this.noticeVoucherTypeId);
        sb.append(", addOnProductInfos=");
        sb.append(this.addOnProductInfos);
        sb.append(", oneStepOrderType=");
        sb.append(this.oneStepOrderType);
        sb.append(", isFromFollow=");
        sb.append(this.isFromFollow);
        sb.append(", billInfoParams=");
        sb.append(this.billInfoParams);
        sb.append(", selectedVoucherMetas=");
        sb.append(this.selectedVoucherMetas);
        sb.append(", preLogId=");
        sb.append(this.preLogId);
        sb.append(", pageSourceInfo=");
        sb.append(this.pageSourceInfo);
        sb.append(", clientTemplate=");
        sb.append(this.clientTemplate);
        sb.append(", useBonusRedeem=");
        sb.append(this.useBonusRedeem);
        sb.append(", extraInfo=");
        sb.append(this.extraInfo);
        sb.append(", changeInfo=");
        sb.append(this.changeInfo);
        sb.append(')');
        return sb.toString();
    }

    public final List<String> getActivityIds() {
        return this.activityIds;
    }

    public final List<AddonProductInfo> getAddOnProductInfos() {
        return this.addOnProductInfos;
    }

    public final String getBillInfoParams() {
        return this.billInfoParams;
    }

    public final String getBizType() {
        return this.bizType;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getBuyerAddrId() {
        return this.buyerAddrId;
    }

    public final ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    public final List<String> getClaimVoucherTypeIds() {
        return this.claimVoucherTypeIds;
    }

    public final int getClientTemplate() {
        return this.clientTemplate;
    }

    public final AddonExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final String getNoticeVoucherTypeId() {
        return this.noticeVoucherTypeId;
    }

    public final Integer getOneStepOrderType() {
        return this.oneStepOrderType;
    }

    public final HashMap<String, Object> getOrderRequestParams() {
        return this.orderRequestParams;
    }

    public final List<OrderShopDigest> getOrderShop() {
        return this.orderShop;
    }

    public final String getPageSourceInfo() {
        return this.pageSourceInfo;
    }

    public final PaymentMethodInfo getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPreLogId() {
        return this.preLogId;
    }

    public final List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public final List<String> getSelectedAddonSKUIds() {
        return this.selectedAddonSKUIds;
    }

    public final List<VoucherMeta> getSelectedVoucherMetas() {
        return this.selectedVoucherMetas;
    }

    public final String getServerIssuedParams() {
        return this.serverIssuedParams;
    }

    public final int[] getTrafficSourceList() {
        return this.trafficSourceList;
    }

    public final boolean getUseBonusRedeem() {
        return this.useBonusRedeem;
    }

    public final Boolean getUseUserSelection() {
        return this.useUserSelection;
    }

    public final boolean getWithAddressInputItem() {
        return this.withAddressInputItem;
    }

    public final boolean getWithPreRiskParam() {
        return this.withPreRiskParam;
    }

    public final boolean getWithProductInfo() {
        return this.withProductInfo;
    }

    public final boolean getWithSellerInfo() {
        return this.withSellerInfo;
    }

    public final Boolean isFromFollow() {
        return this.isFromFollow;
    }

    public final boolean isNewPayment() {
        return this.isNewPayment;
    }

    public final void setBizType(String str) {
        this.bizType = str;
    }

    public BillInfoRequest(String str, int i, List<OrderShopDigest> list, boolean z, boolean z2, boolean z3, boolean z4, List<String> list2, Boolean bool, List<String> list3, boolean z5, PaymentMethodInfo paymentMethodInfo, HashMap<String, Object> hashMap, String str2, List<String> list4, List<String> list5, int[] iArr, String str3, List<AddonProductInfo> list6, Integer num, Boolean bool2, String str4, List<VoucherMeta> list7, String str5, String str6, int i2, boolean z6, AddonExtraInfo addonExtraInfo, ChangeInfo changeInfo) {
        this.buyerAddrId = str;
        this.buyType = i;
        this.orderShop = list;
        this.withProductInfo = z;
        this.withSellerInfo = z2;
        this.withAddressInputItem = z3;
        this.withPreRiskParam = z4;
        this.promotionIds = list2;
        this.useUserSelection = bool;
        this.claimVoucherTypeIds = list3;
        this.isNewPayment = z5;
        this.paymentMethod = paymentMethodInfo;
        this.orderRequestParams = hashMap;
        this.serverIssuedParams = str2;
        this.activityIds = list4;
        this.selectedAddonSKUIds = list5;
        this.trafficSourceList = iArr;
        this.noticeVoucherTypeId = str3;
        this.addOnProductInfos = list6;
        this.oneStepOrderType = num;
        this.isFromFollow = bool2;
        this.billInfoParams = str4;
        this.selectedVoucherMetas = list7;
        this.preLogId = str5;
        this.pageSourceInfo = str6;
        this.clientTemplate = i2;
        this.useBonusRedeem = z6;
        this.extraInfo = addonExtraInfo;
        this.changeInfo = changeInfo;
    }

    public /* synthetic */ BillInfoRequest(String str, int i, List list, boolean z, boolean z2, boolean z3, boolean z4, List list2, Boolean bool, List list3, boolean z5, PaymentMethodInfo paymentMethodInfo, HashMap hashMap, String str2, List list4, List list5, int[] iArr, String str3, List list6, Integer num, Boolean bool2, String str4, List list7, String str5, String str6, int i2, boolean z6, AddonExtraInfo addonExtraInfo, ChangeInfo changeInfo, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? true : z2, (i3 & 32) != 0 ? true : z3, (i3 & 64) != 0 ? C28034AzO.LIZ() : z4, (i3 & 128) != 0 ? null : list2, (i3 & 256) != 0 ? null : bool, (i3 & 512) != 0 ? null : list3, (i3 & 1024) != 0 ? true : z5, (i3 & 2048) != 0 ? null : paymentMethodInfo, (i3 & 4096) != 0 ? null : hashMap, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : str2, (i3 & 16384) != 0 ? null : list4, (32768 & i3) != 0 ? null : list5, (65536 & i3) != 0 ? null : iArr, (131072 & i3) != 0 ? null : str3, (262144 & i3) != 0 ? null : list6, (524288 & i3) != 0 ? null : num, (1048576 & i3) != 0 ? Boolean.FALSE : bool2, (2097152 & i3) != 0 ? null : str4, (4194304 & i3) != 0 ? null : list7, (8388608 & i3) != 0 ? null : str5, (16777216 & i3) != 0 ? null : str6, i2, z6, (134217728 & i3) != 0 ? null : addonExtraInfo, (i3 & 268435456) == 0 ? changeInfo : null);
    }
}
