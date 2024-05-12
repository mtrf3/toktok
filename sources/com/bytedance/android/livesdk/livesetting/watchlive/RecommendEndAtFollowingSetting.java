package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveRecommendAtEnd;

@SettingsKey("recommended_end_at_following_live")
/* loaded from: classes6.dex */
public final class RecommendEndAtFollowingSetting {
    public static final RecommendEndAtFollowingSetting INSTANCE = new RecommendEndAtFollowingSetting();

    @Group(isDefault = true, value = "control_group")
    public static final LiveRecommendAtEnd DEFAULT = new LiveRecommendAtEnd();

    public final LiveRecommendAtEnd getValue() {
        LiveRecommendAtEnd liveRecommendAtEnd = (LiveRecommendAtEnd) SettingsManager.INSTANCE.getValueSafely(RecommendEndAtFollowingSetting.class);
        if (liveRecommendAtEnd == null) {
            return DEFAULT;
        }
        return liveRecommendAtEnd;
    }
}
