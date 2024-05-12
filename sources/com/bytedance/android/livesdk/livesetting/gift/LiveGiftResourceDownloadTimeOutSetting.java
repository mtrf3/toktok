package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_resources_download_timeout")
/* loaded from: classes11.dex */
public final class LiveGiftResourceDownloadTimeOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 10000;
    public static final LiveGiftResourceDownloadTimeOutSetting INSTANCE = new LiveGiftResourceDownloadTimeOutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveGiftResourceDownloadTimeOutSetting.class);
    }
}
