package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.28Q, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C28Q<E> extends AbstractC61884OQm<E> implements InterfaceC44221oQ<E> {
    @Override // X.AbstractC61884OQm, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, X.InterfaceC44221oQ
    public InterfaceC44221oQ<E> addAll(Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        C2HH builder = builder();
        builder.addAll(elements);
        return builder.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.OQZ, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> remove(E e) {
        int indexOf = indexOf(e);
        if (indexOf != -1) {
            return LJJJJIZL(indexOf);
        }
        return this;
    }

    @Override // java.util.Collection, java.util.List, X.InterfaceC44221oQ
    public final InterfaceC44221oQ<E> removeAll(Collection<? extends E> elements) {
        o.LJIIIZ(elements, "elements");
        return LJJJJ(new IDqS416S0100000(elements, 361));
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final List subList(int i, int i2) {
        return new C533127j(this, i, i2);
    }
}
