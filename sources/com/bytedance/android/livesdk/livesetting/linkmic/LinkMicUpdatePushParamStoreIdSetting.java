package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "update_push_param_store_id")
/* loaded from: classes11.dex */
public final class LinkMicUpdatePushParamStoreIdSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicUpdatePushParamStoreIdSetting INSTANCE = new LinkMicUpdatePushParamStoreIdSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicUpdatePushParamStoreIdSetting.class);
    }
}
