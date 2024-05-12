package X;

import Y.ARunnableS10S1000000_4;
import Y.ARunnableS5S1100000_4;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.common.jato.gfx.DoFrameController;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232469Ak implements C2XP, InterfaceC232509Ao {
    public static final C232469Ak LIZ = new C232469Ak();
    public static final java.util.Map<String, C94I> LIZIZ = new LinkedHashMap();
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());
    public static long LIZLLL = -1;
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C232479Al.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C232489Am.LJLIL);
    public static C94I LJI;

    public static C2XN LIZLLL() {
        return (C2XN) LJ.getValue();
    }

    @Override // X.InterfaceC232509Ao
    public final void LIZIZ() {
        C94I c94i;
        if (LIZLLL == -1 || (c94i = LJI) == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - LIZLLL;
        if (uptimeMillis < c94i.LIZ || uptimeMillis > c94i.LIZIZ) {
            return;
        }
        LIZLLL = -1L;
        C2XN LIZLLL2 = LIZLLL();
        LIZLLL2.getClass();
        if (DoFrameController.LIZIZ != 7) {
            return;
        }
        ((C2XO) LIZLLL2.LIZIZ.getValue()).LIZIZ();
    }

    @Override // X.InterfaceC232509Ao
    public final void LIZ() {
        if (LIZLLL().LIZ == null || DoFrameController.LIZIZ != 0) {
            return;
        }
        DoFrameController.LIZIZ = 7;
    }

    public static void LJFF(String scene) {
        C94I c94i;
        o.LJIIIZ(scene, "scene");
        java.util.Map<String, C94I> map = LIZIZ;
        if (map.isEmpty()) {
            return;
        }
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LIZJ.postAtFrontOfQueue(new ARunnableS10S1000000_4(scene, 3));
            return;
        }
        map.remove(scene);
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, C94I>> it = map.entrySet().iterator();
            c94i = null;
            while (it.hasNext()) {
                C94I value = it.next().getValue();
                if (c94i == null || value.LIZ < c94i.LIZ) {
                    c94i = value;
                }
            }
        } else {
            c94i = null;
        }
        LJI = c94i;
        if (LIZIZ.isEmpty()) {
            LIZLLL().LIZ = null;
            if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                DoFrameController.LJIIIIZZ = null;
                if (DoFrameController.LIZIZ == 7) {
                    DoFrameController.LIZIZ = 0;
                }
                C232499An c232499An = (C232499An) LJFF.getValue();
                c232499An.LJLILLLLZI = null;
                if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                    C36381bm.LJIL.LJIIL(c232499An);
                    return;
                }
                return;
            }
            throw new IllegalStateException("must call in main thread");
        }
    }

    @Override // X.C2XP
    public final void LIZJ(long j) {
        LIZLLL = j;
    }

    public final void LJ(String scene, C94I threshold) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(threshold, "threshold");
        long j = threshold.LIZ;
        if (j >= 0) {
            long j2 = threshold.LIZIZ;
            if (j2 < 0 || j > j2 || j < 16) {
                return;
            }
            if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                LIZJ.postAtFrontOfQueue(new ARunnableS5S1100000_4(threshold, scene, 9));
                return;
            }
            C94I c94i = LJI;
            if (c94i == null || threshold.LIZ < c94i.LIZ) {
                LJI = threshold;
            }
            java.util.Map<String, C94I> map = LIZIZ;
            map.put(scene, threshold);
            if (map.size() == 1) {
                C2XN LIZLLL2 = LIZLLL();
                LIZLLL2.getClass();
                LIZLLL2.LIZ = this;
                if (DoFrameController.LIZIZ == 0) {
                    DoFrameController.LIZIZ = 7;
                }
                if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
                    DoFrameController.LJIIIIZZ = LIZLLL2;
                    C232499An c232499An = (C232499An) LJFF.getValue();
                    c232499An.getClass();
                    c232499An.LJLILLLLZI = this;
                    if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                        C36381bm.LJIL.LIZLLL(c232499An);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("must call in main thread");
            }
        }
    }
}
