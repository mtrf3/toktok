package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class ThreadPoolConfig {

    @InterfaceC65349Pkn("core_pool_size")
    public int corePoolSize;

    @InterfaceC65349Pkn("keep_alive_time")
    public long keepAliveTime;

    @InterfaceC65349Pkn("maximum_pool_size")
    public int maximumPoolSize;

    @InterfaceC65349Pkn("thread_priority")
    public int threadPriority;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ThreadPoolConfig() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 15
            r7 = 0
            r0 = r8
            r2 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.broadcast.ThreadPoolConfig.<init>():void");
    }

    public final int getCorePoolSize() {
        return this.corePoolSize;
    }

    public final long getKeepAliveTime() {
        return this.keepAliveTime;
    }

    public final int getMaximumPoolSize() {
        return this.maximumPoolSize;
    }

    public final int getThreadPriority() {
        return this.threadPriority;
    }

    public final void setCorePoolSize(int i) {
        this.corePoolSize = i;
    }

    public final void setKeepAliveTime(long j) {
        this.keepAliveTime = j;
    }

    public final void setMaximumPoolSize(int i) {
        this.maximumPoolSize = i;
    }

    public final void setThreadPriority(int i) {
        this.threadPriority = i;
    }

    public ThreadPoolConfig(int i, int i2, long j, int i3) {
        this.corePoolSize = i;
        this.maximumPoolSize = i2;
        this.keepAliveTime = j;
        this.threadPriority = i3;
    }

    public /* synthetic */ ThreadPoolConfig(int i, int i2, long j, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 3 : i2, (i4 & 4) != 0 ? 15L : j, (i4 & 8) != 0 ? 0 : i3);
    }
}
