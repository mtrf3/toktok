package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.K6a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51160K6a {
    public static C51161K6b LIZ;

    public static void LIZ() {
        String str;
        Long l;
        Long l2;
        String str2;
        C51161K6b c51161K6b = LIZ;
        if (c51161K6b == null || c51161K6b.LIZ == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C51161K6b c51161K6b2 = LIZ;
        o.LJI(c51161K6b2);
        c51161K6b.LIZJ = currentTimeMillis - c51161K6b2.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("type:");
        C51161K6b c51161K6b3 = LIZ;
        if (c51161K6b3 != null) {
            str = c51161K6b3.LIZIZ;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(" cost:");
        C51161K6b c51161K6b4 = LIZ;
        if (c51161K6b4 != null) {
            l = Long.valueOf(c51161K6b4.LIZJ);
        } else {
            l = null;
        }
        LIZ2.append(l);
        X1D.LIZIZ(LIZ2);
        JSONObject jSONObject = new JSONObject();
        try {
            C51161K6b c51161K6b5 = LIZ;
            if (c51161K6b5 != null) {
                l2 = Long.valueOf(c51161K6b5.LIZJ);
            } else {
                l2 = null;
            }
            jSONObject.put("cost", l2);
            C51161K6b c51161K6b6 = LIZ;
            if (c51161K6b6 != null) {
                str2 = c51161K6b6.LIZIZ;
            } else {
                str2 = null;
            }
            jSONObject.put("type", str2);
            jSONObject.put("version", 1);
        } catch (JSONException unused) {
        }
        AppLogNewUtils.onEventV3("search_trigger_keyboard_monitor", jSONObject);
        LIZ = null;
    }

    public static void LIZIZ(String str) {
        C51161K6b c51161K6b = new C51161K6b();
        c51161K6b.LIZ = System.currentTimeMillis();
        c51161K6b.LIZIZ = str;
        C51162K6c.LIZ = c51161K6b;
        C51161K6b c51161K6b2 = new C51161K6b();
        c51161K6b2.LIZ = System.currentTimeMillis();
        c51161K6b2.LIZIZ = str;
        LIZ = c51161K6b2;
    }
}
