package com.bytedance.android.livesdk.livesetting.broadcast;

import X.X1D;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey(preciseExperiment = false, value = "game_live_push_resolution_rule_setting")
/* loaded from: classes6.dex */
public final class GameLivePushResolutionRuleSettingSetting {
    public static final GameLivePushResolutionRuleSettingSetting INSTANCE = new GameLivePushResolutionRuleSettingSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(GameLivePushResolutionRuleSettingSetting.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : getValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("; ");
            sb.append(X1D.LIZIZ(LIZ));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringBuilder.toString()");
        return sb2;
    }
}
