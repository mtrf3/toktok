package X;

import java.util.NoSuchElementException;

/* loaded from: classes16.dex */
public final class YI1 implements YI3 {
    public int LJLIL;
    public final int LJLILLLLZI;
    public final /* synthetic */ AbstractC87141YHx LJLJI;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        LIZIZ();
        throw null;
    }

    public static final void LIZIZ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.YI3
    public final byte LIZJ() {
        int i = this.LJLIL;
        if (i < this.LJLILLLLZI) {
            this.LJLIL = i + 1;
            return this.LJLJI.LJIIIZ(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Object next() {
        return Byte.valueOf(LIZJ());
    }

    public YI1(AbstractC87141YHx abstractC87141YHx) {
        this.LJLJI = abstractC87141YHx;
        this.LJLILLLLZI = abstractC87141YHx.size();
    }
}
