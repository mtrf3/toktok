package X;

import java.util.Iterator;

/* renamed from: X.Pop, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65599Pop<E> extends AbstractC65583PoZ<E> {
    public abstract E get(int i);

    @Override // X.AbstractC65583PoZ
    public final AbstractC65590Pog<E> LJIIIIZZ() {
        return new C65600Poq(this);
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC65557Po9<E> iterator() {
        return asList().iterator();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        return asList().LIZJ(i, objArr);
    }
}
