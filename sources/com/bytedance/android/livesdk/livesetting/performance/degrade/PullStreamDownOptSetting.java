package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C221108m2;
import X.C5H3;
import X.C5S;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("pull_stream_down_opt")
/* loaded from: classes6.dex */
public final class PullStreamDownOptSetting {

    @Group(isDefault = true, value = "control_group")
    public static final int DEFAULT = 0;

    @Group("experimental_group , downgrade alog")
    public static final int V1 = 1;

    @Group("experimental_group, downgrade appmonitor")
    public static final int V2 = 2;

    @Group("experimental_group, downgrade all")
    public static final int V3 = 3;
    public static final PullStreamDownOptSetting INSTANCE = new PullStreamDownOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C5S.LJLIL);

    public final int getEnable() {
        return ((Number) enable$delegate.getValue()).intValue();
    }

    public final boolean isDowngradeALog() {
        if (getEnable() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isDowngradeAll() {
        if (getEnable() == 3) {
            return true;
        }
        return false;
    }

    public final boolean isDowngradeAppMonitor() {
        if (getEnable() == 2) {
            return true;
        }
        return false;
    }
}
