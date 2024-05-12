package X;

import java.util.Iterator;

/* renamed from: X.Pou, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65604Pou<K, V> extends AbstractC65578PoU<V> {
    public final AbstractC65564PoG<K, V> LJLILLLLZI;

    @Override // X.AbstractC65578PoU
    public final AbstractC65590Pog<V> asList() {
        return new C65603Pot(this.LJLILLLLZI.entrySet().asList());
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<V> iterator() {
        return new C65605Pov(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65606Pow(this.LJLILLLLZI);
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C65605Pov(this);
    }

    public C65604Pou(AbstractC65564PoG<K, V> abstractC65564PoG) {
        this.LJLILLLLZI = abstractC65564PoG;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        C65605Pov c65605Pov = new C65605Pov(this);
        while (c65605Pov.hasNext()) {
            if (obj.equals(c65605Pov.next())) {
                return true;
            }
        }
        return false;
    }
}
