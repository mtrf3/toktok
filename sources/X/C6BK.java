package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.6BK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BK {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final synchronized JSONObject LJ() {
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
        return new JSONObject(this.LIZ);
    }

    public final void LIZ(Boolean bool, String str) {
        this.LIZ.put(str, bool);
    }

    public final void LIZIZ(Integer num, String str) {
        this.LIZ.put(str, num);
    }

    public final void LIZJ(Long l, String str) {
        this.LIZ.put(str, l);
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
