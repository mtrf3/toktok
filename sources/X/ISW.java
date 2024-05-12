package X;

import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ISW {
    public static void LIZJ() {
        IEvent LIZJ;
        JSONObject jSONObject = new JSONObject();
        LIZIZ(jSONObject, null, false);
        if (jSONObject.length() <= 0 || (LIZJ = C46982IcE.LIZJ()) == null) {
            return;
        }
        LIZJ.onEvent("play_session_events", jSONObject);
    }

    public static JSONObject LIZ(HashMap hashMap, ISQ isq) {
        JSONObject jSONObject;
        if (hashMap == null || !hashMap.containsKey(isq.name())) {
            return new JSONObject();
        }
        String str = (String) hashMap.get(isq.name());
        if (str == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
        }
        o.LJI(jSONObject);
        jSONObject.length();
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(org.json.JSONObject r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ISW.LIZIZ(org.json.JSONObject, java.lang.String, boolean):void");
    }
}
