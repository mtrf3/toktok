package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddItemToCartRequest {

    @InterfaceC65349Pkn("add_count")
    public final Integer addCount;

    @InterfaceC65349Pkn("add_item_source_page")
    public final Integer addItemSourcePage;

    @InterfaceC65349Pkn("buyer_addr_id")
    public final String buyerAddrId;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("claim_voucher_type_ids")
    public final List<String> claimVoucherTypeIds;

    @InterfaceC65349Pkn("entrance_info")
    public final String entranceInfo;

    @InterfaceC65349Pkn("kol_id")
    public final String kolId;

    @InterfaceC65349Pkn("logistics_service_id")
    public final String logisticsServiceID;

    @InterfaceC65349Pkn("need_recommend")
    public final Boolean needRecommend;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("sku_price")
    public final String skuPrice;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    @InterfaceC65349Pkn("source_info")
    public final String sourceInfo;

    @InterfaceC65349Pkn("warehouse_id")
    public final String warehouseId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItemToCartRequest)) {
            return false;
        }
        AddItemToCartRequest addItemToCartRequest = (AddItemToCartRequest) obj;
        return o.LJ(this.sellerId, addItemToCartRequest.sellerId) && o.LJ(this.warehouseId, addItemToCartRequest.warehouseId) && o.LJ(this.productId, addItemToCartRequest.productId) && o.LJ(this.skuId, addItemToCartRequest.skuId) && o.LJ(this.addCount, addItemToCartRequest.addCount) && o.LJ(this.chainKey, addItemToCartRequest.chainKey) && o.LJ(this.entranceInfo, addItemToCartRequest.entranceInfo) && o.LJ(this.source, addItemToCartRequest.source) && o.LJ(this.kolId, addItemToCartRequest.kolId) && o.LJ(this.claimVoucherTypeIds, addItemToCartRequest.claimVoucherTypeIds) && o.LJ(this.sourceInfo, addItemToCartRequest.sourceInfo) && o.LJ(this.buyerAddrId, addItemToCartRequest.buyerAddrId) && o.LJ(this.skuPrice, addItemToCartRequest.skuPrice) && o.LJ(this.logisticsServiceID, addItemToCartRequest.logisticsServiceID) && o.LJ(this.pageSourceInfo, addItemToCartRequest.pageSourceInfo) && o.LJ(this.addItemSourcePage, addItemToCartRequest.addItemSourcePage) && o.LJ(this.needRecommend, addItemToCartRequest.needRecommend);
    }

    public final int hashCode() {
        String str = this.sellerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.warehouseId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.skuId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.addCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.chainKey;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.entranceInfo;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.source;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.kolId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.claimVoucherTypeIds;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.sourceInfo;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.buyerAddrId;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.skuPrice;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.logisticsServiceID;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.pageSourceInfo;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num3 = this.addItemSourcePage;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.needRecommend;
        return hashCode16 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AddItemToCartRequest(sellerId=" + this.sellerId + ", warehouseId=" + this.warehouseId + ", productId=" + this.productId + ", skuId=" + this.skuId + ", addCount=" + this.addCount + ", chainKey=" + this.chainKey + ", entranceInfo=" + this.entranceInfo + ", source=" + this.source + ", kolId=" + this.kolId + ", claimVoucherTypeIds=" + this.claimVoucherTypeIds + ", sourceInfo=" + this.sourceInfo + ", buyerAddrId=" + this.buyerAddrId + ", skuPrice=" + this.skuPrice + ", logisticsServiceID=" + this.logisticsServiceID + ", pageSourceInfo=" + this.pageSourceInfo + ", addItemSourcePage=" + this.addItemSourcePage + ", needRecommend=" + this.needRecommend + ')';
    }

    public AddItemToCartRequest(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, String str7, List<String> list, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool) {
        this.sellerId = str;
        this.warehouseId = str2;
        this.productId = str3;
        this.skuId = str4;
        this.addCount = num;
        this.chainKey = str5;
        this.entranceInfo = str6;
        this.source = num2;
        this.kolId = str7;
        this.claimVoucherTypeIds = list;
        this.sourceInfo = str8;
        this.buyerAddrId = str9;
        this.skuPrice = str10;
        this.logisticsServiceID = str11;
        this.pageSourceInfo = str12;
        this.addItemSourcePage = num3;
        this.needRecommend = bool;
    }

    public /* synthetic */ AddItemToCartRequest(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, String str7, List list, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, num, str5, str6, num2, str7, (i & 512) != 0 ? null : list, str8, str9, str10, str11, str12, num3, bool);
    }
}
