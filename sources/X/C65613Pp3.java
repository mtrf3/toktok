package X;

import java.util.Iterator;

/* renamed from: X.Pp3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65613Pp3<K, V> extends AbstractC65578PoU<V> {
    public static final long serialVersionUID = 0;
    public final transient AbstractC65611Pp1<K, V> LJLILLLLZI;

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<V> iterator() {
        AbstractC65611Pp1<K, V> abstractC65611Pp1 = this.LJLILLLLZI;
        abstractC65611Pp1.getClass();
        return new C65622PpC(abstractC65611Pp1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public C65613Pp3(AbstractC65611Pp1<K, V> abstractC65611Pp1) {
        this.LJLILLLLZI = abstractC65611Pp1;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLILLLLZI.containsValue(obj);
    }

    @Override // X.AbstractC65578PoU
    public final int LIZJ(int i, Object[] objArr) {
        AbstractC65557Po9<? extends AbstractC65578PoU<V>> it = this.LJLILLLLZI.LJLJJLL.values().iterator();
        while (it.hasNext()) {
            i = it.next().LIZJ(i, objArr);
        }
        return i;
    }
}
