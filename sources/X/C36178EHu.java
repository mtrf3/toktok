package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EHu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36178EHu {
    public static JSONObject LIZ(int i, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        if (i != 0) {
            c198517qh.LIZ.put("error_code", Integer.valueOf(i));
            c198517qh.LIZLLL("error_desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c198517qh.LIZLLL(WM7.SCENE_SERVICE, str2);
        }
        JSONObject LJ = c198517qh.LJ();
        o.LJIIIIZZ(LJ, "eventJsonBuilder.build()");
        return LJ;
    }
}
