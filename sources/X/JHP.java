package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class JHP {
    public static final java.util.Map<String, JHV> LIZ = new HashMap();

    public static JHV LIZ(String str) {
        JHV jhv = (JHV) ((HashMap) LIZ).get(str);
        if (jhv == null) {
            return JHW.LIZ;
        }
        return jhv;
    }
}
