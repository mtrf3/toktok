package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_onboarding_program_panel_schema")
/* loaded from: classes6.dex */
public final class LiveOnboardingProgramPanelSchema {
    public static final LiveOnboardingProgramPanelSchema INSTANCE = new LiveOnboardingProgramPanelSchema();

    @Group(isDefault = true, value = "default group")
    public static final LiveLOPSchemaData DEFAULT = new LiveLOPSchemaData(null, null, 3, null);

    public final String getValue() {
        LiveLOPSchemaData liveLOPSchemaData = (LiveLOPSchemaData) SettingsManager.INSTANCE.getValueSafely(LiveOnboardingProgramPanelSchema.class);
        if (liveLOPSchemaData == null) {
            liveLOPSchemaData = DEFAULT;
        }
        return liveLOPSchemaData.popupSchema;
    }
}
