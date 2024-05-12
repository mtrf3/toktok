package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RefreshProductSKUInfoRequest {

    @InterfaceC65349Pkn("experiment")
    public final Map<String, Object> experiment;

    @InterfaceC65349Pkn("kol_id")
    public final String kolId;

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("pdp_to_logistic_list_info")
    public final String pdpToLogisticListInfo;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("refresh_module_option")
    public final RefreshModuleOption refreshModuleOption;

    @InterfaceC65349Pkn("selected_address_id")
    public final String selectedAddressId;

    @InterfaceC65349Pkn("select_sku_quantity")
    public final Map<String, Integer> selectedSkuQuantity;

    @InterfaceC65349Pkn("ship_to_addr")
    public final List<District> shipToAddr;

    @InterfaceC65349Pkn("sku_ids")
    public final List<String> skuIds;

    @InterfaceC65349Pkn("sku_warehouse_map")
    public final Map<String, String> warehouseIdMap;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshProductSKUInfoRequest)) {
            return false;
        }
        RefreshProductSKUInfoRequest refreshProductSKUInfoRequest = (RefreshProductSKUInfoRequest) obj;
        return o.LJ(this.productId, refreshProductSKUInfoRequest.productId) && o.LJ(this.skuIds, refreshProductSKUInfoRequest.skuIds) && o.LJ(this.warehouseIdMap, refreshProductSKUInfoRequest.warehouseIdMap) && o.LJ(this.selectedAddressId, refreshProductSKUInfoRequest.selectedAddressId) && o.LJ(this.pageSourceInfo, refreshProductSKUInfoRequest.pageSourceInfo) && o.LJ(this.selectedSkuQuantity, refreshProductSKUInfoRequest.selectedSkuQuantity) && o.LJ(this.kolId, refreshProductSKUInfoRequest.kolId) && o.LJ(this.pdpToLogisticListInfo, refreshProductSKUInfoRequest.pdpToLogisticListInfo) && o.LJ(this.shipToAddr, refreshProductSKUInfoRequest.shipToAddr) && o.LJ(this.refreshModuleOption, refreshProductSKUInfoRequest.refreshModuleOption) && o.LJ(this.experiment, refreshProductSKUInfoRequest.experiment);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.skuIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.warehouseIdMap;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.selectedAddressId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pageSourceInfo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Integer> map2 = this.selectedSkuQuantity;
        int hashCode6 = (hashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str4 = this.kolId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pdpToLogisticListInfo;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<District> list2 = this.shipToAddr;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        RefreshModuleOption refreshModuleOption = this.refreshModuleOption;
        int hashCode10 = (hashCode9 + (refreshModuleOption == null ? 0 : refreshModuleOption.hashCode())) * 31;
        Map<String, Object> map3 = this.experiment;
        return hashCode10 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        return "RefreshProductSKUInfoRequest(productId=" + this.productId + ", skuIds=" + this.skuIds + ", warehouseIdMap=" + this.warehouseIdMap + ", selectedAddressId=" + this.selectedAddressId + ", pageSourceInfo=" + this.pageSourceInfo + ", selectedSkuQuantity=" + this.selectedSkuQuantity + ", kolId=" + this.kolId + ", pdpToLogisticListInfo=" + this.pdpToLogisticListInfo + ", shipToAddr=" + this.shipToAddr + ", refreshModuleOption=" + this.refreshModuleOption + ", experiment=" + this.experiment + ')';
    }

    public RefreshProductSKUInfoRequest(String str, List<String> list, Map<String, String> map, String str2, String str3, Map<String, Integer> map2, String str4, String str5, List<District> list2, RefreshModuleOption refreshModuleOption, Map<String, ? extends Object> map3) {
        this.productId = str;
        this.skuIds = list;
        this.warehouseIdMap = map;
        this.selectedAddressId = str2;
        this.pageSourceInfo = str3;
        this.selectedSkuQuantity = map2;
        this.kolId = str4;
        this.pdpToLogisticListInfo = str5;
        this.shipToAddr = list2;
        this.refreshModuleOption = refreshModuleOption;
        this.experiment = map3;
    }

    public /* synthetic */ RefreshProductSKUInfoRequest(String str, List list, Map map, String str2, String str3, Map map2, String str4, String str5, List list2, RefreshModuleOption refreshModuleOption, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, map, str2, str3, map2, str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : refreshModuleOption, (i & 1024) == 0 ? map3 : null);
    }
}
