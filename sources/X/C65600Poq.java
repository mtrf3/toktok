package X;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Poq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65600Poq<E> extends AbstractC65590Pog<E> {
    public final /* synthetic */ AbstractC65599Pop LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return this.LJLJI.LJFF();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LJLJI.size();
    }

    public C65600Poq(AbstractC65599Pop abstractC65599Pop) {
        this.LJLJI = abstractC65599Pop;
    }

    @Override // java.util.List
    public final E get(int i) {
        return (E) this.LJLJI.get(i);
    }
}
