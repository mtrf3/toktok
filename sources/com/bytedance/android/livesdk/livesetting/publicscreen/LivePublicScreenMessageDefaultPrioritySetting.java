package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C5H3;
import X.CF0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenMsgPriorityConfig;

@SettingsKey(preciseExperiment = false, value = "live_publicscreen_message_default_priority")
/* loaded from: classes6.dex */
public final class LivePublicScreenMessageDefaultPrioritySetting {
    public static final LivePublicScreenMessageDefaultPrioritySetting INSTANCE = new LivePublicScreenMessageDefaultPrioritySetting();

    @Group(isDefault = true, value = "default group")
    public static final LivePublicScreenMsgPriorityConfig DEFAULT = new LivePublicScreenMsgPriorityConfig();
    public static final C5H3 priority$delegate = C221108m2.LIZIZ(CF0.LJLIL);

    public static final long getDefaultPriorityForAnchor() {
        return INSTANCE.getPriority().priorityForAnchor;
    }

    public static final long getDefaultPriorityForAudience() {
        return INSTANCE.getPriority().priorityForAudience;
    }

    private final LivePublicScreenMsgPriorityConfig getPriority() {
        return (LivePublicScreenMsgPriorityConfig) priority$delegate.getValue();
    }

    public final LivePublicScreenMsgPriorityConfig getValue() {
        LivePublicScreenMsgPriorityConfig livePublicScreenMsgPriorityConfig = (LivePublicScreenMsgPriorityConfig) SettingsManager.INSTANCE.getValueSafely(LivePublicScreenMessageDefaultPrioritySetting.class);
        if (livePublicScreenMsgPriorityConfig == null) {
            return DEFAULT;
        }
        return livePublicScreenMsgPriorityConfig;
    }
}
