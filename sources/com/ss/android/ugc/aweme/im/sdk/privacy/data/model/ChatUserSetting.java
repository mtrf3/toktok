package com.ss.android.ugc.aweme.im.sdk.privacy.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ChatUserSetting extends F9E implements Serializable {

    @InterfaceC65349Pkn("chat_set")
    public final int chatSet;

    @InterfaceC65349Pkn("chat_settings_panel")
    public final int chatSettingsPanel;

    @InterfaceC65349Pkn("chat_user_type")
    public final int chatUserType;

    public static /* synthetic */ ChatUserSetting copy$default(ChatUserSetting chatUserSetting, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = chatUserSetting.chatSet;
        }
        if ((i4 & 2) != 0) {
            i2 = chatUserSetting.chatSettingsPanel;
        }
        if ((i4 & 4) != 0) {
            i3 = chatUserSetting.chatUserType;
        }
        return chatUserSetting.copy(i, i2, i3);
    }

    public final ChatUserSetting copy(int i, int i2, int i3) {
        return new ChatUserSetting(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.chatSet), Integer.valueOf(this.chatSettingsPanel), Integer.valueOf(this.chatUserType)};
    }

    public final int getChatSet() {
        return this.chatSet;
    }

    public final int getChatSettingsPanel() {
        return this.chatSettingsPanel;
    }

    public final int getChatUserType() {
        return this.chatUserType;
    }

    public ChatUserSetting(int i, int i2, int i3) {
        this.chatSet = i;
        this.chatSettingsPanel = i2;
        this.chatUserType = i3;
    }
}
