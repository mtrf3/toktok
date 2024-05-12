package X;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QWO {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final Semaphore LIZJ;
    public static final QWO LIZLLL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(QWO.class), "gson", "getGson()Lcom/google/gson/Gson;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt};
        LIZLLL = new QWO();
        LIZIZ = C221108m2.LIZIZ(QWP.LJLIL);
        LIZJ = new Semaphore(1);
    }

    public static void LIZ(Context applicationContext) {
        o.LJIIJ(applicationContext, "applicationContext");
        QXZ qxz = new QXZ(applicationContext);
        synchronized (C64735Pat.class) {
            if (!C38354F3m.LJ("x-tt-verify-idv-decision-conf")) {
                Iterator it = ((ConcurrentHashMap) C64735Pat.LJIILJJIL).keySet().iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equalsIgnoreCase("x-tt-verify-idv-decision-conf")) {
                        return;
                    }
                }
                ((ConcurrentHashMap) C64735Pat.LJIILJJIL).put("x-tt-verify-idv-decision-conf", qxz);
            }
        }
    }
}
