package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MainOrderInfo {

    @InterfaceC65349Pkn("available_info")
    public final MainOrderAvailableInfo availableInfo;

    @InterfaceC65349Pkn("logistics")
    public final List<LogisticDTO> logistics;

    @InterfaceC65349Pkn("main_order_id")
    public final String mainOrderId;

    @InterfaceC65349Pkn("packed_skus")
    public final List<PackedSku> packedSkus;

    @InterfaceC65349Pkn("reachable")
    public final Boolean reachable;

    @InterfaceC65349Pkn("selected_logistics_service_id")
    public final String selectedLogisticsServiceId;

    @InterfaceC65349Pkn("logistics_title")
    public final String shippingTitle;

    @InterfaceC65349Pkn("unreachable_reason")
    public final String unreachableReason;

    @InterfaceC65349Pkn("warehouse_id")
    public final String warehouseId;

    @InterfaceC65349Pkn("warehouse_tag")
    public final WarehouseTag warehouseTag;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainOrderInfo)) {
            return false;
        }
        MainOrderInfo mainOrderInfo = (MainOrderInfo) obj;
        return o.LJ(this.warehouseId, mainOrderInfo.warehouseId) && o.LJ(this.packedSkus, mainOrderInfo.packedSkus) && o.LJ(this.reachable, mainOrderInfo.reachable) && o.LJ(this.unreachableReason, mainOrderInfo.unreachableReason) && o.LJ(this.logistics, mainOrderInfo.logistics) && o.LJ(this.selectedLogisticsServiceId, mainOrderInfo.selectedLogisticsServiceId) && o.LJ(this.warehouseTag, mainOrderInfo.warehouseTag) && o.LJ(this.shippingTitle, mainOrderInfo.shippingTitle) && o.LJ(this.mainOrderId, mainOrderInfo.mainOrderId) && o.LJ(this.availableInfo, mainOrderInfo.availableInfo);
    }

    public final int hashCode() {
        String str = this.warehouseId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PackedSku> list = this.packedSkus;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.reachable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.unreachableReason;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<LogisticDTO> list2 = this.logistics;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.selectedLogisticsServiceId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WarehouseTag warehouseTag = this.warehouseTag;
        int hashCode7 = (hashCode6 + (warehouseTag == null ? 0 : warehouseTag.hashCode())) * 31;
        String str4 = this.shippingTitle;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mainOrderId;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MainOrderAvailableInfo mainOrderAvailableInfo = this.availableInfo;
        return hashCode9 + (mainOrderAvailableInfo != null ? mainOrderAvailableInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainOrderInfo(warehouseId=");
        LIZ.append(this.warehouseId);
        LIZ.append(", packedSkus=");
        LIZ.append(this.packedSkus);
        LIZ.append(", reachable=");
        LIZ.append(this.reachable);
        LIZ.append(", unreachableReason=");
        LIZ.append(this.unreachableReason);
        LIZ.append(", logistics=");
        LIZ.append(this.logistics);
        LIZ.append(", selectedLogisticsServiceId=");
        LIZ.append(this.selectedLogisticsServiceId);
        LIZ.append(", warehouseTag=");
        LIZ.append(this.warehouseTag);
        LIZ.append(", shippingTitle=");
        LIZ.append(this.shippingTitle);
        LIZ.append(", mainOrderId=");
        LIZ.append(this.mainOrderId);
        LIZ.append(", availableInfo=");
        LIZ.append(this.availableInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public MainOrderInfo(String str, List<PackedSku> list, Boolean bool, String str2, List<LogisticDTO> list2, String str3, WarehouseTag warehouseTag, String str4, String str5, MainOrderAvailableInfo mainOrderAvailableInfo) {
        this.warehouseId = str;
        this.packedSkus = list;
        this.reachable = bool;
        this.unreachableReason = str2;
        this.logistics = list2;
        this.selectedLogisticsServiceId = str3;
        this.warehouseTag = warehouseTag;
        this.shippingTitle = str4;
        this.mainOrderId = str5;
        this.availableInfo = mainOrderAvailableInfo;
    }

    public /* synthetic */ MainOrderInfo(String str, List list, Boolean bool, String str2, List list2, String str3, WarehouseTag warehouseTag, String str4, String str5, MainOrderAvailableInfo mainOrderAvailableInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2, (i & 32) == 0 ? str3 : null, warehouseTag, str4, str5, mainOrderAvailableInfo);
    }
}
