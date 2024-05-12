package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sheet_migration_anchor_guide_settings")
/* loaded from: classes6.dex */
public final class LiveSheetMigrationAnchorGuideSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSheetMigrationAnchorGuideSettings INSTANCE = new LiveSheetMigrationAnchorGuideSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSheetMigrationAnchorGuideSettings.class);
    }
}
