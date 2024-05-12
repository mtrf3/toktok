package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class PromoteIconFlipFrequencySettingsModel implements Serializable {

    @InterfaceC65349Pkn("delay_time_type_a")
    public final long delayTimeTypeA;

    @InterfaceC65349Pkn("delay_time_type_b")
    public final long delayTimeTypeB;

    @InterfaceC65349Pkn("promote_icon_flip_max_times")
    public final int promoteIconFlipMaxTimes;

    @InterfaceC65349Pkn("promote_icon_flip_time_gap")
    public final int promoteIconFlipTimeGap;

    /* renamed from: switch, reason: not valid java name */
    @InterfaceC65349Pkn("switch")
    public final boolean f28switch;

    public final long getDelayTimeTypeA() {
        return this.delayTimeTypeA;
    }

    public final long getDelayTimeTypeB() {
        return this.delayTimeTypeB;
    }

    public final int getPromoteIconFlipMaxTimes() {
        return this.promoteIconFlipMaxTimes;
    }

    public final int getPromoteIconFlipTimeGap() {
        return this.promoteIconFlipTimeGap;
    }

    public final boolean getSwitch() {
        return this.f28switch;
    }

    public PromoteIconFlipFrequencySettingsModel(boolean z, long j, long j2, int i, int i2) {
        this.f28switch = z;
        this.delayTimeTypeA = j;
        this.delayTimeTypeB = j2;
        this.promoteIconFlipMaxTimes = i;
        this.promoteIconFlipTimeGap = i2;
    }
}
