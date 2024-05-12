package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169586l8 {
    public static boolean LIZLLL;
    public static final C169706lK<C82492WZc> LIZ = new C169706lK<>();
    public static final C169706lK<C82492WZc> LIZIZ = new C169706lK<>();
    public static final java.util.Map<Object, Integer> LIZJ = new LinkedHashMap();
    public static InterfaceC88472Yns<? super Boolean, C76800UCe> LJ = C169596l9.LJLIL;

    public static void LIZ() {
        List<C82492WZc> LIZJ2 = LIZ.LIZJ();
        o.LJIIIIZZ(LIZJ2, "vcStartingTasks.immutableList");
        Iterator<C82492WZc> it = LIZJ2.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        LIZ.LIZIZ();
        List<C82492WZc> LIZJ3 = LIZIZ.LIZJ();
        o.LJIIIIZZ(LIZJ3, "vcCompletedTasks.immutableList");
        Iterator<C82492WZc> it2 = LIZJ3.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        LIZIZ.LIZIZ();
        LJ = C169606lA.LJLIL;
        LIZLLL = false;
    }

    public static boolean LIZJ() {
        List<C82492WZc> LIZJ2 = LIZIZ.LIZJ();
        o.LJIIIIZZ(LIZJ2, "vcCompletedTasks.immutableList");
        Iterator<C82492WZc> it = LIZJ2.iterator();
        while (it.hasNext()) {
            if (it.next().LJLLLLLL.LJLLI.LJLJLLL) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(Object segment) {
        o.LJIIIZ(segment, "segment");
        List<C82492WZc> LIZJ2 = LIZIZ.LIZJ();
        o.LJIIIIZZ(LIZJ2, "vcCompletedTasks.immutableList");
        for (C82492WZc c82492WZc : LIZJ2) {
            if (c82492WZc.LJLJLLL == segment) {
                LIZIZ.LJ(c82492WZc);
                return;
            }
        }
    }

    public static void LIZLLL(C82492WZc task) {
        o.LJIIIZ(task, "task");
        C169706lK<C82492WZc> c169706lK = LIZ;
        c169706lK.LJ(task);
        LIZIZ.LIZ(task);
        if (c169706lK.LIZLLL()) {
            LJ.invoke(Boolean.TRUE);
            LJ = C169606lA.LJLIL;
        }
        if (!task.LJLJLJ) {
            LIZLLL = true;
            LJ.invoke(Boolean.FALSE);
            LJ = C169606lA.LJLIL;
        }
    }
}
