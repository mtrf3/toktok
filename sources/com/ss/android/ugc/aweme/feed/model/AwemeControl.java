package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class AwemeControl implements Serializable {

    @InterfaceC65349Pkn("can_forward")
    public boolean canForward = true;

    @InterfaceC65349Pkn("can_share")
    public boolean canShare = true;

    @InterfaceC65349Pkn("can_comment")
    public boolean canComment = true;

    @InterfaceC65349Pkn("can_show_comment")
    public boolean canShowComment = true;

    public boolean canComment() {
        return this.canComment;
    }

    public boolean canForward() {
        return this.canForward;
    }

    public boolean canShare() {
        return this.canShare;
    }

    public boolean canShowComment() {
        return this.canShowComment;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanForward(boolean z) {
        this.canForward = z;
    }

    public void setCanShare(boolean z) {
        this.canShare = z;
    }

    public void setCanShowComment(boolean z) {
        this.canShowComment = z;
    }
}
