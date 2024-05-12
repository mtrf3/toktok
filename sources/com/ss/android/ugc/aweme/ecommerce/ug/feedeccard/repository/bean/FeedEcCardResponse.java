package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgVoucher;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FeedEcCardResponse extends BaseResponse {

    @InterfaceC65349Pkn("data_type")
    public final Integer dataType;

    @InterfaceC65349Pkn("product_list")
    public final List<EcUgProduct> productList;

    @InterfaceC65349Pkn("voucher_list")
    public final List<EcUgVoucher> voucherList;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedEcCardResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedEcCardResponse copy$default(FeedEcCardResponse feedEcCardResponse, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = feedEcCardResponse.dataType;
        }
        if ((i & 2) != 0) {
            list = feedEcCardResponse.productList;
        }
        if ((i & 4) != 0) {
            list2 = feedEcCardResponse.voucherList;
        }
        return feedEcCardResponse.copy(num, list, list2);
    }

    public final FeedEcCardResponse copy(Integer num, List<EcUgProduct> list, List<EcUgVoucher> list2) {
        return new FeedEcCardResponse(num, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardResponse)) {
            return false;
        }
        FeedEcCardResponse feedEcCardResponse = (FeedEcCardResponse) obj;
        return o.LJ(this.dataType, feedEcCardResponse.dataType) && o.LJ(this.productList, feedEcCardResponse.productList) && o.LJ(this.voucherList, feedEcCardResponse.voucherList);
    }

    public int hashCode() {
        Integer num = this.dataType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<EcUgProduct> list = this.productList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<EcUgVoucher> list2 = this.voucherList;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedEcCardResponse(dataType=");
        LIZ.append(this.dataType);
        LIZ.append(", productList=");
        LIZ.append(this.productList);
        LIZ.append(", voucherList=");
        return C1NE.LIZIZ(LIZ, this.voucherList, ')', LIZ);
    }

    public final Integer getDataType() {
        return this.dataType;
    }

    public final List<EcUgProduct> getProductList() {
        return this.productList;
    }

    public final List<EcUgVoucher> getVoucherList() {
        return this.voucherList;
    }

    public FeedEcCardResponse(Integer num, List<EcUgProduct> list, List<EcUgVoucher> list2) {
        this.dataType = num;
        this.productList = list;
        this.voucherList = list2;
    }

    public /* synthetic */ FeedEcCardResponse(Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
