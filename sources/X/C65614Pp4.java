package X;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.Pp4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65614Pp4<K> extends AbstractC65654Ppi<K> {
    public final /* synthetic */ AbstractC65611Pp1 LJLJJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC65654Ppi, X.InterfaceC65672Pq0
    public final AbstractC65583PoZ<K> elementSet() {
        return this.LJLJJI.keySet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC65672Pq0
    public final int size() {
        return this.LJLJJI.size();
    }

    @Override // X.AbstractC65654Ppi, X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65624PpE(this.LJLJJI);
    }

    @Override // X.AbstractC65654Ppi, X.InterfaceC65672Pq0
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return elementSet();
    }

    public C65614Pp4(AbstractC65611Pp1 abstractC65611Pp1) {
        this.LJLJJI = abstractC65611Pp1;
    }

    @Override // X.AbstractC65654Ppi
    public final InterfaceC65712Pqe<K> LJIIIIZZ(int i) {
        Map.Entry entry = (Map.Entry) this.LJLJJI.LJLJJLL.entrySet().asList().get(i);
        return new C65648Ppc(((Collection) entry.getValue()).size(), entry.getKey());
    }

    @Override // X.AbstractC65654Ppi, X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LJLJJI.containsKey(obj);
    }

    @Override // X.AbstractC65654Ppi, X.InterfaceC65672Pq0
    public final int count(Object obj) {
        Collection collection = (Collection) this.LJLJJI.LJLJJLL.get(obj);
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }
}
