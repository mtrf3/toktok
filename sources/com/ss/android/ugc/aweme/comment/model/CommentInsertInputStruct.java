package com.ss.android.ugc.aweme.comment.model;

import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentInsertInputStruct extends Comment {
    public final Comment parentComment;

    public final Comment getParentComment() {
        return this.parentComment;
    }

    public CommentInsertInputStruct(Comment parentComment) {
        o.LJIIIZ(parentComment, "parentComment");
        this.parentComment = parentComment;
        setCommentType(9);
    }
}
