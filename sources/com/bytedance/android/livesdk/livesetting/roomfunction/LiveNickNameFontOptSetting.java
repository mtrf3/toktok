package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_nick_name_opt")
/* loaded from: classes6.dex */
public final class LiveNickNameFontOptSetting {
    public static final LiveNickNameFontOptSetting INSTANCE = new LiveNickNameFontOptSetting();

    @Group(isDefault = true, value = "default")
    public static final NickNameOptConfig DEFAULT = new NickNameOptConfig(false, false, 3, null);

    public final boolean enableOptFont() {
        NickNameOptConfig nickNameOptConfig = (NickNameOptConfig) SettingsManager.INSTANCE.getValueSafely(LiveNickNameFontOptSetting.class);
        if (nickNameOptConfig == null) {
            nickNameOptConfig = DEFAULT;
        }
        return nickNameOptConfig.optFont;
    }

    public final boolean enableOptRoundCorner() {
        NickNameOptConfig nickNameOptConfig = (NickNameOptConfig) SettingsManager.INSTANCE.getValueSafely(LiveNickNameFontOptSetting.class);
        if (nickNameOptConfig == null) {
            nickNameOptConfig = DEFAULT;
        }
        return nickNameOptConfig.optRoundCorner;
    }
}
