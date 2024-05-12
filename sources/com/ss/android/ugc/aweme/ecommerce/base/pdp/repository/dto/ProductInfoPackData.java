package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductInfoPackData {

    @InterfaceC65349Pkn("cart_entry")
    public final CartEntry cartEntry;

    @InterfaceC65349Pkn("dynamic_page")
    public final DynamicPage dynamicPage;

    @InterfaceC65349Pkn("favorite")
    public final Favorite favorite;

    @InterfaceC65349Pkn("has_pay_method")
    public final Boolean hasPayMethod;

    @InterfaceC65349Pkn("has_shipping_address")
    public final Boolean hasShippingAddress;

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    @InterfaceC65349Pkn("popup")
    public final PopUp popUp;

    @InterfaceC65349Pkn("product_unavailable_info")
    public final ProductUnavailableInfo productUnavailableInfo;

    @InterfaceC65349Pkn("products")
    public final List<ProductPackStruct> productionInfoPack;

    @InterfaceC65349Pkn("schema_info")
    public final DynamicSchema schemaInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfoPackData)) {
            return false;
        }
        ProductInfoPackData productInfoPackData = (ProductInfoPackData) obj;
        return o.LJ(this.productionInfoPack, productInfoPackData.productionInfoPack) && o.LJ(this.cartEntry, productInfoPackData.cartEntry) && o.LJ(this.popUp, productInfoPackData.popUp) && o.LJ(this.hasShippingAddress, productInfoPackData.hasShippingAddress) && o.LJ(this.hasPayMethod, productInfoPackData.hasPayMethod) && o.LJ(this.schemaInfo, productInfoPackData.schemaInfo) && o.LJ(this.productUnavailableInfo, productInfoPackData.productUnavailableInfo) && o.LJ(this.dynamicPage, productInfoPackData.dynamicPage) && o.LJ(this.logId, productInfoPackData.logId) && o.LJ(this.favorite, productInfoPackData.favorite);
    }

    public final int hashCode() {
        List<ProductPackStruct> list = this.productionInfoPack;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CartEntry cartEntry = this.cartEntry;
        int hashCode2 = (hashCode + (cartEntry == null ? 0 : cartEntry.hashCode())) * 31;
        PopUp popUp = this.popUp;
        int hashCode3 = (hashCode2 + (popUp == null ? 0 : popUp.hashCode())) * 31;
        Boolean bool = this.hasShippingAddress;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasPayMethod;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DynamicSchema dynamicSchema = this.schemaInfo;
        int hashCode6 = (hashCode5 + (dynamicSchema == null ? 0 : dynamicSchema.hashCode())) * 31;
        ProductUnavailableInfo productUnavailableInfo = this.productUnavailableInfo;
        int hashCode7 = (hashCode6 + (productUnavailableInfo == null ? 0 : productUnavailableInfo.hashCode())) * 31;
        DynamicPage dynamicPage = this.dynamicPage;
        int hashCode8 = (hashCode7 + (dynamicPage == null ? 0 : dynamicPage.hashCode())) * 31;
        String str = this.logId;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Favorite favorite = this.favorite;
        return hashCode9 + (favorite != null ? favorite.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductInfoPackData(productionInfoPack=");
        LIZ.append(this.productionInfoPack);
        LIZ.append(", cartEntry=");
        LIZ.append(this.cartEntry);
        LIZ.append(", popUp=");
        LIZ.append(this.popUp);
        LIZ.append(", hasShippingAddress=");
        LIZ.append(this.hasShippingAddress);
        LIZ.append(", hasPayMethod=");
        LIZ.append(this.hasPayMethod);
        LIZ.append(", schemaInfo=");
        LIZ.append(this.schemaInfo);
        LIZ.append(", productUnavailableInfo=");
        LIZ.append(this.productUnavailableInfo);
        LIZ.append(", dynamicPage=");
        LIZ.append(this.dynamicPage);
        LIZ.append(", logId=");
        LIZ.append(this.logId);
        LIZ.append(", favorite=");
        LIZ.append(this.favorite);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ProductInfoPackData(List<ProductPackStruct> list, CartEntry cartEntry, PopUp popUp, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema, ProductUnavailableInfo productUnavailableInfo, DynamicPage dynamicPage, String str, Favorite favorite) {
        this.productionInfoPack = list;
        this.cartEntry = cartEntry;
        this.popUp = popUp;
        this.hasShippingAddress = bool;
        this.hasPayMethod = bool2;
        this.schemaInfo = dynamicSchema;
        this.productUnavailableInfo = productUnavailableInfo;
        this.dynamicPage = dynamicPage;
        this.logId = str;
        this.favorite = favorite;
    }

    public /* synthetic */ ProductInfoPackData(List list, CartEntry cartEntry, PopUp popUp, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema, ProductUnavailableInfo productUnavailableInfo, DynamicPage dynamicPage, String str, Favorite favorite, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, cartEntry, (i & 4) != 0 ? null : popUp, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : dynamicSchema, (i & 64) != 0 ? null : productUnavailableInfo, (i & 128) != 0 ? null : dynamicPage, (i & 256) != 0 ? null : str, (i & 512) == 0 ? favorite : null);
    }
}
