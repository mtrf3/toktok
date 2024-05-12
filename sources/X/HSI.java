package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class HSI implements InterfaceC44104HSq {
    public final String LIZ;

    @Override // X.InterfaceC44104HSq
    public final String LIZ() {
        return LJII(this.LIZ, "anchor_id");
    }

    @Override // X.InterfaceC44104HSq
    public final C188727au LIZIZ() {
        C188727au c188727au = new C188727au();
        if (C78685UuP.LJJJZ(this.LIZ)) {
            JSONObject jSONObject = new JSONObject(this.LIZ);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "logExtraObj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("anchor_id") && !next.equals("anchor_type") && !next.equals("anchor_name")) {
                    c188727au.LJI(next, jSONObject.optString(next, ""));
                }
            }
        }
        return c188727au;
    }

    @Override // X.InterfaceC44104HSq
    public final String LIZJ() {
        return LJII(this.LIZ, "anchor_name");
    }

    @Override // X.InterfaceC44104HSq
    public final String LIZLLL() {
        return LJII(this.LIZ, "anchor_type");
    }

    @Override // X.InterfaceC44104HSq
    public final String LJ() {
        return LJII(this.LIZ, "anchor_id");
    }

    @Override // X.InterfaceC44104HSq
    public final String LJFF() {
        return LJII(this.LIZ, "anchor_name");
    }

    @Override // X.InterfaceC44104HSq
    public String LJI() {
        return LJII(this.LIZ, "anchor_type");
    }

    public HSI(String str) {
        this.LIZ = str;
    }

    public static String LJII(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String optString = new JSONObject(str).optString(str2, "");
            o.LJIIIIZZ(optString, "{\n            val logExt…String(key, \"\")\n        }");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }
}
