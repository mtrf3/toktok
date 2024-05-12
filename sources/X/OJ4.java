package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class OJ4 extends OJ9 {
    public static final <T> int LJJJI(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        Iterator<? extends T> it = interfaceC1039145z.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C47261Igj.LJJJJIZL();
                throw null;
            }
        }
        return i;
    }

    public static final Object LJJJIL(C115534g9 c115534g9) {
        C115524g8 c115524g8 = new C115524g8(c115534g9);
        if (c115524g8.hasNext()) {
            return c115524g8.next();
        }
        return null;
    }

    public static final C115534g9 LJJJJIZL(InterfaceC1039145z interfaceC1039145z) {
        o.LJIIIZ(interfaceC1039145z, "<this>");
        return LJJJJI(interfaceC1039145z, C34417Df3.LJLIL);
    }

    public static final <T> T LJJJJJ(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        Iterator<? extends T> it = interfaceC1039145z.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T> T LJJJJLI(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        Iterator<? extends T> it = interfaceC1039145z.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final Comparable LJJJJZI(C110574Vp c110574Vp) {
        C110564Vo c110564Vo = new C110564Vo(c110574Vp);
        if (!c110564Vo.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) c110564Vo.next();
        while (c110564Vo.hasNext()) {
            Comparable comparable2 = (Comparable) c110564Vo.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final InterfaceC1039145z LJJL(InterfaceC1039145z interfaceC1039145z) {
        if (interfaceC1039145z instanceof OJ8) {
            return ((OJ8) interfaceC1039145z).take();
        }
        return new OJC(interfaceC1039145z);
    }

    public static final <T> List<T> LJJLIIIIJ(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        return C47261Igj.LJJIJLIJ(LJJLIIIJ(interfaceC1039145z));
    }

    public static final <T> List<T> LJJLIIIJ(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        o.LJIIIZ(interfaceC1039145z, "<this>");
        ArrayList arrayList = new ArrayList();
        LJJLI(arrayList, interfaceC1039145z);
        return arrayList;
    }

    public static final C115534g9 LJJJJ(InterfaceC1039145z interfaceC1039145z, InterfaceC88472Yns predicate) {
        o.LJIIIZ(predicate, "predicate");
        return new C115534g9(interfaceC1039145z, true, predicate);
    }

    public static final C115534g9 LJJJJI(InterfaceC1039145z interfaceC1039145z, InterfaceC88472Yns predicate) {
        o.LJIIIZ(interfaceC1039145z, "<this>");
        o.LJIIIZ(predicate, "predicate");
        return new C115534g9(interfaceC1039145z, false, predicate);
    }

    public static final C51652KOy LJJJJJL(InterfaceC1039145z interfaceC1039145z, InterfaceC88472Yns transform) {
        o.LJIIIZ(transform, "transform");
        return new C51652KOy(interfaceC1039145z, transform, OJ7.LJLIL);
    }

    public static final C51652KOy LJJJJL(C115534g9 c115534g9, InterfaceC88472Yns transform) {
        o.LJIIIZ(transform, "transform");
        return new C51652KOy(c115534g9, transform, OJ5.LJLIL);
    }

    public static final C110574Vp LJJJJLL(InterfaceC1039145z interfaceC1039145z, InterfaceC88472Yns transform) {
        o.LJIIIZ(interfaceC1039145z, "<this>");
        o.LJIIIZ(transform, "transform");
        return new C110574Vp(interfaceC1039145z, transform);
    }

    public static final C115534g9 LJJJJZ(InterfaceC1039145z interfaceC1039145z, InterfaceC88472Yns transform) {
        o.LJIIIZ(transform, "transform");
        return LJJJJIZL(new C110574Vp(interfaceC1039145z, transform));
    }

    public static final C110574Vp LJJJLIIL(InterfaceC1039145z interfaceC1039145z, InterfaceC88472Yns action) {
        o.LJIIIZ(action, "action");
        return LJJJJLL(interfaceC1039145z, new AqS168S0100000_2(action, 617));
    }

    public static final C51652KOy LJJJLL(C115534g9 c115534g9, Object obj) {
        return OJ6.LJJIL(OJ6.LJJJ(c115534g9, OJ6.LJJJ(obj)));
    }

    public static final C51652KOy LJJJLZIJ(InterfaceC1039145z interfaceC1039145z, Iterable elements) {
        o.LJIIIZ(interfaceC1039145z, "<this>");
        o.LJIIIZ(elements, "elements");
        return OJ6.LJJIL(OJ6.LJJJ(interfaceC1039145z, ORZ.LJLIIIL(elements)));
    }

    public static final C51652KOy LJJJZ(InterfaceC1039145z interfaceC1039145z, C33961Uy c33961Uy) {
        return OJ6.LJJIL(OJ6.LJJJ(interfaceC1039145z, c33961Uy));
    }

    public static final void LJJLI(Collection collection, InterfaceC1039145z interfaceC1039145z) {
        o.LJIIIZ(interfaceC1039145z, "<this>");
        Iterator it = interfaceC1039145z.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
