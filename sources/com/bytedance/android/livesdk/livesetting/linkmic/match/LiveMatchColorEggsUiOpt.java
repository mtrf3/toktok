package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.B9K;
import X.C87277YNd;
import X.CN1;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

@SettingsKey("match_enable_color_eggs_ui_opt")
/* loaded from: classes6.dex */
public final class LiveMatchColorEggsUiOpt {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMatchColorEggsUiOpt INSTANCE = new LiveMatchColorEggsUiOpt();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveMatchColorEggsUiOpt.class) && C87277YNd.LJIIJ(B9K.LIZIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context())) >= 640.0f) {
            return true;
        }
        return false;
    }
}
