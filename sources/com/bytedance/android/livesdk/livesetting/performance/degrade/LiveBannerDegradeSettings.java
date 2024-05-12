package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_banner_degrade")
/* loaded from: classes6.dex */
public final class LiveBannerDegradeSettings {
    public static final LiveBannerDegradeSettings INSTANCE = new LiveBannerDegradeSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveBannerDegrade DEFAULT = new LiveBannerDegrade();

    public final LiveBannerDegrade getValue() {
        LiveBannerDegrade liveBannerDegrade = (LiveBannerDegrade) SettingsManager.INSTANCE.getValueSafely(LiveBannerDegradeSettings.class);
        if (liveBannerDegrade == null) {
            return DEFAULT;
        }
        return liveBannerDegrade;
    }

    public final long delayMillis() {
        return getValue().delayLoadBannerTime;
    }

    public final boolean enableBanner() {
        return getValue().enableBanner;
    }

    public final boolean enableRecycleWebview() {
        return getValue().enableRecycleWebview;
    }

    public final LiveBannerDegrade getDEFAULT() {
        return DEFAULT;
    }
}
