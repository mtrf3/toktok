package X;

import java.util.Iterator;

/* renamed from: X.1fW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38701fW<K, V, T> implements Iterator<T>, InterfaceC90533gv {
    public Object[] LJLIL = C14U.LJ.LIZLLL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLJI < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }
}
