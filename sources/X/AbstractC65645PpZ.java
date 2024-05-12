package X;

import java.util.Iterator;

/* renamed from: X.PpZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65645PpZ<F, T> implements Iterator<T> {
    public final Iterator<? extends F> LJLIL;

    public abstract T LIZ(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return LIZ(this.LJLIL.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LJLIL.remove();
    }

    public AbstractC65645PpZ(Iterator<? extends F> it) {
        it.getClass();
        this.LJLIL = it;
    }
}
