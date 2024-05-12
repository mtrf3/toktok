package X;

import com.bytedance.ies.powerlist.PowerCell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9xP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253639xP {
    public final List<InterfaceC57784Mm4> LIZ = new ArrayList();
    public final HashMap<Class<? extends PowerCell<?>>, Object> LIZIZ = new HashMap<>();

    public final void LIZ(C253569xI c253569xI, InterfaceC88472Yns predicate) {
        o.LJIIIZ(predicate, "predicate");
        if (((Boolean) predicate.invoke(c253569xI)).booleanValue() && c253569xI != null) {
            ((ArrayList) this.LIZ).add(c253569xI);
        }
    }

    public static void LIZIZ(C253639xP c253639xP, InterfaceC57784Mm4 interfaceC57784Mm4, Class cls, C232369Aa c232369Aa, int i) {
        InterfaceC88472Yns predicate = c232369Aa;
        if ((i & 4) != 0) {
            predicate = C253659xR.LJLIL;
        }
        C253669xS doWhat = null;
        if ((i & 8) != 0) {
            doWhat = C253669xS.LJLIL;
        }
        c253639xP.getClass();
        o.LJIIIZ(predicate, "predicate");
        o.LJIIIZ(doWhat, "doWhat");
        if (predicate.invoke(interfaceC57784Mm4).booleanValue() && interfaceC57784Mm4 != null) {
            doWhat.invoke(interfaceC57784Mm4);
            ((ArrayList) c253639xP.LIZ).add(interfaceC57784Mm4);
            c253639xP.LIZIZ.put(cls, interfaceC57784Mm4);
        }
    }
}
