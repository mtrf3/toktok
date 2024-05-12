package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_karaoke_max_download_count")
/* loaded from: classes6.dex */
public final class LiveKaraokeMaxDownloadCount {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final LiveKaraokeMaxDownloadCount INSTANCE = new LiveKaraokeMaxDownloadCount();

    public final int maxCount() {
        return SettingsManager.INSTANCE.getIntValue(LiveKaraokeMaxDownloadCount.class);
    }
}
