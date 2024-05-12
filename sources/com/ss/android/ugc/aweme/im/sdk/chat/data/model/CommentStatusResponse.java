package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes2.dex */
public final class CommentStatusResponse extends BaseResponse {

    @InterfaceC65349Pkn("comment_status_list")
    public List<CommentStatus> commentStatus;

    public final List<CommentStatus> getCommentStatus() {
        return this.commentStatus;
    }

    public final void setCommentStatus(List<CommentStatus> list) {
        this.commentStatus = list;
    }
}