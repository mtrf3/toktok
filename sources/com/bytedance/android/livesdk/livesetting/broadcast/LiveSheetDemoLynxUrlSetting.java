package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C5H3;
import X.C77359UXr;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_sheet_demo_lynx_url")
/* loaded from: classes14.dex */
public final class LiveSheetDemoLynxUrlSetting {
    public static final LiveSheetDemoLynxUrlSetting INSTANCE = new LiveSheetDemoLynxUrlSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSheetDemoLynxUrlConfig DEFAULT = new LiveSheetDemoLynxUrlConfig(null, null, null, null, 15, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C77359UXr.LJLIL);

    public static final String sparkNavigate() {
        return INSTANCE.getSettingValue().sparkNavigate;
    }

    public static final String sparkOfflineNavigate() {
        return INSTANCE.getSettingValue().sparkOfflineNavigate;
    }

    public static final String sparkOfflineOverlay() {
        return INSTANCE.getSettingValue().sparkOfflineOverlay;
    }

    public static final String sparkOverlay() {
        return INSTANCE.getSettingValue().sparkOverlay;
    }

    public final LiveSheetDemoLynxUrlConfig getSettingValue() {
        return (LiveSheetDemoLynxUrlConfig) settingValue$delegate.getValue();
    }
}
