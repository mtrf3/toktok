package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C5H3;
import X.C78996UzQ;
import X.CH9;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_message_history_refresh_footer_config")
/* loaded from: classes6.dex */
public final class LiveMessageHistoryRefreshFooterConfigSetting {
    public static final LiveMessageHistoryRefreshFooterConfigSetting INSTANCE = new LiveMessageHistoryRefreshFooterConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(CH9.LJLIL);

    public final Config getValue() {
        return (Config) value$delegate.getValue();
    }
}
