package com.bytedance.android.livesdk.livesetting.subscription;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSubathonConfig {

    @InterfaceC65349Pkn("anchor_timer_auto_start")
    public boolean anchorTimerAutoStart;

    @InterfaceC65349Pkn("enable_edit_title")
    public boolean enableEditTitle;

    @InterfaceC65349Pkn("enable_entrance")
    public boolean enableEntrance;

    @InterfaceC65349Pkn("time_align_interval")
    public long timeAlignInterval;

    @InterfaceC65349Pkn("time_align_max_gap")
    public long timeAlignMaxGap;

    @InterfaceC65349Pkn("time_align_min_gap")
    public long timeAlignMinGap;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveSubathonConfig() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r10 = 63
            r11 = 0
            r0 = r12
            r2 = r1
            r5 = r3
            r7 = r3
            r9 = r1
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.subscription.LiveSubathonConfig.<init>():void");
    }

    public final boolean getAnchorTimerAutoStart() {
        return this.anchorTimerAutoStart;
    }

    public final boolean getEnableEditTitle() {
        return this.enableEditTitle;
    }

    public final boolean getEnableEntrance() {
        return this.enableEntrance;
    }

    public final long getTimeAlignInterval() {
        return this.timeAlignInterval;
    }

    public final long getTimeAlignMaxGap() {
        return this.timeAlignMaxGap;
    }

    public final long getTimeAlignMinGap() {
        return this.timeAlignMinGap;
    }

    public final void setAnchorTimerAutoStart(boolean z) {
        this.anchorTimerAutoStart = z;
    }

    public final void setEnableEditTitle(boolean z) {
        this.enableEditTitle = z;
    }

    public final void setEnableEntrance(boolean z) {
        this.enableEntrance = z;
    }

    public final void setTimeAlignInterval(long j) {
        this.timeAlignInterval = j;
    }

    public final void setTimeAlignMaxGap(long j) {
        this.timeAlignMaxGap = j;
    }

    public final void setTimeAlignMinGap(long j) {
        this.timeAlignMinGap = j;
    }

    public LiveSubathonConfig(boolean z, boolean z2, long j, long j2, long j3, boolean z3) {
        this.enableEntrance = z;
        this.enableEditTitle = z2;
        this.timeAlignMinGap = j;
        this.timeAlignMaxGap = j2;
        this.timeAlignInterval = j3;
        this.anchorTimerAutoStart = z3;
    }

    public /* synthetic */ LiveSubathonConfig(boolean z, boolean z2, long j, long j2, long j3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? 10L : j, (i & 8) != 0 ? 120L : j2, (i & 16) != 0 ? 300L : j3, (i & 32) != 0 ? true : z3);
    }
}
