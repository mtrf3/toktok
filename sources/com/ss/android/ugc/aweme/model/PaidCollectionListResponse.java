package com.ss.android.ugc.aweme.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidCollectionListResponse extends BaseResponse {

    @InterfaceC65349Pkn("collection_list")
    public final List<CollectionDetailModel> collectionList;

    @InterfaceC65349Pkn("num_published_collections")
    public final int collectionNumber;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("dashboard_url")
    public final String dashboardUrl;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("live_added_collections")
    public final List<Long> liveAddedCollectionIds;

    @InterfaceC65349Pkn("should_show_bottom_sheet")
    public final boolean shouldShowPromoteSheet;

    @InterfaceC65349Pkn("should_show_promote_tooltip")
    public final boolean shouldShowPromoteTooltip;

    public PaidCollectionListResponse() {
        this(0, 0, false, false, false, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionListResponse)) {
            return false;
        }
        PaidCollectionListResponse paidCollectionListResponse = (PaidCollectionListResponse) obj;
        return this.collectionNumber == paidCollectionListResponse.collectionNumber && this.cursor == paidCollectionListResponse.cursor && this.hasMore == paidCollectionListResponse.hasMore && this.shouldShowPromoteTooltip == paidCollectionListResponse.shouldShowPromoteTooltip && this.shouldShowPromoteSheet == paidCollectionListResponse.shouldShowPromoteSheet && o.LJ(this.collectionList, paidCollectionListResponse.collectionList) && o.LJ(this.liveAddedCollectionIds, paidCollectionListResponse.liveAddedCollectionIds) && o.LJ(this.dashboardUrl, paidCollectionListResponse.dashboardUrl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = ((this.collectionNumber * 31) + this.cursor) * 31;
        boolean z = this.hasMore;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.shouldShowPromoteTooltip;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        if (!this.shouldShowPromoteSheet) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        List<CollectionDetailModel> list = this.collectionList;
        int i8 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.liveAddedCollectionIds, (i7 + hashCode) * 31, 31);
        String str = this.dashboardUrl;
        if (str != null) {
            i8 = str.hashCode();
        }
        return LIZIZ + i8;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidCollectionListResponse(collectionNumber=");
        LIZ.append(this.collectionNumber);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", shouldShowPromoteTooltip=");
        LIZ.append(this.shouldShowPromoteTooltip);
        LIZ.append(", shouldShowPromoteSheet=");
        LIZ.append(this.shouldShowPromoteSheet);
        LIZ.append(", collectionList=");
        LIZ.append(this.collectionList);
        LIZ.append(", liveAddedCollectionIds=");
        LIZ.append(this.liveAddedCollectionIds);
        LIZ.append(", dashboardUrl=");
        return q.LIZIZ(LIZ, this.dashboardUrl, ')', LIZ);
    }

    public PaidCollectionListResponse(int i, int i2, boolean z, boolean z2, boolean z3, List<CollectionDetailModel> list, List<Long> liveAddedCollectionIds, String str) {
        o.LJIIIZ(liveAddedCollectionIds, "liveAddedCollectionIds");
        this.collectionNumber = i;
        this.cursor = i2;
        this.hasMore = z;
        this.shouldShowPromoteTooltip = z2;
        this.shouldShowPromoteSheet = z3;
        this.collectionList = list;
        this.liveAddedCollectionIds = liveAddedCollectionIds;
        this.dashboardUrl = str;
    }

    public PaidCollectionListResponse(int i, int i2, boolean z, boolean z2, boolean z3, List list, List list2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) == 0 ? z3 : false, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? C61878OQg.INSTANCE : list2, (i3 & 128) == 0 ? str : null);
    }
}
