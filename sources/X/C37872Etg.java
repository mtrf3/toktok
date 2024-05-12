package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Etg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37872Etg {
    public static final C37872Etg LIZIZ = new C37872Etg();
    public static final ConcurrentHashMap<String, C37873Eth> LIZ = new ConcurrentHashMap<>();

    public static EnumC38003Evn LIZ(C37904EuC c37904EuC, String str, String str2) {
        EnumC38004Evo access;
        String value;
        C37855EtP c37855EtP = c37904EuC.LJIIIZ;
        c37855EtP.getClass();
        InterfaceC37666EqM LIZ2 = c37855EtP.LIZIZ.LIZ(C37859EtT.LIZ(c37904EuC), str2);
        if (LIZ2 != null && (access = LIZ2.getAccess()) != null && (value = access.getValue()) != null) {
            return C38002Evm.LIZ(value);
        }
        LIZIZ.getClass();
        ConcurrentHashMap<String, C37873Eth> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(str) != null) {
            C37873Eth c37873Eth = concurrentHashMap.get(str);
            if (c37873Eth != null) {
                return c37873Eth.LIZ.get(str2);
            }
            o.LJIIZILJ();
            throw null;
        }
        C37873Eth c37873Eth2 = concurrentHashMap.get("DEFAULT");
        if (c37873Eth2 == null) {
            return null;
        }
        return c37873Eth2.LIZ.get(str2);
    }
}
