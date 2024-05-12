package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pp6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65616Pp6<K, V> extends AbstractC65578PoU<Map.Entry<K, V>> {
    public static final long serialVersionUID = 0;
    public final AbstractC65611Pp1<K, V> LJLILLLLZI;

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC65557Po9<Map.Entry<K, V>> iterator() {
        AbstractC65611Pp1<K, V> abstractC65611Pp1 = this.LJLILLLLZI;
        abstractC65611Pp1.getClass();
        return new C65617Pp7(abstractC65611Pp1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public C65616Pp6(AbstractC65611Pp1<K, V> abstractC65611Pp1) {
        this.LJLILLLLZI = abstractC65611Pp1;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.LJLILLLLZI.containsEntry(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
