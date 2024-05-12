package X;

import java.util.Iterator;

/* renamed from: X.PoP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65573PoP<K> extends AbstractC65583PoZ<K> {
    public final transient AbstractC65564PoG<K, ?> LJLJI;
    public final transient AbstractC65590Pog<K> LJLJJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<K> iterator() {
        return this.LJLJJI.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU
    public final AbstractC65590Pog<K> asList() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.LJLJI.get(obj) != null) {
            return true;
        }
        return false;
    }

    public C65573PoP(AbstractC65564PoG abstractC65564PoG, C65575PoR c65575PoR) {
        this.LJLJI = abstractC65564PoG;
        this.LJLJJI = c65575PoR;
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        return this.LJLJJI.LIZJ(i, objArr);
    }
}
