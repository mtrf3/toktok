package com.bytedance.android.livesdk.livesetting.game;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ExceptionInfo implements Serializable {

    @InterfaceC65349Pkn("delay")
    public long delayTime;

    @InterfaceC65349Pkn("active")
    public boolean isActive;

    public ExceptionInfo() {
        this(false, 0L, 3, null);
    }

    public final long getDelayTime() {
        return this.delayTime;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setDelayTime(long j) {
        this.delayTime = j;
    }

    public ExceptionInfo(boolean z, long j) {
        this.isActive = z;
        this.delayTime = j;
    }

    public /* synthetic */ ExceptionInfo(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 5000L : j);
    }
}
