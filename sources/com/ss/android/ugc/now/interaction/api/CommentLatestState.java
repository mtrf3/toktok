package com.ss.android.ugc.now.interaction.api;

import X.X1D;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentLatestState extends Interaction {
    public final String awemeId;
    public final Comment latestComment;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentLatestState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommentLatestState copy$default(CommentLatestState commentLatestState, Comment comment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            comment = commentLatestState.latestComment;
        }
        if ((i & 2) != 0) {
            str = commentLatestState.getAwemeId();
        }
        return commentLatestState.copy(comment, str);
    }

    public final String component2() {
        return getAwemeId();
    }

    public final CommentLatestState copy(Comment comment, String str) {
        return new CommentLatestState(comment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentLatestState)) {
            return false;
        }
        CommentLatestState commentLatestState = (CommentLatestState) obj;
        return o.LJ(this.latestComment, commentLatestState.latestComment) && o.LJ(getAwemeId(), commentLatestState.getAwemeId());
    }

    public int hashCode() {
        Comment comment = this.latestComment;
        return ((comment == null ? 0 : comment.hashCode()) * 31) + (getAwemeId() != null ? getAwemeId().hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentLatestState(latestComment=");
        LIZ.append(this.latestComment);
        LIZ.append(", awemeId=");
        LIZ.append(getAwemeId());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final Comment getLatestComment() {
        return this.latestComment;
    }

    public CommentLatestState(Comment comment, String str) {
        super(null, 1, null);
        this.latestComment = comment;
        this.awemeId = str;
    }

    public /* synthetic */ CommentLatestState(Comment comment, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? null : str);
    }
}
