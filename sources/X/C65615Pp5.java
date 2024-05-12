package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pp5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65615Pp5<K, V> extends AbstractC65583PoZ<Map.Entry<K, V>> {
    public final transient C65609Poz<K, V> LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return false;
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<Map.Entry<K, V>> iterator() {
        C65609Poz<K, V> c65609Poz = this.LJLJI;
        c65609Poz.getClass();
        return new C65617Pp7(c65609Poz);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI.size();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public C65615Pp5(C65609Poz<K, V> c65609Poz) {
        this.LJLJI = c65609Poz;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.LJLJI.containsEntry(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
