package com.bytedance.android.livesdk.livesetting.rank;

import X.C221108m2;
import X.C31054CGs;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_refresh_ranklist_interval")
/* loaded from: classes6.dex */
public final class AutoRefreshRankListSetting {
    public static final AutoRefreshRankListSetting INSTANCE = new AutoRefreshRankListSetting();

    @Group(isDefault = true, value = "default group")
    public static final AutoRefreshRankInterval DEFAULT = new AutoRefreshRankInterval(5, 5);
    public static final C5H3 mSettingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31054CGs.LJLIL);

    private final AutoRefreshRankInterval getMSettingValue() {
        return (AutoRefreshRankInterval) mSettingValue$delegate.getValue();
    }

    public final AutoRefreshRankInterval getConfig() {
        return getMSettingValue();
    }
}
