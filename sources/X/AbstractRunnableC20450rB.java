package X;

import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.0rB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC20450rB implements Runnable {
    public final C1OQ LJLIL = new C1OQ();

    public abstract void LIZIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
            this.LJLIL.LIZ(C0VZ.LIZ);
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static void LIZ(C1OU c1ou, String str) {
        boolean z;
        WorkDatabase workDatabase = c1ou.LIZJ;
        InterfaceC19390pT LJJ = workDatabase.LJJ();
        InterfaceC19270pH LJIJ = workDatabase.LJIJ();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C1Y1 c1y1 = (C1Y1) LJJ;
            EnumC08510Vb LJFF = c1y1.LJFF(str2);
            if (LJFF != EnumC08510Vb.SUCCEEDED && LJFF != EnumC08510Vb.FAILED) {
                c1y1.LJIILL(EnumC08510Vb.CANCELLED, str2);
            }
            linkedList.addAll(((C34711Xv) LJIJ).LIZ(str2));
        }
        C1OR c1or = c1ou.LJFF;
        synchronized (c1or.LJLLI) {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Processor cancelling %s", new Object[]{str});
            LIZ.getClass();
            ((HashSet) c1or.LJLJLLL).add(str);
            RunnableC09050Xd runnableC09050Xd = (RunnableC09050Xd) ((HashMap) c1or.LJLJJLL).remove(str);
            if (runnableC09050Xd != null) {
                z = true;
            } else {
                runnableC09050Xd = (RunnableC09050Xd) ((HashMap) c1or.LJLJL).remove(str);
            }
            C1OR.LIZIZ(str, runnableC09050Xd);
            if (z) {
                c1or.LJIIIIZZ();
            }
        }
        Iterator<C0XZ> it = c1ou.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(str);
        }
    }
}
