package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Qsu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68400Qsu implements Iterator {
    public int LJLIL;
    public final /* synthetic */ C68376QsW LJLILLLLZI;

    public C68400Qsu(C68376QsW c68376QsW) {
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
        if (i < this.LJLILLLLZI.LJLIL.length()) {
            this.LJLIL = i + 1;
            return new C68376QsW(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
