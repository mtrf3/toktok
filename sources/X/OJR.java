package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class OJR<E> extends AbstractC61884OQm<E> implements OJQ<E> {
    @Override // X.AbstractC61884OQm, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC61884OQm, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
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

    @Override // X.AbstractC61884OQm, java.util.List
    public final List subList(int i, int i2) {
        return new OJS(this, i, i2);
    }
}
