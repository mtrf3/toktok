package X;

import defpackage.g0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Ppu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65666Ppu<T> implements ListIterator<T> {
    public boolean LJLIL;
    public final /* synthetic */ ListIterator LJLILLLLZI;
    public final /* synthetic */ C65665Ppt LJLJI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LJLILLLLZI.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LJLILLLLZI.hasNext();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        C65665Ppt c65665Ppt = this.LJLJI;
        int nextIndex = this.LJLILLLLZI.nextIndex();
        int size = c65665Ppt.size();
        C76917UGr.LJIIIIZZ(nextIndex, size);
        return size - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        g0.LJIIJ(this.LJLIL);
        this.LJLILLLLZI.remove();
        this.LJLIL = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.LJLIL = true;
            return (T) this.LJLILLLLZI.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (hasPrevious()) {
            this.LJLIL = true;
            return (T) this.LJLILLLLZI.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        this.LJLILLLLZI.add(t);
        this.LJLILLLLZI.previous();
        this.LJLIL = false;
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        C76917UGr.LJIILL(this.LJLIL);
        this.LJLILLLLZI.set(t);
    }

    public C65666Ppu(C65665Ppt c65665Ppt, ListIterator listIterator) {
        this.LJLJI = c65665Ppt;
        this.LJLILLLLZI = listIterator;
    }
}
