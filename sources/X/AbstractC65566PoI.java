package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PoI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65566PoI<K, V> extends AbstractC65583PoZ<Map.Entry<K, V>> {
    public abstract AbstractC65569PoL LJIIJ();

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65567PoJ(LJIIJ());
    }

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return LJIIJ().LJ();
    }

    @Override // X.AbstractC65583PoZ
    public final boolean LJIIIZ() {
        return LJIIJ().LIZLLL();
    }

    @Override // X.AbstractC65583PoZ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return LJIIJ().hashCode();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return LJIIJ().size();
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v = LJIIJ().get(entry.getKey());
            if (v != null && v.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
