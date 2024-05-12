package com.bytedance.android.livesdk.livesetting.performance;

import X.C30992CEi;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.model.TrackerEventDeprecated;
import java.util.List;
import kotlin.jvm.internal.o;

@SettingsKey("live_tracker_event_deprecated")
/* loaded from: classes6.dex */
public final class UnusedLogOfflineSetting {
    public static final UnusedLogOfflineSetting INSTANCE = new UnusedLogOfflineSetting();

    @Group(isDefault = true, value = "default group")
    public static final TrackerEventDeprecated DEFAULT = new TrackerEventDeprecated();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C30992CEi.LJLIL);

    public final TrackerEventDeprecated getValue() {
        return (TrackerEventDeprecated) value$delegate.getValue();
    }

    public final boolean isEnable(String key) {
        TrackerEventDeprecated value;
        List<String> list;
        o.LJIIIZ(key, "key");
        try {
            TrackerEventDeprecated value2 = getValue();
            if (value2 != null && !value2.isEnable && (value = getValue()) != null && (list = value.allowList) != null) {
                if (!list.contains(key)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
