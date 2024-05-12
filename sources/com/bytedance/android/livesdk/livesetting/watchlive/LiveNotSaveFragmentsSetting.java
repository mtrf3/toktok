package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_not_save_fragments")
/* loaded from: classes6.dex */
public final class LiveNotSaveFragmentsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveNotSaveFragmentsSetting INSTANCE = new LiveNotSaveFragmentsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNotSaveFragmentsSetting.class);
    }
}
