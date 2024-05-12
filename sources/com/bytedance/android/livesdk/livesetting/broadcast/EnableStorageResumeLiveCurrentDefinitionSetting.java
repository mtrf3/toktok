package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_storage_resume_live_current_definition")
/* loaded from: classes6.dex */
public final class EnableStorageResumeLiveCurrentDefinitionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableStorageResumeLiveCurrentDefinitionSetting INSTANCE = new EnableStorageResumeLiveCurrentDefinitionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableStorageResumeLiveCurrentDefinitionSetting.class);
    }
}
