package X;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09020Xa {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VW.LIZIZ("Schedulers");
    }

    public static void LIZ(C0CW c0cw, WorkDatabase workDatabase, List<C0XZ> list) {
        int i;
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC19390pT LJJ = workDatabase.LJJ();
        workDatabase.LIZJ();
        try {
            if (Build.VERSION.SDK_INT == 23) {
                i = c0cw.LJII / 2;
            } else {
                i = c0cw.LJII;
            }
            C1Y1 c1y1 = (C1Y1) LJJ;
            List<C19380pS> LIZJ = c1y1.LIZJ(i);
            List LIZIZ = c1y1.LIZIZ();
            if (((ArrayList) LIZJ).size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) LIZJ).iterator();
                while (it.hasNext()) {
                    c1y1.LJIIJJI(currentTimeMillis, ((C19380pS) it.next()).LIZ);
                }
            }
            workDatabase.LJIILLIIL();
            workDatabase.LJIIJJI();
            ArrayList arrayList = (ArrayList) LIZJ;
            if (arrayList.size() > 0) {
                C19380pS[] c19380pSArr = (C19380pS[]) arrayList.toArray(new C19380pS[arrayList.size()]);
                for (C0XZ c0xz : list) {
                    if (c0xz.LIZIZ()) {
                        c0xz.LIZJ(c19380pSArr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) LIZIZ;
            if (arrayList2.size() > 0) {
                C19380pS[] c19380pSArr2 = (C19380pS[]) arrayList2.toArray(new C19380pS[arrayList2.size()]);
                for (C0XZ c0xz2 : list) {
                    if (!c0xz2.LIZIZ()) {
                        c0xz2.LIZJ(c19380pSArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.LJIIJJI();
            throw th;
        }
    }
}
