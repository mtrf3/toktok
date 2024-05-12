package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.30F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30F extends AbstractC65781Prl implements InterfaceC88472Yns<C30E, C76800UCe> {
    public static final C30F LJLIL = new C30F();

    public C30F() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C30E c30e) {
        java.util.Map<Long, Long> map;
        long j;
        C30E c30e2 = c30e;
        if (c30e2 != null && (map = c30e2.LIZ) != null) {
            for (Map.Entry<Long, Long> entry : map.entrySet()) {
                ConcurrentHashMap<Long, Integer> concurrentHashMap = C95773pN.LJLILLLLZI;
                Long key = entry.getKey();
                o.LJIIIIZZ(key, "entry.key");
                Long value = entry.getValue();
                if (value != null) {
                    j = value.longValue();
                } else {
                    j = 0;
                }
                concurrentHashMap.put(key, Integer.valueOf((int) j));
            }
            C95773pN c95773pN = C95773pN.LJLIL;
            List LLJI = ORZ.LLJI(map.keySet());
            c95773pN.getClass();
            C95773pN.LIZ(LLJI);
        }
        return C76800UCe.LIZ;
    }
}
