package X;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.1DR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DR<T> implements ListIterator<T>, InterfaceC90533gv {
    public int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ C1DU<T> LJLJJI;

    @Override // java.util.ListIterator
    public final void add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLIL > this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        Object[] objArr = this.LJLJJI.LJLIL;
        int i = this.LJLIL;
        this.LJLIL = i + 1;
        return (T) objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL - this.LJLILLLLZI;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        Object[] objArr = this.LJLJJI.LJLIL;
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        return (T) objArr[i];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.LJLIL - this.LJLILLLLZI) - 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1DR(X.C1DU r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto L10
            int r0 = r3.LJLJJI
        Lc:
            r2.<init>(r3, r4, r1, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DR.<init>(X.1DU, int, int):void");
    }

    public C1DR(C1DU c1du, int i, int i2, int i3) {
        this.LJLJJI = c1du;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }
}
