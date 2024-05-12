package X;

import java.util.Iterator;

/* renamed from: X.Zcq, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90336Zcq implements Iterator<String> {
    public final Iterator<String> LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.LJLIL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C90336Zcq(C90727Zj9 c90727Zj9) {
        this.LJLIL = c90727Zj9.LJLIL.iterator();
    }
}
