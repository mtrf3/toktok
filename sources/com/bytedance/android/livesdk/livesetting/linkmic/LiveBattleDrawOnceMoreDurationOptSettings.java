package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C31010CFa;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_battle_draw_oncemore_duration_opt")
/* loaded from: classes6.dex */
public final class LiveBattleDrawOnceMoreDurationOptSettings {
    public static final LiveBattleDrawOnceMoreDurationOptSettings INSTANCE = new LiveBattleDrawOnceMoreDurationOptSettings();

    @Group(isDefault = true, value = "default group")
    public static final SettingsParams DEFAULT = new SettingsParams(0, null, null, 7, null);
    public static final C5H3 settingsValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31010CFa.LJLIL);

    private final SettingsParams getSettingsValue() {
        return (SettingsParams) settingsValue$delegate.getValue();
    }

    public final String durationOptBusinessName() {
        return getSettingsValue().durationOptBusinessName;
    }

    public final boolean enable() {
        if (getSettingsValue().status > 0) {
            return true;
        }
        return false;
    }

    public final String featureCollectBusinessName() {
        return getSettingsValue().featureCollectBusinessName;
    }

    public final boolean multiMatchEnable() {
        if ((getSettingsValue().status & 2) > 0) {
            return true;
        }
        return false;
    }

    public final boolean twoMatchEnable() {
        if ((getSettingsValue().status & 1) > 0) {
            return true;
        }
        return false;
    }
}
