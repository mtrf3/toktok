package X;

import android.app.Activity;
import com.google.android.play.core.appupdate.b;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.FwZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40599FwZ {
    public static final C40599FwZ LIZ = new C40599FwZ();
    public static b LIZIZ;
    public static C40598FwY LIZJ;
    public static boolean LIZLLL;
    public static WeakReference<Activity> LJ;

    public static final void LIZ(Activity activity) {
        C40561Fvx LIZIZ2;
        o.LJIIIZ(activity, "activity");
        if (!C19N.LJ("in_app_updates_switch", true)) {
            return;
        }
        LJ = new WeakReference<>(activity);
        if (LIZIZ == null) {
            LIZIZ = C32151Nz.LJIILIIL(C16880lQ.LLLLJ(activity));
        }
        C40598FwY c40598FwY = C40598FwY.LIZ;
        b bVar = LIZIZ;
        if (bVar != null) {
            bVar.LIZ();
        }
        LIZJ = c40598FwY;
        b bVar2 = LIZIZ;
        if (bVar2 != null && (LIZIZ2 = bVar2.LIZIZ()) != null) {
            LIZIZ2.LIZJ(C38410F5q.LIZ, new C40600Fwa(activity));
        }
    }

    public static C26231ARf LIZIZ(Activity activity) {
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJ(R.string.hi8);
        c26227ARb.LIZIZ(activity.getString(R.string.hi7));
        UC0.LIZJ(c26227ARb, C40601Fwb.LJLIL);
        c26227ARb.LJII = false;
        C26231ARf LJI = c26227ARb.LJI();
        LJI.LIZLLL();
        return LJI;
    }

    public static final void LIZJ(String str) {
        if (C19N.LJ("in_app_updates_switch", true)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("type", "flexible");
            FMX.LJIIL(str, c188727au.LIZ);
        }
    }

    public static void LIZLLL(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        if (!C38776FJs.LJIIL().LIZ(EF7.LIZIZ(), "KEY_UPDATE_IN_PROGRESS", false)) {
            return;
        }
        if (LIZIZ == null) {
            LIZIZ = C32151Nz.LJIILIIL(C16880lQ.LLLLJ(activity));
        }
        C40598FwY c40598FwY = C40598FwY.LIZ;
        b bVar = LIZIZ;
        if (bVar != null) {
            bVar.LIZ();
        }
        LIZJ = c40598FwY;
    }
}
