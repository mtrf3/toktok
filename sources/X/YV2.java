package X;

import java.util.NoSuchElementException;

/* loaded from: classes16.dex */
public final class YV2 extends YV4 {
    public final int LJLIL;
    public int LJLILLLLZI;
    public final AbstractC87480YUy LJLJI;

    @Override // java.util.Iterator, java.util.ListIterator
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        return this.LJLILLLLZI < this.LJLIL;
    }

    @Override // java.util.ListIterator
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final boolean hasPrevious() {
        return this.LJLILLLLZI > 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLILLLLZI - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (hasNext()) {
            int i = this.LJLILLLLZI;
            this.LJLILLLLZI = i + 1;
            return this.LJLJI.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.LJLILLLLZI - 1;
            this.LJLILLLLZI = i;
            return this.LJLJI.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLILLLLZI;
    }

    public YV2(AbstractC87480YUy abstractC87480YUy, int i) {
        int size = abstractC87480YUy.size();
        C47265Ign.LIZIZ(i, size);
        this.LJLIL = size;
        this.LJLILLLLZI = i;
        this.LJLJI = abstractC87480YUy;
    }
}
