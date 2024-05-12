package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LikeConfig;

@SettingsKey("digg_params")
/* loaded from: classes6.dex */
public final class DiggParamsSetting {

    @Group(isDefault = true, value = "default group")
    public static final LikeConfig DEFAULT;
    public static final DiggParamsSetting INSTANCE = new DiggParamsSetting();

    static {
        LikeConfig likeConfig = new LikeConfig();
        likeConfig.likeStyle = 0;
        likeConfig.tapInterval = 500L;
        likeConfig.sendLikesTapCount = 15;
        likeConfig.showProgressTapCount = 15;
        likeConfig.fullProgressTapCount = 80;
        likeConfig.othersFlowAnimRepeatCount = 1;
        likeConfig.iconForceHeart = false;
        likeConfig.othersFlowAnimDelay = 300L;
        DEFAULT = likeConfig;
    }

    public final LikeConfig getValue() {
        LikeConfig likeConfig = (LikeConfig) SettingsManager.INSTANCE.getValueSafely(DiggParamsSetting.class);
        if (likeConfig == null) {
            return DEFAULT;
        }
        return likeConfig;
    }
}
