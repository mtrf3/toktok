package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_report_schema_handle")
/* loaded from: classes6.dex */
public final class SchemaHandleReportSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final SchemaHandleReportSetting INSTANCE = new SchemaHandleReportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SchemaHandleReportSetting.class);
    }
}
