package X;

import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E3F {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, InterfaceC65784Pro targetAction, boolean z) {
        o.LJIIIZ(targetAction, "targetAction");
        C38805FKv.LIZIZ(C38805FKv.LIZ, new C35666DzC(str, z, E3H.IFRUN, 0), targetAction, null, 4);
    }

    public static void LIZ(String str, boolean z, Integer num, InterfaceC65784Pro originalAction) {
        o.LJIIIZ(originalAction, "originalAction");
        C38805FKv.LIZIZ(C38805FKv.LIZ, new C35666DzC(str, z, E3H.DELAY, num), null, new AqS156S0100000_6(originalAction, (InterfaceC65784Pro<C76800UCe>) 139), 2);
    }

    public static Object LIZJ(String str, InterfaceC65784Pro originalAction, InterfaceC65784Pro targetAction, boolean z) {
        o.LJIIIZ(originalAction, "originalAction");
        o.LJIIIZ(targetAction, "targetAction");
        return C38805FKv.LIZ.LIZ(new C35666DzC(str, z, E3H.REPLACE, 0), targetAction, new AqS156S0100000_6(originalAction, (InterfaceC65784Pro<C76800UCe>) 142));
    }
}
