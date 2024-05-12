package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_pre_download_live")
/* loaded from: classes6.dex */
public final class EnablePreDownloadLive {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnablePreDownloadLive INSTANCE = new EnablePreDownloadLive();

    @Group("v1")
    public static final int ENABLE = 1;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(EnablePreDownloadLive.class) == 1) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getENABLE() {
        return ENABLE;
    }
}
