package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.30K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30K {
    public static final int LIZ = Q7K.LIZIZ("playermanager_background_check", 0);

    public static boolean LIZ(String str) {
        int i = LIZ;
        if (i == 1) {
            if (TextUtils.equals("resumePlay", str)) {
                C36922EeM.LIZLLL(4, "PlayerManagerLegacyHelper", android.util.Log.getStackTraceString(new Throwable("resumePlay")));
            }
        } else if (i != 1) {
            return false;
        }
        if (C84763XOl.LJIIJJI) {
            String stackTraceString = android.util.Log.getStackTraceString(new Throwable("PlayVideoInAppBackground"));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorMsg", stackTraceString);
                C09900aA.LJI("play_video_in_app_background", null, null, jSONObject);
            } catch (Exception unused) {
            }
            C36922EeM.LIZLLL(4, "PlayerManagerLegacyHelper", "Try play video when app is in background, trace is " + stackTraceString);
            return true;
        }
        return false;
    }
}
