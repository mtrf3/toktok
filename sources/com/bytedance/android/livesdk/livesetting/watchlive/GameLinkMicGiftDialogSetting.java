package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.game.GameLinkMicGiftDialogConfig;

@SettingsKey("live_game_link_mic_gift_dialog_setting")
/* loaded from: classes6.dex */
public final class GameLinkMicGiftDialogSetting {
    public static final GameLinkMicGiftDialogSetting INSTANCE = new GameLinkMicGiftDialogSetting();

    @Group(isDefault = true, value = "default group")
    public static final GameLinkMicGiftDialogConfig DEFAULT = new GameLinkMicGiftDialogConfig(false, false);

    private final GameLinkMicGiftDialogConfig getValue() {
        GameLinkMicGiftDialogConfig gameLinkMicGiftDialogConfig = (GameLinkMicGiftDialogConfig) SettingsManager.INSTANCE.getValueSafely(GameLinkMicGiftDialogSetting.class);
        if (gameLinkMicGiftDialogConfig == null) {
            return DEFAULT;
        }
        return gameLinkMicGiftDialogConfig;
    }

    public final boolean isBlockBarrier() {
        return getValue().isBlockBarrier;
    }

    public final boolean isBlockWidget() {
        return getValue().isBlockWidget;
    }
}
