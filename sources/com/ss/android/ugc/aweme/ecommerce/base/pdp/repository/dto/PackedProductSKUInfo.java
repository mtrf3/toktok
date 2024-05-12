package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PackedProductSKUInfo {

    @InterfaceC65349Pkn("pdp_payment_module")
    public final PdpPaymentModule pdpPaymentModule;

    @InterfaceC65349Pkn("pdp_shipping_module")
    public final PDPShippingModule pdpShippingModule;

    @InterfaceC65349Pkn("shipping")
    public final PdpShipping shipping;

    @InterfaceC65349Pkn("sku")
    public final SkuItem sku;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedProductSKUInfo)) {
            return false;
        }
        PackedProductSKUInfo packedProductSKUInfo = (PackedProductSKUInfo) obj;
        return o.LJ(this.sku, packedProductSKUInfo.sku) && o.LJ(this.shipping, packedProductSKUInfo.shipping) && o.LJ(this.pdpShippingModule, packedProductSKUInfo.pdpShippingModule) && o.LJ(this.pdpPaymentModule, packedProductSKUInfo.pdpPaymentModule);
    }

    public final int hashCode() {
        SkuItem skuItem = this.sku;
        int hashCode = (skuItem == null ? 0 : skuItem.hashCode()) * 31;
        PdpShipping pdpShipping = this.shipping;
        int hashCode2 = (hashCode + (pdpShipping == null ? 0 : pdpShipping.hashCode())) * 31;
        PDPShippingModule pDPShippingModule = this.pdpShippingModule;
        int hashCode3 = (hashCode2 + (pDPShippingModule == null ? 0 : pDPShippingModule.hashCode())) * 31;
        PdpPaymentModule pdpPaymentModule = this.pdpPaymentModule;
        return hashCode3 + (pdpPaymentModule != null ? pdpPaymentModule.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PackedProductSKUInfo(sku=");
        LIZ.append(this.sku);
        LIZ.append(", shipping=");
        LIZ.append(this.shipping);
        LIZ.append(", pdpShippingModule=");
        LIZ.append(this.pdpShippingModule);
        LIZ.append(", pdpPaymentModule=");
        LIZ.append(this.pdpPaymentModule);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PackedProductSKUInfo(SkuItem skuItem, PdpShipping pdpShipping, PDPShippingModule pDPShippingModule, PdpPaymentModule pdpPaymentModule) {
        this.sku = skuItem;
        this.shipping = pdpShipping;
        this.pdpShippingModule = pDPShippingModule;
        this.pdpPaymentModule = pdpPaymentModule;
    }

    public /* synthetic */ PackedProductSKUInfo(SkuItem skuItem, PdpShipping pdpShipping, PDPShippingModule pDPShippingModule, PdpPaymentModule pdpPaymentModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(skuItem, pdpShipping, (i & 4) != 0 ? null : pDPShippingModule, (i & 8) != 0 ? null : pdpPaymentModule);
    }
}
