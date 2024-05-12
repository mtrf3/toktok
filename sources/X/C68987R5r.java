package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R5r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68987R5r {
    public static JSONObject LIZ(C68987R5r c68987R5r, int i, String str) {
        c68987R5r.getClass();
        C198517qh c198517qh = new C198517qh();
        if (i != 0) {
            c198517qh.LIZ.put("error_code", Integer.valueOf(i));
            c198517qh.LIZLLL("error_desc", str);
        }
        if (!TextUtils.isEmpty("")) {
            c198517qh.LIZLLL("platform", "");
        }
        if (!TextUtils.isEmpty("")) {
            c198517qh.LIZLLL("carrier_type", "");
        }
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        return LJ;
    }

    public static JSONObject LIZIZ(int i, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        long currentTimeMillis = System.currentTimeMillis() - C68986R5q.LIZIZ;
        C68986R5q.LIZIZ = 0L;
        if (i != 0) {
            c198517qh.LIZ.put("error_code", Integer.valueOf(i));
            c198517qh.LIZLLL("error_desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c198517qh.LIZLLL("platform", str2);
        }
        c198517qh.LIZJ(Long.valueOf(currentTimeMillis), "time");
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        return LJ;
    }

    public static void LJFF(int i, int i2, String str) {
        C198517qh c198517qh = new C198517qh();
        if (i2 != 0) {
            c198517qh.LIZ.put("error_code", Integer.valueOf(i2));
            c198517qh.LIZLLL("error_desc", str);
        }
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        Q13.LIZIZ("monitor_login_verified_env", i, LJ);
    }

    public final void LIZJ(int i, int i2, String str) {
        Q13.LIZIZ("monitor_login_email", i, LIZ(this, i2, str));
    }

    public final void LIZLLL(int i, String str, boolean z) {
        Q13.LIZIZ("monitor_login_phone_passport", !z ? 1 : 0, LIZ(this, i, str));
    }

    public final void LJ(int i, String str, boolean z) {
        Q13.LIZIZ("monitor_login_phone_sms", !z ? 1 : 0, LIZ(this, i, str));
    }
}
