package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CreatorCollectionDetailResponse extends BaseResponse {

    @InterfaceC65349Pkn("collection")
    public final ManagementPagePaidCollectionInfo collectionDetail;

    @InterfaceC65349Pkn("mobile_reroute_deeplink_schema")
    public final String routerSchema;

    @InterfaceC65349Pkn("video_list")
    public final List<ManagementPagePaidVideo> videos;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorCollectionDetailResponse)) {
            return false;
        }
        CreatorCollectionDetailResponse creatorCollectionDetailResponse = (CreatorCollectionDetailResponse) obj;
        return o.LJ(this.collectionDetail, creatorCollectionDetailResponse.collectionDetail) && o.LJ(this.videos, creatorCollectionDetailResponse.videos) && o.LJ(this.routerSchema, creatorCollectionDetailResponse.routerSchema);
    }

    public final int hashCode() {
        int hashCode = this.collectionDetail.hashCode() * 31;
        List<ManagementPagePaidVideo> list = this.videos;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.routerSchema;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorCollectionDetailResponse(collectionDetail=");
        LIZ.append(this.collectionDetail);
        LIZ.append(", videos=");
        LIZ.append(this.videos);
        LIZ.append(", routerSchema=");
        return q.LIZIZ(LIZ, this.routerSchema, ')', LIZ);
    }

    public CreatorCollectionDetailResponse(ManagementPagePaidCollectionInfo collectionDetail, List<ManagementPagePaidVideo> list, String str) {
        o.LJIIIZ(collectionDetail, "collectionDetail");
        this.collectionDetail = collectionDetail;
        this.videos = list;
        this.routerSchema = str;
    }

    public /* synthetic */ CreatorCollectionDetailResponse(ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(managementPagePaidCollectionInfo, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
