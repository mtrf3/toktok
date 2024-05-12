package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.AbstractC70686Rog;
import X.AbstractC70730RpO;
import X.C70723RpH;
import X.C70729RpN;
import X.C70839Rr9;
import X.C79062V1e;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductReviewState implements IListState<AbstractC70686Rog, C70839Rr9> {
    public final Integer bizType;
    public final String clickedReviewId;
    public final Integer count;
    public final String countStr;
    public final String countStrV2;
    public final C70723RpH filterData;
    public final String kolId;
    public final String productId;
    public final Float rate;
    public final int reviewBodyContent;
    public final String reviewRatingsLink;
    public final String selectFilterId;
    public final String sellerId;
    public final Integer sortType;
    public final int state;
    public final AbstractC70730RpO status;
    public final ListState substate;
    public final String trafficSource;
    public final ArrayList<Integer> trafficSourceList;

    public static /* synthetic */ ProductReviewState copy$default(ProductReviewState productReviewState, int i, String str, String str2, C70723RpH c70723RpH, ListState listState, String str3, String str4, ArrayList arrayList, String str5, int i2, Integer num, String str6, Integer num2, String str7, String str8, Float f, String str9, Integer num3, AbstractC70730RpO abstractC70730RpO, int i3, Object obj) {
        ListState listState2 = listState;
        int i4 = i;
        String str10 = str;
        ArrayList arrayList2 = arrayList;
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        C70723RpH c70723RpH2 = c70723RpH;
        String str14 = str7;
        Integer num4 = num2;
        String str15 = str6;
        Integer num5 = num;
        String str16 = str5;
        int i5 = i2;
        AbstractC70730RpO abstractC70730RpO2 = abstractC70730RpO;
        Integer num6 = num3;
        String str17 = str9;
        String str18 = str8;
        Float f2 = f;
        if ((i3 & 1) != 0) {
            i4 = productReviewState.state;
        }
        if ((i3 & 2) != 0) {
            str10 = productReviewState.selectFilterId;
        }
        if ((i3 & 4) != 0) {
            str13 = productReviewState.productId;
        }
        if ((i3 & 8) != 0) {
            c70723RpH2 = productReviewState.filterData;
        }
        if ((i3 & 16) != 0) {
            listState2 = productReviewState.getSubstate();
        }
        if ((i3 & 32) != 0) {
            str12 = productReviewState.sellerId;
        }
        if ((i3 & 64) != 0) {
            str11 = productReviewState.kolId;
        }
        if ((i3 & 128) != 0) {
            arrayList2 = productReviewState.trafficSourceList;
        }
        if ((i3 & 256) != 0) {
            str16 = productReviewState.trafficSource;
        }
        if ((i3 & 512) != 0) {
            i5 = productReviewState.reviewBodyContent;
        }
        if ((i3 & 1024) != 0) {
            num5 = productReviewState.sortType;
        }
        if ((i3 & 2048) != 0) {
            str15 = productReviewState.clickedReviewId;
        }
        if ((i3 & 4096) != 0) {
            num4 = productReviewState.count;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            str14 = productReviewState.countStr;
        }
        if ((i3 & 16384) != 0) {
            str18 = productReviewState.countStrV2;
        }
        if ((32768 & i3) != 0) {
            f2 = productReviewState.rate;
        }
        if ((65536 & i3) != 0) {
            str17 = productReviewState.reviewRatingsLink;
        }
        if ((131072 & i3) != 0) {
            num6 = productReviewState.bizType;
        }
        if ((i3 & 262144) != 0) {
            abstractC70730RpO2 = productReviewState.status;
        }
        String str19 = str11;
        return productReviewState.copy(i4, str10, str13, c70723RpH2, listState2, str12, str19, arrayList2, str16, i5, num5, str15, num4, str14, str18, f2, str17, num6, abstractC70730RpO2);
    }

    public final ListState component5() {
        return getSubstate();
    }

    public final ProductReviewState copy(int i, String str, String productId, C70723RpH c70723RpH, ListState substate, String sellerId, String str2, ArrayList<Integer> arrayList, String str3, int i2, Integer num, String str4, Integer num2, String str5, String str6, Float f, String str7, Integer num3, AbstractC70730RpO status) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(substate, "substate");
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(status, "status");
        return new ProductReviewState(i, str, productId, c70723RpH, substate, sellerId, str2, arrayList, str3, i2, num, str4, num2, str5, str6, f, str7, num3, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewState)) {
            return false;
        }
        ProductReviewState productReviewState = (ProductReviewState) obj;
        return this.state == productReviewState.state && o.LJ(this.selectFilterId, productReviewState.selectFilterId) && o.LJ(this.productId, productReviewState.productId) && o.LJ(this.filterData, productReviewState.filterData) && o.LJ(getSubstate(), productReviewState.getSubstate()) && o.LJ(this.sellerId, productReviewState.sellerId) && o.LJ(this.kolId, productReviewState.kolId) && o.LJ(this.trafficSourceList, productReviewState.trafficSourceList) && o.LJ(this.trafficSource, productReviewState.trafficSource) && this.reviewBodyContent == productReviewState.reviewBodyContent && o.LJ(this.sortType, productReviewState.sortType) && o.LJ(this.clickedReviewId, productReviewState.clickedReviewId) && o.LJ(this.count, productReviewState.count) && o.LJ(this.countStr, productReviewState.countStr) && o.LJ(this.countStrV2, productReviewState.countStrV2) && o.LJ(this.rate, productReviewState.rate) && o.LJ(this.reviewRatingsLink, productReviewState.reviewRatingsLink) && o.LJ(this.bizType, productReviewState.bizType) && o.LJ(this.status, productReviewState.status);
    }

    public String toString() {
        return "ProductReviewState(state=" + this.state + ", selectFilterId=" + this.selectFilterId + ", productId=" + this.productId + ", filterData=" + this.filterData + ", substate=" + getSubstate() + ", sellerId=" + this.sellerId + ", kolId=" + this.kolId + ", trafficSourceList=" + this.trafficSourceList + ", trafficSource=" + this.trafficSource + ", reviewBodyContent=" + this.reviewBodyContent + ", sortType=" + this.sortType + ", clickedReviewId=" + this.clickedReviewId + ", count=" + this.count + ", countStr=" + this.countStr + ", countStrV2=" + this.countStrV2 + ", rate=" + this.rate + ", reviewRatingsLink=" + this.reviewRatingsLink + ", bizType=" + this.bizType + ", status=" + this.status + ')';
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int i = this.state * 31;
        String str = this.selectFilterId;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.productId, (i + hashCode) * 31, 31);
        C70723RpH c70723RpH = this.filterData;
        if (c70723RpH == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c70723RpH.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.sellerId, (getSubstate().hashCode() + ((LJ + hashCode2) * 31)) * 31, 31);
        String str2 = this.kolId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (LJ2 + hashCode3) * 31;
        ArrayList<Integer> arrayList = this.trafficSourceList;
        if (arrayList == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = arrayList.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str3 = this.trafficSource;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i5 = (((i4 + hashCode5) * 31) + this.reviewBodyContent) * 31;
        Integer num = this.sortType;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str4 = this.clickedReviewId;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Integer num2 = this.count;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        String str5 = this.countStr;
        if (str5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str5.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str6 = this.countStrV2;
        if (str6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str6.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        Float f = this.rate;
        if (f == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = f.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        String str7 = this.reviewRatingsLink;
        if (str7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str7.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        Integer num3 = this.bizType;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return this.status.hashCode() + ((i12 + i2) * 31);
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final String getClickedReviewId() {
        return this.clickedReviewId;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getCountStr() {
        return this.countStr;
    }

    public final String getCountStrV2() {
        return this.countStrV2;
    }

    public final C70723RpH getFilterData() {
        return this.filterData;
    }

    public final String getKolId() {
        return this.kolId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Float getRate() {
        return this.rate;
    }

    public final int getReviewBodyContent() {
        return this.reviewBodyContent;
    }

    public final String getReviewRatingsLink() {
        return this.reviewRatingsLink;
    }

    public final String getSelectFilterId() {
        return this.selectFilterId;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final Integer getSortType() {
        return this.sortType;
    }

    public final int getState() {
        return this.state;
    }

    public final AbstractC70730RpO getStatus() {
        return this.status;
    }

    public final String getTrafficSource() {
        return this.trafficSource;
    }

    public final ArrayList<Integer> getTrafficSourceList() {
        return this.trafficSourceList;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public NestedState<ListState> newSubstate(ListState sub) {
        o.LJIIIZ(sub, "sub");
        return copy$default(this, 0, null, null, null, sub, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 524271, null);
    }

    public ProductReviewState(int i, String str, String productId, C70723RpH c70723RpH, ListState substate, String sellerId, String str2, ArrayList<Integer> arrayList, String str3, int i2, Integer num, String str4, Integer num2, String str5, String str6, Float f, String str7, Integer num3, AbstractC70730RpO status) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(substate, "substate");
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(status, "status");
        this.state = i;
        this.selectFilterId = str;
        this.productId = productId;
        this.filterData = c70723RpH;
        this.substate = substate;
        this.sellerId = sellerId;
        this.kolId = str2;
        this.trafficSourceList = arrayList;
        this.trafficSource = str3;
        this.reviewBodyContent = i2;
        this.sortType = num;
        this.clickedReviewId = str4;
        this.count = num2;
        this.countStr = str5;
        this.countStrV2 = str6;
        this.rate = f;
        this.reviewRatingsLink = str7;
        this.bizType = num3;
        this.status = status;
    }

    public /* synthetic */ ProductReviewState(int i, String str, String str2, C70723RpH c70723RpH, ListState listState, String str3, String str4, ArrayList arrayList, String str5, int i2, Integer num, String str6, Integer num2, String str7, String str8, Float f, String str9, Integer num3, AbstractC70730RpO abstractC70730RpO, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, c70723RpH, listState, str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : arrayList, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? 1 : i2, (i3 & 1024) != 0 ? null : num, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : num2, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : str7, (i3 & 16384) != 0 ? null : str8, (32768 & i3) != 0 ? null : f, (65536 & i3) != 0 ? null : str9, (131072 & i3) == 0 ? num3 : null, (i3 & 262144) != 0 ? C70729RpN.LIZ : abstractC70730RpO);
    }
}
