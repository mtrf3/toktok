package com.ss.android.ugc.aweme.comment.model;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class CommentReplyListItem {
    public CommentReplyButtonStruct mButtonStruct;
    public Comment mComment;
    public CommentInsertInputStruct mInsertInputStruct;
    public List<Comment> mReplyComments = new ArrayList();

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        Comment comment;
        if ((obj instanceof CommentReplyListItem) && (comment = this.mComment) != null) {
            return comment.equals(((CommentReplyListItem) obj).mComment);
        }
        return super.equals(obj);
    }
}
