package com.ss.android.ugc.tiktok.tpsc.data.effectcount;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InteractionVideoCount {

    @InterfaceC65349Pkn("comment")
    public final VideoCount comment;

    @InterfaceC65349Pkn("duet")
    public final VideoCount duet;

    @InterfaceC65349Pkn("stitch")
    public final VideoCount stitch;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractionVideoCount() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionVideoCount)) {
            return false;
        }
        InteractionVideoCount interactionVideoCount = (InteractionVideoCount) obj;
        return o.LJ(this.comment, interactionVideoCount.comment) && o.LJ(this.duet, interactionVideoCount.duet) && o.LJ(this.stitch, interactionVideoCount.stitch);
    }

    public final int hashCode() {
        VideoCount videoCount = this.comment;
        int hashCode = (videoCount == null ? 0 : videoCount.hashCode()) * 31;
        VideoCount videoCount2 = this.duet;
        int hashCode2 = (hashCode + (videoCount2 == null ? 0 : videoCount2.hashCode())) * 31;
        VideoCount videoCount3 = this.stitch;
        return hashCode2 + (videoCount3 != null ? videoCount3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionVideoCount(comment=");
        LIZ.append(this.comment);
        LIZ.append(", duet=");
        LIZ.append(this.duet);
        LIZ.append(", stitch=");
        LIZ.append(this.stitch);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public InteractionVideoCount(VideoCount videoCount, VideoCount videoCount2, VideoCount videoCount3) {
        this.comment = videoCount;
        this.duet = videoCount2;
        this.stitch = videoCount3;
    }

    public /* synthetic */ InteractionVideoCount(VideoCount videoCount, VideoCount videoCount2, VideoCount videoCount3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoCount, (i & 2) != 0 ? null : videoCount2, (i & 4) != 0 ? null : videoCount3);
    }
}
