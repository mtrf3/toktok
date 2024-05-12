package X;

import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fa7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39207Fa7 {
    public static Object LIZ(OHW ohw, InterfaceC88472Yns block) {
        C66300Q0i c66300Q0i;
        o.LJIIJ(block, "block");
        InterfaceC88472Yns<? super C66300Q0i, ? extends Object> aqS137S0200000_6 = new AqS137S0200000_6(ohw, block, 23);
        InterfaceC39206Fa6 interfaceC39206Fa6 = C39205Fa5.LIZ;
        if (interfaceC39206Fa6 != null) {
            c66300Q0i = interfaceC39206Fa6.check(ohw, aqS137S0200000_6);
            if (c66300Q0i != null) {
                return c66300Q0i.LJFF;
            }
        } else {
            c66300Q0i = null;
        }
        return aqS137S0200000_6.invoke(c66300Q0i);
    }
}
