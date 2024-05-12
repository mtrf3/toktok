package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EbO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36738EbO {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C36738EbO LIZLLL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C36738EbO.class), "configMap", "getConfigMap()Ljava/util/concurrent/ConcurrentHashMap;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C36738EbO.class), "cacheMap", "getCacheMap()Ljava/util/concurrent/ConcurrentHashMap;")};
        LIZLLL = new C36738EbO();
        LIZIZ = C221108m2.LIZIZ(C36739EbP.LJLIL);
        LIZJ = C221108m2.LIZIZ(C36740EbQ.LJLIL);
    }

    public static void LIZ(String business, String project, String config) {
        o.LJIIJ(business, "business");
        o.LJIIJ(project, "project");
        o.LJIIJ(config, "config");
        C62822Ol8 c62822Ol8 = LIZIZ;
        if (!((ConcurrentHashMap) c62822Ol8.getValue()).containsKey(business)) {
            ((ConcurrentHashMap) c62822Ol8.getValue()).put(business, new ArrayList());
        }
        ArrayList arrayList = (ArrayList) ((ConcurrentHashMap) c62822Ol8.getValue()).get(business);
        if (arrayList != null) {
            arrayList.add(new C36741EbR(project, config));
        }
    }
}
