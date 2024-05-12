package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveSEIDelayTimeCorrectSetting;
import org.json.JSONObject;

/* renamed from: X.0vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22950vD {
    public static void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (LiveSEIDelayTimeCorrectSetting.INSTANCE.enableSEITimeCorrect()) {
                jSONObject.put("ts", C31012CFc.LIZIZ());
                jSONObject.put("tt_ntp", 1);
            }
        } catch (Exception e) {
            C0NB.LIZLLL(e.getMessage());
        }
    }
}
