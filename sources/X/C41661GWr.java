package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GWr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41661GWr implements GXQ {
    public static boolean LIZJ(String str, String str2) {
        if (!TextUtils.equals(str, "im_story")) {
            if (TextUtils.equals(str, "story") && TextUtils.equals(str2, "from_chat")) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.GXQ
    public final boolean LIZ(String eventName, java.util.Map<String, String> map) {
        String str;
        o.LJIIIZ(eventName, "eventName");
        String str2 = null;
        if (map != null) {
            str = map.get("shoot_way");
            str2 = map.get("enter_from");
        } else {
            str = null;
        }
        return LIZJ(str, str2);
    }

    @Override // X.GXQ
    public final boolean LIZIZ(String eventName, JSONObject jSONObject) {
        String str;
        o.LJIIIZ(eventName, "eventName");
        String str2 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("shoot_way", "");
            str2 = jSONObject.optString("enter_from", "");
        } else {
            str = null;
        }
        return LIZJ(str, str2);
    }
}
