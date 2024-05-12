package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R9z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69099R9z {
    public static JSONObject LIZ(int i, int i2, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        if (i != 0) {
            c198517qh.LIZ.put("error_code", Integer.valueOf(i));
            c198517qh.LIZLLL("error_desc", str);
        }
        c198517qh.LIZIZ(Integer.valueOf(i2), "send_type");
        if (str2 != null) {
            c198517qh.LIZLLL("send_from", str2);
        }
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        return LJ;
    }

    public static void LIZIZ(int i, int i2, int i3, String str, String str2) {
        Q13.LIZIZ("monitor_send_sms", i, LIZ(i3, i2, str, str2));
    }
}
