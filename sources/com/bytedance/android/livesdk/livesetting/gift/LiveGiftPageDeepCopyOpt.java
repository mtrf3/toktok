package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_gift_page_deep_copy_opt")
/* loaded from: classes6.dex */
public final class LiveGiftPageDeepCopyOpt {

    @Group(isDefault = true, value = "Disable")
    public static final int DEFAULT = 0;

    @Group("Enable")
    public static final int ENABLE = 1;
    public static final LiveGiftPageDeepCopyOpt INSTANCE = new LiveGiftPageDeepCopyOpt();

    public static final boolean enabled() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftPageDeepCopyOpt.class) > 0) {
            return true;
        }
        return false;
    }
}
