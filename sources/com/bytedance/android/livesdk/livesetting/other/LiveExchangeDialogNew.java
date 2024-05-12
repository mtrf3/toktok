package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_exchange_dialog_new")
/* loaded from: classes6.dex */
public final class LiveExchangeDialogNew {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveExchangeDialogNew INSTANCE = new LiveExchangeDialogNew();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveExchangeDialogNew.class);
    }
}
