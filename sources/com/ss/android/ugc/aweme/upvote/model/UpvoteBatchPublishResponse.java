package com.ss.android.ugc.aweme.upvote.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpvoteBatchPublishResponse extends BaseResponse {

    @InterfaceC65349Pkn("failed_item_ids")
    public final List<String> failedItemIds;

    @InterfaceC65349Pkn("upvotes")
    public final List<UpvoteStruct> upvotes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvoteBatchPublishResponse)) {
            return false;
        }
        UpvoteBatchPublishResponse upvoteBatchPublishResponse = (UpvoteBatchPublishResponse) obj;
        return o.LJ(this.upvotes, upvoteBatchPublishResponse.upvotes) && o.LJ(this.failedItemIds, upvoteBatchPublishResponse.failedItemIds);
    }

    public final int hashCode() {
        List<UpvoteStruct> list = this.upvotes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.failedItemIds;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvoteBatchPublishResponse(upvotes=");
        LIZ.append(this.upvotes);
        LIZ.append(", failedItemIds=");
        return C1NE.LIZIZ(LIZ, this.failedItemIds, ')', LIZ);
    }

    public UpvoteBatchPublishResponse(List<UpvoteStruct> list, List<String> list2) {
        this.upvotes = list;
        this.failedItemIds = list2;
    }
}
