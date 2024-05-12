package X;

import Y.ACallableS112S0100000_9;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ML4 {
    public static volatile ML5 LIZ;
    public static String LIZIZ;

    public static void LIZ() {
        String currentUserID;
        if (!InboxSampleRate.LIZ(1.0f, "inbox_enter_perf") || (currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) == null || currentUserID.length() == 0 || o.LJ(LIZIZ, currentUserID)) {
            return;
        }
        LIZIZ = currentUserID;
        LIZ = new ML5(0);
        LIZLLL(ML8.LJLIL);
    }

    public static void LIZIZ() {
        Long l;
        if (LIZ != null) {
            ML5 ml5 = LIZ;
            o.LJI(ml5);
            if (ml5.LJI <= 0) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRendered:");
            ML5 ml52 = LIZ;
            if (ml52 != null) {
                l = Long.valueOf(ml52.LJI);
            } else {
                l = null;
            }
            LIZ2.append(l);
            X1D.LIZIZ(LIZ2);
            ML5 ml53 = LIZ;
            o.LJI(ml53);
            ml53.LJII = SystemClock.uptimeMillis();
            ML5 ml54 = LIZ;
            o.LJI(ml54);
            long j = ml54.LIZ;
            long j2 = ml54.LIZIZ;
            C213748aA lifecycleTracker = ml54.LIZJ;
            long j3 = ml54.LIZLLL;
            long j4 = ml54.LJ;
            ML6<Integer> ml6 = ml54.LJFF;
            long j5 = ml54.LJI;
            long j6 = ml54.LJII;
            o.LJIIIZ(lifecycleTracker, "lifecycleTracker");
            C10K.LIZJ(new ACallableS112S0100000_9(new ML5(j, j2, lifecycleTracker, j3, j4, ml6, j5, j6), 34));
            LIZ = null;
        }
    }

    public static void LIZJ() {
        String currentUserID;
        C55888Lwa.LIZIZ.LJJJ();
        if (INB.LIZIZ()) {
            if (!InboxSampleRate.LIZ(1.0f, "inbox_enter_perf_v1") || (currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) == null || currentUserID.length() == 0 || o.LJ(C56641MKv.LIZIZ, currentUserID)) {
                return;
            }
            C56641MKv.LIZIZ = currentUserID;
            C56641MKv.LIZ = new C56639MKt(0);
            C56641MKv.LIZ(ML2.LJLIL);
            return;
        }
        LIZ();
    }

    public static void LIZLLL(InterfaceC88472Yns interfaceC88472Yns) {
        ML5 ml5 = LIZ;
        if (ml5 != null) {
            interfaceC88472Yns.invoke(ml5);
        }
    }

    public static Object LJ(C8WY event, InterfaceC65784Pro interfaceC65784Pro) {
        Object LIZIZ2;
        o.LJIIIZ(event, "event");
        ML5 ml5 = LIZ;
        if (ml5 == null || (LIZIZ2 = ml5.LIZJ.LIZIZ(event, interfaceC65784Pro)) == null) {
            return interfaceC65784Pro.invoke();
        }
        return LIZIZ2;
    }
}
