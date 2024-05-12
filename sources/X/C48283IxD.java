package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.IxD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48283IxD<E> extends AbstractSet<E> {
    public final ConcurrentHashMap<E, Boolean> LJLIL = new ConcurrentHashMap<>();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.LJLIL.keySet().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLIL.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        if (this.LJLIL.putIfAbsent(e, Boolean.TRUE) == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ConcurrentHashMap<E, Boolean> concurrentHashMap = this.LJLIL;
        if (concurrentHashMap != null) {
            return concurrentHashMap.containsKey(obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ConcurrentHashMap<E, Boolean> concurrentHashMap = this.LJLIL;
        if (concurrentHashMap != null) {
            if (C65777Prh.LIZJ(concurrentHashMap).remove(obj) != null) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }
}
