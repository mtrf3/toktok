package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_search_feed_guest_size_settings")
/* loaded from: classes6.dex */
public final class MultiGuestSearchFeedGuestSizeOptSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestSearchFeedGuestSizeOptSettings INSTANCE = new MultiGuestSearchFeedGuestSizeOptSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestSearchFeedGuestSizeOptSettings.class);
    }
}
