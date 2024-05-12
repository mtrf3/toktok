package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PoK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65568PoK<K, V> extends AbstractC65566PoI<K, V> {
    public final /* synthetic */ AbstractC65569PoL LJLJI;

    @Override // X.AbstractC65566PoI, X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<Map.Entry<K, V>> iterator() {
        return this.LJLJI.LJI();
    }

    @Override // X.AbstractC65566PoI
    public final AbstractC65569PoL LJIIJ() {
        return this.LJLJI;
    }

    public C65568PoK(AbstractC65569PoL abstractC65569PoL) {
        this.LJLJI = abstractC65569PoL;
    }
}
