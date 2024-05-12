package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FavoriteInfo {

    @InterfaceC65349Pkn("catalog_id")
    public final String catalogId;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_type")
    public final int productType;

    @InterfaceC65349Pkn("sell_from")
    public final String sellFrom;

    @InterfaceC65349Pkn("sku_prices")
    public final List<FavoriteSkuPrice> skuPrices;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteInfo)) {
            return false;
        }
        FavoriteInfo favoriteInfo = (FavoriteInfo) obj;
        return o.LJ(this.productId, favoriteInfo.productId) && this.productType == favoriteInfo.productType && o.LJ(this.sellFrom, favoriteInfo.sellFrom) && o.LJ(this.skuPrices, favoriteInfo.skuPrices) && o.LJ(this.catalogId, favoriteInfo.catalogId);
    }

    public final int hashCode() {
        int hashCode = ((this.productId.hashCode() * 31) + this.productType) * 31;
        String str = this.sellFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<FavoriteSkuPrice> list = this.skuPrices;
        return this.catalogId.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavoriteInfo(productId=");
        LIZ.append(this.productId);
        LIZ.append(", productType=");
        LIZ.append(this.productType);
        LIZ.append(", sellFrom=");
        LIZ.append(this.sellFrom);
        LIZ.append(", skuPrices=");
        LIZ.append(this.skuPrices);
        LIZ.append(", catalogId=");
        return q.LIZIZ(LIZ, this.catalogId, ')', LIZ);
    }

    public FavoriteInfo(String productId, int i, String str, List<FavoriteSkuPrice> list, String catalogId) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(catalogId, "catalogId");
        this.productId = productId;
        this.productType = i;
        this.sellFrom = str;
        this.skuPrices = list;
        this.catalogId = catalogId;
    }

    public /* synthetic */ FavoriteInfo(String str, int i, String str2, List list, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) == 0 ? list : null, (i2 & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str3);
    }
}
