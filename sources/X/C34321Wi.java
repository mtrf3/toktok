package X;

import java.util.Iterator;

/* renamed from: X.1Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34321Wi implements Iterator<AbstractC17640me>, InterfaceC90533gv {
    public final Iterator<AbstractC17640me> LJLIL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final AbstractC17640me next() {
        return this.LJLIL.next();
    }

    public C34321Wi(C34331Wj c34331Wj) {
        this.LJLIL = c34331Wj.LJLL.iterator();
    }
}
