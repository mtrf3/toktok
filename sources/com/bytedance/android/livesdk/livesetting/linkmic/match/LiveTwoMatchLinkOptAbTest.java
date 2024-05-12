package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_two_match_link_optimize")
/* loaded from: classes14.dex */
public final class LiveTwoMatchLinkOptAbTest {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveTwoMatchLinkOptAbTest INSTANCE = new LiveTwoMatchLinkOptAbTest();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTwoMatchLinkOptAbTest.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
