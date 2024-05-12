package com.ss.android.ugc.aweme.ktv;

import X.F9E;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class AudioInterval extends F9E implements Serializable {
    public long end;
    public long start;

    public static /* synthetic */ AudioInterval copy$default(AudioInterval audioInterval, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = audioInterval.start;
        }
        if ((i & 2) != 0) {
            j2 = audioInterval.end;
        }
        return audioInterval.copy(j, j2);
    }

    public final AudioInterval copy(long j, long j2) {
        return new AudioInterval(j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.start), Long.valueOf(this.end)};
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public AudioInterval(long j, long j2) {
        this.start = j;
        this.end = j2;
    }
}
