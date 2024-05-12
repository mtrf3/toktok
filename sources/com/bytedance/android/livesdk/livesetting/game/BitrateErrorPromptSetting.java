package com.bytedance.android.livesdk.livesetting.game;

import X.C09650Zl;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("ttlive_game_bitrate_error_prompt_setting")
/* loaded from: classes6.dex */
public final class BitrateErrorPromptSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final BitrateErrorPromptSetting INSTANCE = new BitrateErrorPromptSetting();

    private final String getStringValue() {
        return SettingsManager.INSTANCE.getStringValue(BitrateErrorPromptSetting.class);
    }

    public final BitrateErrorPromptData getData() {
        try {
            return (BitrateErrorPromptData) C09650Zl.LIZIZ.LJI(getStringValue(), BitrateErrorPromptData.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean isEnable() {
        BitrateErrorPromptData data = getData();
        if (data != null) {
            return o.LJ(data.enable, Boolean.TRUE);
        }
        return false;
    }
}
