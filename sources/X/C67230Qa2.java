package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.awemepushlib.experiments.PushCustomUISettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: X.Qa2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67230Qa2 implements Serializable {
    public static final ArrayList<String> BRANDS_CANNOT_CUSTOM_GROUP = new ArrayList<>(Arrays.asList("vivo", "xiaomi"));
    public int alertType;
    public transient JSONObject appData;
    public String callback;
    public C67229Qa1 extra;
    public boolean functionalPush;
    public long id;
    public int imageType;
    public String imageUrl;
    public int isPing;
    public boolean led;
    public String openUrl;
    public transient JSONObject originData;
    public String postBack;
    public boolean preloadArticle;
    public String rawJson;
    public long revokeId;
    public int revokeType;
    public long rid64;
    public boolean sound;
    public int soundType;
    public String soundUrl;
    public String targetSecUid;
    public String text;
    public String title;
    public boolean useSound;
    public boolean vibrator;
    public int filter = 1;
    public int pass_through = 1;

    public boolean isExclusiveGroupMsg() {
        return Objects.equals(this.extra.pushGroupId, "android_exclusive_group");
    }

    public boolean isStandardUIType() {
        if (this.imageType != 9) {
            return true;
        }
        return false;
    }

    public boolean canSetCustomGroup() {
        if (isStandardUIType() || PushCustomUISettings.LIZIZ()) {
            return true;
        }
        return false;
    }

    public JSONObject getOriginData() {
        return this.originData;
    }

    public static C67230Qa2 from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C67230Qa2 c67230Qa2 = new C67230Qa2();
        c67230Qa2.rawJson = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c67230Qa2.originData = jSONObject;
            c67230Qa2.id = jSONObject.optLong("id", 0L);
            c67230Qa2.rid64 = jSONObject.optLong("rid64", 0L);
            c67230Qa2.title = jSONObject.optString("title");
            c67230Qa2.text = jSONObject.optString("text");
            c67230Qa2.pass_through = jSONObject.optInt("pass_through", 1);
            c67230Qa2.openUrl = jSONObject.optString("open_url");
            c67230Qa2.imageUrl = jSONObject.optString("image_url");
            c67230Qa2.callback = jSONObject.optString("callback");
            c67230Qa2.isPing = jSONObject.optInt("is_ping", 0);
            c67230Qa2.imageType = jSONObject.optInt("image_type");
            c67230Qa2.filter = jSONObject.optInt("filter", 1);
            c67230Qa2.alertType = jSONObject.optInt("alert_type", 0);
            c67230Qa2.soundType = jSONObject.optInt("sound_type", 0);
            String optString = jSONObject.optString("extra_str");
            c67230Qa2.postBack = jSONObject.optString("post_back");
            c67230Qa2.led = C67227QZz.LIZLLL(jSONObject, "use_led", false);
            c67230Qa2.sound = C67227QZz.LIZLLL(jSONObject, "sound", false);
            c67230Qa2.vibrator = C67227QZz.LIZLLL(jSONObject, "use_vibrator", false);
            c67230Qa2.preloadArticle = C67227QZz.LIZLLL(jSONObject, "preload_article", false);
            c67230Qa2.appData = jSONObject.optJSONObject("app_data");
            c67230Qa2.extra = C67229Qa1.LIZ(optString);
            c67230Qa2.targetSecUid = jSONObject.optString("ttpush_sec_target_uid");
            c67230Qa2.revokeId = jSONObject.optLong("revoke_id", 0L);
            c67230Qa2.revokeType = jSONObject.optInt("revoke_type", 0);
            int i = c67230Qa2.extra.style;
            if (i >= 0) {
                c67230Qa2.imageType = i;
            }
            if (!TextUtils.isEmpty(c67230Qa2.openUrl)) {
                try {
                    c67230Qa2.functionalPush = "1".equals(UriProtector.getQueryParameter(UriProtector.parse(c67230Qa2.openUrl), "functional_push"));
                } catch (Throwable unused) {
                }
            }
            return c67230Qa2;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int getShortMsgID(long j) {
        return (int) (j % 2147483647L);
    }
}
