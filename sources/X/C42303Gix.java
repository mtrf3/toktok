package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gix, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42303Gix {
    public static long LIZ;
    public static long LIZJ;
    public static long LJ;
    public static long LJFF;
    public static final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());
    public static final List<Integer> LIZLLL = new ArrayList();
    public static final List<Integer> LJI = new ArrayList();

    public static void LIZIZ(int i, GGO action, long j, String str) {
        o.LJIIIZ(action, "action");
        C145995oB c145995oB = new C145995oB();
        EnumC42305Giz enumC42305Giz = EnumC42305Giz.TOAST;
        c145995oB.LIZ(enumC42305Giz.getValue(), "type");
        c145995oB.LIZ(i, WM7.SCENE_SERVICE);
        c145995oB.LIZ(action.getValue(), "action");
        c145995oB.LIZIZ(j, "duration_time");
        if (str != null) {
            c145995oB.LIZLLL("msg", str);
        }
        FMX.LJIIL("tool_performance_loading", c145995oB.LIZ);
        if (GGO.SHOW != action) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = LJFF;
        if (j2 == 0) {
            ((ArrayList) LJI).add(Integer.valueOf(i));
            LJFF = currentTimeMillis + j;
            return;
        }
        if (currentTimeMillis - j2 > 1000) {
            LJFF = 0L;
            ((ArrayList) LJI).clear();
            return;
        }
        LJFF = currentTimeMillis + j;
        List<Integer> list = LJI;
        ((ArrayList) list).add(Integer.valueOf(i));
        C145995oB c145995oB2 = new C145995oB();
        c145995oB2.LIZ(enumC42305Giz.getValue(), "type");
        c145995oB2.LIZ(9999, WM7.SCENE_SERVICE);
        c145995oB2.LJI("msg", ORZ.LLD(list, "-", null, null, null, 62));
        FMX.LJIIL("tool_performance_loading", c145995oB2.LIZ);
    }

    public static void LIZ(int i, GGO action, EnumC42283Gid styleType, EnumC42282Gic closeType, String str) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(styleType, "styleType");
        o.LJIIIZ(closeType, "closeType");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(EnumC42305Giz.LOADING.getValue(), "type");
        c145995oB.LIZ(i, WM7.SCENE_SERVICE);
        c145995oB.LIZ(action.getValue(), "action");
        c145995oB.LIZ(styleType.getValue(), "style_type");
        c145995oB.LIZ(closeType.getValue(), "close_type");
        if (str != null) {
            c145995oB.LIZLLL("msg", str);
        }
        GGO ggo = GGO.SHOW;
        if (ggo == action) {
            LIZ = System.currentTimeMillis();
        }
        GGO ggo2 = GGO.DISMISS;
        if (ggo2 == action) {
            c145995oB.LIZIZ(System.currentTimeMillis() - LIZ, "cost_time");
            LIZ = 0L;
        }
        FMX.LJIIL("tool_performance_loading", c145995oB.LIZ);
        if (action == ggo) {
            long j = LIZ;
            long j2 = LJ;
            if (j - j2 < 2000 || j2 == 0) {
                ((ArrayList) LIZLLL).add(Integer.valueOf(i));
                LIZJ = System.currentTimeMillis();
            }
        }
        if (action == ggo2) {
            LJ = System.currentTimeMillis();
            LIZJ = System.currentTimeMillis();
            LIZIZ.postDelayed(RunnableC42304Giy.LJLIL, 2000L);
        }
    }
}
