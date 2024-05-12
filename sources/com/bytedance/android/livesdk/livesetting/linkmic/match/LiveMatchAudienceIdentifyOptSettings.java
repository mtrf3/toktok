package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("audience_match_identify_policy")
/* loaded from: classes6.dex */
public final class LiveMatchAudienceIdentifyOptSettings {
    public static final LiveMatchAudienceIdentifyOptSettings INSTANCE = new LiveMatchAudienceIdentifyOptSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveMatchAudienceIdentifyOptSettingsData DEFAULT = new LiveMatchAudienceIdentifyOptSettingsData(false, false, false, false, 15, null);

    private final LiveMatchAudienceIdentifyOptSettingsData getConfig() {
        return (LiveMatchAudienceIdentifyOptSettingsData) SettingsManager.INSTANCE.getValueSafely(LiveMatchAudienceIdentifyOptSettings.class);
    }

    public final boolean blockMatchOpenMsg() {
        LiveMatchAudienceIdentifyOptSettingsData config = getConfig();
        if (config != null) {
            return config.enable_block_match_open_msg;
        }
        return false;
    }

    public final boolean isArmiesFallBackEnable() {
        LiveMatchAudienceIdentifyOptSettingsData config = getConfig();
        if (config != null) {
            return config.enable_armies_fallback;
        }
        return false;
    }

    public final boolean isOpenMessageEnable() {
        LiveMatchAudienceIdentifyOptSettingsData config = getConfig();
        if (config != null) {
            return config.enable_open_message_cache;
        }
        return false;
    }

    public final boolean isSeiFallBackEnable() {
        LiveMatchAudienceIdentifyOptSettingsData config = getConfig();
        if (config != null) {
            return config.enable_sei_fallback;
        }
        return false;
    }
}
