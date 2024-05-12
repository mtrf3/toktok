package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a5E, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92096a5E {
    public static void LIZ(C91722ZzC c91722ZzC, String route, List arguments, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88472Yns interfaceC88472Yns3, InterfaceC88472Yns interfaceC88472Yns4, C40431iJ c40431iJ) {
        C61878OQg deepLinks = C61878OQg.INSTANCE;
        o.LJIIIZ(c91722ZzC, "<this>");
        o.LJIIIZ(route, "route");
        o.LJIIIZ(arguments, "arguments");
        o.LJIIIZ(deepLinks, "deepLinks");
        C91700Zyq c91700Zyq = c91722ZzC.LJI;
        c91700Zyq.getClass();
        C92315a8l c92315a8l = new C92315a8l((C92316a8m) c91700Zyq.LIZIZ(C91699Zyp.LIZ(C92316a8m.class)), c40431iJ);
        c92315a8l.LJIILLIIL(route);
        Iterator it = arguments.iterator();
        while (it.hasNext()) {
            C91690Zyg c91690Zyg = (C91690Zyg) it.next();
            String argumentName = c91690Zyg.LIZ;
            C91698Zyo argument = c91690Zyg.LIZIZ;
            o.LJIIIZ(argumentName, "argumentName");
            o.LJIIIZ(argument, "argument");
            c92315a8l.LJLJJL.put(argumentName, argument);
        }
        Iterator it2 = deepLinks.iterator();
        while (it2.hasNext()) {
            c92315a8l.LIZJ((C91712Zz2) it2.next());
        }
        if (interfaceC88472Yns != null) {
            C92094a5C.LIZ.put(route, interfaceC88472Yns);
        }
        if (interfaceC88472Yns2 != null) {
            C92094a5C.LIZIZ.put(route, interfaceC88472Yns2);
        }
        if (interfaceC88472Yns3 != null) {
            C92094a5C.LIZJ.put(route, interfaceC88472Yns3);
        }
        if (interfaceC88472Yns4 != null) {
            C92094a5C.LIZLLL.put(route, interfaceC88472Yns4);
        }
        ((ArrayList) c91722ZzC.LJIIIIZZ).add(c92315a8l);
    }
}
