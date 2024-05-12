package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddonOrder {

    @InterfaceC65349Pkn("notice")
    public final AddonNotice addOnNotice;

    @InterfaceC65349Pkn("addon_title")
    public final String addonTitle;

    @InterfaceC65349Pkn("filtered_sku_list")
    public final List<String> filterSku;

    @InterfaceC65349Pkn("is_selected")
    public final Map<String, Boolean> isSelected;

    @InterfaceC65349Pkn("packed_skus")
    public final List<PackedSku> packedSkus;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddonOrder copy$default(AddonOrder addonOrder, List list, Map map, String str, Integer num, AddonNotice addonNotice, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addonOrder.packedSkus;
        }
        if ((i & 2) != 0) {
            map = addonOrder.isSelected;
        }
        if ((i & 4) != 0) {
            str = addonOrder.addonTitle;
        }
        if ((i & 8) != 0) {
            num = addonOrder.type;
        }
        if ((i & 16) != 0) {
            addonNotice = addonOrder.addOnNotice;
        }
        if ((i & 32) != 0) {
            list2 = addonOrder.filterSku;
        }
        return addonOrder.copy(list, map, str, num, addonNotice, list2);
    }

    public final AddonOrder copy(List<PackedSku> list, Map<String, Boolean> map, String str, Integer num, AddonNotice addonNotice, List<String> list2) {
        return new AddonOrder(list, map, str, num, addonNotice, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonOrder)) {
            return false;
        }
        AddonOrder addonOrder = (AddonOrder) obj;
        return o.LJ(this.packedSkus, addonOrder.packedSkus) && o.LJ(this.isSelected, addonOrder.isSelected) && o.LJ(this.addonTitle, addonOrder.addonTitle) && o.LJ(this.type, addonOrder.type) && o.LJ(this.addOnNotice, addonOrder.addOnNotice) && o.LJ(this.filterSku, addonOrder.filterSku);
    }

    public int hashCode() {
        List<PackedSku> list = this.packedSkus;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, Boolean> map = this.isSelected;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.addonTitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        AddonNotice addonNotice = this.addOnNotice;
        int hashCode5 = (hashCode4 + (addonNotice == null ? 0 : addonNotice.hashCode())) * 31;
        List<String> list2 = this.filterSku;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean isAddonOrderSelected() {
        boolean z = false;
        if (this.isSelected != null && (!r0.isEmpty())) {
            Iterator<Map.Entry<String, Boolean>> it = this.isSelected.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().booleanValue()) {
                    z = true;
                }
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonOrder(packedSkus=");
        LIZ.append(this.packedSkus);
        LIZ.append(", isSelected=");
        LIZ.append(this.isSelected);
        LIZ.append(", addonTitle=");
        LIZ.append(this.addonTitle);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", addOnNotice=");
        LIZ.append(this.addOnNotice);
        LIZ.append(", filterSku=");
        return C1NE.LIZIZ(LIZ, this.filterSku, ')', LIZ);
    }

    public final AddonNotice getAddOnNotice() {
        return this.addOnNotice;
    }

    public final String getAddonTitle() {
        return this.addonTitle;
    }

    public final List<String> getFilterSku() {
        return this.filterSku;
    }

    public final List<PackedSku> getPackedSkus() {
        return this.packedSkus;
    }

    public final Integer getType() {
        return this.type;
    }

    public final Map<String, Boolean> isSelected() {
        return this.isSelected;
    }

    public AddonOrder(List<PackedSku> list, Map<String, Boolean> map, String str, Integer num, AddonNotice addonNotice, List<String> list2) {
        this.packedSkus = list;
        this.isSelected = map;
        this.addonTitle = str;
        this.type = num;
        this.addOnNotice = addonNotice;
        this.filterSku = list2;
    }
}
