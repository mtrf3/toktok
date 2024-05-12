package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("postpone_request_batch_share_list")
/* loaded from: classes6.dex */
public final class PostponeRequestBatchShareListSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final PostponeRequestBatchShareListSetting INSTANCE = new PostponeRequestBatchShareListSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PostponeRequestBatchShareListSetting.class);
    }
}
