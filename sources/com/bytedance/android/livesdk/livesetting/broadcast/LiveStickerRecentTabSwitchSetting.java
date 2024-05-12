package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_effect_has_recent_tab")
/* loaded from: classes6.dex */
public final class LiveStickerRecentTabSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("icon")
    public static final int ICON_STYLE = 2;
    public static final LiveStickerRecentTabSwitchSetting INSTANCE = new LiveStickerRecentTabSwitchSetting();

    @Group("text")
    public static final int TEXT_STYLE = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStickerRecentTabSwitchSetting.class);
    }

    public final boolean canShowRecentTab() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }

    public final boolean showIcon() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean showText() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
