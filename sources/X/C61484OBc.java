package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OBc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61484OBc {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C61484OBc.class), "service", "getService()Lcom/bytedance/lynx/hybrid/service/impl/HybridService;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
    }

    public static C61483OBb LIZIZ() {
        return (C61483OBb) C61483OBb.LIZIZ.getValue();
    }

    public static C61485OBd LIZ(String bid, ConcurrentHashMap concurrentHashMap) {
        C61485OBd c61485OBd = (C61485OBd) concurrentHashMap.get(bid);
        if (c61485OBd == null) {
            C61486OBe c61486OBe = new C61486OBe();
            o.LJIIJ(bid, "bid");
            c61486OBe.LIZIZ = bid;
            C61485OBd c61485OBd2 = new C61485OBd(c61486OBe);
            concurrentHashMap.put(bid, c61485OBd2);
            return c61485OBd2;
        }
        return c61485OBd;
    }
}
