package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_check_resource_downloaded_config")
/* loaded from: classes6.dex */
public final class CheckResourceDownloadedSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CheckResourceDownloadedSettings INSTANCE = new CheckResourceDownloadedSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CheckResourceDownloadedSettings.class);
    }
}
