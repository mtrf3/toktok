package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65784Pro;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_host_invite_friend_panel_style")
/* loaded from: classes14.dex */
public final class MultiGuestAnchorPanelTypeSetting {
    public static boolean forceDisable;
    public static InterfaceC65784Pro<Boolean> isMicRoom;
    public static final MultiGuestAnchorPanelTypeSetting INSTANCE = new MultiGuestAnchorPanelTypeSetting();

    @Group(isDefault = true, value = "default group")
    public static final PanelStyle DEFAULT = new PanelStyle(0, false, 3, null);

    public final void setDisable() {
        forceDisable = true;
    }

    public final PanelStyle getValue() {
        if (forceDisable) {
            return new PanelStyle(0, false, 3, null);
        }
        PanelStyle panelStyle = (PanelStyle) SettingsManager.INSTANCE.getValueSafely(MultiGuestAnchorPanelTypeSetting.class);
        if (panelStyle == null) {
            return new PanelStyle(0, false, 3, null);
        }
        return panelStyle;
    }

    public final boolean isInLabGroup() {
        int i;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = isMicRoom;
        if ((interfaceC65784Pro == null || !interfaceC65784Pro.invoke().booleanValue()) && (i = getValue().panelType) != 0 && (i == 1 || i == 2)) {
            return true;
        }
        return false;
    }

    public final boolean isShowViewMore() {
        if (getValue().panelType != 2 || !getValue().showViewMore) {
            return false;
        }
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = isMicRoom;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean isTwoTabType() {
        if (getValue().panelType != 1) {
            return false;
        }
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = isMicRoom;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return false;
        }
        return true;
    }

    public final PanelStyle getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getForceDisable() {
        return forceDisable;
    }

    public final InterfaceC65784Pro<Boolean> isMicRoom() {
        return isMicRoom;
    }

    public final void setForceDisable(boolean z) {
        forceDisable = z;
    }

    public final void setMicRoom(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        isMicRoom = interfaceC65784Pro;
    }
}
