package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_guide_dialog_duration")
/* loaded from: classes11.dex */
public final class LiveGuideDialogDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LiveGuideDialogDurationSetting INSTANCE = new LiveGuideDialogDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideDialogDurationSetting.class);
    }
}
