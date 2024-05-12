package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class JGG implements JGH {
    public abstract String LIZLLL();

    @Override // X.JGH
    public final java.util.Map<String, String> LIZ() {
        String LIZLLL = LIZLLL();
        HashMap hashMap = new HashMap();
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        hashMap.put("x-tt-dt", LIZLLL);
        return hashMap;
    }
}
