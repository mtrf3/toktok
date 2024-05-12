package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("remove_draw_preview_live_end")
/* loaded from: classes11.dex */
public final class RemoveDrawPreviewLiveEndSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final RemoveDrawPreviewLiveEndSetting INSTANCE = new RemoveDrawPreviewLiveEndSetting();

    @Group("v1")
    public static final int enableValue = 1;

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getIntValue(RemoveDrawPreviewLiveEndSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
