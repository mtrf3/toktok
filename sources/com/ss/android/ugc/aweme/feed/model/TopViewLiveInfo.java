package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class TopViewLiveInfo implements Serializable {
    public transient int currentIndex;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public String statusMsg;

    @InterfaceC65349Pkn("viewer_count")
    public Long viewerCount = 0L;

    @InterfaceC65349Pkn("comment_count")
    public Long commentCount = 0L;

    @InterfaceC65349Pkn("gift_count")
    public Long giftCount = 0L;

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final Long getGiftCount() {
        return this.giftCount;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final Long getViewerCount() {
        return this.viewerCount;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setGiftCount(Long l) {
        this.giftCount = l;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setViewerCount(Long l) {
        this.viewerCount = l;
    }
}
