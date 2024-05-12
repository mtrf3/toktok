package X;

import defpackage.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.Ppp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65661Ppp {
    public static <E> ArrayList<E> LIZ(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        ArrayList<E> arrayList = new ArrayList<>();
        C65631PpL.LIZ(arrayList, it);
        return arrayList;
    }

    public static <E> ArrayList<E> LIZIZ(E... eArr) {
        int length = eArr.length;
        g0.LJIIIIZZ(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(C65713Pqf.LIZ(length + 5 + (length / 10)));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <T> List<T> LIZJ(List<T> list) {
        if (list instanceof AbstractC65590Pog) {
            return ((AbstractC65590Pog) list).reverse();
        }
        if (list instanceof C65665Ppt) {
            return ((C65665Ppt) list).LJLIL;
        }
        if (list instanceof RandomAccess) {
            return new C65688PqG(list);
        }
        return new C65665Ppt(list);
    }

    public static <F, T> List<T> LIZLLL(List<F> list, InterfaceC65644PpY<? super F, ? extends T> interfaceC65644PpY) {
        if (list instanceof RandomAccess) {
            return new C65664Pps(list, interfaceC65644PpY);
        }
        return new C65663Ppr(list, interfaceC65644PpY);
    }
}
