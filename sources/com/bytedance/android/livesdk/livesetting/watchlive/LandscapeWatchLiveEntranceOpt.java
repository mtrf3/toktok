package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("landscape_watch_live_entrance_opt")
/* loaded from: classes6.dex */
public final class LandscapeWatchLiveEntranceOpt {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LandscapeWatchLiveEntranceOpt INSTANCE = new LandscapeWatchLiveEntranceOpt();

    public final int getGroup() {
        return SettingsManager.INSTANCE.getIntValue(LandscapeWatchLiveEntranceOpt.class);
    }

    public final boolean enable() {
        if (getGroup() > 0) {
            return true;
        }
        return false;
    }

    public final boolean enableLandscapeBackButton() {
        int group = getGroup();
        if (group == 2 || group == 4) {
            return true;
        }
        return false;
    }
}
