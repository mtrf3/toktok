package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.1IP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IP<T> implements ListIterator<T>, InterfaceC90533gv {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ C48171un<T> LJLILLLLZI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL.element < this.LJLILLLLZI.LJLJJI - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLIL.element >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        int i = this.LJLIL.element + 1;
        C0OG.LIZ(i, this.LJLILLLLZI.LJLJJI);
        this.LJLIL.element = i;
        return this.LJLILLLLZI.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL.element + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.LJLIL.element;
        C0OG.LIZ(i, this.LJLILLLLZI.LJLJJI);
        this.LJLIL.element = i - 1;
        return this.LJLILLLLZI.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLIL.element;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        "Cannot modify a state list through an iterator".toString();
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        "Cannot modify a state list through an iterator".toString();
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        "Cannot modify a state list through an iterator".toString();
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public C1IP(C76732zl c76732zl, C48171un<T> c48171un) {
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = c48171un;
    }
}
