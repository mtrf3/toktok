package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_high_traffic_buffer_dropping_strategy_android")
/* loaded from: classes6.dex */
public final class GiftHighTrafficDropMessageSetting {

    @Group(isDefault = true, value = "default group")
    public static final GiftHighTrafficDropMessageConfig DEFAULT;
    public static final GiftHighTrafficDropMessageSetting INSTANCE;
    public static final boolean enabled;
    public static final boolean skipLowerCombo;

    static {
        boolean z;
        GiftHighTrafficDropMessageSetting giftHighTrafficDropMessageSetting = new GiftHighTrafficDropMessageSetting();
        INSTANCE = giftHighTrafficDropMessageSetting;
        DEFAULT = new GiftHighTrafficDropMessageConfig(0, 0, 0L, 0, 0, 0, 63, null);
        boolean z2 = true;
        if (giftHighTrafficDropMessageSetting.getConfig().maxQueueLength > 0) {
            z = true;
        } else {
            z = false;
        }
        enabled = z;
        if (!z || giftHighTrafficDropMessageSetting.getConfig().disableSkipLowerCombo != 0) {
            z2 = false;
        }
        skipLowerCombo = z2;
    }

    public final GiftHighTrafficDropMessageConfig getConfig() {
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfig = (GiftHighTrafficDropMessageConfig) SettingsManager.INSTANCE.getValueSafely(GiftHighTrafficDropMessageSetting.class);
        if (giftHighTrafficDropMessageConfig == null) {
            return DEFAULT;
        }
        return giftHighTrafficDropMessageConfig;
    }

    public final GiftHighTrafficDropMessageConfig getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final boolean getSkipLowerCombo() {
        return skipLowerCombo;
    }
}
