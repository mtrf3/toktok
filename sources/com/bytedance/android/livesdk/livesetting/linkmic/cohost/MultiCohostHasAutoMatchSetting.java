package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_has_multi_auto_match")
/* loaded from: classes6.dex */
public final class MultiCohostHasAutoMatchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiCohostHasAutoMatchSetting INSTANCE = new MultiCohostHasAutoMatchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiCohostHasAutoMatchSetting.class);
    }
}
