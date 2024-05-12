package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "fs_need_event_collect")
/* loaded from: classes6.dex */
public final class FsNeedEventCollectSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FsNeedEventCollectSetting INSTANCE = new FsNeedEventCollectSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FsNeedEventCollectSetting.class);
    }
}
