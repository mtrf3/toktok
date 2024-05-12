package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EHs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36176EHs {
    public static void LIZ(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        C198517qh c198517qh = new C198517qh();
        if (i2 != 0) {
            c198517qh.LIZ.put("error_code", Integer.valueOf(i2));
            c198517qh.LIZ.put("error_desc", str);
            if (str2 == null) {
                str2 = "";
            }
            c198517qh.LIZLLL("client_key", str2);
        }
        c198517qh.LIZ.put("opensdk_name", str3);
        c198517qh.LIZ.put("opensdk_version", str4);
        c198517qh.LIZ.put("commonsdk_name", str5);
        c198517qh.LIZLLL("commsdk_version", str6);
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        C09900aA.LJIIJJI("monitor_login_authorize", i, LJ);
    }
}
