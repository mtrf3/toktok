package com.ss.android.ugc.aweme.upvote.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UpvoteListResponse extends BaseResponse {

    @InterfaceC65349Pkn("new_insert_ids")
    public final String newInsertIds;

    @InterfaceC65349Pkn("upvote_list")
    public final UpvoteList upvoteList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpvoteListResponse) {
            return C78966Uyw.LJIIIZ(((UpvoteListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.upvoteList, this.newInsertIds};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("UpvoteListResponse:%s,%s", getObjects());
    }

    public UpvoteListResponse(UpvoteList upvoteList, String newInsertIds) {
        o.LJIIIZ(upvoteList, "upvoteList");
        o.LJIIIZ(newInsertIds, "newInsertIds");
        this.upvoteList = upvoteList;
        this.newInsertIds = newInsertIds;
    }
}
