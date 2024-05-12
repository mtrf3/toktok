package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NleClipTimeAdjustData extends F9E {
    public long duration;
    public long endTime;
    public String id;
    public float speed;
    public long startTime;

    public static /* synthetic */ NleClipTimeAdjustData copy$default(NleClipTimeAdjustData nleClipTimeAdjustData, String str, long j, long j2, float f, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nleClipTimeAdjustData.id;
        }
        if ((i & 2) != 0) {
            j = nleClipTimeAdjustData.startTime;
        }
        if ((i & 4) != 0) {
            j2 = nleClipTimeAdjustData.endTime;
        }
        if ((i & 8) != 0) {
            f = nleClipTimeAdjustData.speed;
        }
        if ((i & 16) != 0) {
            j3 = nleClipTimeAdjustData.duration;
        }
        return nleClipTimeAdjustData.copy(str, j, j2, f, j3);
    }

    public final NleClipTimeAdjustData copy(String id, long j, long j2, float f, long j3) {
        o.LJIIIZ(id, "id");
        return new NleClipTimeAdjustData(id, j, j2, f, j3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.id, Long.valueOf(this.startTime), Long.valueOf(this.endTime), Float.valueOf(this.speed), Long.valueOf(this.duration)};
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.id;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.id = str;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public NleClipTimeAdjustData(String id, long j, long j2, float f, long j3) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.startTime = j;
        this.endTime = j2;
        this.speed = f;
        this.duration = j3;
    }
}
