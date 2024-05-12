package X;

import java.util.ListIterator;

/* renamed from: X.Zci, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90328Zci implements ListIterator<String> {
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
    public final /* bridge */ /* synthetic */ Object next() {
        return this.LJLIL.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
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

    public C90328Zci(C90727Zj9 c90727Zj9, int i) {
        this.LJLIL = c90727Zj9.LJLIL.listIterator(i);
    }
}
