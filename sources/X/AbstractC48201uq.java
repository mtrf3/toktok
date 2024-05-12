package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48201uq<K, V, E> implements java.util.Set<E>, InterfaceC65779Prj {
    public final C41311jj<K, V> LJLIL;

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        o.LJIIIZ(array, "array");
        return (T[]) ORX.LIZJ(this, array);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.LJLIL.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.LJLIL.size();
    }

    public AbstractC48201uq(C41311jj<K, V> map) {
        o.LJIIIZ(map, "map");
        this.LJLIL = map;
    }
}
