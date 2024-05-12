package X;

/* renamed from: X.Pq2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65674Pq2<E> implements InterfaceC65712Pqe<E> {
    public final int hashCode() {
        int hashCode;
        E LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            hashCode = 0;
        } else {
            hashCode = LIZLLL.hashCode();
        }
        return hashCode ^ getCount();
    }

    public final String toString() {
        String valueOf = String.valueOf(LIZLLL());
        int count = getCount();
        if (count == 1) {
            return valueOf;
        }
        return YE1.LIZIZ(valueOf, " x ", count);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC65712Pqe)) {
            return false;
        }
        InterfaceC65712Pqe interfaceC65712Pqe = (InterfaceC65712Pqe) obj;
        if (getCount() != interfaceC65712Pqe.getCount() || !C78886Uxe.LJIIIIZZ(LIZLLL(), interfaceC65712Pqe.LIZLLL())) {
            return false;
        }
        return true;
    }
}
