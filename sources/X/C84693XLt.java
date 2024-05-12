package X;

import java.util.ListIterator;

/* renamed from: X.XLt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84693XLt implements ListIterator<String> {
    public final ListIterator<String> LJLIL;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LJLIL.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.LJLIL.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
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
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    public C84693XLt(C84692XLs c84692XLs, int i) {
        this.LJLIL = c84692XLs.LJLIL.listIterator(i);
    }
}
