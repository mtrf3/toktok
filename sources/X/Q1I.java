package X;

import java.util.HashMap;
import kotlin.jvm.internal.AqS15S2000000_11;
import kotlin.jvm.internal.AqS49S1000000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q1I {
    public static final InterfaceC66337Q1t LIZIZ;
    public static final Q1I LIZJ = new Q1I();
    public static final HashMap<String, Q1Y> LIZ = new HashMap<>();

    static {
        C66224Pyu c66224Pyu;
        C66225Pyv c66225Pyv = Q1A.LJII;
        if (c66225Pyv != null) {
            c66224Pyu = c66225Pyv.LIZ("source_rules_v416");
        } else {
            c66224Pyu = null;
        }
        LIZIZ = c66224Pyu;
    }

    public final Q1Y LIZ(String source) {
        o.LJIIJ(source, "source");
        HashMap<String, Q1Y> hashMap = LIZ;
        Q1Y q1y = hashMap.get(source);
        if (q1y == null) {
            q1y = new Q1Y(source);
            synchronized (this) {
                Q1Y q1y2 = hashMap.get(source);
                if (q1y2 == null) {
                    hashMap.put(source, q1y);
                } else {
                    q1y = q1y2;
                }
            }
        }
        return q1y;
    }

    public static void LIZIZ(String key, String rules) {
        String str;
        o.LJIIJ(key, "key");
        o.LJIIJ(rules, "rules");
        String LIZJ2 = C38352F3k.LIZJ(rules);
        InterfaceC66337Q1t interfaceC66337Q1t = LIZIZ;
        if (interfaceC66337Q1t != null) {
            str = interfaceC66337Q1t.get(key);
        } else {
            str = null;
        }
        if (o.LJ(str, LIZJ2)) {
            Q14.LIZ("com.bytedance.ruler.strategy.cache.StrategyCacheManager.sync", new AqS49S1000000_11(key, 1));
        } else {
            Q14.LIZ("com.bytedance.ruler.strategy.cache.StrategyCacheManager.rebuild", new AqS15S2000000_11(key, LIZJ2, 0));
        }
    }
}
