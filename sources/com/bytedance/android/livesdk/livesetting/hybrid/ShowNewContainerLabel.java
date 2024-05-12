package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_show_live_new_container_label")
/* loaded from: classes6.dex */
public final class ShowNewContainerLabel {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final ShowNewContainerLabel INSTANCE = new ShowNewContainerLabel();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ShowNewContainerLabel.class);
    }
}
