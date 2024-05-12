package com.ss.android.ugc.aweme.ecommerce.ug.common.bean;

import X.C07670Rv;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EcUgProduct {

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("buy_button")
    public final EcUgProductBtn btnBuy;

    @InterfaceC65349Pkn("first_image")
    public final Image firstImage;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("platform")
    public final Integer platform;

    @InterfaceC65349Pkn("price")
    public final EcUgProductPrice price;

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("promotion_view")
    public final PromotionView promotionView;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("seller")
    public final EcUgProductSeller seller;

    @InterfaceC65349Pkn("skc_info")
    public final EcUgProductSkcInfo skcInfo;

    @InterfaceC65349Pkn("skus")
    public final List<EcUgProductSku> skus;

    @InterfaceC65349Pkn("source_from")
    public final Integer sourceFrom;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* loaded from: classes5.dex */
    public static final class EcUgProductSkcInfo {

        @InterfaceC65349Pkn("skcs")
        public final List<EcUgProductSkc> skcs;

        /* JADX WARN: Multi-variable type inference failed */
        public EcUgProductSkcInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EcUgProductSkcInfo copy$default(EcUgProductSkcInfo ecUgProductSkcInfo, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ecUgProductSkcInfo.skcs;
            }
            return ecUgProductSkcInfo.copy(list);
        }

        public final EcUgProductSkcInfo copy(List<EcUgProductSkc> list) {
            return new EcUgProductSkcInfo(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcUgProductSkcInfo) && o.LJ(this.skcs, ((EcUgProductSkcInfo) obj).skcs);
        }

        public int hashCode() {
            List<EcUgProductSkc> list = this.skcs;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        /* loaded from: classes5.dex */
        public static final class EcUgProductSkc {

            @InterfaceC65349Pkn("skc_id")
            public final String skcId;

            /* JADX WARN: Multi-variable type inference failed */
            public EcUgProductSkc() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ EcUgProductSkc copy$default(EcUgProductSkc ecUgProductSkc, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ecUgProductSkc.skcId;
                }
                return ecUgProductSkc.copy(str);
            }

            public final EcUgProductSkc copy(String str) {
                return new EcUgProductSkc(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EcUgProductSkc) && o.LJ(this.skcId, ((EcUgProductSkc) obj).skcId);
            }

            public int hashCode() {
                String str = this.skcId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EcUgProductSkc(skcId=");
                return q.LIZIZ(LIZ, this.skcId, ')', LIZ);
            }

            public final String getSkcId() {
                return this.skcId;
            }

            public EcUgProductSkc(String str) {
                this.skcId = str;
            }

            public /* synthetic */ EcUgProductSkc(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcUgProductSkcInfo(skcs=");
            return C1NE.LIZIZ(LIZ, this.skcs, ')', LIZ);
        }

        public final List<EcUgProductSkc> getSkcs() {
            return this.skcs;
        }

        public EcUgProductSkcInfo(List<EcUgProductSkc> list) {
            this.skcs = list;
        }

        public /* synthetic */ EcUgProductSkcInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcUgProduct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcUgProduct copy$default(EcUgProduct ecUgProduct, String str, Image image, String str2, EcUgProductPrice ecUgProductPrice, PromotionView promotionView, EcUgProductBtn ecUgProductBtn, String str3, List list, EcUgProductSkcInfo ecUgProductSkcInfo, EcUgProductSeller ecUgProductSeller, Integer num, Integer num2, Integer num3, Integer num4, String str4, int i, Object obj) {
        Image image2 = image;
        String str5 = str;
        EcUgProductPrice ecUgProductPrice2 = ecUgProductPrice;
        String str6 = str2;
        EcUgProductBtn ecUgProductBtn2 = ecUgProductBtn;
        PromotionView promotionView2 = promotionView;
        List list2 = list;
        String str7 = str3;
        EcUgProductSeller ecUgProductSeller2 = ecUgProductSeller;
        EcUgProductSkcInfo ecUgProductSkcInfo2 = ecUgProductSkcInfo;
        Integer num5 = num2;
        Integer num6 = num;
        Integer num7 = num4;
        Integer num8 = num3;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = ecUgProduct.productId;
        }
        if ((i & 2) != 0) {
            image2 = ecUgProduct.firstImage;
        }
        if ((i & 4) != 0) {
            str6 = ecUgProduct.title;
        }
        if ((i & 8) != 0) {
            ecUgProductPrice2 = ecUgProduct.price;
        }
        if ((i & 16) != 0) {
            promotionView2 = ecUgProduct.promotionView;
        }
        if ((i & 32) != 0) {
            ecUgProductBtn2 = ecUgProduct.btnBuy;
        }
        if ((i & 64) != 0) {
            str7 = ecUgProduct.schema;
        }
        if ((i & 128) != 0) {
            list2 = ecUgProduct.skus;
        }
        if ((i & 256) != 0) {
            ecUgProductSkcInfo2 = ecUgProduct.skcInfo;
        }
        if ((i & 512) != 0) {
            ecUgProductSeller2 = ecUgProduct.seller;
        }
        if ((i & 1024) != 0) {
            num6 = ecUgProduct.bizType;
        }
        if ((i & 2048) != 0) {
            num5 = ecUgProduct.status;
        }
        if ((i & 4096) != 0) {
            num8 = ecUgProduct.platform;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            num7 = ecUgProduct.sourceFrom;
        }
        if ((i & 16384) != 0) {
            str8 = ecUgProduct.logExtra;
        }
        return ecUgProduct.copy(str5, image2, str6, ecUgProductPrice2, promotionView2, ecUgProductBtn2, str7, list2, ecUgProductSkcInfo2, ecUgProductSeller2, num6, num5, num8, num7, str8);
    }

    public final EcUgProduct copy(String str, Image image, String str2, EcUgProductPrice ecUgProductPrice, PromotionView promotionView, EcUgProductBtn ecUgProductBtn, String str3, List<EcUgProductSku> list, EcUgProductSkcInfo ecUgProductSkcInfo, EcUgProductSeller ecUgProductSeller, Integer num, Integer num2, Integer num3, Integer num4, String str4) {
        return new EcUgProduct(str, image, str2, ecUgProductPrice, promotionView, ecUgProductBtn, str3, list, ecUgProductSkcInfo, ecUgProductSeller, num, num2, num3, num4, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcUgProduct)) {
            return false;
        }
        EcUgProduct ecUgProduct = (EcUgProduct) obj;
        return o.LJ(this.productId, ecUgProduct.productId) && o.LJ(this.firstImage, ecUgProduct.firstImage) && o.LJ(this.title, ecUgProduct.title) && o.LJ(this.price, ecUgProduct.price) && o.LJ(this.promotionView, ecUgProduct.promotionView) && o.LJ(this.btnBuy, ecUgProduct.btnBuy) && o.LJ(this.schema, ecUgProduct.schema) && o.LJ(this.skus, ecUgProduct.skus) && o.LJ(this.skcInfo, ecUgProduct.skcInfo) && o.LJ(this.seller, ecUgProduct.seller) && o.LJ(this.bizType, ecUgProduct.bizType) && o.LJ(this.status, ecUgProduct.status) && o.LJ(this.platform, ecUgProduct.platform) && o.LJ(this.sourceFrom, ecUgProduct.sourceFrom) && o.LJ(this.logExtra, ecUgProduct.logExtra);
    }

    public int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.firstImage;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EcUgProductPrice ecUgProductPrice = this.price;
        int hashCode4 = (hashCode3 + (ecUgProductPrice == null ? 0 : ecUgProductPrice.hashCode())) * 31;
        PromotionView promotionView = this.promotionView;
        int hashCode5 = (hashCode4 + (promotionView == null ? 0 : promotionView.hashCode())) * 31;
        EcUgProductBtn ecUgProductBtn = this.btnBuy;
        int hashCode6 = (hashCode5 + (ecUgProductBtn == null ? 0 : ecUgProductBtn.hashCode())) * 31;
        String str3 = this.schema;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<EcUgProductSku> list = this.skus;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        EcUgProductSkcInfo ecUgProductSkcInfo = this.skcInfo;
        int hashCode9 = (hashCode8 + (ecUgProductSkcInfo == null ? 0 : ecUgProductSkcInfo.hashCode())) * 31;
        EcUgProductSeller ecUgProductSeller = this.seller;
        int hashCode10 = (hashCode9 + (ecUgProductSeller == null ? 0 : ecUgProductSeller.hashCode())) * 31;
        Integer num = this.bizType;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.platform;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sourceFrom;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.logExtra;
        return hashCode14 + (str4 != null ? str4.hashCode() : 0);
    }

    /* loaded from: classes5.dex */
    public static final class EcUgProductBtn {

        @InterfaceC65349Pkn("log_extra")
        public final String logExtra;

        @InterfaceC65349Pkn("desc")
        public final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public EcUgProductBtn() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcUgProductBtn copy$default(EcUgProductBtn ecUgProductBtn, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecUgProductBtn.text;
            }
            if ((i & 2) != 0) {
                str2 = ecUgProductBtn.logExtra;
            }
            return ecUgProductBtn.copy(str, str2);
        }

        public final EcUgProductBtn copy(String str, String str2) {
            return new EcUgProductBtn(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcUgProductBtn)) {
                return false;
            }
            EcUgProductBtn ecUgProductBtn = (EcUgProductBtn) obj;
            return o.LJ(this.text, ecUgProductBtn.text) && o.LJ(this.logExtra, ecUgProductBtn.logExtra);
        }

        public int hashCode() {
            String str = this.text;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.logExtra;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcUgProductBtn(text=");
            LIZ.append(this.text);
            LIZ.append(", logExtra=");
            return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
        }

        public final String getLogExtra() {
            return this.logExtra;
        }

        public final String getText() {
            return this.text;
        }

        public EcUgProductBtn(String str, String str2) {
            this.text = str;
            this.logExtra = str2;
        }

        public /* synthetic */ EcUgProductBtn(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    /* loaded from: classes13.dex */
    public static final class EcUgProductPrice {

        @InterfaceC65349Pkn("currency")
        public final String currency;

        @InterfaceC65349Pkn("min_price")
        public final String minOriginalPrice;

        @InterfaceC65349Pkn("min_real_price")
        public final String minSalesPrice;

        /* JADX WARN: Multi-variable type inference failed */
        public EcUgProductPrice() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcUgProductPrice copy$default(EcUgProductPrice ecUgProductPrice, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecUgProductPrice.currency;
            }
            if ((i & 2) != 0) {
                str2 = ecUgProductPrice.minSalesPrice;
            }
            if ((i & 4) != 0) {
                str3 = ecUgProductPrice.minOriginalPrice;
            }
            return ecUgProductPrice.copy(str, str2, str3);
        }

        public final EcUgProductPrice copy(String str, String str2, String str3) {
            return new EcUgProductPrice(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcUgProductPrice)) {
                return false;
            }
            EcUgProductPrice ecUgProductPrice = (EcUgProductPrice) obj;
            return o.LJ(this.currency, ecUgProductPrice.currency) && o.LJ(this.minSalesPrice, ecUgProductPrice.minSalesPrice) && o.LJ(this.minOriginalPrice, ecUgProductPrice.minOriginalPrice);
        }

        public int hashCode() {
            String str = this.currency;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.minSalesPrice;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.minOriginalPrice;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcUgProductPrice(currency=");
            LIZ.append(this.currency);
            LIZ.append(", minSalesPrice=");
            LIZ.append(this.minSalesPrice);
            LIZ.append(", minOriginalPrice=");
            return q.LIZIZ(LIZ, this.minOriginalPrice, ')', LIZ);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getMinOriginalPrice() {
            return this.minOriginalPrice;
        }

        public final String getMinSalesPrice() {
            return this.minSalesPrice;
        }

        public EcUgProductPrice(String str, String str2, String str3) {
            this.currency = str;
            this.minSalesPrice = str2;
            this.minOriginalPrice = str3;
        }

        public /* synthetic */ EcUgProductPrice(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    /* loaded from: classes7.dex */
    public static final class EcUgProductSeller {

        @InterfaceC65349Pkn("seller_id")
        public final String sellerId;

        /* JADX WARN: Multi-variable type inference failed */
        public EcUgProductSeller() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcUgProductSeller copy$default(EcUgProductSeller ecUgProductSeller, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecUgProductSeller.sellerId;
            }
            return ecUgProductSeller.copy(str);
        }

        public final EcUgProductSeller copy(String str) {
            return new EcUgProductSeller(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcUgProductSeller) && o.LJ(this.sellerId, ((EcUgProductSeller) obj).sellerId);
        }

        public int hashCode() {
            String str = this.sellerId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcUgProductSeller(sellerId=");
            return q.LIZIZ(LIZ, this.sellerId, ')', LIZ);
        }

        public final String getSellerId() {
            return this.sellerId;
        }

        public EcUgProductSeller(String str) {
            this.sellerId = str;
        }

        public /* synthetic */ EcUgProductSeller(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class EcUgProductSku {

        @InterfaceC65349Pkn("sku_id")
        public final String skuId;

        /* JADX WARN: Multi-variable type inference failed */
        public EcUgProductSku() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EcUgProductSku copy$default(EcUgProductSku ecUgProductSku, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ecUgProductSku.skuId;
            }
            return ecUgProductSku.copy(str);
        }

        public final EcUgProductSku copy(String str) {
            return new EcUgProductSku(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcUgProductSku) && o.LJ(this.skuId, ((EcUgProductSku) obj).skuId);
        }

        public int hashCode() {
            String str = this.skuId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcUgProductSku(skuId=");
            return q.LIZIZ(LIZ, this.skuId, ')', LIZ);
        }

        public final String getSkuId() {
            return this.skuId;
        }

        public EcUgProductSku(String str) {
            this.skuId = str;
        }

        public /* synthetic */ EcUgProductSku(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EcUgProduct(productId=");
        sb.append(this.productId);
        sb.append(", firstImage=");
        sb.append(this.firstImage);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", promotionView=");
        sb.append(this.promotionView);
        sb.append(", btnBuy=");
        sb.append(this.btnBuy);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", skus=");
        sb.append(this.skus);
        sb.append(", skcInfo=");
        sb.append(this.skcInfo);
        sb.append(", seller=");
        sb.append(this.seller);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", sourceFrom=");
        sb.append(this.sourceFrom);
        sb.append(", logExtra=");
        return C07670Rv.LIZIZ(sb, this.logExtra, ')');
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final EcUgProductBtn getBtnBuy() {
        return this.btnBuy;
    }

    public final Image getFirstImage() {
        return this.firstImage;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final Integer getPlatform() {
        return this.platform;
    }

    public final EcUgProductPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final EcUgProductSeller getSeller() {
        return this.seller;
    }

    public final EcUgProductSkcInfo getSkcInfo() {
        return this.skcInfo;
    }

    public final List<EcUgProductSku> getSkus() {
        return this.skus;
    }

    public final Integer getSourceFrom() {
        return this.sourceFrom;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public EcUgProduct(String str, Image image, String str2, EcUgProductPrice ecUgProductPrice, PromotionView promotionView, EcUgProductBtn ecUgProductBtn, String str3, List<EcUgProductSku> list, EcUgProductSkcInfo ecUgProductSkcInfo, EcUgProductSeller ecUgProductSeller, Integer num, Integer num2, Integer num3, Integer num4, String str4) {
        this.productId = str;
        this.firstImage = image;
        this.title = str2;
        this.price = ecUgProductPrice;
        this.promotionView = promotionView;
        this.btnBuy = ecUgProductBtn;
        this.schema = str3;
        this.skus = list;
        this.skcInfo = ecUgProductSkcInfo;
        this.seller = ecUgProductSeller;
        this.bizType = num;
        this.status = num2;
        this.platform = num3;
        this.sourceFrom = num4;
        this.logExtra = str4;
    }

    public /* synthetic */ EcUgProduct(String str, Image image, String str2, EcUgProductPrice ecUgProductPrice, PromotionView promotionView, EcUgProductBtn ecUgProductBtn, String str3, List list, EcUgProductSkcInfo ecUgProductSkcInfo, EcUgProductSeller ecUgProductSeller, Integer num, Integer num2, Integer num3, Integer num4, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : ecUgProductPrice, (i & 16) != 0 ? null : promotionView, (i & 32) != 0 ? null : ecUgProductBtn, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : ecUgProductSkcInfo, (i & 512) != 0 ? null : ecUgProductSeller, (i & 1024) != 0 ? -1 : num, (i & 2048) != 0 ? 1 : num2, (i & 4096) != 0 ? 5 : num3, (i & FileUtils.BUFFER_SIZE) != 0 ? 3 : num4, (i & 16384) == 0 ? str4 : null);
    }
}
