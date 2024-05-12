package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_replace_first_stream_type")
/* loaded from: classes6.dex */
public final class LiveReplaceFirstStreamTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveReplaceFirstStreamTypeSetting INSTANCE = new LiveReplaceFirstStreamTypeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveReplaceFirstStreamTypeSetting.class);
    }
}
