package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_recharge_insufficient_package_recommendation_timeout")
/* loaded from: classes11.dex */
public final class LiveRechargeInsufficientPackageRecommendationTimeout {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 2;
    public static final LiveRechargeInsufficientPackageRecommendationTimeout INSTANCE = new LiveRechargeInsufficientPackageRecommendationTimeout();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveRechargeInsufficientPackageRecommendationTimeout.class);
    }
}
