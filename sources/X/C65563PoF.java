package X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.PoF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65563PoF<K, V> extends AbstractC65569PoL<K, AbstractC65583PoZ<V>> {
    public final /* synthetic */ AbstractC65564PoG LJLJJL;

    @Override // X.AbstractC65569PoL, X.AbstractC65564PoG
    public final AbstractC65583PoZ<K> LIZIZ() {
        return this.LJLJJL.keySet();
    }

    @Override // X.AbstractC65564PoG
    public final boolean LIZLLL() {
        return this.LJLJJL.LIZLLL();
    }

    @Override // X.AbstractC65564PoG
    public final boolean LJ() {
        return this.LJLJJL.LJ();
    }

    @Override // X.AbstractC65569PoL
    public final AbstractC65557Po9<Map.Entry<K, AbstractC65583PoZ<V>>> LJI() {
        return new C65562PoE(this.LJLJJL.entrySet().iterator());
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final int hashCode() {
        return this.LJLJJL.hashCode();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLJJL.size();
    }

    public C65563PoF(AbstractC65564PoG abstractC65564PoG) {
        this.LJLJJL = abstractC65564PoG;
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LJLJJL.containsKey(obj);
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.LJLJJL.get(obj);
        if (obj2 == null) {
            return null;
        }
        return AbstractC65583PoZ.of(obj2);
    }
}
