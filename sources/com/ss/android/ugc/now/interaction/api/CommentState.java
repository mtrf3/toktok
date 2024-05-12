package com.ss.android.ugc.now.interaction.api;

import X.C16880lQ;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentState extends Interaction {
    public final String awemeId;
    public final long commentCount;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentState() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommentState copy$default(CommentState commentState, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = commentState.commentCount;
        }
        if ((i & 2) != 0) {
            str = commentState.getAwemeId();
        }
        return commentState.copy(j, str);
    }

    public final String component2() {
        return getAwemeId();
    }

    public final CommentState copy(long j, String str) {
        return new CommentState(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentState)) {
            return false;
        }
        CommentState commentState = (CommentState) obj;
        return this.commentCount == commentState.commentCount && o.LJ(getAwemeId(), commentState.getAwemeId());
    }

    public int hashCode() {
        return (C16880lQ.LLJIJIL(this.commentCount) * 31) + (getAwemeId() == null ? 0 : getAwemeId().hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentState(commentCount=");
        LIZ.append(this.commentCount);
        LIZ.append(", awemeId=");
        LIZ.append(getAwemeId());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public CommentState(long j, String str) {
        super(null, 1, null);
        this.commentCount = j;
        this.awemeId = str;
    }

    public /* synthetic */ CommentState(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str);
    }
}
