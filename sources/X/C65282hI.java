package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65282hI {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C65302hK.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C65292hJ.LJLIL);

    public static String LIZIZ(String originKey) {
        o.LJIIIZ(originKey, "originKey");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(originKey);
        LIZ2.append("_calculate_bg");
        return X1D.LIZIZ(LIZ2);
    }

    public static OSZ LIZJ(String originKey) {
        OSZ osz;
        o.LJIIIZ(originKey, "originKey");
        Object obj = ((java.util.Map) LIZIZ.getValue()).get(LIZIZ(originKey));
        if (!(obj instanceof OSZ) || (osz = (OSZ) obj) == null) {
            return new OSZ(-16777216, -16777216);
        }
        return osz;
    }

    public static void LIZLLL(String key) {
        o.LJIIIZ(key, "key");
        InterfaceC68342mE interfaceC68342mE = (InterfaceC68342mE) ((ConcurrentHashMap) LIZ.getValue()).remove(key);
        if (interfaceC68342mE != null && interfaceC68342mE.isCompleted()) {
            ((java.util.Map) LIZIZ.getValue()).put(key, interfaceC68342mE.LIZJ());
        }
    }

    public static void LJ(List list) {
        if (!((ConcurrentHashMap) LIZ.getValue()).isEmpty()) {
            XKX.LJ(MBB.INSTANCE, new C63922f6(list, null));
        }
    }

    public static void LIZ(String key, InterfaceC68342mE interfaceC68342mE) {
        o.LJIIIZ(key, "key");
        if (interfaceC68342mE == null) {
            return;
        }
        ((ConcurrentHashMap) LIZ.getValue()).put(key, interfaceC68342mE);
    }
}
