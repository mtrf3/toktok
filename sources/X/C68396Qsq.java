package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Qsq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68396Qsq implements Iterator {
    public int LJLIL;
    public final /* synthetic */ C68376QsW LJLILLLLZI;

    public C68396Qsq(C68376QsW c68376QsW) {
        this.LJLILLLLZI = c68376QsW;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLILLLLZI.LJLIL.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.LJLIL;
        C68376QsW c68376QsW = this.LJLILLLLZI;
        if (i < c68376QsW.LJLIL.length()) {
            String str = c68376QsW.LJLIL;
            this.LJLIL = i + 1;
            return new C68376QsW(String.valueOf(str.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
