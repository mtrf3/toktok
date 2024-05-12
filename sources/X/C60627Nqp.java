package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* renamed from: X.Nqp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60627Nqp {
    public static final java.util.Set<InterfaceC37736ErU> LIZ = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public static AbstractC60536NpM LIZIZ(C60624Nqm c60624Nqm, String str) {
        TreeMap<Integer, AbstractC60536NpM> treeMap;
        if (c60624Nqm == null) {
            C78949Uyf.LJIJJ("EventManager");
            return null;
        }
        java.util.Map<String, TreeMap<Integer, AbstractC60536NpM>> map = c60624Nqm.LJFF;
        if (map == null || (treeMap = map.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        AbstractC60536NpM value = treeMap.firstEntry().getValue();
        AbstractC60629Nqr extension = value.getExtension();
        if (!extension.LJLILLLLZI || !extension.LIZIZ()) {
            C60625Nqn.LIZJ();
            return LIZ(c60624Nqm, value, str);
        }
        C60625Nqn.LIZJ();
        return value;
    }

    public static AbstractC60536NpM LIZ(InterfaceC37736ErU interfaceC37736ErU, AbstractC60536NpM abstractC60536NpM, String str) {
        TreeMap<Integer, AbstractC60536NpM> treeMap;
        java.util.Map<String, TreeMap<Integer, AbstractC60536NpM>> map = ((C60624Nqm) interfaceC37736ErU).LJFF;
        if (map == null || (treeMap = map.get(str)) == null || treeMap.size() <= 0) {
            return null;
        }
        Iterator<AbstractC60536NpM> it = treeMap.values().iterator();
        while (it.hasNext()) {
            if (abstractC60536NpM == it.next()) {
                while (it.hasNext()) {
                    AbstractC60536NpM next = it.next();
                    AbstractC60629Nqr extension = next.getExtension();
                    if (!extension.LJLILLLLZI || !extension.LIZIZ()) {
                        C60625Nqn.LIZJ();
                    } else {
                        C60625Nqn.LIZJ();
                        return next;
                    }
                }
                C60625Nqn.LIZJ();
                return null;
            }
        }
        C60625Nqn.LIZJ();
        return null;
    }

    public static void LIZJ(C60624Nqm c60624Nqm, String str, AbstractC60536NpM abstractC60536NpM, int i) {
        if (c60624Nqm == null) {
            return;
        }
        java.util.Map<String, TreeMap<Integer, AbstractC60536NpM>> map = c60624Nqm.LJFF;
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap());
            c60624Nqm.LJFF = map;
            LIZ.add(c60624Nqm);
        }
        C60635Nqx c60635Nqx = (C60635Nqx) map.get(str);
        if (c60635Nqx == null) {
            c60635Nqx = new C60635Nqx();
            map.put(str, c60635Nqx);
        }
        if (c60635Nqx.containsValue(abstractC60536NpM)) {
            return;
        }
        synchronized (C60627Nqp.class) {
            int i2 = c60635Nqx.LJLIL + 1;
            c60635Nqx.LJLIL = i2;
            if (i2 != 10000) {
                c60635Nqx.put(Integer.valueOf((i * 10000) + i2), abstractC60536NpM);
            } else {
                throw new Error("listener id > 999");
            }
        }
    }
}
