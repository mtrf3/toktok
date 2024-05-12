package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class KI4 {
    public final java.util.Map<String, String> LIZ = new HashMap();

    public final void LIZIZ(java.util.Map map) {
        if (map != null) {
            ((HashMap) this.LIZ).putAll(map);
        }
    }

    public final void LIZ(int i, String str) {
        LIZJ(str, String.valueOf(i));
    }

    public final void LIZJ(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C188737av.LIZ(str2));
    }
}
