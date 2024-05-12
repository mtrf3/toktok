package com.ss.android.ugc.aweme.feed.model;

import X.C47135Ieh;
import X.C70657RoD;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes13.dex */
public class AwemeStatistics implements Serializable, Cloneable {

    @InterfaceC65349Pkn("aid")
    public String aid;

    @InterfaceC65349Pkn("collect_count")
    public long collectCount = -1;

    @InterfaceC65349Pkn("comment_count")
    public long commentCount;

    @InterfaceC65349Pkn("digg_count")
    public long diggCount;

    @InterfaceC65349Pkn("download_count")
    public long downloadCount;

    @InterfaceC65349Pkn("forward_count")
    public long forwardCount;

    @InterfaceC65349Pkn("lose_comment_count")
    public int loseCommentCount;

    @InterfaceC65349Pkn("lose_count")
    public int loseCount;

    @InterfaceC65349Pkn("play_count")
    public long playCount;

    @InterfaceC65349Pkn("share_count")
    public long shareCount;

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AwemeStatistics m115clone() {
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        awemeStatistics.aid = this.aid;
        awemeStatistics.commentCount = this.commentCount;
        awemeStatistics.diggCount = this.diggCount;
        awemeStatistics.playCount = this.playCount;
        awemeStatistics.shareCount = this.shareCount;
        awemeStatistics.forwardCount = this.forwardCount;
        awemeStatistics.downloadCount = this.downloadCount;
        awemeStatistics.collectCount = this.collectCount;
        return awemeStatistics;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Long.valueOf(this.commentCount), Long.valueOf(this.diggCount), Long.valueOf(this.playCount), Long.valueOf(this.shareCount), Long.valueOf(this.forwardCount), Long.valueOf(this.downloadCount), Long.valueOf(this.collectCount)});
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeStatistics{aid='");
        Q89.LIZIZ(LIZ, this.aid, '\'', ", commentCount=");
        LIZ.append(this.commentCount);
        LIZ.append(", diggCount=");
        LIZ.append(this.diggCount);
        LIZ.append(", playCount=");
        LIZ.append(this.playCount);
        LIZ.append(", shareCount=");
        LIZ.append(this.shareCount);
        LIZ.append(", forwardCount=");
        LIZ.append(this.forwardCount);
        LIZ.append(", downloadCount=");
        LIZ.append(this.downloadCount);
        LIZ.append(", collectCount=");
        return C47135Ieh.LIZIZ(LIZ, this.collectCount, '}', LIZ);
    }

    public String getAid() {
        return this.aid;
    }

    public long getCollectCount() {
        return this.collectCount;
    }

    public long getCommentCount() {
        return this.commentCount;
    }

    public long getDiggCount() {
        return this.diggCount;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getForwardCount() {
        return this.forwardCount;
    }

    public int getLoseCommentCount() {
        return this.loseCommentCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public long getShareCount() {
        return this.shareCount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatistics)) {
            return false;
        }
        AwemeStatistics awemeStatistics = (AwemeStatistics) obj;
        if (this.commentCount == awemeStatistics.commentCount && this.diggCount == awemeStatistics.diggCount && this.playCount == awemeStatistics.playCount && this.shareCount == awemeStatistics.shareCount && this.forwardCount == awemeStatistics.forwardCount && this.downloadCount == awemeStatistics.downloadCount && this.collectCount == awemeStatistics.collectCount && C70657RoD.LJII(this.aid, awemeStatistics.aid)) {
            return true;
        }
        return false;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCollectCount(long j) {
        this.collectCount = j;
    }

    public void setCommentCount(long j) {
        this.commentCount = j;
    }

    public void setDiggCount(long j) {
        this.diggCount = j;
    }

    public void setDownloadCount(long j) {
        this.downloadCount = j;
    }

    public void setForwardCount(long j) {
        this.forwardCount = j;
    }

    public void setLoseCommentCount(int i) {
        this.loseCommentCount = i;
    }

    public void setLoseCount(int i) {
        this.loseCount = i;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setShareCount(long j) {
        this.shareCount = j;
    }
}
