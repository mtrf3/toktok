package X;

import java.util.HashMap;

/* renamed from: X.ZWm, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90068ZWm {
    public final java.util.Map<String, String> LIZ = new HashMap();
    public final java.util.Map<String, String> LIZIZ = new HashMap();
    public final java.util.Map<String, Integer> LIZJ = new HashMap();

    public final int LIZ(String str) {
        Integer num = (Integer) ((HashMap) this.LIZJ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void LIZIZ(int i, String str, String str2) {
        ((HashMap) this.LIZ).put(str, str2);
        ((HashMap) this.LIZIZ).put(str2, str);
        ((HashMap) this.LIZJ).put(str, Integer.valueOf(i));
    }
}
