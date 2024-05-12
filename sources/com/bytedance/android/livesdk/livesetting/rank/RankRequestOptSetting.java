package com.bytedance.android.livesdk.livesetting.rank;

import X.B6B;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_rank_request_optimize_setting")
/* loaded from: classes6.dex */
public final class RankRequestOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final RankRequestOptSetting INSTANCE = new RankRequestOptSetting();
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, B6B.LJLIL);

    private final int getConfigValue() {
        return ((Number) configValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getConfigValue();
    }
}
