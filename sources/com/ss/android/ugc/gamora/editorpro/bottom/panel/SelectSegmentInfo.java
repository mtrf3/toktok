package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SelectSegmentInfo extends F9E {
    public long dropTime;
    public long duration;
    public long end;
    public final int height;
    public boolean isSelect;
    public final String key;
    public final String path;
    public float speed;
    public long start;
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SelectSegmentInfo() {
        /*
            r17 = this;
            r1 = 0
            r3 = 0
            r9 = 0
            r10 = 0
            r15 = 1023(0x3ff, float:1.434E-42)
            r0 = r17
            r2 = r1
            r5 = r3
            r7 = r3
            r11 = r10
            r12 = r10
            r13 = r3
            r16 = r1
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.SelectSegmentInfo.<init>():void");
    }

    public static /* synthetic */ SelectSegmentInfo copy$default(SelectSegmentInfo selectSegmentInfo, String str, String str2, long j, long j2, long j3, float f, int i, int i2, boolean z, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = selectSegmentInfo.key;
        }
        if ((i3 & 2) != 0) {
            str2 = selectSegmentInfo.path;
        }
        if ((i3 & 4) != 0) {
            j = selectSegmentInfo.start;
        }
        if ((i3 & 8) != 0) {
            j2 = selectSegmentInfo.end;
        }
        if ((i3 & 16) != 0) {
            j3 = selectSegmentInfo.duration;
        }
        if ((i3 & 32) != 0) {
            f = selectSegmentInfo.speed;
        }
        if ((i3 & 64) != 0) {
            i = selectSegmentInfo.width;
        }
        if ((i3 & 128) != 0) {
            i2 = selectSegmentInfo.height;
        }
        if ((i3 & 256) != 0) {
            z = selectSegmentInfo.isSelect;
        }
        if ((i3 & 512) != 0) {
            j4 = selectSegmentInfo.dropTime;
        }
        return selectSegmentInfo.copy(str, str2, j, j2, j3, f, i, i2, z, j4);
    }

    public final SelectSegmentInfo copy(String key, String path, long j, long j2, long j3, float f, int i, int i2, boolean z, long j4) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(path, "path");
        return new SelectSegmentInfo(key, path, j, j2, j3, f, i, i2, z, j4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.key, this.path, Long.valueOf(this.start), Long.valueOf(this.end), Long.valueOf(this.duration), Float.valueOf(this.speed), Integer.valueOf(this.width), Integer.valueOf(this.height), Boolean.valueOf(this.isSelect), Long.valueOf(this.dropTime)};
    }

    public final long getDropTime() {
        return this.dropTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPath() {
        return this.path;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setDropTime(long j) {
        this.dropTime = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public SelectSegmentInfo(String key, String path, long j, long j2, long j3, float f, int i, int i2, boolean z, long j4) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(path, "path");
        this.key = key;
        this.path = path;
        this.start = j;
        this.end = j2;
        this.duration = j3;
        this.speed = f;
        this.width = i;
        this.height = i2;
        this.isSelect = z;
        this.dropTime = j4;
    }

    public /* synthetic */ SelectSegmentInfo(String str, String str2, long j, long j2, long j3, float f, int i, int i2, boolean z, long j4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) == 0 ? str2 : "", (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? 0L : j3, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) == 0 ? z : false, (i3 & 512) == 0 ? j4 : 0L);
    }
}
