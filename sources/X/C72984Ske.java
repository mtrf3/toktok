package X;

import java.util.LinkedList;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Ske, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72984Ske {
    public static void LIZJ(C72977SkX c72977SkX, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(c72977SkX, "<this>");
        ((LinkedList) c72977SkX.LIZ.getValue()).add(interfaceC88472Yns);
    }

    public static C72977SkX LIZ(Object obj, C72977SkX o1, InterfaceC88471Ynr cb) {
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(cb, "cb");
        C72977SkX c72977SkX = new C72977SkX(obj);
        LIZJ(o1, new AqS178S0100000_12(new AqS101S0300000_12(cb, (InterfaceC88471Ynr<Object, Object, Object>) c72977SkX, (C72977SkX<Object>) o1, (C72977SkX<Object>) 9), 575));
        return c72977SkX;
    }

    public static C72977SkX LIZIZ(Object obj, C72977SkX o1, C72977SkX o2, InterfaceC88473Ynt cb) {
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        o.LJIIIZ(cb, "cb");
        C72977SkX c72977SkX = new C72977SkX(obj);
        AqS72S0400000_12 aqS72S0400000_12 = new AqS72S0400000_12(cb, (InterfaceC88473Ynt<Object, Object, Object, Object>) c72977SkX, (C72977SkX<Object>) o1, (C72977SkX<Object>) o2, (C72977SkX<Object>) 26);
        LIZJ(o1, new AqS178S0100000_12(aqS72S0400000_12, 576));
        LIZJ(o2, new AqS178S0100000_12(aqS72S0400000_12, 577));
        return c72977SkX;
    }
}
