package X;

/* renamed from: X.Pq1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65673Pq1<E> extends AbstractC65680Pq8<InterfaceC65712Pqe<E>> {
    public abstract InterfaceC65672Pq0<E> LIZJ();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        LIZJ().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC65712Pqe)) {
            return false;
        }
        InterfaceC65712Pqe interfaceC65712Pqe = (InterfaceC65712Pqe) obj;
        if (interfaceC65712Pqe.getCount() <= 0 || LIZJ().count(interfaceC65712Pqe.LIZLLL()) != interfaceC65712Pqe.getCount()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof InterfaceC65712Pqe) {
            InterfaceC65712Pqe interfaceC65712Pqe = (InterfaceC65712Pqe) obj;
            Object LIZLLL = interfaceC65712Pqe.LIZLLL();
            int count = interfaceC65712Pqe.getCount();
            if (count != 0) {
                return LIZJ().setCount(LIZLLL, count, 0);
            }
        }
        return false;
    }
}
