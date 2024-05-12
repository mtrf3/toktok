package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.C69698RXa;
import X.C70717RpB;
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
public final class ReviewGalleryState implements IListState<C70717RpB, C70839Rr9> {
    public final int clickedIndex;
    public final String clickedReviewId;
    public final C69698RXa curReviewItem;
    public final int cursor;
    public final boolean hasMore;
    public final int index;
    public final String kolId;
    public final String productId;
    public final String respKey;
    public final int reviewBodyContent;
    public final String selectFilterId;
    public final String sellerId;
    public final boolean showOtherInfo;
    public final Integer sortType;
    public final ListState substate;
    public final String trafficSource;
    public final ArrayList<Integer> trafficSourceList;

    public static /* synthetic */ ReviewGalleryState copy$default(ReviewGalleryState reviewGalleryState, String str, String str2, String str3, String str4, ArrayList arrayList, String str5, int i, Integer num, boolean z, int i2, int i3, int i4, String str6, String str7, boolean z2, C69698RXa c69698RXa, ListState listState, int i5, Object obj) {
        ListState listState2 = listState;
        String str8 = str;
        String str9 = str2;
        ArrayList arrayList2 = arrayList;
        String str10 = str3;
        String str11 = str4;
        Integer num2 = num;
        String str12 = str5;
        int i6 = i;
        int i7 = i3;
        boolean z3 = z;
        int i8 = i2;
        String str13 = str7;
        int i9 = i4;
        String str14 = str6;
        boolean z4 = z2;
        C69698RXa c69698RXa2 = c69698RXa;
        if ((i5 & 1) != 0) {
            str8 = reviewGalleryState.productId;
        }
        if ((i5 & 2) != 0) {
            str9 = reviewGalleryState.selectFilterId;
        }
        if ((i5 & 4) != 0) {
            str10 = reviewGalleryState.sellerId;
        }
        if ((i5 & 8) != 0) {
            str11 = reviewGalleryState.kolId;
        }
        if ((i5 & 16) != 0) {
            arrayList2 = reviewGalleryState.trafficSourceList;
        }
        if ((i5 & 32) != 0) {
            str12 = reviewGalleryState.trafficSource;
        }
        if ((i5 & 64) != 0) {
            i6 = reviewGalleryState.reviewBodyContent;
        }
        if ((i5 & 128) != 0) {
            num2 = reviewGalleryState.sortType;
        }
        if ((i5 & 256) != 0) {
            z3 = reviewGalleryState.hasMore;
        }
        if ((i5 & 512) != 0) {
            i8 = reviewGalleryState.cursor;
        }
        if ((i5 & 1024) != 0) {
            i7 = reviewGalleryState.clickedIndex;
        }
        if ((i5 & 2048) != 0) {
            i9 = reviewGalleryState.index;
        }
        if ((i5 & 4096) != 0) {
            str14 = reviewGalleryState.clickedReviewId;
        }
        if ((i5 & FileUtils.BUFFER_SIZE) != 0) {
            str13 = reviewGalleryState.respKey;
        }
        if ((i5 & 16384) != 0) {
            z4 = reviewGalleryState.showOtherInfo;
        }
        if ((32768 & i5) != 0) {
            c69698RXa2 = reviewGalleryState.curReviewItem;
        }
        if ((i5 & 65536) != 0) {
            listState2 = reviewGalleryState.getSubstate();
        }
        String str15 = str11;
        return reviewGalleryState.copy(str8, str9, str10, str15, arrayList2, str12, i6, num2, z3, i8, i7, i9, str14, str13, z4, c69698RXa2, listState2);
    }

    public final ListState component17() {
        return getSubstate();
    }

