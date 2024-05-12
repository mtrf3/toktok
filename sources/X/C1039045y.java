package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: X.45y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1039045y<R> implements Iterator<R>, InterfaceC90533gv {
    public final Iterator<T> LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C1038945x<T, R> LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final R next() {
        InterfaceC88471Ynr<Integer, T, R> interfaceC88471Ynr = this.LJLJI.LIZIZ;
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = i + 1;
        if (i >= 0) {
            return interfaceC88471Ynr.invoke(Integer.valueOf(i), this.LJLIL.next());
        }
        C47261Igj.LJJJJJ();
        throw null;
    }

    public C1039045y(C1038945x<T, R> c1038945x) {
        this.LJLJI = c1038945x;
        this.LJLIL = c1038945x.LIZ.iterator();
    }
}
