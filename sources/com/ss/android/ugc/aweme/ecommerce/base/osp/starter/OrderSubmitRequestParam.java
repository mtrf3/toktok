package com.ss.android.ugc.aweme.ecommerce.base.osp.starter;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderSubmitRequestParam implements Serializable {

    @InterfaceC65349Pkn("activity_ids")
    public final List<String> activityIds;

    @InterfaceC65349Pkn("buyer_addr_id")
    public final String addressId;

    @InterfaceC65349Pkn("bill_info_server_params")
    public final String billInfoParams;

    @InterfaceC65349Pkn("da_info")
    public final Map<String, String> daInfo;

    @InterfaceC65349Pkn("is_from_follow")
    public final Boolean isFromFollow;

    @InterfaceC65349Pkn("key_timestamp")
    public final Long keyTimestamp;

    @InterfaceC65349Pkn("one_step_order_type")
    public final Integer oneStepOrderType;

    @InterfaceC65349Pkn("order_shop")
    public final List<OrderShopDigest> orderShopDigest;

    @InterfaceC65349Pkn("pre_log_id")
    public final String preLogId;

    @InterfaceC65349Pkn("promotion_ids")
    public final List<String> promotionIds;

    @InterfaceC65349Pkn("selected_voucher_metas")
    public final List<VoucherMeta> selectedVoucherMetas;

    @InterfaceC65349Pkn("to_auto_claim_voucher_type_ids")
    public final List<String> toAutoClaimVoucherTypeIDs;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderSubmitRequestParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderSubmitRequestParam copy$default(OrderSubmitRequestParam orderSubmitRequestParam, String str, List list, List list2, List list3, Long l, Integer num, Boolean bool, Map map, String str2, String str3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderSubmitRequestParam.addressId;
        }
        if ((i & 2) != 0) {
            list = orderSubmitRequestParam.orderShopDigest;
        }
        if ((i & 4) != 0) {
            list2 = orderSubmitRequestParam.toAutoClaimVoucherTypeIDs;
        }
        if ((i & 8) != 0) {
            list3 = orderSubmitRequestParam.activityIds;
        }
        if ((i & 16) != 0) {
            l = orderSubmitRequestParam.keyTimestamp;
        }
        if ((i & 32) != 0) {
            num = orderSubmitRequestParam.oneStepOrderType;
        }
        if ((i & 64) != 0) {
            bool = orderSubmitRequestParam.isFromFollow;
        }
        if ((i & 128) != 0) {
            map = orderSubmitRequestParam.daInfo;
        }
        if ((i & 256) != 0) {
            str2 = orderSubmitRequestParam.preLogId;
        }
        if ((i & 512) != 0) {
            str3 = orderSubmitRequestParam.billInfoParams;
        }
        if ((i & 1024) != 0) {
            list4 = orderSubmitRequestParam.promotionIds;
        }
        if ((i & 2048) != 0) {
            list5 = orderSubmitRequestParam.selectedVoucherMetas;
        }
        return orderSubmitRequestParam.copy(str, list, list2, list3, l, num, bool, map, str2, str3, list4, list5);
    }

    public final OrderSubmitRequestParam copy(String str, List<OrderShopDigest> list, List<String> list2, List<String> list3, Long l, Integer num, Boolean bool, Map<String, String> map, String str2, String str3, List<String> list4, List<VoucherMeta> list5) {
        return new OrderSubmitRequestParam(str, list, list2, list3, l, num, bool, map, str2, str3, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitRequestParam)) {
            return false;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = (OrderSubmitRequestParam) obj;
        return o.LJ(this.addressId, orderSubmitRequestParam.addressId) && o.LJ(this.orderShopDigest, orderSubmitRequestParam.orderShopDigest) && o.LJ(this.toAutoClaimVoucherTypeIDs, orderSubmitRequestParam.toAutoClaimVoucherTypeIDs) && o.LJ(this.activityIds, orderSubmitRequestParam.activityIds) && o.LJ(this.keyTimestamp, orderSubmitRequestParam.keyTimestamp) && o.LJ(this.oneStepOrderType, orderSubmitRequestParam.oneStepOrderType) && o.LJ(this.isFromFollow, orderSubmitRequestParam.isFromFollow) && o.LJ(this.daInfo, orderSubmitRequestParam.daInfo) && o.LJ(this.preLogId, orderSubmitRequestParam.preLogId) && o.LJ(this.billInfoParams, orderSubmitRequestParam.billInfoParams) && o.LJ(this.promotionIds, orderSubmitRequestParam.promotionIds) && o.LJ(this.selectedVoucherMetas, orderSubmitRequestParam.selectedVoucherMetas);
    }

    public int hashCode() {
        String str = this.addressId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OrderShopDigest> list = this.orderShopDigest;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.toAutoClaimVoucherTypeIDs;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.activityIds;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l = this.keyTimestamp;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.oneStepOrderType;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFromFollow;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.daInfo;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.preLogId;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billInfoParams;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list4 = this.promotionIds;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<VoucherMeta> list5 = this.selectedVoucherMetas;
        return hashCode11 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        return "OrderSubmitRequestParam(addressId=" + this.addressId + ", orderShopDigest=" + this.orderShopDigest + ", toAutoClaimVoucherTypeIDs=" + this.toAutoClaimVoucherTypeIDs + ", activityIds=" + this.activityIds + ", keyTimestamp=" + this.keyTimestamp + ", oneStepOrderType=" + this.oneStepOrderType + ", isFromFollow=" + this.isFromFollow + ", daInfo=" + this.daInfo + ", preLogId=" + this.preLogId + ", billInfoParams=" + this.billInfoParams + ", promotionIds=" + this.promotionIds + ", selectedVoucherMetas=" + this.selectedVoucherMetas + ')';
    }

    public final List<String> getActivityIds() {
        return this.activityIds;
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final String getBillInfoParams() {
        return this.billInfoParams;
    }

    public final Map<String, String> getDaInfo() {
        return this.daInfo;
    }

    public final Long getKeyTimestamp() {
        return this.keyTimestamp;
    }

    public final Integer getOneStepOrderType() {
        return this.oneStepOrderType;
    }

    public final List<OrderShopDigest> getOrderShopDigest() {
        return this.orderShopDigest;
    }

    public final String getPreLogId() {
        return this.preLogId;
    }

    public final List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public final List<VoucherMeta> getSelectedVoucherMetas() {
        return this.selectedVoucherMetas;
    }

    public final List<String> getToAutoClaimVoucherTypeIDs() {
        return this.toAutoClaimVoucherTypeIDs;
    }

    public final Boolean isFromFollow() {
        return this.isFromFollow;
    }

    public OrderSubmitRequestParam(String str, List<OrderShopDigest> list, List<String> list2, List<String> list3, Long l, Integer num, Boolean bool, Map<String, String> map, String str2, String str3, List<String> list4, List<VoucherMeta> list5) {
        this.addressId = str;
        this.orderShopDigest = list;
        this.toAutoClaimVoucherTypeIDs = list2;
        this.activityIds = list3;
        this.keyTimestamp = l;
        this.oneStepOrderType = num;
        this.isFromFollow = bool;
        this.daInfo = map;
        this.preLogId = str2;
        this.billInfoParams = str3;
        this.promotionIds = list4;
        this.selectedVoucherMetas = list5;
    }

    public /* synthetic */ OrderSubmitRequestParam(String str, List list, List list2, List list3, Long l, Integer num, Boolean bool, Map map, String str2, String str3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? null : num, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? null : map, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : list4, (i & 2048) == 0 ? list5 : null);
    }
}
