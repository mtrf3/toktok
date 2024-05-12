package com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.data;

import X.C16880lQ;
import X.C47135Ieh;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommercelive.common.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PriceInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedProduct {
    public final long LIZ;

    @InterfaceC65349Pkn("bag_index")
    public final int bagIndex;

    @InterfaceC65349Pkn("cover")
    public final ECImage cover;

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("price")
    public final PriceInfo priceInfo;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("promotion_view")
    public final PromotionView promotionView;

    @InterfaceC65349Pkn("selling_view")
    public final SellingView sellingView;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedProduct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0L, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedProduct)) {
            return false;
        }
        FeedProduct feedProduct = (FeedProduct) obj;
        return o.LJ(this.productId, feedProduct.productId) && o.LJ(this.title, feedProduct.title) && o.LJ(this.cover, feedProduct.cover) && o.LJ(this.priceInfo, feedProduct.priceInfo) && o.LJ(this.promotionView, feedProduct.promotionView) && o.LJ(this.sellingView, feedProduct.sellingView) && this.bagIndex == feedProduct.bagIndex && o.LJ(this.daInfo, feedProduct.daInfo) && this.LIZ == feedProduct.LIZ;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.title, this.productId.hashCode() * 31, 31);
        ECImage eCImage = this.cover;
        int i = 0;
        if (eCImage == null) {
            hashCode = 0;
        } else {
            hashCode = eCImage.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        PriceInfo priceInfo = this.priceInfo;
        if (priceInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = priceInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        PromotionView promotionView = this.promotionView;
        if (promotionView == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = promotionView.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SellingView sellingView = this.sellingView;
        if (sellingView == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = sellingView.hashCode();
        }
        int i5 = (((i4 + hashCode4) * 31) + this.bagIndex) * 31;
        String str = this.daInfo;
        if (str != null) {
            i = str.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LIZ) + ((i5 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedProduct(productId=");
        LIZ.append(this.productId);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", priceInfo=");
        LIZ.append(this.priceInfo);
        LIZ.append(", promotionView=");
        LIZ.append(this.promotionView);
        LIZ.append(", sellingView=");
        LIZ.append(this.sellingView);
        LIZ.append(", bagIndex=");
        LIZ.append(this.bagIndex);
        LIZ.append(", daInfo=");
        LIZ.append(this.daInfo);
        LIZ.append(", createTimeLocal=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public FeedProduct(String productId, String title, ECImage eCImage, PriceInfo priceInfo, PromotionView promotionView, SellingView sellingView, int i, String str, long j) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(title, "title");
        this.productId = productId;
        this.title = title;
        this.cover = eCImage;
        this.priceInfo = priceInfo;
        this.promotionView = promotionView;
        this.sellingView = sellingView;
        this.bagIndex = i;
        this.daInfo = str;
        this.LIZ = j;
    }

    public /* synthetic */ FeedProduct(String str, String str2, ECImage eCImage, PriceInfo priceInfo, PromotionView promotionView, SellingView sellingView, int i, String str3, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : eCImage, (i2 & 8) != 0 ? null : priceInfo, (i2 & 16) != 0 ? null : promotionView, (i2 & 32) != 0 ? null : sellingView, (i2 & 64) != 0 ? 0 : i, (i2 & 128) == 0 ? str3 : null, (i2 & 256) != 0 ? SystemClock.elapsedRealtime() : j);
    }
}
