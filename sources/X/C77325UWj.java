package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.UWj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77325UWj<T> implements Iterator<C2058786d<? extends T>>, InterfaceC90533gv {
    public final Iterator<T> LJLIL;
    public int LJLILLLLZI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = i + 1;
        if (i >= 0) {
            return new C2058786d(i, this.LJLIL.next());
        }
        C47261Igj.LJJJJJ();
        throw null;
    }

    public C77325UWj(C77326UWk<T> c77326UWk) {
        this.LJLIL = c77326UWk.LIZ.iterator();
    }
}
