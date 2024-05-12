package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_preview_card_config")
/* loaded from: classes6.dex */
public final class LiveProfileV3Setting {

    @Group(isDefault = true, value = "default group")
    public static final LiveProfileCardV3Config DEFAULT;
    public static final LiveProfileV3Setting INSTANCE = new LiveProfileV3Setting();
    public static final LiveProfileCardV3Config config;

    static {
        LiveProfileCardV3Config liveProfileCardV3Config = new LiveProfileCardV3Config(false, 0L, false, false, 15, null);
        DEFAULT = liveProfileCardV3Config;
        LiveProfileCardV3Config liveProfileCardV3Config2 = (LiveProfileCardV3Config) SettingsManager.INSTANCE.getValueSafely(LiveProfileV3Setting.class);
        if (liveProfileCardV3Config2 != null) {
            liveProfileCardV3Config = liveProfileCardV3Config2;
        }
        config = liveProfileCardV3Config;
    }

    public final long getFetchTimeoutMs() {
        return config.getFetchTimeoutMs();
    }

    public final boolean isEnableAuthorPrefetch() {
        return config.getEnableAuthorPrefetch();
    }

    public final boolean isEnableFastFollow() {
        return config.getEnableFastFollow();
    }

    public final boolean isEnableFetchThenShow() {
        LiveProfileCardV3Config liveProfileCardV3Config = config;
        if (liveProfileCardV3Config.getFetchThenShow() && liveProfileCardV3Config.getFetchTimeoutMs() > 500) {
            return true;
        }
        return false;
    }
}