    public final ReviewGalleryState copy(String productId, String str, String sellerId, String str2, ArrayList<Integer> arrayList, String str3, int i, Integer num, boolean z, int i2, int i3, int i4, String str4, String str5, boolean z2, C69698RXa c69698RXa, ListState substate) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(substate, "substate");
        return new ReviewGalleryState(productId, str, sellerId, str2, arrayList, str3, i, num, z, i2, i3, i4, str4, str5, z2, c69698RXa, substate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewGalleryState)) {
            return false;
        }
        ReviewGalleryState reviewGalleryState = (ReviewGalleryState) obj;
        return o.LJ(this.productId, reviewGalleryState.productId) && o.LJ(this.selectFilterId, reviewGalleryState.selectFilterId) && o.LJ(this.sellerId, reviewGalleryState.sellerId) && o.LJ(this.kolId, reviewGalleryState.kolId) && o.LJ(this.trafficSourceList, reviewGalleryState.trafficSourceList) && o.LJ(this.trafficSource, reviewGalleryState.trafficSource) && this.reviewBodyContent == reviewGalleryState.reviewBodyContent && o.LJ(this.sortType, reviewGalleryState.sortType) && this.hasMore == reviewGalleryState.hasMore && this.cursor == reviewGalleryState.cursor && this.clickedIndex == reviewGalleryState.clickedIndex && this.index == reviewGalleryState.index && o.LJ(this.clickedReviewId, reviewGalleryState.clickedReviewId) && o.LJ(this.respKey, reviewGalleryState.respKey) && this.showOtherInfo == reviewGalleryState.showOtherInfo && o.LJ(this.curReviewItem, reviewGalleryState.curReviewItem) && o.LJ(getSubstate(), reviewGalleryState.getSubstate());
    }

    public String toString() {
        return "ReviewGalleryState(productId=" + this.productId + ", selectFilterId=" + this.selectFilterId + ", sellerId=" + this.sellerId + ", kolId=" + this.kolId + ", trafficSourceList=" + this.trafficSourceList + ", trafficSource=" + this.trafficSource + ", reviewBodyContent=" + this.reviewBodyContent + ", sortType=" + this.sortType + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", clickedIndex=" + this.clickedIndex + ", index=" + this.index + ", clickedReviewId=" + this.clickedReviewId + ", respKey=" + this.respKey + ", showOtherInfo=" + this.showOtherInfo + ", curReviewItem=" + this.curReviewItem + ", substate=" + getSubstate() + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = this.productId.hashCode() * 31;
        String str = this.selectFilterId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.sellerId, (hashCode8 + hashCode) * 31, 31);
        String str2 = this.kolId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        ArrayList<Integer> arrayList = this.trafficSourceList;
        if (arrayList == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = arrayList.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str3 = this.trafficSource;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (((i3 + hashCode4) * 31) + this.reviewBodyContent) * 31;
        Integer num = this.sortType;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        boolean z = this.hasMore;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (((((((i5 + i7) * 31) + this.cursor) * 31) + this.clickedIndex) * 31) + this.index) * 31;
        String str4 = this.clickedReviewId;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str5 = this.respKey;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        if (!this.showOtherInfo) {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        C69698RXa c69698RXa = this.curReviewItem;
        if (c69698RXa != null) {
            i = c69698RXa.hashCode();
        }
        return getSubstate().hashCode() + ((i11 + i) * 31);
    }

    public final int getClickedIndex() {
        return this.clickedIndex;
    }

    public final String getClickedReviewId() {
        return this.clickedReviewId;
    }

    public final C69698RXa getCurReviewItem() {
        return this.curReviewItem;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getKolId() {
        return this.kolId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getRespKey() {
        return this.respKey;
    }

    public final int getReviewBodyContent() {
        return this.reviewBodyContent;
    }

    public final String getSelectFilterId() {
        return this.selectFilterId;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final boolean getShowOtherInfo() {
        return this.showOtherInfo;
    }

    public final Integer getSortType() {
        return this.sortType;
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
        return copy$default(this, null, null, null, null, null, null, 0, null, false, 0, 0, 0, null, null, false, null, sub, 65535, null);
    }

    public ReviewGalleryState(String productId, String str, String sellerId, String str2, ArrayList<Integer> arrayList, String str3, int i, Integer num, boolean z, int i2, int i3, int i4, String str4, String str5, boolean z2, C69698RXa c69698RXa, ListState substate) {
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(substate, "substate");
        this.productId = productId;
        this.selectFilterId = str;
        this.sellerId = sellerId;
        this.kolId = str2;
        this.trafficSourceList = arrayList;
        this.trafficSource = str3;
        this.reviewBodyContent = i;
        this.sortType = num;
        this.hasMore = z;
        this.cursor = i2;
        this.clickedIndex = i3;
        this.index = i4;
        this.clickedReviewId = str4;
        this.respKey = str5;
        this.showOtherInfo = z2;
        this.curReviewItem = c69698RXa;
        this.substate = substate;
    }

    public /* synthetic */ ReviewGalleryState(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, int i, Integer num, boolean z, int i2, int i3, int i4, String str6, String str7, boolean z2, C69698RXa c69698RXa, ListState listState, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, arrayList, str5, (i5 & 64) != 0 ? 1 : i, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? false : z, (i5 & 512) != 0 ? 1 : i2, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? 0 : i4, (i5 & 4096) != 0 ? null : str6, (i5 & FileUtils.BUFFER_SIZE) != 0 ? null : str7, (i5 & 16384) != 0 ? true : z2, (i5 & 32768) == 0 ? c69698RXa : null, listState);
    }
}
