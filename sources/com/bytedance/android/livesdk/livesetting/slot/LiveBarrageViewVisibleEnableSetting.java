package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_barrage_view_visible_enable")
/* loaded from: classes6.dex */
public final class LiveBarrageViewVisibleEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveBarrageViewVisibleEnableSetting INSTANCE = new LiveBarrageViewVisibleEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBarrageViewVisibleEnableSetting.class);
    }
}
