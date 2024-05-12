package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class E2V extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, java.util.Map<String, ? extends Object>>> {
    public static final E2V LJLIL = new E2V();

    public E2V() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, java.util.Map<String, ? extends Object>> invoke() {
        Object LIZ;
        java.util.Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Iterator it = ((ArrayList) ORZ.LLIIIZ(C47261Igj.LJJIJIIJI(E2Q.LIZ, E2R.LIZ, E2S.LIZ, E2T.LIZ, E2U.LIZ, E2Z.LIZ, C35768E2a.LIZ, E2W.LIZ, E2X.LIZ, E2Y.LIZ), C47261Igj.LJJIJ(C35769E2b.LIZ))).iterator();
            while (it.hasNext()) {
                java.util.Map<String, Object> LIZ2 = ((InterfaceC35770E2c) it.next()).LIZ();
                for (String str : LIZ2.keySet()) {
                    Object obj = LIZ2.get(str);
                    if (obj instanceof java.util.Map) {
                        map = (java.util.Map) obj;
                    } else {
                        map = null;
                    }
                    if (map != null) {
                        java.util.Map map2 = (java.util.Map) linkedHashMap.get(str);
                        if (map2 != null) {
                            map = C113554cx.LJJLIIIJILLIZJL(map2, map);
                        }
                        linkedHashMap.put(str, map);
                    }
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
        return linkedHashMap;
    }
}
