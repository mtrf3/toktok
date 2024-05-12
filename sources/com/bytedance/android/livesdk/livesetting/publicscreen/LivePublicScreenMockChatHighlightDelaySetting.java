package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C31296CQa;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_mock_chat_highlight_delay")
/* loaded from: classes6.dex */
public final class LivePublicScreenMockChatHighlightDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final LivePublicScreenMockChatHighlightDelaySetting INSTANCE = new LivePublicScreenMockChatHighlightDelaySetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(C31296CQa.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
