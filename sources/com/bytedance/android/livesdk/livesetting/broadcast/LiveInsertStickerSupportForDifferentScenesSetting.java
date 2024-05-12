package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_insert_sticker_support_for_different_scenes")
/* loaded from: classes6.dex */
public final class LiveInsertStickerSupportForDifferentScenesSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LiveInsertStickerSupportForDifferentScenesSetting INSTANCE = new LiveInsertStickerSupportForDifferentScenesSetting();

    @Group("Forced insertion logic optimization")
    public static final int V1 = 1;

    @Group("Plugging logic optimization + plugging motion graphics optimization")
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInsertStickerSupportForDifferentScenesSetting.class);
    }

    public final boolean isExperiment() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }

    public final boolean isV2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
