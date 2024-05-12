package com.ss.android.ugc.aweme.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidSeriesLiveListResponse extends BaseResponse {

    @InterfaceC65349Pkn("creator_status")
    public final PaidContentCreatorStatus creatorStatus;

    @InterfaceC65349Pkn("introduce_id")
    public final Long introduceId;

    @InterfaceC65349Pkn("live_collection_list")
    public final List<CollectionDetailModel> paidCollectionDetail;

    public PaidSeriesLiveListResponse() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidSeriesLiveListResponse)) {
            return false;
        }
        PaidSeriesLiveListResponse paidSeriesLiveListResponse = (PaidSeriesLiveListResponse) obj;
        return this.creatorStatus == paidSeriesLiveListResponse.creatorStatus && o.LJ(this.paidCollectionDetail, paidSeriesLiveListResponse.paidCollectionDetail) && o.LJ(this.introduceId, paidSeriesLiveListResponse.introduceId);
    }

    public final int hashCode() {
        int hashCode;
        PaidContentCreatorStatus paidContentCreatorStatus = this.creatorStatus;
        int i = 0;
        if (paidContentCreatorStatus == null) {
            hashCode = 0;
        } else {
            hashCode = paidContentCreatorStatus.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.paidCollectionDetail, hashCode * 31, 31);
        Long l = this.introduceId;
        if (l != null) {
            i = l.hashCode();
        }
        return LIZIZ + i;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidSeriesLiveListResponse(creatorStatus=");
        LIZ.append(this.creatorStatus);
        LIZ.append(", paidCollectionDetail=");
        LIZ.append(this.paidCollectionDetail);
        LIZ.append(", introduceId=");
        return JBR.LJ(LIZ, this.introduceId, ')', LIZ);
    }

    public PaidSeriesLiveListResponse(PaidContentCreatorStatus paidContentCreatorStatus, List<CollectionDetailModel> paidCollectionDetail, Long l) {
        o.LJIIIZ(paidCollectionDetail, "paidCollectionDetail");
        this.creatorStatus = paidContentCreatorStatus;
        this.paidCollectionDetail = paidCollectionDetail;
        this.introduceId = l;
    }

    public PaidSeriesLiveListResponse(PaidContentCreatorStatus paidContentCreatorStatus, List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paidContentCreatorStatus, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? null : l);
    }
}
