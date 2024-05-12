package X;

import X.AbstractC65694PqM;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.PqN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65695PqN<K, V> extends AbstractC65694PqM<K, V> implements InterfaceC65637PpR<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    @Override // X.AbstractC65694PqM
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public abstract List<V> LJII();

    @Override // X.AbstractC65694PqM
    public final Collection LJIIIIZZ() {
        return Collections.emptyList();
    }

    @Override // X.AbstractC65632PpM, X.InterfaceC65633PpN
    public final java.util.Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public AbstractC65695PqN(java.util.Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // X.AbstractC65694PqM
    public final <E> Collection<E> LJIIIZ(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // X.AbstractC65632PpM
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // X.AbstractC65694PqM, X.InterfaceC65633PpN
    public final List<V> get(K k) {
        return (List) super.get((AbstractC65695PqN<K, V>) k);
    }

    @Override // X.AbstractC65694PqM, X.InterfaceC65633PpN
    public final Collection removeAll(Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM, X.InterfaceC65633PpN
    public final /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractC65695PqN<K, V>) obj);
    }

    @Override // X.AbstractC65694PqM
    public final Collection<V> LJIIJ(K k, Collection<V> collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new C65702PqU(this, k, list, null);
        }
        return new AbstractC65694PqM.l(k, list, null);
    }

    @Override // X.AbstractC65694PqM, X.AbstractC65632PpM, X.InterfaceC65633PpN
    public final boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC65694PqM, X.AbstractC65632PpM
    public final Collection replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }
}
