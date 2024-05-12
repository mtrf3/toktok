package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.QsU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68374QsU implements Iterator {
    public int LJLIL;
    public final /* synthetic */ C68375QsV LJLILLLLZI;

    public C68374QsU(C68375QsV c68375QsV) {
        this.LJLILLLLZI = c68375QsV;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLILLLLZI.LJIILLIIL()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.LJLIL < this.LJLILLLLZI.LJIILLIIL()) {
            C68375QsV c68375QsV = this.LJLILLLLZI;
            int i = this.LJLIL;
            this.LJLIL = i + 1;
            return c68375QsV.LJIIZILJ(i);
        }
        throw new NoSuchElementException(C64.LIZIZ("Out of bounds index: ", this.LJLIL));
    }
}
