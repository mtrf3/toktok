package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sei_parser_setting")
/* loaded from: classes6.dex */
public final class LiveSeiParserSetting {
    public static final LiveSeiParserSetting INSTANCE = new LiveSeiParserSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSeiConfig DEFAULT = new LiveSeiConfig(0, 0, 3, null);

    private final LiveSeiConfig getConfig() {
        LiveSeiConfig liveSeiConfig = (LiveSeiConfig) SettingsManager.INSTANCE.getValueSafely(LiveSeiParserSetting.class);
        if (liveSeiConfig == null) {
            return DEFAULT;
        }
        return liveSeiConfig;
    }

    public final int seiParserInterval() {
        return getConfig().interval;
    }

    public final int seiParserType() {
        return getConfig().parseType;
    }
}
