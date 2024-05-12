package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_old_container_offline_text")
/* loaded from: classes6.dex */
public final class OldContainerOfflineText {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "This page will be migrated to Spark at 2690, if you don't know what changes this will bring, please contact @mengxiangzhao";
    public static final OldContainerOfflineText INSTANCE = new OldContainerOfflineText();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(OldContainerOfflineText.class);
    }
}
