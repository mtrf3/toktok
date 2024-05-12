package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FGw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38702FGw {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C38702FGw.class), "dataStorage", "getDataStorage()Lcom/bytedance/ies/abmock/datacenter/storage/IDataStorage;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
    }

    public static C38701FGv LIZ(String str) {
        ConcurrentHashMap<String, C38701FGv> concurrentHashMap = C38701FGv.LJFF;
        C38701FGv c38701FGv = concurrentHashMap.get(str);
        if (c38701FGv == null) {
            synchronized (concurrentHashMap) {
                c38701FGv = concurrentHashMap.get(str);
                if (c38701FGv == null) {
                    c38701FGv = new C38701FGv(str);
                }
            }
        }
        return c38701FGv;
    }
}
