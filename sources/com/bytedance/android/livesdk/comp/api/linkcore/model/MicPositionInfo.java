package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MicPositionInfo extends F9E {
    public long linkedTime;
    public final int position;
    public final int strategy;
    public int uiPos;

    public static /* synthetic */ MicPositionInfo copy$default(MicPositionInfo micPositionInfo, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = micPositionInfo.strategy;
        }
        if ((i4 & 2) != 0) {
            i2 = micPositionInfo.position;
        }
        if ((i4 & 4) != 0) {
            i3 = micPositionInfo.uiPos;
        }
        if ((i4 & 8) != 0) {
            j = micPositionInfo.linkedTime;
        }
        return micPositionInfo.copy(i, i2, i3, j);
    }

    public final MicPositionInfo copy(int i, int i2, int i3, long j) {
        return new MicPositionInfo(i, i2, i3, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.strategy), Integer.valueOf(this.position), Integer.valueOf(this.uiPos), Long.valueOf(this.linkedTime)};
    }

    public final long getLinkedTime() {
        return this.linkedTime;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getStrategy() {
        return this.strategy;
    }

    public final int getUiPos() {
        return this.uiPos;
    }

    public final void setLinkedTime(long j) {
        this.linkedTime = j;
    }

    public final void setUiPos(int i) {
        this.uiPos = i;
    }

    public MicPositionInfo(int i, int i2, int i3, long j) {
        this.strategy = i;
        this.position = i2;
        this.uiPos = i3;
        this.linkedTime = j;
    }

    public /* synthetic */ MicPositionInfo(int i, int i2, int i3, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, (i4 & 8) != 0 ? 0L : j);
    }
}
