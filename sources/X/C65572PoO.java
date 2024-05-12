package X;

import java.util.Map;

/* renamed from: X.PoO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65572PoO extends AbstractC65557Po9<Object> {
    public final /* synthetic */ AbstractC65557Po9 LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.LJLIL.next()).getKey();
    }

    public C65572PoO(AbstractC65557Po9 abstractC65557Po9) {
        this.LJLIL = abstractC65557Po9;
    }
}
