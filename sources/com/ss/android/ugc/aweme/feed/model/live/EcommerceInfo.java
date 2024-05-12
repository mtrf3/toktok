package com.ss.android.ugc.aweme.feed.model.live;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcommerceInfo implements Serializable {

    @InterfaceC65349Pkn("is_ecom")
    public Boolean isEcom;

    @InterfaceC65349Pkn("product_cnt")
    public Integer productCnt;

    @InterfaceC65349Pkn("spu_list")
    public List<String> spuList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcommerceInfo copy$default(EcommerceInfo ecommerceInfo, Boolean bool, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = ecommerceInfo.isEcom;
        }
        if ((i & 2) != 0) {
            num = ecommerceInfo.productCnt;
        }
        if ((i & 4) != 0) {
            list = ecommerceInfo.spuList;
        }
        return ecommerceInfo.copy(bool, num, list);
    }

    public final EcommerceInfo copy(Boolean bool, Integer num, List<String> list) {
        return new EcommerceInfo(bool, num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceInfo)) {
            return false;
        }
        EcommerceInfo ecommerceInfo = (EcommerceInfo) obj;
        return o.LJ(this.isEcom, ecommerceInfo.isEcom) && o.LJ(this.productCnt, ecommerceInfo.productCnt) && o.LJ(this.spuList, ecommerceInfo.spuList);
    }

    public int hashCode() {
        Boolean bool = this.isEcom;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.productCnt;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.spuList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcommerceInfo(isEcom=");
        LIZ.append(this.isEcom);
        LIZ.append(", productCnt=");
        LIZ.append(this.productCnt);
        LIZ.append(", spuList=");
        return C1NE.LIZIZ(LIZ, this.spuList, ')', LIZ);
    }

    public final Integer getProductCnt() {
        return this.productCnt;
    }

    public final List<String> getSpuList() {
        return this.spuList;
    }

    public final Boolean isEcom() {
        return this.isEcom;
    }

    public final void setEcom(Boolean bool) {
        this.isEcom = bool;
    }

    public final void setProductCnt(Integer num) {
        this.productCnt = num;
    }

    public final void setSpuList(List<String> list) {
        this.spuList = list;
    }

    public EcommerceInfo(Boolean bool, Integer num, List<String> list) {
        this.isEcom = bool;
        this.productCnt = num;
        this.spuList = list;
    }
}
