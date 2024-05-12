package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RVU;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuCommonConfig implements Parcelable {
    public static final Parcelable.Creator<SkuCommonConfig> CREATOR = new RVU();

    @InterfaceC65349Pkn("pdp_button_area_id")
    public final String bottomAreaId;

    @InterfaceC65349Pkn("is_with_default_sku")
    public final Boolean isWithDefaultSku;

    @InterfaceC65349Pkn("pdp_promotion_items")
    public final Map<String, PdpPromotion> pdpPromotionItems;

    @InterfaceC65349Pkn("sale_prop_unavailable_info_id")
    public final Integer salePropUnavailableInfoId;

    @InterfaceC65349Pkn("sku_common_texts")
    public final List<SkuCommonText> skuCommonTexts;

    @InterfaceC65349Pkn("unavailable_info_list")
    public final List<SkuUnavailableInfo> skuUnavailableInfoList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuCommonConfig)) {
            return false;
        }
        SkuCommonConfig skuCommonConfig = (SkuCommonConfig) obj;
        return o.LJ(this.skuCommonTexts, skuCommonConfig.skuCommonTexts) && o.LJ(this.pdpPromotionItems, skuCommonConfig.pdpPromotionItems) && o.LJ(this.skuUnavailableInfoList, skuCommonConfig.skuUnavailableInfoList) && o.LJ(this.salePropUnavailableInfoId, skuCommonConfig.salePropUnavailableInfoId) && o.LJ(this.isWithDefaultSku, skuCommonConfig.isWithDefaultSku) && o.LJ(this.bottomAreaId, skuCommonConfig.bottomAreaId);
    }

    public final int hashCode() {
        List<SkuCommonText> list = this.skuCommonTexts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, PdpPromotion> map = this.pdpPromotionItems;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<SkuUnavailableInfo> list2 = this.skuUnavailableInfoList;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.salePropUnavailableInfoId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isWithDefaultSku;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.bottomAreaId;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuCommonConfig(skuCommonTexts=");
        LIZ.append(this.skuCommonTexts);
        LIZ.append(", pdpPromotionItems=");
        LIZ.append(this.pdpPromotionItems);
        LIZ.append(", skuUnavailableInfoList=");
        LIZ.append(this.skuUnavailableInfoList);
        LIZ.append(", salePropUnavailableInfoId=");
        LIZ.append(this.salePropUnavailableInfoId);
        LIZ.append(", isWithDefaultSku=");
        LIZ.append(this.isWithDefaultSku);
        LIZ.append(", bottomAreaId=");
        return q.LIZIZ(LIZ, this.bottomAreaId, ')', LIZ);
    }

    public final ProductUnavailableInfo LIZ(int i) {
        List<SkuUnavailableInfo> list = this.skuUnavailableInfoList;
        if (list != null) {
            for (SkuUnavailableInfo skuUnavailableInfo : list) {
                Integer num = skuUnavailableInfo.pageStatus;
                if (num != null && num.intValue() == i) {
                    return skuUnavailableInfo.unavailableInfo;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<SkuCommonText> list = this.skuCommonTexts;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((SkuCommonText) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Map<String, PdpPromotion> map = this.pdpPromotionItems;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, PdpPromotion> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                entry.getValue().writeToParcel(out, i);
            }
        }
        List<SkuUnavailableInfo> list2 = this.skuUnavailableInfoList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((SkuUnavailableInfo) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.salePropUnavailableInfoId;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.isWithDefaultSku;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.bottomAreaId);
    }

    public SkuCommonConfig(List<SkuCommonText> list, Map<String, PdpPromotion> map, List<SkuUnavailableInfo> list2, Integer num, Boolean bool, String str) {
        this.skuCommonTexts = list;
        this.pdpPromotionItems = map;
        this.skuUnavailableInfoList = list2;
        this.salePropUnavailableInfoId = num;
        this.isWithDefaultSku = bool;
        this.bottomAreaId = str;
    }

    public /* synthetic */ SkuCommonConfig(List list, Map map, List list2, Integer num, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : num, (i & 16) == 0 ? bool : null, str);
    }
}
