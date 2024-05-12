package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Muy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58336Muy {
    public static final java.util.Map<String, InterfaceC58337Muz> LIZ = new ConcurrentHashMap();

    public static Object LIZ(String str, List<Object> list) {
        InterfaceC58337Muz interfaceC58337Muz = (InterfaceC58337Muz) ((ConcurrentHashMap) LIZ).get(str);
        if (interfaceC58337Muz == null) {
            return null;
        }
        return interfaceC58337Muz.LIZ(list);
    }
}
