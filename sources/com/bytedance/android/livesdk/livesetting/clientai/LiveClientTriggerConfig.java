package com.bytedance.android.livesdk.livesetting.clientai;

import X.C221108m2;
import X.C5H3;
import X.CFW;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.List;

@SettingsKey("live_client_trigger_framework_config")
/* loaded from: classes6.dex */
public final class LiveClientTriggerConfig {
    public static final LiveClientTriggerConfig INSTANCE = new LiveClientTriggerConfig();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(0, null, 0, 7, null);
    public static final C5H3 config$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CFW.LJLIL);

    private final Config getConfig() {
        return (Config) config$delegate.getValue();
    }

    public final int delayDownloadPkgs() {
        return getConfig().delayDownloadPkgs;
    }

    public final boolean enable() {
        if (getConfig().enable > 0) {
            return true;
        }
        return false;
    }

    public final List<String> imEventList() {
        return getConfig().imMsgEnableList;
    }
}
