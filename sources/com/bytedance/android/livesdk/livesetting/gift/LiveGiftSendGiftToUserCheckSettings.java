package com.bytedance.android.livesdk.livesetting.gift;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("live_gift_send_gift_to_user_check")
/* loaded from: classes6.dex */
public final class LiveGiftSendGiftToUserCheckSettings {

    @Group(isDefault = true, value = "Default")
    public static final HashMap<String, Boolean> DEFAULT;
    public static final LiveGiftSendGiftToUserCheckSettings INSTANCE = new LiveGiftSendGiftToUserCheckSettings();

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT = C113554cx.LJJJLZIJ(new OSZ("is_open_fix_normal_link", bool), new OSZ("is_open_fix_guest_link_host", bool), new OSZ("is_open_fix_guest_link_guest", bool));
    }

    private final Map<String, Boolean> getValue() {
        try {
            Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveGiftSendGiftToUserCheckSettings.class);
            if (map == null) {
                return DEFAULT;
            }
            return map;
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }

    public final boolean blockForGuestLinkGuest() {
        Boolean bool = getValue().get("is_open_fix_guest_link_guest");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean blockForGuestLinkHost() {
        Boolean bool = getValue().get("is_open_fix_guest_link_host");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean blockForNormalLink() {
        Boolean bool = getValue().get("is_open_fix_normal_link");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
