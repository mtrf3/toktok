package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249849rI {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final List<InterfaceC250059rd> LIZ = new ArrayList();
    public static final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public static final RunnableC249859rJ LJ = RunnableC249859rJ.LJLIL;
    public static final C249889rM LJFF = C249889rM.LJLIL;

    public static void LIZJ() {
        if (!LIZJ) {
            LIZJ = true;
            LIZIZ.postDelayed(LJ, 1000L);
        }
        if (!LIZLLL) {
            LIZLLL = true;
            LIZIZ();
        }
    }

    public static void LIZIZ() {
        long LIZ2 = (C245559kN.LIZ() + 86400) - C245559kN.LIZIZ();
        Handler handler = LIZIZ;
        Object obj = LJFF;
        if (obj != null) {
            obj = new ARunnableS40S0100000_4(obj, 152);
        }
        handler.postDelayed((Runnable) obj, LIZ2 * 1000);
    }

    public static void LIZ(InterfaceC250059rd task) {
        o.LJIIIZ(task, "task");
        ArrayList arrayList = (ArrayList) LIZ;
        if (arrayList.contains(task)) {
            return;
        }
        arrayList.add(task);
        if (!arrayList.isEmpty()) {
            LIZJ();
        }
    }
}
