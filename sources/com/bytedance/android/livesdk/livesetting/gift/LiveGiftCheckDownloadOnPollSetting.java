package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_check_download_on_poll_strategy")
/* loaded from: classes6.dex */
public final class LiveGiftCheckDownloadOnPollSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftCheckDownloadOnPollSetting INSTANCE = new LiveGiftCheckDownloadOnPollSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftCheckDownloadOnPollSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
