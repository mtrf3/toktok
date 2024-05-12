package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class CommentStatus {

    @InterfaceC65349Pkn("cid")
    public Long commentId;

    @InterfaceC65349Pkn("is_visible")
    public Boolean isVisible = Boolean.TRUE;

    @InterfaceC65349Pkn("reason")
    public String reason;

    @InterfaceC65349Pkn("comment_sharing_status")
    public Integer sharingStatus;

    public final Long getCommentId() {
        return this.commentId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Integer getSharingStatus() {
        return this.sharingStatus;
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setCommentId(Long l) {
        this.commentId = l;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setSharingStatus(Integer num) {
        this.sharingStatus = num;
    }

    public final void setVisible(Boolean bool) {
        this.isVisible = bool;
    }
}
