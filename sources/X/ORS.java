package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ORS extends C40675Fxn {
    public static final ORR LJJLIIIJL(List list) {
        o.LJIIIZ(list, "<this>");
        return new ORR(list);
    }

    public static final Object LJJLJ(List list) {
        o.LJIIIZ(list, "<this>");
        if (!list.isEmpty()) {
            return ListProtector.remove(list, 0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object LJJLJLI(List list) {
        o.LJIIIZ(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return ListProtector.remove(list, 0);
    }

    public static final Object LJJLL(List list) {
        o.LJIIIZ(list, "<this>");
        if (!list.isEmpty()) {
            return ListProtector.remove(list, C47261Igj.LJJI(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object LJJZ(List list) {
        o.LJIIIZ(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return ListProtector.remove(list, C47261Igj.LJJI(list));
    }

    public static final void LJJLIIIJILLIZJL(Iterable elements, Collection collection) {
        o.LJIIIZ(collection, "<this>");
        o.LJIIIZ(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void LJJLIIIJJI(Collection collection, InterfaceC1039145z interfaceC1039145z) {
        o.LJIIIZ(collection, "<this>");
        Iterator it = interfaceC1039145z.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void LJJLIIIJJIZ(Collection collection, Object[] elements) {
        o.LJIIIZ(collection, "<this>");
        o.LJIIIZ(elements, "elements");
        collection.addAll(C61898ORa.LJIILL(elements));
    }

    public static final void LJJLIIJ(Iterable iterable, InterfaceC88472Yns predicate) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(predicate, "predicate");
        LJJLIIIJLJLI(iterable, predicate, true);
    }

    public static final boolean LJJLIL(InterfaceC88472Yns predicate, List list) {
        o.LJIIIZ(list, "<this>");
        o.LJIIIZ(predicate, "predicate");
        return LJJLIIIJLLLLLLLZ(list, predicate, true);
    }

    public static final int LJJZZI(int i, List list) {
        if (new C40517FvF(0, C47261Igj.LJJI(list)).LJIILJJIL(i)) {
            return C47261Igj.LJJI(list) - i;
        }
        StringBuilder LJ = C7MY.LJ("Element index ", i, " must be in range [");
        LJ.append(new C40517FvF(0, C47261Igj.LJJI(list)));
        LJ.append("].");
        throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
    }

    public static final boolean LJJLIIIJLJLI(Iterable iterable, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC88472Yns.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean LJJLIIIJLLLLLLLZ(List list, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        if (!(list instanceof RandomAccess)) {
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if (!(list instanceof InterfaceC90533gv) || (list instanceof ORN)) {
                return LJJLIIIJLJLI(list, interfaceC88472Yns, z);
            }
            C65777Prh.LJIIIIZZ(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        C118234kV it = new C40517FvF(0, C47261Igj.LJJI(list)).iterator();
        int i = 0;
        while (it.LJLJI) {
            int nextInt = it.nextInt();
            Object obj = ListProtector.get(list, nextInt);
            if (((Boolean) interfaceC88472Yns.invoke(obj)).booleanValue() != z) {
                if (i != nextInt) {
                    ListProtector.set(list, i, obj);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int LJJI = C47261Igj.LJJI(list);
        if (i > LJJI) {
            return true;
        }
        while (true) {
            ListProtector.remove(list, LJJI);
            if (LJJI != i) {
                LJJI--;
            } else {
                return true;
            }
        }
    }
}
