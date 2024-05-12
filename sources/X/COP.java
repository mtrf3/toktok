package X;

import android.view.View;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class COP<V extends View> implements COU<V> {
    public final String LIZ;

    public COP(String str) {
        this.LIZ = str;
    }

    public final void LJ(String str) {
        LIZ(null, "gblhb_schema_error", LIZIZ(this, this.LIZ, str, -102, null, null, 24));
    }

    public final void LJFF(String str) {
        LIZ(null, "gblhb_start_parse_url", LIZIZ(this, this.LIZ, str, 0, null, null, 28));
    }

    public final void LJI(String str) {
        LIZ(null, "gblhb_schema_error", LIZIZ(this, this.LIZ, str, -101, null, null, 24));
    }

    public final void LIZJ(int i, View view, String str, String str2) {
        LIZ(view, "gblhb_container_load_error", LIZIZ(this, this.LIZ, str, i, str2, null, 16));
    }

    public final void LIZLLL(V v, String str, String str2, boolean z) {
        JSONObject LIZIZ = LIZIZ(this, this.LIZ, str, 0, null, str2, 12);
        LIZIZ.put("is_first_load", z);
        LIZ(v, "gblhb_container_finish_load", LIZIZ);
    }

    public static JSONObject LIZIZ(COP cop, String str, String str2, int i, String str3, String str4, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        cop.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_container_type", str);
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jSONObject.put("schema", str2);
        } else if (str4 != null && str4.length() != 0) {
            jSONObject.put("schema", str4);
        }
        if (i != 0) {
            jSONObject.put("error_code", i);
        }
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("error_msg", str3);
        }
        return jSONObject;
    }
}
