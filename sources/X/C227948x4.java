package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* renamed from: X.8x4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227948x4 {
    public static boolean LIZ = true;

    public static void LIZ(String str, String str2, String str3, String str4, Object obj) {
        if (LIZ) {
            LIZ = false;
            LIZIZ("first compare", "key", "value", "value", LiveGiftNewGifterBadgeSetting.DEFAULT);
        }
        if (TextUtils.equals(str2, str3)) {
            return;
        }
        LIZIZ(str, str4, str2, str3, obj.toString());
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        JSONObject LJ = C47135Ieh.LJ("event_scene_name", str, "check_key", str2);
        LJ.put("new_value", str3);
        LJ.put("origion_value", str4);
        LJ.put("orgin_params", str5);
        LJ.put("error_msg_info", "");
        AppLogNewUtils.onEventV3("event_track_parameter_passing_abnormal", LJ);
    }
}
