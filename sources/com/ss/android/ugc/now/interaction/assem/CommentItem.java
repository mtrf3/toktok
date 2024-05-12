package com.ss.android.ugc.now.interaction.assem;

import X.InterfaceC57784Mm4;
import X.X1D;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentItem implements InterfaceC57784Mm4 {
    public final Aweme aweme;
    public final Comment comment;
    public final NowFeedMobHierarchyData interactionHierarchyData;

    public static /* synthetic */ CommentItem copy$default(CommentItem commentItem, Comment comment, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData, int i, Object obj) {
        if ((i & 1) != 0) {
            comment = commentItem.comment;
        }
        if ((i & 2) != 0) {
            aweme = commentItem.aweme;
        }
        if ((i & 4) != 0) {
            nowFeedMobHierarchyData = commentItem.interactionHierarchyData;
        }
        return commentItem.copy(comment, aweme, nowFeedMobHierarchyData);
    }

    public final CommentItem copy(Comment comment, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(comment, "comment");
        return new CommentItem(comment, aweme, nowFeedMobHierarchyData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentItem)) {
            return false;
        }
        CommentItem commentItem = (CommentItem) obj;
        return o.LJ(this.comment, commentItem.comment) && o.LJ(this.aweme, commentItem.aweme) && o.LJ(this.interactionHierarchyData, commentItem.interactionHierarchyData);
    }

    public int hashCode() {
        int hashCode = this.comment.hashCode() * 31;
        Aweme aweme = this.aweme;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = this.interactionHierarchyData;
        return hashCode2 + (nowFeedMobHierarchyData != null ? nowFeedMobHierarchyData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentItem(comment=");
        LIZ.append(this.comment);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", interactionHierarchyData=");
        LIZ.append(this.interactionHierarchyData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Comment getComment() {
        return this.comment;
    }

    public final NowFeedMobHierarchyData getInteractionHierarchyData() {
        return this.interactionHierarchyData;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public CommentItem(Comment comment, Aweme aweme, NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        o.LJIIIZ(comment, "comment");
        this.comment = comment;
        this.aweme = aweme;
        this.interactionHierarchyData = nowFeedMobHierarchyData;
    }
}
