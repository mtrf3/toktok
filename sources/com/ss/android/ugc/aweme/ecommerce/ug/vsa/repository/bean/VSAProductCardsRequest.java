package com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VSAProductCardsRequest {

    @InterfaceC65349Pkn("page_source_info")
    public final String pageSourceInfo;

    @InterfaceC65349Pkn("feed_info")
    public final List<ProductInfo> productInfoList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VSAProductCardsRequest copy$default(VSAProductCardsRequest vSAProductCardsRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vSAProductCardsRequest.productInfoList;
        }
        if ((i & 2) != 0) {
            str = vSAProductCardsRequest.pageSourceInfo;
        }
        return vSAProductCardsRequest.copy(list, str);
    }

    public final VSAProductCardsRequest copy(List<ProductInfo> productInfoList, String str) {
        o.LJIIIZ(productInfoList, "productInfoList");
        return new VSAProductCardsRequest(productInfoList, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VSAProductCardsRequest)) {
            return false;
        }
        VSAProductCardsRequest vSAProductCardsRequest = (VSAProductCardsRequest) obj;
        return o.LJ(this.productInfoList, vSAProductCardsRequest.productInfoList) && o.LJ(this.pageSourceInfo, vSAProductCardsRequest.pageSourceInfo);
    }

    public int hashCode() {
        int hashCode = this.productInfoList.hashCode() * 31;
        String str = this.pageSourceInfo;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* loaded from: classes2.dex */
    public static final class ProductInfo {

        @InterfaceC65349Pkn("feed_id")
        public final String feedId;

        @InterfaceC65349Pkn("feed_scene")
        public final int feedScene;

        @InterfaceC65349Pkn("product_id")
        public final List<String> productIdList;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductInfo copy$default(ProductInfo productInfo, String str, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = productInfo.feedId;
            }
            if ((i2 & 2) != 0) {
                i = productInfo.feedScene;
            }
            if ((i2 & 4) != 0) {
                list = productInfo.productIdList;
            }
            return productInfo.copy(str, i, list);
        }

        public final ProductInfo copy(String str, int i, List<String> productIdList) {
            o.LJIIIZ(productIdList, "productIdList");
            return new ProductInfo(str, i, productIdList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductInfo)) {
                return false;
            }
            ProductInfo productInfo = (ProductInfo) obj;
            return o.LJ(this.feedId, productInfo.feedId) && this.feedScene == productInfo.feedScene && o.LJ(this.productIdList, productInfo.productIdList);
        }

        public int hashCode() {
            String str = this.feedId;
            return this.productIdList.hashCode() + ((((str == null ? 0 : str.hashCode()) * 31) + this.feedScene) * 31);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProductInfo(feedId=");
            LIZ.append(this.feedId);
            LIZ.append(", feedScene=");
            LIZ.append(this.feedScene);
            LIZ.append(", productIdList=");
            return C1NE.LIZIZ(LIZ, this.productIdList, ')', LIZ);
        }

        public final String getFeedId() {
            return this.feedId;
        }

        public final int getFeedScene() {
            return this.feedScene;
        }

        public final List<String> getProductIdList() {
            return this.productIdList;
        }

        public ProductInfo(String str, int i, List<String> productIdList) {
            o.LJIIIZ(productIdList, "productIdList");
            this.feedId = str;
            this.feedScene = i;
            this.productIdList = productIdList;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VSAProductCardsRequest(productInfoList=");
        LIZ.append(this.productInfoList);
        LIZ.append(", pageSourceInfo=");
        return q.LIZIZ(LIZ, this.pageSourceInfo, ')', LIZ);
    }

    public final String getPageSourceInfo() {
        return this.pageSourceInfo;
    }

    public final List<ProductInfo> getProductInfoList() {
        return this.productInfoList;
    }

    public VSAProductCardsRequest(List<ProductInfo> productInfoList, String str) {
        o.LJIIIZ(productInfoList, "productInfoList");
        this.productInfoList = productInfoList;
        this.pageSourceInfo = str;
    }

    public VSAProductCardsRequest(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, str);
    }
}
