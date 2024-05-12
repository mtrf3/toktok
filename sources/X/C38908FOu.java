package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FOu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38908FOu {
    public static final ConcurrentHashMap<EnumC38909FOv, InterfaceC38906FOs> LIZ = new ConcurrentHashMap<>();

    static {
        InterfaceC38906FOs c38901FOn;
        for (EnumC38909FOv enumC38909FOv : EnumC38909FOv.values()) {
            ConcurrentHashMap<EnumC38909FOv, InterfaceC38906FOs> concurrentHashMap = LIZ;
            int i = C38910FOw.LIZ[enumC38909FOv.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    c38901FOn = new C38901FOn();
                } else {
                    c38901FOn = new C38903FOp();
                }
            } else {
                c38901FOn = new C38901FOn();
            }
            concurrentHashMap.put(enumC38909FOv, c38901FOn);
        }
    }
}
