package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMMusicInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("track")
    public TTMTrack track;

    /* JADX WARN: Multi-variable type inference failed */
    public TTMMusicInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TTMMusicInfo copy$default(TTMMusicInfo tTMMusicInfo, TTMTrack tTMTrack, int i, Object obj) {
        if ((i & 1) != 0) {
            tTMTrack = tTMMusicInfo.track;
        }
        return tTMMusicInfo.copy(tTMTrack);
    }

    public final TTMMusicInfo copy(TTMTrack tTMTrack) {
        return new TTMMusicInfo(tTMTrack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TTMMusicInfo) && o.LJ(this.track, ((TTMMusicInfo) obj).track);
    }

    public int hashCode() {
        TTMTrack tTMTrack = this.track;
        if (tTMTrack == null) {
            return 0;
        }
        return tTMTrack.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMMusicInfo(track=");
        LIZ.append(this.track);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final TTMTrack getTrack() {
        return this.track;
    }

    public TTMMusicInfo(TTMTrack tTMTrack) {
        this.track = tTMTrack;
    }

    public /* synthetic */ TTMMusicInfo(TTMTrack tTMTrack, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : tTMTrack);
    }
}
