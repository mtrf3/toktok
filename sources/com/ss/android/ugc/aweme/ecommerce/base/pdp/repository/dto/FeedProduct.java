package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedProduct {

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("product_id")
    public final String id;

    @InterfaceC65349Pkn("images")
    public final List<Image> images;

    @InterfaceC65349Pkn("is_selected")
    public final boolean isSelected;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("price")
    public final Price price;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("seller")
    public final SellerInfo seller;

    @InterfaceC65349Pkn("sku_schema")
    public final String skuSchema;

    @InterfaceC65349Pkn("skus")
    public final List<SkuItem> skus;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedProduct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedProduct)) {
            return false;
        }
        FeedProduct feedProduct = (FeedProduct) obj;
        return o.LJ(this.id, feedProduct.id) && o.LJ(this.title, feedProduct.title) && o.LJ(this.images, feedProduct.images) && o.LJ(this.price, feedProduct.price) && o.LJ(this.skus, feedProduct.skus) && o.LJ(this.schema, feedProduct.schema) && o.LJ(this.bizType, feedProduct.bizType) && o.LJ(this.skuSchema, feedProduct.skuSchema) && o.LJ(this.seller, feedProduct.seller) && this.isSelected == feedProduct.isSelected && o.LJ(this.logExtra, feedProduct.logExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Price price = this.price;
        int hashCode4 = (hashCode3 + (price == null ? 0 : price.hashCode())) * 31;
        List<SkuItem> list2 = this.skus;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.schema;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.bizType;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.skuSchema;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SellerInfo sellerInfo = this.seller;
        int hashCode9 = (hashCode8 + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode9 + i) * 31;
        String str5 = this.logExtra;
        return i2 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedProduct(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", skus=");
        sb.append(this.skus);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", skuSchema=");
        sb.append(this.skuSchema);
        sb.append(", seller=");
        sb.append(this.seller);
        sb.append(", isSelected=");
        sb.append(this.isSelected);
        sb.append(", logExtra=");
        return C07670Rv.LIZIZ(sb, this.logExtra, ')');
    }

    public FeedProduct(String str, String str2, List<Image> list, Price price, List<SkuItem> list2, String str3, Integer num, String str4, SellerInfo sellerInfo, boolean z, String str5) {
        this.id = str;
        this.title = str2;
        this.images = list;
        this.price = price;
        this.skus = list2;
        this.schema = str3;
        this.bizType = num;
        this.skuSchema = str4;
        this.seller = sellerInfo;
        this.isSelected = z;
        this.logExtra = str5;
    }

    public /* synthetic */ FeedProduct(String str, String str2, List list, Price price, List list2, String str3, Integer num, String str4, SellerInfo sellerInfo, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : price, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : sellerInfo, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? str5 : null);
    }
}
