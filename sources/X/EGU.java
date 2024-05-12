package X;

import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class EGU implements Iterator<Long>, InterfaceC90533gv {
    public abstract long nextLong();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }
}
