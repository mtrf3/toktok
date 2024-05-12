package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class MusicChorusInfo implements Serializable {

    @InterfaceC65349Pkn("duration_ms")
    public long duration;

    @InterfaceC65349Pkn("start_ms")
    public long startTime;

    public final long getDuration() {
        return this.duration;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
