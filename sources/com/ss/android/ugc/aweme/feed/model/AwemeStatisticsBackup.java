package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class AwemeStatisticsBackup implements Serializable {

    @InterfaceC65349Pkn("aweme_id")
    public String aid = "";

    @InterfaceC65349Pkn("digg_count")
    public Long diggCount = 0L;

    @InterfaceC65349Pkn("download_count")
    public Long downloadCount = 0L;

    @InterfaceC65349Pkn("play_count")
    public Long playCount = 0L;

    @InterfaceC65349Pkn("share_count")
    public Long shareCount = 0L;

    @InterfaceC65349Pkn("forward_count")
    public Long forwardCount = 0L;

    @InterfaceC65349Pkn("comment_count")
    public Long commentCount = 0L;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeStatistics{aid='");
        LIZ.append(this.aid);
        LIZ.append("', comemntCount=");
        LIZ.append(this.commentCount);
        LIZ.append(", diggCount=");
        LIZ.append(this.diggCount);
        LIZ.append(", playCount=");
        LIZ.append(this.playCount);
        LIZ.append(", shareCount=");
        LIZ.append(this.shareCount);
        LIZ.append(", forwardCount=");
        return JBR.LJ(LIZ, this.forwardCount, '}', LIZ);
    }

    public final String getAid() {
        return this.aid;
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final Long getDiggCount() {
        return this.diggCount;
    }

    public final Long getDownloadCount() {
        return this.downloadCount;
    }

    public final Long getForwardCount() {
        return this.forwardCount;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Long getShareCount() {
        return this.shareCount;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setCommentCount(Long l) {
        this.commentCount = l;
    }

    public final void setDiggCount(Long l) {
        this.diggCount = l;
    }

    public final void setDownloadCount$common_feed_release(Long l) {
        this.downloadCount = l;
    }

    public final void setForwardCount(Long l) {
        this.forwardCount = l;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setShareCount(Long l) {
        this.shareCount = l;
    }
}
