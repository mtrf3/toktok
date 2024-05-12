package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_subscription_goal_lynx_url")
/* loaded from: classes6.dex */
public final class SubscribeGoalsLynxUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final SubscribeGoalsLynxUrlSetting INSTANCE;
    public static final String anchor_detail_page;
    public static final String anchor_detail_popup;
    public static final String edit_page;
    public static final String edit_popup;
    public static final String guide_page;
    public static final String guide_popup;
    public static final String history_page;
    public static final String history_popup;
    public static final String management_page;
    public static final String management_popup;
    public static final String pinCard;
    public static final String user_detail_page;
    public static final String user_detail_popup;

    static {
        SubscribeGoalsLynxUrlSetting subscribeGoalsLynxUrlSetting = new SubscribeGoalsLynxUrlSetting();
        INSTANCE = subscribeGoalsLynxUrlSetting;
        String optString = subscribeGoalsLynxUrlSetting.getValue().optString("guide_popup", "");
        o.LJIIIIZZ(optString, "getValue().optString(\"guide_popup\", \"\")");
        guide_popup = optString;
        String optString2 = subscribeGoalsLynxUrlSetting.getValue().optString("edit_popup", "");
        o.LJIIIIZZ(optString2, "getValue().optString(\"edit_popup\", \"\")");
        edit_popup = optString2;
        String optString3 = subscribeGoalsLynxUrlSetting.getValue().optString("anchor_detail_popup", "");
        o.LJIIIIZZ(optString3, "getValue().optString(\"anchor_detail_popup\", \"\")");
        anchor_detail_popup = optString3;
        String optString4 = subscribeGoalsLynxUrlSetting.getValue().optString("user_detail_popup", "");
        o.LJIIIIZZ(optString4, "getValue().optString(\"user_detail_popup\", \"\")");
        user_detail_popup = optString4;
        String optString5 = subscribeGoalsLynxUrlSetting.getValue().optString("management_popup", "");
        o.LJIIIIZZ(optString5, "getValue().optString(\"management_popup\", \"\")");
        management_popup = optString5;
        String optString6 = subscribeGoalsLynxUrlSetting.getValue().optString("history_popup", "");
        o.LJIIIIZZ(optString6, "getValue().optString(\"history_popup\", \"\")");
        history_popup = optString6;
        String optString7 = subscribeGoalsLynxUrlSetting.getValue().optString("guide_page", "");
        o.LJIIIIZZ(optString7, "getValue().optString(\"guide_page\", \"\")");
        guide_page = optString7;
        String optString8 = subscribeGoalsLynxUrlSetting.getValue().optString("edit_page", "");
        o.LJIIIIZZ(optString8, "getValue().optString(\"edit_page\", \"\")");
        edit_page = optString8;
        String optString9 = subscribeGoalsLynxUrlSetting.getValue().optString("anchor_detail_page", "");
        o.LJIIIIZZ(optString9, "getValue().optString(\"anchor_detail_page\", \"\")");
        anchor_detail_page = optString9;
        String optString10 = subscribeGoalsLynxUrlSetting.getValue().optString("user_detail_page", "");
        o.LJIIIIZZ(optString10, "getValue().optString(\"user_detail_page\", \"\")");
        user_detail_page = optString10;
        String optString11 = subscribeGoalsLynxUrlSetting.getValue().optString("management_page", "");
        o.LJIIIIZZ(optString11, "getValue().optString(\"management_page\", \"\")");
        management_page = optString11;
        String optString12 = subscribeGoalsLynxUrlSetting.getValue().optString("history_page", "");
        o.LJIIIIZZ(optString12, "getValue().optString(\"history_page\", \"\")");
        history_page = optString12;
        String optString13 = subscribeGoalsLynxUrlSetting.getValue().optString("pin_card", "");
        o.LJIIIIZZ(optString13, "getValue().optString(\"pin_card\", \"\")");
        pinCard = optString13;
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        if (TextUtils.isEmpty(settingsManager.getStringValue(SubscribeGoalsLynxUrlSetting.class))) {
            return new JSONObject();
        }
        return new JSONObject(settingsManager.getStringValue(SubscribeGoalsLynxUrlSetting.class));
    }

    public final String getAnchor_detail_page() {
        return anchor_detail_page;
    }

    public final String getAnchor_detail_popup() {
        return anchor_detail_popup;
    }

    public final String getEdit_page() {
        return edit_page;
    }

    public final String getEdit_popup() {
        return edit_popup;
    }

    public final String getGuide_page() {
        return guide_page;
    }

    public final String getGuide_popup() {
        return guide_popup;
    }

    public final String getHistory_page() {
        return history_page;
    }

    public final String getHistory_popup() {
        return history_popup;
    }

    public final String getManagement_page() {
        return management_page;
    }

    public final String getManagement_popup() {
        return management_popup;
    }

    public final String getPinCard() {
        return pinCard;
    }

    public final String getUser_detail_page() {
        return user_detail_page;
    }

    public final String getUser_detail_popup() {
        return user_detail_popup;
    }
}
