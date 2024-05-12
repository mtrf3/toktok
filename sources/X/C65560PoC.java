package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.PoC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65560PoC<F, T> extends AbstractCollection<T> {
    public final Collection<F> LJLIL;
    public final InterfaceC65644PpY<? super F, ? extends T> LJLILLLLZI;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        Iterator<F> it = this.LJLIL.iterator();
        InterfaceC65644PpY<? super F, ? extends T> interfaceC65644PpY = this.LJLILLLLZI;
        interfaceC65644PpY.getClass();
        return new C65643PpX(it, interfaceC65644PpY);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    public C65560PoC(Collection<F> collection, InterfaceC65644PpY<? super F, ? extends T> interfaceC65644PpY) {
        this.LJLIL = collection;
        this.LJLILLLLZI = interfaceC65644PpY;
    }
}
