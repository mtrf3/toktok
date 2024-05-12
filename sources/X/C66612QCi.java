package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.QCi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66612QCi {
    public static final ConcurrentHashMap<Class<?>, List<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(Class cls, InterfaceC88472Yns handler) {
        List<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>> list;
        o.LJIIIZ(handler, "handler");
        ConcurrentHashMap<Class<?>, List<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>>> concurrentHashMap = LIZ;
        if (!concurrentHashMap.containsKey(cls)) {
            concurrentHashMap.put(cls, new ArrayList());
        }
        if (C65777Prh.LJFF(1, handler) && handler != null) {
            List<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>> list2 = concurrentHashMap.get(cls);
            if ((list2 != null && list2.contains(handler)) || (list = concurrentHashMap.get(cls)) == null) {
                return;
            }
            list.add(handler);
        }
    }

    public static void LIZIZ(Class cls, InterfaceC88472Yns handler) {
        o.LJIIIZ(handler, "handler");
        List<InterfaceC88472Yns<C75732Tns<?>, C76800UCe>> list = LIZ.get(cls);
        if (list != null) {
            C65777Prh.LIZ(list).remove(handler);
        }
    }
}
