package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.B6G;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_play_abnormal_report")
/* loaded from: classes6.dex */
public final class LivePlayAbnormalReportSetting {
    public static final LivePlayAbnormalReportSetting INSTANCE = new LivePlayAbnormalReportSetting();

    @Group(isDefault = true, value = "enable")
    public static final boolean DEFAULT = true;
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(B6G.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean isEnable() {
        return getEnable();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
