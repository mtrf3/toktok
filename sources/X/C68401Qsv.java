package X;

import java.util.Iterator;

/* renamed from: X.Qsv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68401Qsv implements Iterator {
    public final /* synthetic */ Iterator LJLIL;

    public C68401Qsv(Iterator it) {
        this.LJLIL = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C68376QsW((String) this.LJLIL.next());
    }
}
