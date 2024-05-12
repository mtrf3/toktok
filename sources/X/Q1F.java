package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1F {
    public static final /* synthetic */ int LIZ = 0;

    public static Q11 LIZ(Collection rules, boolean z, java.util.Map map, java.util.Map functions) {
        Object LIZ2;
        o.LJIIJ(rules, "rules");
        o.LJIIJ(functions, "functions");
        if (!Q1A.LIZ.get()) {
            return new Q11(203, "RulerSDK's initialization did not complete", null, null, null, 252);
        }
        Object obj = map.get("source");
        HashMap<String, Object> hashMap = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Q11 q11 = new Q11(0, null, null, null, null, 254);
        long j = 0;
        try {
            Q1J q1j = new Q1J(new Q1N(str), map, functions);
            Q1G q1g = new Q1G(q1j);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : rules) {
                Q1P rule = (Q1P) obj2;
                o.LJIIJ(rule, "rule");
                C66327Q1j LIZ3 = Q1G.LIZ(q1g.LIZ, Q1A.LIZ(), rule);
                if (LIZ3.LIZIZ) {
                    q11.LJI.add(LIZ3.LIZ);
                }
                if (LIZ3.LIZIZ && z) {
                    break;
                }
                arrayList.add(obj2);
            }
            j = q1j.LIZ / 1000;
            InterfaceC66331Q1n interfaceC66331Q1n = q1j.LIZJ;
            if (interfaceC66331Q1n instanceof Q1N) {
                hashMap = ((Q1N) interfaceC66331Q1n).LIZ;
            }
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            q11 = new Q11(202, "Unexpected error happened", null, m10exceptionOrNullimpl, null, 188);
        }
        q11.LIZLLL.LJLIL = j;
        q11.LJ = hashMap;
        return q11;
    }
}
