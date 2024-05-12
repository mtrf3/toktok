package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MKv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56641MKv {
    public static volatile C56639MKt LIZ;
    public static String LIZIZ;

    public static void LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        C56639MKt c56639MKt = LIZ;
        if (c56639MKt != null) {
            interfaceC88472Yns.invoke(c56639MKt);
        }
    }

    public static Object LIZIZ(C8WY event, InterfaceC65784Pro interfaceC65784Pro) {
        Object LIZIZ2;
        o.LJIIIZ(event, "event");
        C56639MKt c56639MKt = LIZ;
        if (c56639MKt == null || (LIZIZ2 = c56639MKt.LIZJ.LIZIZ(event, interfaceC65784Pro)) == null) {
            return interfaceC65784Pro.invoke();
        }
        return LIZIZ2;
    }
}
