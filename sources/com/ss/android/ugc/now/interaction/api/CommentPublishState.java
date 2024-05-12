package com.ss.android.ugc.now.interaction.api;

import X.X1D;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentPublishState extends Interaction {
    public final String awemeId;
    public final Comment comment;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentPublishState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommentPublishState copy$default(CommentPublishState commentPublishState, Comment comment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            comment = commentPublishState.comment;
        }
        if ((i & 2) != 0) {
            str = commentPublishState.getAwemeId();
        }
        return commentPublishState.copy(comment, str);
    }

    public final String component2() {
        return getAwemeId();
    }

    public final CommentPublishState copy(Comment comment, String str) {
        return new CommentPublishState(comment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPublishState)) {
            return false;
        }
        CommentPublishState commentPublishState = (CommentPublishState) obj;
        return o.LJ(this.comment, commentPublishState.comment) && o.LJ(getAwemeId(), commentPublishState.getAwemeId());
    }

    public int hashCode() {
        Comment comment = this.comment;
        return ((comment == null ? 0 : comment.hashCode()) * 31) + (getAwemeId() != null ? getAwemeId().hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentPublishState(comment=");
        LIZ.append(this.comment);
        LIZ.append(", awemeId=");
        LIZ.append(getAwemeId());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final Comment getComment() {
        return this.comment;
    }

    public CommentPublishState(Comment comment, String str) {
        super(null, 1, null);
        this.comment = comment;
        this.awemeId = str;
    }

    public /* synthetic */ CommentPublishState(Comment comment, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? null : str);
    }
}
