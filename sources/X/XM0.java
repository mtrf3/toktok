package X;

import java.util.Iterator;

/* loaded from: classes16.dex */
public final class XM0 implements Iterator {
    public final Iterator LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.LJLIL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public XM0(XM1 xm1) {
        this.LJLIL = xm1.LJLIL.iterator();
    }
}
