package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.29i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C538229i<E> extends AbstractC65780Prk<E> {
    public final C40601ia<E, Boolean> LJLIL;

    public C538229i() {
        this(false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LJLIL.clear();
    }

    @Override // X.AbstractC65780Prk
    public final int getSize() {
        return this.LJLIL.keySet().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.LJLIL.keySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return this.LJLIL.keySet().iterator();
    }

    public C538229i(boolean z) {
        this.LJLIL = new C40601ia<>(z);
    }

    @Override // X.AbstractC65780Prk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        C40601ia<E, Boolean> c40601ia = this.LJLIL;
        Boolean bool = Boolean.TRUE;
        return o.LJ(c40601ia.put(e, bool), bool);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLIL.keySet().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return o.LJ(this.LJLIL.remove(obj), Boolean.TRUE);
    }
}
