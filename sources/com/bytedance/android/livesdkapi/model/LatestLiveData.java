package com.bytedance.android.livesdkapi.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class LatestLiveData extends F9E {
    public final long latestDuration;
    public final long latestLeaveTime;
    public final long latestRoomId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LatestLiveData() {
        /*
            r9 = this;
            r1 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.model.LatestLiveData.<init>():void");
    }

    public static /* synthetic */ LatestLiveData copy$default(LatestLiveData latestLiveData, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = latestLiveData.latestRoomId;
        }
        if ((i & 2) != 0) {
            j2 = latestLiveData.latestLeaveTime;
        }
        if ((i & 4) != 0) {
            j3 = latestLiveData.latestDuration;
        }
        return latestLiveData.copy(j, j2, j3);
    }

    public final LatestLiveData copy(long j, long j2, long j3) {
        return new LatestLiveData(j, j2, j3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.latestRoomId), Long.valueOf(this.latestLeaveTime), Long.valueOf(this.latestDuration)};
    }

    public final long getLatestDuration() {
        return this.latestDuration;
    }

    public final long getLatestLeaveTime() {
        return this.latestLeaveTime;
    }

    public final long getLatestRoomId() {
        return this.latestRoomId;
    }

    public LatestLiveData(long j, long j2, long j3) {
        this.latestRoomId = j;
        this.latestLeaveTime = j2;
        this.latestDuration = j3;
    }

    public /* synthetic */ LatestLiveData(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }
}
