package com.bytedance.android.livesdk.livesetting.clientai;

import X.C221108m2;
import X.C32156Cjg;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gift_guide_client_trigger_request_settings")
/* loaded from: classes6.dex */
public final class LiveClientTriggerRequestSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveClientTriggerRequestSettings INSTANCE = new LiveClientTriggerRequestSettings();
    public static final C5H3 requestSetting$delegate = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C32156Cjg.LJLIL);

    public final int getRequestSetting() {
        return ((Number) requestSetting$delegate.getValue()).intValue();
    }
}
