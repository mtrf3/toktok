package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class OJM<E> implements Iterable<E> {
    public final WeakHashMap<E, Object> LJLIL = new WeakHashMap<>();
    public final Object LJLILLLLZI = new Object();

    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        ArrayList arrayList = new ArrayList(this.LJLIL.size());
        for (E e : this.LJLIL.keySet()) {
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList.iterator();
    }

    public final void LJIIZILJ(E e) {
        if (e == null) {
            this.LJLIL.size();
        } else {
            this.LJLIL.put(e, this.LJLILLLLZI);
        }
    }

    public final void LJIJ(E e) {
        if (e == null) {
            this.LJLIL.size();
        } else {
            this.LJLIL.remove(e);
        }
    }
}
