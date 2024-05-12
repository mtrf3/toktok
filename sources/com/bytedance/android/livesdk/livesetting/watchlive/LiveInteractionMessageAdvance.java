package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interaction_message_advance")
/* loaded from: classes6.dex */
public final class LiveInteractionMessageAdvance {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveInteractionMessageAdvance INSTANCE = new LiveInteractionMessageAdvance();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveInteractionMessageAdvance.class);
    }
}
