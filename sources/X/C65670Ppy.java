package X;

/* JADX INFO: Add missing generic type declarations: [E] */
/* renamed from: X.Ppy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65670Ppy<E> extends AbstractC65599Pop<InterfaceC65712Pqe<E>> {
    public static final long serialVersionUID = 0;
    public final /* synthetic */ AbstractC65654Ppi LJLJI;

    @Override // X.AbstractC65578PoU
    public final boolean LJFF() {
        return this.LJLJI.LJFF();
    }

    @Override // X.AbstractC65583PoZ, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.LJLJI.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LJLJI.elementSet().size();
    }

    @Override // X.AbstractC65583PoZ, X.AbstractC65578PoU
    public Object writeReplace() {
        return new C65687PqF(this.LJLJI);
    }

    public C65670Ppy(AbstractC65654Ppi abstractC65654Ppi) {
        this.LJLJI = abstractC65654Ppi;
    }

    @Override // X.AbstractC65578PoU, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC65712Pqe)) {
            return false;
        }
        InterfaceC65712Pqe interfaceC65712Pqe = (InterfaceC65712Pqe) obj;
        if (interfaceC65712Pqe.getCount() <= 0 || this.LJLJI.count(interfaceC65712Pqe.LIZLLL()) != interfaceC65712Pqe.getCount()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC65599Pop
    public final Object get(int i) {
        return this.LJLJI.LJIIIIZZ(i);
    }
}
