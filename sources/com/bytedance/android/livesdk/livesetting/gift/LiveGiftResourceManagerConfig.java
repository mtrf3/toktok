package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveGiftResourceManagerConfig {

    @InterfaceC65349Pkn("resource_disk_control_line_tier1")
    public long diskRedLine;

    @InterfaceC65349Pkn("resource_disk_control_line_tier2")
    public long diskYellowLine;

    @InterfaceC65349Pkn("enable_delete_all_resources")
    public boolean enableDeleteAllResource;

    @InterfaceC65349Pkn("enable_delete_unused_resources")
    public boolean enableDeleteUnusedResource;

    @InterfaceC65349Pkn("resource_disk_limitation_enable")
    public boolean resourceDiskLimitationEnable;

    @InterfaceC65349Pkn("resource_expire_duration")
    public int resourceExpireDuration;

    @InterfaceC65349Pkn("resource_preload_strategy")
    public int resourcePreloadStrategy;

    @InterfaceC65349Pkn("thread_crash_fix")
    public boolean threadCrashFix;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveGiftResourceManagerConfig() {
        /*
            r13 = this;
            r1 = 0
            r4 = 0
            r11 = 255(0xff, float:3.57E-43)
            r12 = 0
            r0 = r13
            r2 = r1
            r3 = r1
            r6 = r4
            r8 = r1
            r9 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerConfig.<init>():void");
    }

    public LiveGiftResourceManagerConfig(int i, int i2, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4) {
        this.resourcePreloadStrategy = i;
        this.resourceExpireDuration = i2;
        this.resourceDiskLimitationEnable = z;
        this.diskRedLine = j;
        this.diskYellowLine = j2;
        this.enableDeleteUnusedResource = z2;
        this.enableDeleteAllResource = z3;
        this.threadCrashFix = z4;
    }

    public /* synthetic */ LiveGiftResourceManagerConfig(int i, int i2, boolean z, long j, long j2, boolean z2, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 259200 : i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? 51200L : j, (i3 & 16) != 0 ? 102400L : j2, (i3 & 32) != 0 ? true : z2, (i3 & 64) != 0 ? true : z3, (i3 & 128) == 0 ? z4 : true);
    }
}
