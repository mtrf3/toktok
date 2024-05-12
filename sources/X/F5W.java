package X;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5W {
    public static final List<InterfaceC37103EhH> LIZ = new CopyOnWriteArrayList();
    public static final InterfaceC38394F5a LIZIZ;

    static {
        InterfaceC38394F5a LJIIIZ = C77321UWf.LJIIIZ(EF7.LIZIZ());
        o.LJIIIIZZ(LJIIIZ, "create(AppContextManager.getApplicationContext())");
        LIZIZ = LJIIIZ;
        LJIIIZ.LIZ();
    }

    public static void LIZ(String packageName) {
        o.LJIIIZ(packageName, "packageName");
        C38403F5j c38403F5j = new C38403F5j();
        if (packageName.startsWith("com.ss.android.ugc.aweme.dflanguage")) {
            ((ArrayList) c38403F5j.LIZIZ).add(new Locale(C40689Fy1.LLF(36, packageName)));
        } else {
            ((ArrayList) c38403F5j.LIZ).add(C36970Ef8.LIZ(packageName));
        }
        C40561Fvx LIZJ = LIZIZ.LIZJ(new C38398F5e(c38403F5j));
        C38396F5c c38396F5c = new C38396F5c(packageName);
        LIZJ.getClass();
        E1Q e1q = C38410F5q.LIZ;
        LIZJ.LIZJ(e1q, c38396F5c);
        C38406F5m c38406F5m = new C38406F5m(packageName);
        C40566Fw2<ResultT> c40566Fw2 = LIZJ.LIZIZ;
        C40567Fw3 c40567Fw3 = new C40567Fw3(e1q, c38406F5m);
        synchronized (c40566Fw2.LIZ) {
            if (c40566Fw2.LIZIZ == null) {
                c40566Fw2.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) c40566Fw2.LIZIZ).add(c40567Fw3);
        }
        LIZJ.LIZLLL();
    }

    public static void LIZIZ(Exception e, String packageName) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(packageName, "packageName");
        C37100EhE c37100EhE = new C37100EhE(packageName, EPA.LIZJ(), 6);
        if (e instanceof C35481DwD) {
            c37100EhE.LJI = ((EPR) e).getErrorCode();
        } else {
            c37100EhE.LJI = 1;
        }
        c37100EhE.LJIIIIZZ = e;
        C37095Eh9.LIZ(c37100EhE);
    }
}
