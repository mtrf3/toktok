package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

@SettingsKey("live_fans_club_level")
/* loaded from: classes6.dex */
public final class FansClubSettings {
    public static final FansClubSettings INSTANCE = new FansClubSettings();

    @Group(isDefault = true, value = "default group")
    public static final FansClubConfig DEFAULT = new FansClubConfig(new ArrayList(), new FansClubDynamicConfig(10, false, 4000, 1), new ArrayList(), new ArrayList(), new GeckoResourceDownloadConfig(null, 1, null), new FansClubLottieConfig(null, null, null, 7, null));

    public final FansClubConfig getFansClubConfig() {
        FansClubConfig fansClubConfig = (FansClubConfig) SettingsManager.INSTANCE.getValueSafely(FansClubSettings.class);
        if (fansClubConfig == null) {
            return DEFAULT;
        }
        return fansClubConfig;
    }

    public final FansClubConfig getDEFAULT() {
        return DEFAULT;
    }
}
