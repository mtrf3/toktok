package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;

@SettingsKey("tt_live_drawer_load_opt")
/* loaded from: classes6.dex */
public final class LiveDrawerLoadOptSetting {
    public static final LiveDrawerLoadOptSetting INSTANCE = new LiveDrawerLoadOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final DrawerLoadOpt DEFAULT = new DrawerLoadOpt();

    public final DrawerLoadOpt getValue() {
        return (DrawerLoadOpt) SettingsManager.INSTANCE.getValueSafely(LiveDrawerLoadOptSetting.class);
    }
}
