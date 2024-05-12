package com.bytedance.android.livesdk.livesetting.game;

import X.C221108m2;
import X.C3X;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_game_broadcast_exception_config")
/* loaded from: classes6.dex */
public final class GameBroadcastExceptionConfigSetting {
    public static final GameBroadcastExceptionConfigSetting INSTANCE = new GameBroadcastExceptionConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final GameBroadcastExceptionConfig DEFAULT = new GameBroadcastExceptionConfig(false, null, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C3X.LJLIL);

    private final GameBroadcastExceptionConfig getSettingValue() {
        return (GameBroadcastExceptionConfig) settingValue$delegate.getValue();
    }

    public final GameBroadcastExceptionConfig getValue() {
        return getSettingValue();
    }
}
