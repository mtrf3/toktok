package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class StateConfig {

    @InterfaceC65349Pkn("state_check_duration")
    public int checkDuration;

    @InterfaceC65349Pkn("state_compare_recheck")
    public int doubleCheck;

    @InterfaceC65349Pkn("state_stat_report")
    public boolean enableStat;

    @InterfaceC65349Pkn("state_filter_by_type")
    public boolean filterStateType;

    @InterfaceC65349Pkn("state_im_config")
    public int imConfig;

    @InterfaceC65349Pkn("state_sync_rtc")
    public boolean syncWithRTC;

    /* JADX WARN: Multi-variable type inference failed */
    public StateConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, null);
    }

    public final int getCheckDuration() {
        return this.checkDuration;
    }

    public final int getDoubleCheck() {
        return this.doubleCheck;
    }

    public final boolean getEnableStat() {
        return this.enableStat;
    }

    public final boolean getFilterStateType() {
        return this.filterStateType;
    }

    public final int getImConfig() {
        return this.imConfig;
    }

    public final boolean getSyncWithRTC() {
        return this.syncWithRTC;
    }

    public final void setCheckDuration(int i) {
        this.checkDuration = i;
    }

    public final void setDoubleCheck(int i) {
        this.doubleCheck = i;
    }

    public final void setEnableStat(boolean z) {
        this.enableStat = z;
    }

    public final void setFilterStateType(boolean z) {
        this.filterStateType = z;
    }

    public final void setImConfig(int i) {
        this.imConfig = i;
    }

    public final void setSyncWithRTC(boolean z) {
        this.syncWithRTC = z;
    }

    public StateConfig(int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
        this.imConfig = i;
        this.enableStat = z;
        this.syncWithRTC = z2;
        this.filterStateType = z3;
        this.doubleCheck = i2;
        this.checkDuration = i3;
    }

    public /* synthetic */ StateConfig(int i, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 15 : i, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? true : z3, (i4 & 16) == 0 ? i2 : 1, (i4 & 32) != 0 ? 60 : i3);
    }
}
