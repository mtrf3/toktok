package com.bytedance.android.livesdk.livesetting.watchlive;

import X.BQL;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_chat_image_refactor")
/* loaded from: classes6.dex */
public final class LiveChatViewImageSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LiveChatViewImageSetting INSTANCE = new LiveChatViewImageSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BQL.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
