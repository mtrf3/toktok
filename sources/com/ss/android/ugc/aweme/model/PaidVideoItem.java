package com.ss.android.ugc.aweme.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidVideoItem implements Serializable {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("is_completed_bool")
    public final boolean isComplete;

    @InterfaceC65349Pkn("is_intro")
    public final boolean isIntro;

    @InterfaceC65349Pkn("is_reported")
    public final boolean isReported;

    @InterfaceC65349Pkn("last_watch_time")
    public final long lastWatchTime;

    @InterfaceC65349Pkn("max_timestamp")
    public final long maxTimestamp;

    @InterfaceC65349Pkn("paid_video_id")
    public final long paidVideoId;

    @InterfaceC65349Pkn("video_duration")
    public final long videoDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaidVideoItem() {
        /*
            r15 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r13 = 255(0xff, float:3.57E-43)
            r0 = r15
            r4 = r3
            r6 = r3
            r7 = r1
            r9 = r1
            r11 = r1
            r14 = r5
            r0.<init>(r1, r3, r4, r5, r6, r7, r9, r11, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.PaidVideoItem.<init>():void");
    }

    public static /* synthetic */ PaidVideoItem copy$default(PaidVideoItem paidVideoItem, long j, boolean z, boolean z2, Aweme aweme, boolean z3, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = paidVideoItem.paidVideoId;
        }
        if ((i & 2) != 0) {
            z = paidVideoItem.isIntro;
        }
        if ((i & 4) != 0) {
            z2 = paidVideoItem.isReported;
        }
        if ((i & 8) != 0) {
            aweme = paidVideoItem.aweme;
        }
        if ((i & 16) != 0) {
            z3 = paidVideoItem.isComplete;
        }
        if ((i & 32) != 0) {
            j2 = paidVideoItem.maxTimestamp;
        }
        if ((i & 64) != 0) {
            j3 = paidVideoItem.lastWatchTime;
        }
        if ((i & 128) != 0) {
            j4 = paidVideoItem.videoDuration;
        }
        return paidVideoItem.copy(j, z, z2, aweme, z3, j2, j3, j4);
    }

    public final PaidVideoItem copy(long j, boolean z, boolean z2, Aweme aweme, boolean z3, long j2, long j3, long j4) {
        return new PaidVideoItem(j, z, z2, aweme, z3, j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidVideoItem)) {
            return false;
        }
        PaidVideoItem paidVideoItem = (PaidVideoItem) obj;
        return this.paidVideoId == paidVideoItem.paidVideoId && this.isIntro == paidVideoItem.isIntro && this.isReported == paidVideoItem.isReported && o.LJ(this.aweme, paidVideoItem.aweme) && this.isComplete == paidVideoItem.isComplete && this.maxTimestamp == paidVideoItem.maxTimestamp && this.lastWatchTime == paidVideoItem.lastWatchTime && this.videoDuration == paidVideoItem.videoDuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.paidVideoId) * 31;
        boolean z = this.isIntro;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LLJIJIL + i2) * 31;
        boolean z2 = this.isReported;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        Aweme aweme = this.aweme;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i6 = (i5 + hashCode) * 31;
        if (!this.isComplete) {
            i = 0;
        }
        return C16880lQ.LLJIJIL(this.videoDuration) + JBR.LIZJ(this.lastWatchTime, JBR.LIZJ(this.maxTimestamp, (i6 + i) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidVideoItem(paidVideoId=");
        LIZ.append(this.paidVideoId);
        LIZ.append(", isIntro=");
        LIZ.append(this.isIntro);
        LIZ.append(", isReported=");
        LIZ.append(this.isReported);
        LIZ.append(", aweme=");
        LIZ.append(this.aweme);
        LIZ.append(", isComplete=");
        LIZ.append(this.isComplete);
        LIZ.append(", maxTimestamp=");
        LIZ.append(this.maxTimestamp);
        LIZ.append(", lastWatchTime=");
        LIZ.append(this.lastWatchTime);
        LIZ.append(", videoDuration=");
        return C47135Ieh.LIZIZ(LIZ, this.videoDuration, ')', LIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final long getLastWatchTime() {
        return this.lastWatchTime;
    }

    public final long getMaxTimestamp() {
        return this.maxTimestamp;
    }

    public final long getPaidVideoId() {
        return this.paidVideoId;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final boolean isIntro() {
        return this.isIntro;
    }

    public final boolean isReported() {
        return this.isReported;
    }

    public PaidVideoItem(long j, boolean z, boolean z2, Aweme aweme, boolean z3, long j2, long j3, long j4) {
        this.paidVideoId = j;
        this.isIntro = z;
        this.isReported = z2;
        this.aweme = aweme;
        this.isComplete = z3;
        this.maxTimestamp = j2;
        this.lastWatchTime = j3;
        this.videoDuration = j4;
    }

    public /* synthetic */ PaidVideoItem(long j, boolean z, boolean z2, Aweme aweme, boolean z3, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : aweme, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? 0L : j3, (i & 128) == 0 ? j4 : 0L);
    }
}
