package com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes16.dex */
public final class DigitalWellbeingSetting implements Serializable {

    @InterfaceC65349Pkn("isTeenageModeSelf")
    public boolean isRestrictModeSelf;

    @InterfaceC65349Pkn("isWeeklyUpdate")
    public boolean isWeeklyUpdate;

    @InterfaceC65349Pkn("screenTimeBreaks")
    public int screenTimeBreaks;

    @InterfaceC65349Pkn("screenTimeType")
    public int screenTimeType;

    @InterfaceC65349Pkn("timeLockSelfEnable")
    public int timeLockSelfEnable;

    @InterfaceC65349Pkn("timeLockSelfInMin")
    public int timeLockSelfInMin;

    @InterfaceC65349Pkn("timeLockSelfType")
    public int timeLockSelfType;

    @InterfaceC65349Pkn("timelockEligible")
    public int timelockEligible;

    public final int getScreenTimeBreaks() {
        return this.screenTimeBreaks;
    }

    public final int getScreenTimeType() {
        return this.screenTimeType;
    }

    public final int getTimeLockSelfEnable() {
        return this.timeLockSelfEnable;
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final int getTimeLockSelfType() {
        return this.timeLockSelfType;
    }

    public final int getTimelockEligible() {
        return this.timelockEligible;
    }

    public final boolean isRestrictModeSelf() {
        return this.isRestrictModeSelf;
    }

    public final boolean isWeeklyUpdate() {
        return this.isWeeklyUpdate;
    }

    public final void setRestrictModeSelf(boolean z) {
        this.isRestrictModeSelf = z;
    }

    public final void setScreenTimeBreaks(int i) {
        this.screenTimeBreaks = i;
    }

    public final void setScreenTimeType(int i) {
        this.screenTimeType = i;
    }

    public final void setTimeLockSelfEnable(int i) {
        this.timeLockSelfEnable = i;
    }

    public final void setTimeLockSelfInMin(int i) {
        this.timeLockSelfInMin = i;
    }

    public final void setTimeLockSelfType(int i) {
        this.timeLockSelfType = i;
    }

    public final void setTimelockEligible(int i) {
        this.timelockEligible = i;
    }

    public final void setWeeklyUpdate(boolean z) {
        this.isWeeklyUpdate = z;
    }

    public DigitalWellbeingSetting(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6) {
        this.isRestrictModeSelf = z;
        this.timeLockSelfInMin = i;
        this.timeLockSelfEnable = i2;
        this.timelockEligible = i3;
        this.timeLockSelfType = i4;
        this.isWeeklyUpdate = z2;
        this.screenTimeBreaks = i5;
        this.screenTimeType = i6;
    }
}
