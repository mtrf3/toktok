package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("link_mic_sei_sub_scene_tech_switch")
/* loaded from: classes14.dex */
public final class LinkMicSeiSubSceneTechSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicSeiSubSceneTechSwitchSetting INSTANCE = new LinkMicSeiSubSceneTechSwitchSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicSeiSubSceneTechSwitchSetting.class);
    }

    public final boolean enable() {
        return getValue();
    }
}
