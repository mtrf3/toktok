package X;

import java.util.Iterator;

/* renamed from: X.XLu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84694XLu implements Iterator<String> {
    public final Iterator<String> LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.LJLIL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C84694XLu(C84692XLs c84692XLs) {
        this.LJLIL = c84692XLs.LJLIL.iterator();
    }
}
