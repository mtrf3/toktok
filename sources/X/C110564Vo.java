package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: X.4Vo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110564Vo<R> implements Iterator<R>, InterfaceC90533gv {
    public final Iterator<T> LJLIL;
    public final /* synthetic */ C110574Vp<T, R> LJLILLLLZI;

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
        return this.LJLILLLLZI.LIZIZ.invoke(this.LJLIL.next());
    }

    public C110564Vo(C110574Vp<T, R> c110574Vp) {
        this.LJLILLLLZI = c110574Vp;
        this.LJLIL = c110574Vp.LIZ.iterator();
    }
}
