package com.bytedance.android.livesdk.livesetting.performance;

import X.C30060Bqy;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_watch_live_interaction_reuse")
/* loaded from: classes6.dex */
public final class LiveWatchLiveInteractionReuseSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveWatchLiveInteractionReuseSetting INSTANCE = new LiveWatchLiveInteractionReuseSetting();
    public static final C5H3 enabled$delegate = C78996UzQ.LJJIJIIJI(C30060Bqy.LJLIL);

    public final boolean getEnabled() {
        return ((Boolean) enabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWatchLiveInteractionReuseSetting.class);
    }
}
