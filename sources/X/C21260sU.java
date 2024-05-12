package X;

import Y.IDRunnableS29S0200000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21260sU {
    public volatile boolean LIZ;
    public String LIZJ;
    public C1XL LIZLLL;
    public String LIZIZ = "";
    public final LinkedList<IRT> LJ = new LinkedList<>();

    public final C1XL LIZIZ() {
        if (this.LIZLLL == null) {
            if (C1XL.LJ == null) {
                synchronized (C1XL.class) {
                    if (C1XL.LJ == null) {
                        C1XL.LJ = new C1XL();
                    }
                }
            }
            this.LIZLLL = C1XL.LJ;
        }
        return this.LIZLLL;
    }

    public final void LIZJ(IRT irt) {
        if (irt == null) {
            return;
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record batteryLog: ");
            LIZ.append(irt.toString());
            X1D.LIZIZ(LIZ);
        }
        F9U.LIZ.LIZJ(new IDRunnableS29S0200000(irt, this, 38));
    }

    public static boolean LIZLLL(C21270sV c21270sV, List list) {
        java.util.Map<String, InterfaceC23150vX> map = C14570hh.LIZ.LJLJL;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            IRT irt = (IRT) it.next();
            if (str == null || !str.equals(irt.LJIIJJI)) {
                str = irt.LJIIJJI;
                sb.append(str);
            }
            if ("ground_record".equals(irt.LIZLLL)) {
                if (irt.LIZIZ) {
                    c21270sV.LIZ += irt.LJI;
                } else {
                    c21270sV.LIZIZ += irt.LJI;
                }
            } else {
                InterfaceC23150vX interfaceC23150vX = (InterfaceC23150vX) ((ConcurrentHashMap) map).get(irt.LIZLLL);
                if (interfaceC23150vX != null) {
                    interfaceC23150vX.LIZJ(c21270sV, irt);
                }
            }
        }
        IRT irt2 = (IRT) ListProtector.get(list, 0);
        boolean z = irt2.LJIIJ;
        c21270sV.LJIIL = z;
        if (!z || (c21270sV.LIZ > 60000 && c21270sV.LIZIZ > 5000)) {
            c21270sV.LJIILIIL = irt2.LJIIIZ;
            c21270sV.LJIILJJIL = sb.toString();
            return c21270sV.LIZIZ(true);
        }
        c21270sV.LIZ();
        C09970aH.LJII();
        return false;
    }

    public final List LIZ(long j, boolean z) {
        List LIZLLL;
        try {
            C1XL LIZIZ = LIZIZ();
            synchronized (LIZIZ) {
                if (z) {
                    LIZLLL = LIZIZ.LIZLLL("main_process = 1 AND delete_flag = 0", null, LIZIZ);
                } else {
                    LIZLLL = LIZIZ.LIZLLL("main_process = 0 AND delete_flag = 0 AND timestamp <= ? ", new String[]{String.valueOf(j)}, LIZIZ);
                }
            }
            return LIZLLL;
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }
}
