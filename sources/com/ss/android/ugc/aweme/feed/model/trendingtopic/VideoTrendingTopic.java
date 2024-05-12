package com.ss.android.ugc.aweme.feed.model.trendingtopic;

import X.C16880lQ;
import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTrendingTopic implements Serializable {

    @InterfaceC65349Pkn("event_id")
    public long eventId;

    @InterfaceC65349Pkn("event_img")
    public String eventImg;

    @InterfaceC65349Pkn("event_name")
    public String eventName;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("total_videos")
    public long totalVideos;

    @InterfaceC65349Pkn("total_views")
    public long totalViews;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTrendingTopic() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r10 = 63
            r0 = r12
            r4 = r1
            r6 = r1
            r8 = r3
            r9 = r3
            r11 = r3
            r0.<init>(r1, r3, r4, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic.<init>():void");
    }

    public static /* synthetic */ VideoTrendingTopic copy$default(VideoTrendingTopic videoTrendingTopic, long j, String str, long j2, long j3, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = videoTrendingTopic.eventId;
        }
        if ((i & 2) != 0) {
            str = videoTrendingTopic.eventName;
        }
        if ((i & 4) != 0) {
            j2 = videoTrendingTopic.totalViews;
        }
        if ((i & 8) != 0) {
            j3 = videoTrendingTopic.totalVideos;
        }
        if ((i & 16) != 0) {
            str2 = videoTrendingTopic.eventImg;
        }
        if ((i & 32) != 0) {
            str3 = videoTrendingTopic.extra;
        }
        return videoTrendingTopic.copy(j, str, j2, j3, str2, str3);
    }

    public final VideoTrendingTopic copy(long j, String eventName, long j2, long j3, String eventImg, String extra) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(eventImg, "eventImg");
        o.LJIIIZ(extra, "extra");
        return new VideoTrendingTopic(j, eventName, j2, j3, eventImg, extra);
    }

    public int hashCode() {
        return this.extra.hashCode() + C79062V1e.LJ(this.eventImg, JBR.LIZJ(this.totalVideos, JBR.LIZJ(this.totalViews, C79062V1e.LJ(this.eventName, C16880lQ.LLJIJIL(this.eventId) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoTrendingTopic(eventId=");
        LIZ.append(this.eventId);
        LIZ.append(", eventName=");
        LIZ.append(this.eventName);
        LIZ.append(", totalViews=");
        LIZ.append(this.totalViews);
        LIZ.append(", totalVideos=");
        LIZ.append(this.totalVideos);
        LIZ.append(", eventImg=");
        LIZ.append(this.eventImg);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public final long getEventId() {
        return this.eventId;
    }

    public final String getEventImg() {
        return this.eventImg;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final long getTotalVideos() {
        return this.totalVideos;
    }

    public final long getTotalViews() {
        return this.totalViews;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoTrendingTopic) || this.eventId != ((VideoTrendingTopic) obj).eventId) {
            return false;
        }
        return true;
    }

    public final void setEventId(long j) {
        this.eventId = j;
    }

    public final void setEventImg(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.eventImg = str;
    }

    public final void setEventName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.eventName = str;
    }

    public final void setExtra(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setTotalVideos(long j) {
        this.totalVideos = j;
    }

    public final void setTotalViews(long j) {
        this.totalViews = j;
    }

    public VideoTrendingTopic(long j, String str, long j2, long j3, String str2, String str3) {
        HH1.LIZ(str, "eventName", str2, "eventImg", str3, "extra");
        this.eventId = j;
        this.eventName = str;
        this.totalViews = j2;
        this.totalVideos = j3;
        this.eventImg = str2;
        this.extra = str3;
    }

    public /* synthetic */ VideoTrendingTopic(long j, String str, long j2, long j3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j2, (i & 8) == 0 ? j3 : 0L, (i & 16) != 0 ? "" : str2, (i & 32) == 0 ? str3 : "");
    }
}
