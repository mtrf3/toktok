package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30838C8k;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.concurrent.ThreadLocalRandom;

@SettingsKey("live_broadcast_livelog_opt")
/* loaded from: classes6.dex */
public final class LiveBroadcastLiveLogOpt {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBroadcastLiveLogOpt INSTANCE = new LiveBroadcastLiveLogOpt();
    public static final double randomValue = ThreadLocalRandom.current().nextDouble();
    public static final C5H3 isOffline$delegate = C221108m2.LIZIZ(C30838C8k.LJLIL);

    private final boolean isOffline() {
        return ((Boolean) isOffline$delegate.getValue()).booleanValue();
    }

    public final boolean canReport(double d) {
        if (isOffline() || SettingsManager.INSTANCE.getIntValue(LiveBroadcastLiveLogOpt.class) == 0 || randomValue < d) {
            return true;
        }
        return false;
    }
}
