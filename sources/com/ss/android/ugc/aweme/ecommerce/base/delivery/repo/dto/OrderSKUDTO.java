package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1FJ;
import X.C27995Ayl;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderSKUDTO implements Parcelable {
    public static final Parcelable.Creator<OrderSKUDTO> CREATOR = new C27995Ayl();

    @InterfaceC65349Pkn("aggregation_count")
    public final Integer aggregationCount;

    @InterfaceC65349Pkn("aggregation_key")
    public final String aggregationKey;

    @InterfaceC65349Pkn("bundle_id")
    public final String bundleId;

    @InterfaceC65349Pkn("cart_item_id")
    public final String cartItemId;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("entrance_info")
    public final String entranceInfo;

    @InterfaceC65349Pkn("kol_id")
    public String kolId;

    @InterfaceC65349Pkn("logistics_service_id")
    public String logisticsServiceId;

    @InterfaceC65349Pkn("price_val")
    public final String priceVal;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("quantity")
    public final Integer quantity;

    @InterfaceC65349Pkn("sku_card_style")
    public final SkuCardStyleInfo skuCardStyleInfo;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    @InterfaceC65349Pkn("source_info")
    public final String sourceInfo;

    @InterfaceC65349Pkn("warehouse_id")
    public final String warehouseId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSKUDTO)) {
            return false;
        }
        OrderSKUDTO orderSKUDTO = (OrderSKUDTO) obj;
        return o.LJ(this.productId, orderSKUDTO.productId) && o.LJ(this.skuId, orderSKUDTO.skuId) && o.LJ(this.quantity, orderSKUDTO.quantity) && o.LJ(this.cartItemId, orderSKUDTO.cartItemId) && o.LJ(this.source, orderSKUDTO.source) && o.LJ(this.sourceInfo, orderSKUDTO.sourceInfo) && o.LJ(this.entranceInfo, orderSKUDTO.entranceInfo) && o.LJ(this.chainKey, orderSKUDTO.chainKey) && o.LJ(this.kolId, orderSKUDTO.kolId) && o.LJ(this.logisticsServiceId, orderSKUDTO.logisticsServiceId) && o.LJ(this.priceVal, orderSKUDTO.priceVal) && o.LJ(this.currency, orderSKUDTO.currency) && o.LJ(this.warehouseId, orderSKUDTO.warehouseId) && o.LJ(this.bundleId, orderSKUDTO.bundleId) && o.LJ(this.aggregationKey, orderSKUDTO.aggregationKey) && o.LJ(this.aggregationCount, orderSKUDTO.aggregationCount) && o.LJ(this.skuCardStyleInfo, orderSKUDTO.skuCardStyleInfo);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.cartItemId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.source;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.sourceInfo;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entranceInfo;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chainKey;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kolId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.logisticsServiceId;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.priceVal;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.currency;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.warehouseId;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.bundleId;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.aggregationKey;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num3 = this.aggregationCount;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        return hashCode16 + (skuCardStyleInfo != null ? skuCardStyleInfo.hashCode() : 0);
    }

    public final String toString() {
        return "OrderSKUDTO(productId=" + this.productId + ", skuId=" + this.skuId + ", quantity=" + this.quantity + ", cartItemId=" + this.cartItemId + ", source=" + this.source + ", sourceInfo=" + this.sourceInfo + ", entranceInfo=" + this.entranceInfo + ", chainKey=" + this.chainKey + ", kolId=" + this.kolId + ", logisticsServiceId=" + this.logisticsServiceId + ", priceVal=" + this.priceVal + ", currency=" + this.currency + ", warehouseId=" + this.warehouseId + ", bundleId=" + this.bundleId + ", aggregationKey=" + this.aggregationKey + ", aggregationCount=" + this.aggregationCount + ", skuCardStyleInfo=" + this.skuCardStyleInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
        out.writeString(this.skuId);
        Integer num = this.quantity;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.cartItemId);
        Integer num2 = this.source;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.sourceInfo);
        out.writeString(this.entranceInfo);
        out.writeString(this.chainKey);
        out.writeString(this.kolId);
        out.writeString(this.logisticsServiceId);
        out.writeString(this.priceVal);
        out.writeString(this.currency);
        out.writeString(this.warehouseId);
        out.writeString(this.bundleId);
        out.writeString(this.aggregationKey);
        Integer num3 = this.aggregationCount;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        SkuCardStyleInfo skuCardStyleInfo = this.skuCardStyleInfo;
        if (skuCardStyleInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            skuCardStyleInfo.writeToParcel(out, i);
        }
    }

    public static OrderSKUDTO LIZ(OrderSKUDTO orderSKUDTO, Integer num, String str, int i) {
        String str2;
        String str3;
        String str4;
        Integer num2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Integer num3;
        Integer num4 = num;
        String str14 = str;
        SkuCardStyleInfo skuCardStyleInfo = null;
        if ((i & 1) != 0) {
            str2 = orderSKUDTO.productId;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = orderSKUDTO.skuId;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            num4 = orderSKUDTO.quantity;
        }
        if ((i & 8) != 0) {
            str4 = orderSKUDTO.cartItemId;
        } else {
            str4 = null;
        }
        if ((i & 16) != 0) {
            num2 = orderSKUDTO.source;
        } else {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str5 = orderSKUDTO.sourceInfo;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str14 = orderSKUDTO.entranceInfo;
        }
        if ((i & 128) != 0) {
            str6 = orderSKUDTO.chainKey;
        } else {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = orderSKUDTO.kolId;
        } else {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str8 = orderSKUDTO.logisticsServiceId;
        } else {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str9 = orderSKUDTO.priceVal;
        } else {
            str9 = null;
        }
        if ((i & 2048) != 0) {
            str10 = orderSKUDTO.currency;
        } else {
            str10 = null;
        }
        if ((i & 4096) != 0) {
            str11 = orderSKUDTO.warehouseId;
        } else {
            str11 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str12 = orderSKUDTO.bundleId;
        } else {
            str12 = null;
        }
        if ((i & 16384) != 0) {
            str13 = orderSKUDTO.aggregationKey;
        } else {
            str13 = null;
        }
        if ((32768 & i) != 0) {
            num3 = orderSKUDTO.aggregationCount;
        } else {
            num3 = null;
        }
        if ((i & 65536) != 0) {
            skuCardStyleInfo = orderSKUDTO.skuCardStyleInfo;
        }
        orderSKUDTO.getClass();
        return new OrderSKUDTO(str2, str3, num4, str4, num2, str5, str14, str6, str7, str8, str9, str10, str11, str12, str13, num3, skuCardStyleInfo);
    }

    public OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num3, SkuCardStyleInfo skuCardStyleInfo) {
        this.productId = str;
        this.skuId = str2;
        this.quantity = num;
        this.cartItemId = str3;
        this.source = num2;
        this.sourceInfo = str4;
        this.entranceInfo = str5;
        this.chainKey = str6;
        this.kolId = str7;
        this.logisticsServiceId = str8;
        this.priceVal = str9;
        this.currency = str10;
        this.warehouseId = str11;
        this.bundleId = str12;
        this.aggregationKey = str13;
        this.aggregationCount = num3;
        this.skuCardStyleInfo = skuCardStyleInfo;
    }

    public /* synthetic */ OrderSKUDTO(String str, String str2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num3, SkuCardStyleInfo skuCardStyleInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, (i & 8) != 0 ? null : str3, num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, str6, (i & 256) != 0 ? null : str7, str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (32768 & i) != 0 ? null : num3, (i & 65536) == 0 ? skuCardStyleInfo : null);
    }
}
