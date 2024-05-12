package X;

import java.util.Iterator;

/* renamed from: X.PoN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65571PoN<K, V> extends AbstractC65599Pop<K> {
    public final AbstractC65564PoG<K, V> LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC65599Pop, X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<K> iterator() {
        return new C65572PoO(this.LJLJI.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65570PoM(this.LJLJI);
    }

    @Override // X.AbstractC65599Pop, X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public C65571PoN(AbstractC65564PoG<K, V> abstractC65564PoG) {
        this.LJLJI = abstractC65564PoG;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLJI.containsKey(obj);
    }

    @Override // X.AbstractC65599Pop
    public final K get(int i) {
        return this.LJLJI.entrySet().asList().get(i).getKey();
    }
}
