package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.QiD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67737QiD {
    public static String LIZ = "";

    public static final void LIZ(int i, String str, boolean z, boolean z2) {
        int i2;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("success", Boolean.valueOf(z));
        if (str == null) {
            str = "";
        }
        c198517qh.LIZ.put("error_desc", str);
        c198517qh.LIZ.put("has_sim_card", Boolean.valueOf(z2));
        c198517qh.LIZ.put("google_availability", Integer.valueOf(i));
        JSONObject json = c198517qh.LJ();
        if (z) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        o.LJIIIIZZ(json, "json");
        Q13.LIZIZ("sms_auto_fill", i2, json);
    }
}
