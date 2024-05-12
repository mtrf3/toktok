package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.helios.sdk.HeliosEnvImpl;

/* loaded from: classes12.dex */
public final class PQ0 {
    public static final PQ0 LJFF;
    public final C68292m9 LIZ = new C68292m9();
    public final Object LIZIZ = new Object();
    public final PQ1 LIZJ = new PQ1(this);
    public final PQ2 LIZLLL = new PQ2(this);
    public final C64416PPw LJ = new C64416PPw(this);

    public static int LIZJ() {
        Integer valueOf = Integer.valueOf(C64403PPj.LIZIZ);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        C68222m2 c68222m2 = C64409PPp.LIZIZ;
        if (c68222m2 != null) {
            return c68222m2.LIZLLL;
        }
        return 0;
    }

    public static String LIZLLL() {
        String LIZJ = C64403PPj.LIZJ();
        if (LIZJ != null) {
            return LIZJ;
        }
        return "null";
    }

    public static boolean LJ() {
        return C64403PPj.LIZLLL(HeliosEnvImpl.get().LJIIJ.backgroundFreezeDuration);
    }

    public static boolean LJFF() {
        return !C64403PPj.LIZLLL(0L);
    }

    static {
        C16880lQ.LJLLJ(PQ0.class);
        LJFF = new PQ0();
    }

    public final void LIZ(Fragment fragment, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.LIZIZ) {
            C66138PxW.LIZLLL(fragment, str);
        }
        C65929Pu9.LIZ(currentTimeMillis, "checkFragmentResource", false);
    }

    public final void LIZIZ(Activity activity, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.LIZIZ) {
            C66138PxW.LIZLLL(activity.getClass().getName(), str);
        }
        C65929Pu9.LIZ(currentTimeMillis, "checkResource", false);
    }
}
