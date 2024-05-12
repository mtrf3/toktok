package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;

/* renamed from: X.F6j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38429F6j {
    public static final C38429F6j LIZLLL = new C38429F6j();
    public static final FutureC38431F6l LIZ = new FutureC38431F6l();
    public static final Keva LIZIZ = Keva.getRepo("ship_repo");
    public static final C38433F6n LIZJ = C38433F6n.LJ;

    public static void LIZ(int i) {
        LIZJ.getClass();
        C38433F6n.LIZ = SystemClock.elapsedRealtime();
        Keva keva = LIZIZ;
        boolean z = false;
        int i2 = keva.getInt("try_times", 0) + 1;
        if (i == 0) {
            z = true;
        }
        FutureC38431F6l futureC38431F6l = LIZ;
        if (z) {
            futureC38431F6l.LJLILLLLZI.set(4);
        } else {
            futureC38431F6l.LJLILLLLZI.set(3);
        }
        futureC38431F6l.LJLIL.release();
        keva.storeInt("try_times", i2);
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "prepare_result");
        c188727au.LJ(C38433F6n.LIZ - C38433F6n.LIZIZ, "prepare_till_end");
        c188727au.LIZLLL(i2, "try_times");
        if (i == 0) {
            if (C38433F6n.LIZ >= C38433F6n.LIZJ) {
                c188727au.LJI("first_access_till_success", String.valueOf(C38433F6n.LIZ - C38433F6n.LIZJ));
                c188727au.LIZLLL(C38433F6n.LIZLLL, "access_type");
            } else {
                c188727au.LJI("first_access_till_success", String.valueOf(0L));
                c188727au.LIZLLL(1, "access_type");
            }
        }
        FMX.LJIIL("prf_ship_plugin", c188727au.LIZ);
    }
}
