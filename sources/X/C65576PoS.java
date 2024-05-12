package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PoS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65576PoS<K, V> extends AbstractC65583PoZ<Map.Entry<K, V>> {
    public final transient AbstractC65564PoG<K, V> LJLJI;
    public final transient Object[] LJLJJI;
    public final transient int LJLJJL = 0;
    public final transient int LJLJJLL;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC65583PoZ
    public final AbstractC65590Pog<Map.Entry<K, V>> LJIIIIZZ() {
        return new C65577PoT(this);
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<Map.Entry<K, V>> iterator() {
        return asList().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.LJLJI.get(key))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        return asList().LIZJ(i, objArr);
    }

    public C65576PoS(AbstractC65564PoG abstractC65564PoG, Object[] objArr, int i) {
        this.LJLJI = abstractC65564PoG;
        this.LJLJJI = objArr;
        this.LJLJJLL = i;
    }
}
