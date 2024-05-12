package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16910lT {
    public static Object LIZ(InterfaceC16890lR interfaceC16890lR, InterfaceC32651Px interfaceC32651Px, String str, String str2, InterfaceC65784Pro interfaceC65784Pro) {
        int length;
        String LIZ = interfaceC16890lR.LIZ(interfaceC32651Px, str, str2);
        Object invoke = interfaceC65784Pro.invoke();
        if (invoke != null) {
            if (o.LJ(str2, "String")) {
                length = ((String) invoke).length();
            } else if (o.LJ(str2, "StringSet")) {
                length = C65777Prh.LIZLLL(invoke).size();
            } else if (o.LJ(str2, "Array")) {
                length = ((Object[]) invoke).length;
            } else if (o.LJ(str2, "ByteArray")) {
                length = ((byte[]) invoke).length;
            }
            interfaceC16890lR.LIZLLL(LIZ, interfaceC32651Px, length);
            return invoke;
        }
        length = -1;
        interfaceC16890lR.LIZLLL(LIZ, interfaceC32651Px, length);
        return invoke;
    }

    public static void LIZIZ(InterfaceC16890lR interfaceC16890lR, InterfaceC32651Px interfaceC32651Px, String str, String str2, Object obj, int i, InterfaceC65784Pro interfaceC65784Pro) {
        String LJIIIZ = interfaceC16890lR.LJIIIZ(interfaceC32651Px, str, str2);
        interfaceC65784Pro.invoke();
        interfaceC16890lR.LJIIIIZZ(LJIIIZ, interfaceC32651Px, i);
    }
}
