package com.bytedance.android.livesdk.livesetting.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveTooltipDebugConfig implements Serializable {

    @InterfaceC65349Pkn("bubble_frequency_control_all_close")
    public boolean allClose;

    @InterfaceC65349Pkn("bubble_change_color")
    public boolean changeColor;

    @InterfaceC65349Pkn("bubble_frequence_control_daily_limit")
    public int dailyLimit;

    @InterfaceC65349Pkn("bubble_frequence_control_outdate_version")
    public int outdateVersion;

    @InterfaceC65349Pkn("bubble_frequency_control_position")
    public boolean positionCheck;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveTooltipDebugConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    public final boolean getAllClose() {
        return this.allClose;
    }

    public final boolean getChangeColor() {
        return this.changeColor;
    }

    public final int getDailyLimit() {
        return this.dailyLimit;
    }

    public final int getOutdateVersion() {
        return this.outdateVersion;
    }

    public final boolean getPositionCheck() {
        return this.positionCheck;
    }

    public final void setAllClose(boolean z) {
        this.allClose = z;
    }

    public final void setChangeColor(boolean z) {
        this.changeColor = z;
    }

    public final void setDailyLimit(int i) {
        this.dailyLimit = i;
    }

    public final void setOutdateVersion(int i) {
        this.outdateVersion = i;
    }

    public final void setPositionCheck(boolean z) {
        this.positionCheck = z;
    }

    public LiveTooltipDebugConfig(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.changeColor = z;
        this.allClose = z2;
        this.dailyLimit = i;
        this.outdateVersion = i2;
        this.positionCheck = z3;
    }

    public /* synthetic */ LiveTooltipDebugConfig(boolean z, boolean z2, int i, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? true : z3);
    }
}
