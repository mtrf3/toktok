package com.ss.android.ugc.aweme.upvote.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvotePublishResponse extends BaseResponse {

    @InterfaceC65349Pkn("rethink_popup")
    public final CommentRethinkPopup rethinkPopup;

    @InterfaceC65349Pkn("upvote")
    public final UpvoteStruct upvote;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvotePublishResponse)) {
            return false;
        }
        UpvotePublishResponse upvotePublishResponse = (UpvotePublishResponse) obj;
        return o.LJ(this.upvote, upvotePublishResponse.upvote) && o.LJ(this.rethinkPopup, upvotePublishResponse.rethinkPopup);
    }

    public final int hashCode() {
        UpvoteStruct upvoteStruct = this.upvote;
        int hashCode = (upvoteStruct == null ? 0 : upvoteStruct.hashCode()) * 31;
        CommentRethinkPopup commentRethinkPopup = this.rethinkPopup;
        return hashCode + (commentRethinkPopup != null ? commentRethinkPopup.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvotePublishResponse(upvote=");
        LIZ.append(this.upvote);
        LIZ.append(", rethinkPopup=");
        LIZ.append(this.rethinkPopup);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public UpvotePublishResponse(UpvoteStruct upvoteStruct, CommentRethinkPopup commentRethinkPopup) {
        this.upvote = upvoteStruct;
        this.rethinkPopup = commentRethinkPopup;
    }

    public /* synthetic */ UpvotePublishResponse(UpvoteStruct upvoteStruct, CommentRethinkPopup commentRethinkPopup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(upvoteStruct, (i & 2) != 0 ? null : commentRethinkPopup);
    }
}
