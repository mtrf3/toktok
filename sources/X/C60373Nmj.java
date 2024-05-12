package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Nmj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60373Nmj {
    public static InterfaceC60324Nlw LIZIZ() {
        InterfaceC60324Nlw interfaceC60324Nlw;
        synchronized (C60392Nn2.LIZIZ) {
            interfaceC60324Nlw = C60392Nn2.LIZIZ;
            if (interfaceC60324Nlw instanceof C60341NmD) {
                interfaceC60324Nlw = new C60392Nn2();
                C60392Nn2.LIZIZ = interfaceC60324Nlw;
            }
        }
        return interfaceC60324Nlw;
    }

    public static C60378Nmo LIZ(String bid, ConcurrentHashMap concurrentHashMap) {
        C60378Nmo c60378Nmo = (C60378Nmo) concurrentHashMap.get(bid);
        if (c60378Nmo == null) {
            C60342NmE c60342NmE = new C60342NmE();
            o.LJIIJ(bid, "bid");
            c60342NmE.LIZIZ = bid;
            C60378Nmo c60378Nmo2 = new C60378Nmo(c60342NmE);
            concurrentHashMap.put(bid, c60378Nmo2);
            return c60378Nmo2;
        }
        return c60378Nmo;
    }
}
