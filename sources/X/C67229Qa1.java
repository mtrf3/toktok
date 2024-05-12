package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Qa1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67229Qa1 implements Serializable {
    public int activeClickValid;
    public String authorId;
    public String challengeId;
    public String customAction;
    public int enableRTL;
    public String extra_text;
    public int imageShowStyle;
    public String inAppPushType;
    public boolean isBannerDeteled;
    public boolean is_notification_top;
    public String largeModeIconUrl;
    public String musicId;
    public String push_user_id;
    public String rawExtra;
    public String roomId;
    public String soundId;
    public String soundUrl;
    public long stickTopOffset;
    public int stick_top;
    public String tagId;
    public String trackInfo;
    public boolean turn_screen_on;
    public boolean useAssetSound;
    public String userId;
    public int videoPlayIconFlag;
    public int visibility;
    public float volumeFactor = 1.0f;
    public int badgeCount = -1;
    public int redBadgeOnly = -1;
    public int floatWindow = -1;
    public int oppoFloatWindow = -2;
    public boolean user_system_style = true;
    public long float_window_show_time = 12000;
    public int oppo_push_style = 11;
    public int notificaitonPriority = 1;
    public boolean isZeroVibrate = true;
    public String bg_color = "";
    public boolean isGroupSummary = true;
    public int style = -1;
    public boolean allowBannerDelete = true;
    public ArrayList<String> pre_o_urls = new ArrayList<>();
    public String notificationChannelId = "";
    public String pushGroupId = "";
    public ArrayList<String[]> actionList = new ArrayList<>();

    public int getPriority() {
        int i = this.notificaitonPriority;
        if (i > 2) {
            return 2;
        }
        if (i < -2) {
            return -2;
        }
        return i;
    }

    public String toJsonString() {
        return this.rawExtra;
    }

    public static C67229Qa1 LIZ(String str) {
        boolean z;
        C67229Qa1 c67229Qa1 = new C67229Qa1();
        try {
            c67229Qa1.rawExtra = str;
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return c67229Qa1;
        }
        JSONObject jSONObject = new JSONObject(str);
        c67229Qa1.notificationChannelId = jSONObject.optString("notification_channel", "");
        c67229Qa1.soundUrl = jSONObject.optString("surl");
        c67229Qa1.soundId = null;
        c67229Qa1.badgeCount = jSONObject.optInt("badge", -1);
        c67229Qa1.customAction = jSONObject.optString("in_app_push");
        c67229Qa1.inAppPushType = jSONObject.optString("in_app_push_type");
        c67229Qa1.redBadgeOnly = jSONObject.optInt("red_badge_only", -1);
        if (!TextUtils.isEmpty(c67229Qa1.soundUrl)) {
            c67229Qa1.soundId = C38352F3k.LIZJ(c67229Qa1.soundUrl);
        }
        c67229Qa1.volumeFactor = (float) jSONObject.optDouble("vfac", 1.0d);
        c67229Qa1.stickTopOffset = jSONObject.optLong("stof");
        if (jSONObject.optInt("sdef") == 1) {
            z = true;
        } else {
            z = false;
        }
        c67229Qa1.useAssetSound = z;
        c67229Qa1.redBadgeOnly = jSONObject.optInt("red_badge_only");
        c67229Qa1.largeModeIconUrl = jSONObject.optString("large_mode_icon");
        c67229Qa1.imageShowStyle = jSONObject.optInt("image_show_style", 0);
        c67229Qa1.visibility = jSONObject.optInt("visibility", 0);
        c67229Qa1.turn_screen_on = C67227QZz.LIZLLL(jSONObject, "turn_screen_on", false);
        c67229Qa1.user_system_style = C67227QZz.LIZLLL(jSONObject, "use_system_style", true);
        c67229Qa1.is_notification_top = C67227QZz.LIZLLL(jSONObject, "is_notification_top", false);
        c67229Qa1.stick_top = jSONObject.optInt("stick_top", 0);
        c67229Qa1.floatWindow = jSONObject.optInt("show_float_window", -1);
        c67229Qa1.oppoFloatWindow = jSONObject.optInt("show_float_window", -2);
        c67229Qa1.float_window_show_time = jSONObject.optLong("float_window_show_time", 12000L);
        c67229Qa1.oppo_push_style = jSONObject.optInt("oppo_push_style", 11);
        c67229Qa1.isZeroVibrate = C67227QZz.LIZLLL(jSONObject, "is_zero_vibrate", true);
        c67229Qa1.bg_color = jSONObject.optString("bg_color", "");
        c67229Qa1.style = jSONObject.optInt("notification_style", -1);
        c67229Qa1.isGroupSummary = C67227QZz.LIZLLL(jSONObject, "is_group_summary", true);
        c67229Qa1.pushGroupId = jSONObject.optString("custom_androidthread_group_code");
        c67229Qa1.extra_text = jSONObject.optString("extra_text");
        c67229Qa1.authorId = jSONObject.optString("author_id");
        c67229Qa1.roomId = jSONObject.optString("room_id");
        c67229Qa1.userId = jSONObject.optString("user_id");
        c67229Qa1.musicId = jSONObject.optString("music_id");
        c67229Qa1.tagId = jSONObject.optString("tag_id");
        c67229Qa1.trackInfo = jSONObject.optString("track_info");
        c67229Qa1.challengeId = jSONObject.optString("challenge_id");
        c67229Qa1.enableRTL = jSONObject.optInt("enable_rtl");
        c67229Qa1.videoPlayIconFlag = jSONObject.optInt("video_play_icon_flag", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("pre_o_urls");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            c67229Qa1.pre_o_urls.clear();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    ListProtector.add(c67229Qa1.pre_o_urls, 0, optString);
                }
            }
        }
        c67229Qa1.push_user_id = jSONObject.optString("push_user_id");
        c67229Qa1.allowBannerDelete = C67227QZz.LIZLLL(jSONObject, "allow_banner_delete", true);
        c67229Qa1.notificaitonPriority = jSONObject.optInt("push_priority", 1);
        c67229Qa1.activeClickValid = jSONObject.optInt("active_click_valid", 0);
        JSONArray optJSONArray2 = jSONObject.optJSONArray("action_list");
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
            c67229Qa1.actionList.add(new String[]{optJSONObject.optString("action_id"), optJSONObject.optString("action_title"), optJSONObject.optString("action_url"), String.valueOf(optJSONObject.optInt("enable_input"))});
        }
        return c67229Qa1;
    }
}
