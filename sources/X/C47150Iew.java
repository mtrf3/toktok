package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Iew, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47150Iew {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZLLL() {
        return IWS.LIZ;
    }

    public static String LIZ(String eventName, JSONObject msg) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(msg, "msg");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", eventName);
        jSONObject.put("data", msg);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "{\n                var me….toString()\n            }");
        return jSONObject2;
    }

    public static final void LIZIZ(String eventName, JSONObject msg) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        String LIZ2 = LIZ(eventName, msg);
        if (!TextUtils.isEmpty(LIZ2)) {
            C36922EeM.LIZLLL(3, "VideoPlayer_Log", LIZ2);
        }
    }

    public static final void LIZJ(String tag, String msg) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(msg, "msg");
        if (!IWS.LIZ) {
            return;
        }
        C36922EeM.LIZLLL(6, tag, msg);
    }
}
