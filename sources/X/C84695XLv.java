package X;

import java.util.ListIterator;

/* renamed from: X.XLv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84695XLv implements ListIterator {
    public final ListIterator LJLIL;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LJLIL.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.LJLIL.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return this.LJLIL.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLIL.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C84695XLv(XM1 xm1, int i) {
        this.LJLIL = xm1.LJLIL.listIterator(i);
    }
}
