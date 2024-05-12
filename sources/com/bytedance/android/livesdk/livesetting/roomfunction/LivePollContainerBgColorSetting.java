package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C30634C0o;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_poll_container_bg_color")
/* loaded from: classes6.dex */
public final class LivePollContainerBgColorSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LivePollContainerBgColorSetting INSTANCE = new LivePollContainerBgColorSetting();
    public static final C5H3 color$delegate = C78996UzQ.LJJIJIIJI(C30634C0o.LJLIL);

    public final String getColor() {
        return (String) color$delegate.getValue();
    }
}
