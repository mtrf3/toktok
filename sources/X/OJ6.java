package X;

import java.util.Iterator;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class OJ6 extends C60903NvH {
    public static final <T> InterfaceC1039145z<T> LJJIJLIJ(Iterator<? extends T> it) {
        o.LJIIIZ(it, "<this>");
        C36973EfB c36973EfB = new C36973EfB(it);
        if (c36973EfB instanceof F3W) {
            return c36973EfB;
        }
        return new F3W(c36973EfB);
    }

    public static final C51652KOy LJJIL(InterfaceC1039145z interfaceC1039145z) {
        C36975EfD iterator = C36975EfD.LJLIL;
        if (interfaceC1039145z instanceof C110574Vp) {
            C110574Vp c110574Vp = (C110574Vp) interfaceC1039145z;
            o.LJIIIZ(iterator, "iterator");
            return new C51652KOy(c110574Vp.LIZ, c110574Vp.LIZIZ, iterator);
        }
        return new C51652KOy(interfaceC1039145z, C58395Mvv.LJLIL, iterator);
    }

    public static final <T> InterfaceC1039145z<T> LJJJ(T... tArr) {
        if (tArr.length == 0) {
            return OJA.LIZ;
        }
        return ORY.LJJIIZ(tArr);
    }

    public static final <T> InterfaceC1039145z<T> LJJIZ(T t, InterfaceC88472Yns<? super T, ? extends T> nextFunction) {
        o.LJIIIZ(nextFunction, "nextFunction");
        if (t == null) {
            return OJA.LIZ;
        }
        return new OJL(new AqS158S0100000_8(t, 670), nextFunction);
    }
}
