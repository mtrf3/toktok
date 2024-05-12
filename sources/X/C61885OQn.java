package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.OQn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61885OQn<E> extends AbstractC61884OQm<E>.b implements ListIterator<E> {
    public final /* synthetic */ AbstractC61884OQm<E> LJLJI;

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLIL > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLIL - 1;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC61884OQm<E> abstractC61884OQm = this.LJLJI;
            int i = this.LJLIL - 1;
            this.LJLIL = i;
            return abstractC61884OQm.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61885OQn(AbstractC61884OQm abstractC61884OQm, int i) {
        super();
        this.LJLJI = abstractC61884OQm;
        C61880OQi.LIZIZ(i, abstractC61884OQm.LIZJ());
        this.LJLIL = i;
    }
}
