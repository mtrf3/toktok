package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_anchor_subathon_url")
/* loaded from: classes6.dex */
public final class LiveSubscriptionAnchorSubathonUrl {
    public static final LiveSubscriptionAnchorSubathonUrl INSTANCE = new LiveSubscriptionAnchorSubathonUrl();

    @Group(isDefault = true, value = "default group")
    public static final LiveSubscriptionAnchorSubathonUrlConfig DEFAULT = new LiveSubscriptionAnchorSubathonUrlConfig(null, null, null, null, null, null, 63, null);

    public final LiveSubscriptionAnchorSubathonUrlConfig getValue() {
        LiveSubscriptionAnchorSubathonUrlConfig liveSubscriptionAnchorSubathonUrlConfig = (LiveSubscriptionAnchorSubathonUrlConfig) SettingsManager.INSTANCE.getValueSafely(LiveSubscriptionAnchorSubathonUrl.class);
        if (liveSubscriptionAnchorSubathonUrlConfig == null) {
            return DEFAULT;
        }
        return liveSubscriptionAnchorSubathonUrlConfig;
    }

    public final LiveSubscriptionAnchorSubathonUrlConfig getDEFAULT() {
        return DEFAULT;
    }
}
