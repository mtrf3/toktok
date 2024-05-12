package X;

import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: X.EcM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36798EcM {
    public static final java.util.Map<String, InterfaceC36797EcL> LIZ = Collections.synchronizedMap(new LinkedHashMap());

    static {
        LIZ(new C36801EcP());
        LIZ(new C36800EcO());
        LIZ(new C36799EcN());
    }

    public static void LIZ(InterfaceC36797EcL interfaceC36797EcL) {
        java.util.Map<String, InterfaceC36797EcL> map = LIZ;
        if (map.containsKey(interfaceC36797EcL.type())) {
            return;
        }
        map.put(interfaceC36797EcL.type(), interfaceC36797EcL);
    }
}
