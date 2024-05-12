package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Giy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42304Giy implements Runnable {
    public static final RunnableC42304Giy LJLIL = new RunnableC42304Giy();

    public static void LIZ() {
        if (System.currentTimeMillis() - C42303Gix.LIZJ < 2000) {
            return;
        }
        List<Integer> list = C42303Gix.LIZLLL;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 1) {
            String LLD = ORZ.LLD(list, null, null, null, null, 63);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZ(EnumC42305Giz.LOADING.getValue(), "type");
            c145995oB.LIZ(9999, WM7.SCENE_SERVICE);
            c145995oB.LJI("msg", LLD);
            FMX.LJIIL("tool_performance_loading", c145995oB.LIZ);
        }
        C42303Gix.LJ = 0L;
        arrayList.clear();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
