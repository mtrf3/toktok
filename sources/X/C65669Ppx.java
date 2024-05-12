package X;

/* renamed from: X.Ppx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65669Ppx {
    public static boolean LIZ(InterfaceC65672Pq0<?> interfaceC65672Pq0, Object obj) {
        if (obj == interfaceC65672Pq0) {
            return true;
        }
        if (obj instanceof InterfaceC65672Pq0) {
            InterfaceC65672Pq0 interfaceC65672Pq02 = (InterfaceC65672Pq0) obj;
            if (interfaceC65672Pq0.size() == interfaceC65672Pq02.size() && interfaceC65672Pq0.entrySet().size() == interfaceC65672Pq02.entrySet().size()) {
                for (InterfaceC65712Pqe interfaceC65712Pqe : interfaceC65672Pq02.entrySet()) {
                    if (interfaceC65672Pq0.count(interfaceC65712Pqe.LIZLLL()) != interfaceC65712Pqe.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
