package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: X.Fho, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39684Fho {
    public static boolean LIZ() {
        try {
            C39685Fhp LIZIZ = C39685Fhp.LIZIZ(EF7.LIZIZ());
            LIZIZ.getClass();
            if (TextUtils.isEmpty("enable_region_swtich")) {
                return false;
            }
            Object obj = LIZIZ.LJLILLLLZI;
            if (((JSONObject) obj) != null) {
                return ((JSONObject) obj).optInt("enable_region_swtich", 0) == 1;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
