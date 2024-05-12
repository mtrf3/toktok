package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_navi_prefab_effect_name")
/* loaded from: classes6.dex */
public final class LiveNaviPrefabEffectNameSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "navi_head_prefab_live";
    public static final LiveNaviPrefabEffectNameSetting INSTANCE = new LiveNaviPrefabEffectNameSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveNaviPrefabEffectNameSetting.class);
    }
}
