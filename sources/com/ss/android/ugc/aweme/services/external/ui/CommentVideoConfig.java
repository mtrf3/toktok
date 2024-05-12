package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class CommentVideoConfig implements Serializable {
    public CommentVideoModel commentVideoModel;

    public final CommentVideoModel getCommentVideoModel() {
        return this.commentVideoModel;
    }

    public final void setCommentVideoModel(CommentVideoModel commentVideoModel) {
        this.commentVideoModel = commentVideoModel;
    }
}
