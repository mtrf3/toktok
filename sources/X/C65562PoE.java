package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PoE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65562PoE<K, V> extends AbstractC65557Po9<Map.Entry<K, AbstractC65583PoZ<V>>> {
    public final /* synthetic */ Iterator LJLIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new C65530Pni((Map.Entry) this.LJLIL.next());
    }

    public C65562PoE(AbstractC65557Po9 abstractC65557Po9) {
        this.LJLIL = abstractC65557Po9;
    }
}
