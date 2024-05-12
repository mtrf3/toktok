package X;

import X.AbstractC65694PqM;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.PqV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65703PqV<V> extends AbstractC65694PqM<K, V>.k.a implements ListIterator<V> {
    public final /* synthetic */ AbstractC65694PqM.l LJLJJI;

    public final ListIterator<V> LIZIZ() {
        LIZ();
        return (ListIterator) this.LJLIL;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return LIZIZ().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return LIZIZ().nextIndex();
    }

    @Override // java.util.ListIterator
    public final V previous() {
        return LIZIZ().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return LIZIZ().previousIndex();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65703PqV(AbstractC65694PqM.l lVar) {
        super();
        this.LJLJJI = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(V v) {
        boolean isEmpty = this.LJLJJI.isEmpty();
        LIZIZ().add(v);
        AbstractC65694PqM.l lVar = this.LJLJJI;
        AbstractC65694PqM.this.LJLJL++;
        if (isEmpty) {
            lVar.LIZJ();
        }
    }

    @Override // java.util.ListIterator
    public final void set(V v) {
        LIZIZ().set(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65703PqV(AbstractC65694PqM.l lVar, int i) {
        super(((List) lVar.LJLILLLLZI).listIterator(i));
        this.LJLJJI = lVar;
    }
}
