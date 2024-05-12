package X;

import java.util.LinkedHashMap;

/* renamed from: X.Lgx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54919Lgx {
    public static final C61136Nz2 LIZ;
    public static final java.util.Map<String, InterfaceC54881LgL> LIZIZ;

    static {
        C61136Nz2 c61136Nz2 = new C61136Nz2();
        LIZ = c61136Nz2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("FYP", c61136Nz2);
        linkedHashMap.put("Nearby", new C61137Nz3());
        LIZIZ = linkedHashMap;
    }

    public static InterfaceC54881LgL LIZ() {
        InterfaceC54881LgL interfaceC54881LgL = (InterfaceC54881LgL) ((LinkedHashMap) LIZIZ).get("Nearby");
        if (interfaceC54881LgL == null) {
            return LIZ;
        }
        return interfaceC54881LgL;
    }
}
