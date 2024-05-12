package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Afv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26827Afv {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final List<AbstractC06100Lu> LIZJ = new LinkedList();

    public static void LIZ() {
        List<AbstractC06100Lu> list = LIZJ;
        if (!list.isEmpty()) {
            Iterator<AbstractC06100Lu> it = list.iterator();
            while (it.hasNext()) {
                C36381bm.LJIL.LJIIL(it.next());
            }
            ((LinkedList) LIZJ).clear();
        }
    }

    public static void LIZIZ(String str) {
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Invalid operation : ");
            LIZ2.append(str);
            Throwable th = new Throwable(X1D.LIZIZ(LIZ2));
            th.setStackTrace(C16880lQ.LLLLIIIILLL().getStackTrace());
            FMW.LIZLLL("MainThreadMonitorBugfixLancet", "MainThreadMonitorBugfixLancet", "removeObserver", "", th);
        } catch (Throwable unused) {
        }
    }
}
