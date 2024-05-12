package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.7sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199797sl<T> implements Iterator<C2058786d<? extends T>>, InterfaceC90533gv {
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

    /* JADX WARN: Multi-variable type inference failed */
    public C199797sl(Iterator<? extends T> iterator) {
        o.LJIIIZ(iterator, "iterator");
        this.LJLIL = iterator;
    }
}
