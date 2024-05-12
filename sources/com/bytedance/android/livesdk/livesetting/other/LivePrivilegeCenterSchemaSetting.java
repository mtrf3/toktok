package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C58535MyB;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("privilege_entrance_schema")
/* loaded from: classes11.dex */
public final class LivePrivilegeCenterSchemaSetting {
    public static final LivePrivilegeCenterSchemaSetting INSTANCE = new LivePrivilegeCenterSchemaSetting();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=0B0B1F&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_privilege%2Fpages%2Fprivilege_list%2Ftemplate.js&gravity=bottom&height=900rpx";
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58535MyB.LJLIL);

    private final String getSettingValue() {
        return (String) settingValue$delegate.getValue();
    }

    public final String getValue() {
        return getSettingValue();
    }
}
