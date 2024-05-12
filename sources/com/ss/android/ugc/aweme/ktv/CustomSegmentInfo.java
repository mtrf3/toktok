package com.ss.android.ugc.aweme.ktv;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class CustomSegmentInfo implements Serializable {

    @InterfaceC65349Pkn("lyric_start_time")
    public int lyricStartTime;

    @InterfaceC65349Pkn("shoot_duration")
    public int shootDuration;

    @InterfaceC65349Pkn("start_time_offset")
    public int startTimeOffset;

    public final int getLyricStartTime() {
        return this.lyricStartTime;
    }

    public final int getShootDuration() {
        return this.shootDuration;
    }

    public final int getStartTimeOffset() {
        return this.startTimeOffset;
    }

    public final void setLyricStartTime(int i) {
        this.lyricStartTime = i;
    }

    public final void setShootDuration(int i) {
        this.shootDuration = i;
    }

    public final void setStartTimeOffset(int i) {
        this.startTimeOffset = i;
    }
}
