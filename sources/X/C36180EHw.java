package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EHw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36180EHw {
    public static JSONObject LIZ(Integer num, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        if (num == null || num.intValue() != 0) {
            c198517qh.LIZ.put("error_code", num);
            c198517qh.LIZLLL("error_desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c198517qh.LIZLLL("extra", str2);
        }
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        return LJ;
    }
}
