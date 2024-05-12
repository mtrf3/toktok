package com.ss.android.ugc.now.interaction.api;

import X.C1803575z;
import X.C33Q;
import X.C43I;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionSyncViewModelState implements C33Q {
    public final PostActiveState activePost;
    public final CommentCountState commentCountState;
    public final CommentDeleteState commentDeleteState;
    public final C43I<CommentLatestState> commentLatestState;
    public final CommentPublishState commentPublishState;
    public final LikeState likeState;
    public final User user;
    public final C1803575z viewState;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionSyncViewModelState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionSyncViewModelState copy$default(InteractionSyncViewModelState interactionSyncViewModelState, LikeState likeState, C1803575z c1803575z, CommentCountState commentCountState, CommentPublishState commentPublishState, CommentDeleteState commentDeleteState, C43I c43i, User user, PostActiveState postActiveState, int i, Object obj) {
        if ((i & 1) != 0) {
            likeState = interactionSyncViewModelState.likeState;
        }
        if ((i & 2) != 0) {
            c1803575z = interactionSyncViewModelState.viewState;
        }
        if ((i & 4) != 0) {
            commentCountState = interactionSyncViewModelState.commentCountState;
        }
        if ((i & 8) != 0) {
            commentPublishState = interactionSyncViewModelState.commentPublishState;
        }
        if ((i & 16) != 0) {
            commentDeleteState = interactionSyncViewModelState.commentDeleteState;
        }
        if ((i & 32) != 0) {
            c43i = interactionSyncViewModelState.commentLatestState;
        }
        if ((i & 64) != 0) {
            user = interactionSyncViewModelState.user;
        }
        if ((i & 128) != 0) {
            postActiveState = interactionSyncViewModelState.activePost;
        }
        return interactionSyncViewModelState.copy(likeState, c1803575z, commentCountState, commentPublishState, commentDeleteState, c43i, user, postActiveState);
    }

    public final InteractionSyncViewModelState copy(LikeState likeState, C1803575z c1803575z, CommentCountState commentCountState, CommentPublishState commentPublishState, CommentDeleteState commentDeleteState, C43I<CommentLatestState> c43i, User user, PostActiveState postActiveState) {
        o.LJIIIZ(user, "user");
        return new InteractionSyncViewModelState(likeState, c1803575z, commentCountState, commentPublishState, commentDeleteState, c43i, user, postActiveState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionSyncViewModelState)) {
            return false;
        }
        InteractionSyncViewModelState interactionSyncViewModelState = (InteractionSyncViewModelState) obj;
        return o.LJ(this.likeState, interactionSyncViewModelState.likeState) && o.LJ(this.viewState, interactionSyncViewModelState.viewState) && o.LJ(this.commentCountState, interactionSyncViewModelState.commentCountState) && o.LJ(this.commentPublishState, interactionSyncViewModelState.commentPublishState) && o.LJ(this.commentDeleteState, interactionSyncViewModelState.commentDeleteState) && o.LJ(this.commentLatestState, interactionSyncViewModelState.commentLatestState) && o.LJ(this.user, interactionSyncViewModelState.user) && o.LJ(this.activePost, interactionSyncViewModelState.activePost);
    }

    public int hashCode() {
        LikeState likeState = this.likeState;
        int hashCode = (likeState == null ? 0 : likeState.hashCode()) * 31;
        C1803575z c1803575z = this.viewState;
        int hashCode2 = (hashCode + (c1803575z == null ? 0 : c1803575z.hashCode())) * 31;
        CommentCountState commentCountState = this.commentCountState;
        int hashCode3 = (hashCode2 + (commentCountState == null ? 0 : commentCountState.hashCode())) * 31;
        CommentPublishState commentPublishState = this.commentPublishState;
        int hashCode4 = (hashCode3 + (commentPublishState == null ? 0 : commentPublishState.hashCode())) * 31;
        CommentDeleteState commentDeleteState = this.commentDeleteState;
        int hashCode5 = (hashCode4 + (commentDeleteState == null ? 0 : commentDeleteState.hashCode())) * 31;
        C43I<CommentLatestState> c43i = this.commentLatestState;
        int hashCode6 = (this.user.hashCode() + ((hashCode5 + (c43i == null ? 0 : c43i.hashCode())) * 31)) * 31;
        PostActiveState postActiveState = this.activePost;
        return hashCode6 + (postActiveState != null ? postActiveState.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionSyncViewModelState(likeState=");
        LIZ.append(this.likeState);
        LIZ.append(", viewState=");
        LIZ.append(this.viewState);
        LIZ.append(", commentCountState=");
        LIZ.append(this.commentCountState);
        LIZ.append(", commentPublishState=");
        LIZ.append(this.commentPublishState);
        LIZ.append(", commentDeleteState=");
        LIZ.append(this.commentDeleteState);
        LIZ.append(", commentLatestState=");
        LIZ.append(this.commentLatestState);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", activePost=");
        LIZ.append(this.activePost);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final PostActiveState getActivePost() {
        return this.activePost;
    }

    public final CommentCountState getCommentCountState() {
        return this.commentCountState;
    }

    public final CommentDeleteState getCommentDeleteState() {
        return this.commentDeleteState;
    }

    public final C43I<CommentLatestState> getCommentLatestState() {
        return this.commentLatestState;
    }

    public final CommentPublishState getCommentPublishState() {
        return this.commentPublishState;
    }

    public final LikeState getLikeState() {
        return this.likeState;
    }

    public final User getUser() {
        return this.user;
    }

    public final C1803575z getViewState() {
        return this.viewState;
    }

    public InteractionSyncViewModelState(LikeState likeState, C1803575z c1803575z, CommentCountState commentCountState, CommentPublishState commentPublishState, CommentDeleteState commentDeleteState, C43I<CommentLatestState> c43i, User user, PostActiveState postActiveState) {
        o.LJIIIZ(user, "user");
        this.likeState = likeState;
        this.viewState = c1803575z;
        this.commentCountState = commentCountState;
        this.commentPublishState = commentPublishState;
        this.commentDeleteState = commentDeleteState;
        this.commentLatestState = c43i;
        this.user = user;
        this.activePost = postActiveState;
    }

    public /* synthetic */ InteractionSyncViewModelState(LikeState likeState, C1803575z c1803575z, CommentCountState commentCountState, CommentPublishState commentPublishState, CommentDeleteState commentDeleteState, C43I c43i, User user, PostActiveState postActiveState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : likeState, (i & 2) != 0 ? null : c1803575z, (i & 4) != 0 ? null : commentCountState, (i & 8) != 0 ? null : commentPublishState, (i & 16) != 0 ? null : commentDeleteState, (i & 32) != 0 ? null : c43i, (i & 64) != 0 ? new User() : user, (i & 128) == 0 ? postActiveState : null);
    }
}
