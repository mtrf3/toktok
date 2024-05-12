package com.bytedance.android.livesdk.livesetting.game;

import X.C221108m2;
import X.C58533My9;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_game_broadcast_speed_test_upload_mapping")
/* loaded from: classes11.dex */
public final class GameLiveBroadcastSpeedDetectionUploadMappingSetting {
    public static final GameLiveBroadcastSpeedDetectionUploadMappingSetting INSTANCE = new GameLiveBroadcastSpeedDetectionUploadMappingSetting();

    @Group(isDefault = true, value = "default group")
    public static final UploadSpeedDetectionMapping DEFAULT = new UploadSpeedDetectionMapping(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58533My9.LJLIL);

    private final UploadSpeedDetectionMapping getSettingValue() {
        return (UploadSpeedDetectionMapping) settingValue$delegate.getValue();
    }

    public final UploadSpeedDetectionMapping getValue() {
        return getSettingValue();
    }
}
