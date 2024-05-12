package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BroadcastResumeInfo extends F9E {
    public final int continueScene;
    public final long linkMicUserNum;

    public BroadcastResumeInfo() {
        this(0, 0L, 3, null);
    }

    private final int component1() {
        return this.continueScene;
    }

    public static /* synthetic */ BroadcastResumeInfo copy$default(BroadcastResumeInfo broadcastResumeInfo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = broadcastResumeInfo.continueScene;
        }
        if ((i2 & 2) != 0) {
            j = broadcastResumeInfo.linkMicUserNum;
        }
        return broadcastResumeInfo.copy(i, j);
    }

    public final BroadcastResumeInfo copy(int i, long j) {
        return new BroadcastResumeInfo(i, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.continueScene), Long.valueOf(this.linkMicUserNum)};
    }

    public final int getRealScene() {
        int i = this.continueScene;
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            return 0;
        }
        return 4;
    }

    public final long getLinkMicUserNum() {
        return this.linkMicUserNum;
    }

    public BroadcastResumeInfo(int i, long j) {
        this.continueScene = i;
        this.linkMicUserNum = j;
    }

    public /* synthetic */ BroadcastResumeInfo(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }
}
