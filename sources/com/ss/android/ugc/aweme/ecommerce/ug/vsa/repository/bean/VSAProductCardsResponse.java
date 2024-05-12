package com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean;

import X.C1NE;
import X.EnumC46532IOa;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.b0;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class VSAProductCardsResponse extends BaseResponse {

    @InterfaceC65349Pkn("feed_product_list")
    public final List<ProductCard> productCardList;

    /* JADX WARN: Multi-variable type inference failed */
    public VSAProductCardsResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VSAProductCardsResponse copy$default(VSAProductCardsResponse vSAProductCardsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vSAProductCardsResponse.productCardList;
        }
        return vSAProductCardsResponse.copy(list);
    }

    public final VSAProductCardsResponse copy(List<ProductCard> list) {
        return new VSAProductCardsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VSAProductCardsResponse) && o.LJ(this.productCardList, ((VSAProductCardsResponse) obj).productCardList);
    }

    public int hashCode() {
        List<ProductCard> list = this.productCardList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* loaded from: classes11.dex */
    public static final class PriceDetail {

        @InterfaceC65349Pkn("currency")
        public final String currency;

        @InterfaceC65349Pkn("min_origin_price_value")
        public final String minOriginPriceValue;

        @InterfaceC65349Pkn("min_real_price_value")
        public final String minRealPriceValue;

        /* JADX WARN: Multi-variable type inference failed */
        public PriceDetail() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PriceDetail copy$default(PriceDetail priceDetail, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = priceDetail.minOriginPriceValue;
            }
            if ((i & 2) != 0) {
                str2 = priceDetail.minRealPriceValue;
            }
            if ((i & 4) != 0) {
                str3 = priceDetail.currency;
            }
            return priceDetail.copy(str, str2, str3);
        }

        public final PriceDetail copy(String str, String str2, String str3) {
            return new PriceDetail(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceDetail)) {
                return false;
            }
            PriceDetail priceDetail = (PriceDetail) obj;
            return o.LJ(this.minOriginPriceValue, priceDetail.minOriginPriceValue) && o.LJ(this.minRealPriceValue, priceDetail.minRealPriceValue) && o.LJ(this.currency, priceDetail.currency);
        }

        public int hashCode() {
            String str = this.minOriginPriceValue;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.minRealPriceValue;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currency;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PriceDetail(minOriginPriceValue=");
            LIZ.append(this.minOriginPriceValue);
            LIZ.append(", minRealPriceValue=");
            LIZ.append(this.minRealPriceValue);
            LIZ.append(", currency=");
            return q.LIZIZ(LIZ, this.currency, ')', LIZ);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getMinOriginPriceValue() {
            return this.minOriginPriceValue;
        }

        public final String getMinRealPriceValue() {
            return this.minRealPriceValue;
        }

        public PriceDetail(String str, String str2, String str3) {
            this.minOriginPriceValue = str;
            this.minRealPriceValue = str2;
            this.currency = str3;
        }

        public /* synthetic */ PriceDetail(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }

    /* loaded from: classes11.dex */
    public static final class ProductCard {

        @InterfaceC65349Pkn("button_text")
        public final String btnText;

        @InterfaceC65349Pkn("disappear_delay_time")
        public final Integer delayCloseTime;

        @InterfaceC65349Pkn("show_delay_time")
        public final Integer delayShowTime;

        @InterfaceC65349Pkn("feed_id")
        public final String feedId;

        @InterfaceC65349Pkn("feed_scene")
        public final Integer feedScene;

        @InterfaceC65349Pkn("max_show_products_num")
        public final Integer maxShowNum;

        @InterfaceC65349Pkn("product_detail")
        public final List<ProductDetail> productDetailList;

        /* JADX WARN: Multi-variable type inference failed */
        public ProductCard() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductCard copy$default(ProductCard productCard, String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productCard.feedId;
            }
            if ((i & 2) != 0) {
                num = productCard.feedScene;
            }
            if ((i & 4) != 0) {
                str2 = productCard.btnText;
            }
            if ((i & 8) != 0) {
                num2 = productCard.delayShowTime;
            }
            if ((i & 16) != 0) {
                num3 = productCard.delayCloseTime;
            }
            if ((i & 32) != 0) {
                num4 = productCard.maxShowNum;
            }
            if ((i & 64) != 0) {
                list = productCard.productDetailList;
            }
            return productCard.copy(str, num, str2, num2, num3, num4, list);
        }

        public final ProductCard copy(String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, List<ProductDetail> list) {
            return new ProductCard(str, num, str2, num2, num3, num4, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCard)) {
                return false;
            }
            ProductCard productCard = (ProductCard) obj;
            return o.LJ(this.feedId, productCard.feedId) && o.LJ(this.feedScene, productCard.feedScene) && o.LJ(this.btnText, productCard.btnText) && o.LJ(this.delayShowTime, productCard.delayShowTime) && o.LJ(this.delayCloseTime, productCard.delayCloseTime) && o.LJ(this.maxShowNum, productCard.maxShowNum) && o.LJ(this.productDetailList, productCard.productDetailList);
        }

        public int hashCode() {
            String str = this.feedId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.feedScene;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.btnText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.delayShowTime;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.delayCloseTime;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.maxShowNum;
            int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            List<ProductDetail> list = this.productDetailList;
            return hashCode6 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProductCard(feedId=");
            LIZ.append(this.feedId);
            LIZ.append(", feedScene=");
            LIZ.append(this.feedScene);
            LIZ.append(", btnText=");
            LIZ.append(this.btnText);
            LIZ.append(", delayShowTime=");
            LIZ.append(this.delayShowTime);
            LIZ.append(", delayCloseTime=");
            LIZ.append(this.delayCloseTime);
            LIZ.append(", maxShowNum=");
            LIZ.append(this.maxShowNum);
            LIZ.append(", productDetailList=");
            return C1NE.LIZIZ(LIZ, this.productDetailList, ')', LIZ);
        }

        public final String getBtnText() {
            return this.btnText;
        }

        public final Integer getDelayCloseTime() {
            return this.delayCloseTime;
        }

        public final Integer getDelayShowTime() {
            return this.delayShowTime;
        }

        public final String getFeedId() {
            return this.feedId;
        }

        public final Integer getFeedScene() {
            return this.feedScene;
        }

        public final Integer getMaxShowNum() {
            return this.maxShowNum;
        }

        public final List<ProductDetail> getProductDetailList() {
            return this.productDetailList;
        }

        public ProductCard(String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, List<ProductDetail> list) {
            this.feedId = str;
            this.feedScene = num;
            this.btnText = str2;
            this.delayShowTime = num2;
            this.delayCloseTime = num3;
            this.maxShowNum = num4;
            this.productDetailList = list;
        }

        public /* synthetic */ ProductCard(String str, Integer num, String str2, Integer num2, Integer num3, Integer num4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Integer.valueOf(EnumC46532IOa.UNKNOWN.getValue()) : num, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? 0 : num2, (i & 16) != 0 ? 0 : num3, (i & 32) != 0 ? 1 : num4, (i & 64) != 0 ? null : list);
        }
    }

    /* loaded from: classes11.dex */
    public static final class ProductDetail {
        public int bizType;

        @InterfaceC65349Pkn("image")
        public final Image image;

        @InterfaceC65349Pkn("price")
        public final PriceDetail price;

        @InterfaceC65349Pkn("product_id")
        public final String productId;

        @InterfaceC65349Pkn("promotion_view")
        public final PromotionView promotion;

        @InterfaceC65349Pkn("status")
        public final Integer status;

        @InterfaceC65349Pkn("title")
        public final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public ProductDetail() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 127, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ProductDetail copy$default(ProductDetail productDetail, String str, String str2, Image image, PriceDetail priceDetail, PromotionView promotionView, Integer num, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = productDetail.productId;
            }
            if ((i2 & 2) != 0) {
                str2 = productDetail.title;
            }
            if ((i2 & 4) != 0) {
                image = productDetail.image;
            }
            if ((i2 & 8) != 0) {
                priceDetail = productDetail.price;
            }
            if ((i2 & 16) != 0) {
                promotionView = productDetail.promotion;
            }
            if ((i2 & 32) != 0) {
                num = productDetail.status;
            }
            if ((i2 & 64) != 0) {
                i = productDetail.bizType;
            }
            return productDetail.copy(str, str2, image, priceDetail, promotionView, num, i);
        }

        public final ProductDetail copy(String str, String str2, Image image, PriceDetail priceDetail, PromotionView promotionView, Integer num, int i) {
            return new ProductDetail(str, str2, image, priceDetail, promotionView, num, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetail)) {
                return false;
            }
            ProductDetail productDetail = (ProductDetail) obj;
            return o.LJ(this.productId, productDetail.productId) && o.LJ(this.title, productDetail.title) && o.LJ(this.image, productDetail.image) && o.LJ(this.price, productDetail.price) && o.LJ(this.promotion, productDetail.promotion) && o.LJ(this.status, productDetail.status) && this.bizType == productDetail.bizType;
        }

        public int hashCode() {
            String str = this.productId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.image;
            int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            PriceDetail priceDetail = this.price;
            int hashCode4 = (hashCode3 + (priceDetail == null ? 0 : priceDetail.hashCode())) * 31;
            PromotionView promotionView = this.promotion;
            int hashCode5 = (hashCode4 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
            Integer num = this.status;
            return ((hashCode5 + (num != null ? num.hashCode() : 0)) * 31) + this.bizType;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProductDetail(productId=");
            LIZ.append(this.productId);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", image=");
            LIZ.append(this.image);
            LIZ.append(", price=");
            LIZ.append(this.price);
            LIZ.append(", promotion=");
            LIZ.append(this.promotion);
            LIZ.append(", status=");
            LIZ.append(this.status);
            LIZ.append(", bizType=");
            return b0.LIZJ(LIZ, this.bizType, ')', LIZ);
        }

        public final int getBizType() {
            return this.bizType;
        }

        public final Image getImage() {
            return this.image;
        }

        public final PriceDetail getPrice() {
            return this.price;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final PromotionView getPromotion() {
            return this.promotion;
        }

        public final Integer getStatus() {
            return this.status;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setBizType(int i) {
            this.bizType = i;
        }

        public ProductDetail(String str, String str2, Image image, PriceDetail priceDetail, PromotionView promotionView, Integer num, int i) {
            this.productId = str;
            this.title = str2;
            this.image = image;
            this.price = priceDetail;
            this.promotion = promotionView;
            this.status = num;
            this.bizType = i;
        }

        public /* synthetic */ ProductDetail(String str, String str2, Image image, PriceDetail priceDetail, PromotionView promotionView, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? null : image, (i2 & 8) != 0 ? null : priceDetail, (i2 & 16) == 0 ? promotionView : null, (i2 & 32) != 0 ? 0 : num, (i2 & 64) != 0 ? 0 : i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VSAProductCardsResponse(productCardList=");
        return C1NE.LIZIZ(LIZ, this.productCardList, ')', LIZ);
    }

    public final List<ProductCard> getProductCardList() {
        return this.productCardList;
    }

    public VSAProductCardsResponse(List<ProductCard> list) {
        this.productCardList = list;
    }

    public /* synthetic */ VSAProductCardsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
