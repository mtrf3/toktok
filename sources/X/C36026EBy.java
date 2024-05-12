package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.EBy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36026EBy<K, V> implements Iterator<Map.Entry<K, V>> {
    public final /* synthetic */ Iterator LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new C36025EBx((Map.Entry) this.LJLIL.next());
    }

    public C36026EBy(Iterator it) {
        this.LJLIL = it;
    }
}
