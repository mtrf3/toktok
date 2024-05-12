package com.bytedance.android.livesdk.livesetting.subscription;

import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@SettingsKey("live_subscription_invitation_lynx_url")
/* loaded from: classes6.dex */
public final class SubscribeInvitationLynxUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final SubscribeInvitationLynxUrlSetting INSTANCE;
    public static final String activityId;
    public static final String activityUrl;
    public static final String home_page;
    public static final String invitation_card;
    public static final String wrong_invitation;

    static {
        SubscribeInvitationLynxUrlSetting subscribeInvitationLynxUrlSetting = new SubscribeInvitationLynxUrlSetting();
        INSTANCE = subscribeInvitationLynxUrlSetting;
        String optString = subscribeInvitationLynxUrlSetting.getValue().optString("home_page", "");
        o.LJIIIIZZ(optString, "getValue().optString(\"home_page\", \"\")");
        home_page = optString;
        String optString2 = subscribeInvitationLynxUrlSetting.getValue().optString("invitation_card", "");
        o.LJIIIIZZ(optString2, "getValue().optString(\"invitation_card\", \"\")");
        invitation_card = optString2;
        String optString3 = subscribeInvitationLynxUrlSetting.getValue().optString("wrong_invitation", "");
        o.LJIIIIZZ(optString3, "getValue().optString(\"wrong_invitation\", \"\")");
        wrong_invitation = optString3;
        String optString4 = subscribeInvitationLynxUrlSetting.getValue().optString("activity_id", "");
        o.LJIIIIZZ(optString4, "getValue().optString(\"activity_id\", \"\")");
        activityId = optString4;
        String optString5 = subscribeInvitationLynxUrlSetting.getValue().optString("activity_url", "");
        o.LJIIIIZZ(optString5, "getValue().optString(\"activity_url\", \"\")");
        activityUrl = optString5;
    }

    public final JSONObject getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        if (TextUtils.isEmpty(settingsManager.getStringValue(SubscribeInvitationLynxUrlSetting.class))) {
            return new JSONObject();
        }
        return new JSONObject(settingsManager.getStringValue(SubscribeInvitationLynxUrlSetting.class));
    }

    public final boolean showActivityEntry() {
        if (activityId.length() > 0) {
            return true;
        }
        return false;
    }

    public final String getActivityId() {
        return activityId;
    }

    public final String getActivityUrl() {
        return activityUrl;
    }

    public final String getHome_page() {
        return home_page;
    }

    public final String getInvitation_card() {
        return invitation_card;
    }

    public final String getWrong_invitation() {
        return wrong_invitation;
    }
}
