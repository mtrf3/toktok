package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QPE {
    public static void LIZIZ(Context context, String str, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            LIZ(context, "event_v1", "red_badge", str, 0L, 0L, jSONObjectArr[0]);
        } else {
            LIZ(context, "event_v1", "red_badge", str, 0L, 0L, null);
        }
    }

    public static void LIZ(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (C38354F3m.LJ(str) || C38354F3m.LJ(str2)) {
            return;
        }
        new QPC(context, str, str2, str3, j, j2, jSONObject).LIZ();
    }
}
