package X;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;

/* renamed from: X.XOl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84763XOl {
    public static final C73893SzJ<BPL> LIZ = new C73893SzJ<>();
    public static final C73893SzJ<BPL> LIZIZ = new C73893SzJ<>();
    public static final C73893SzJ<Activity> LIZJ = new C73893SzJ<>();
    public static final C73893SzJ<Activity> LIZLLL = new C73893SzJ<>();
    public static final C73893SzJ<Activity> LJ = new C73893SzJ<>();
    public static final C73893SzJ<Activity> LJFF = new C73893SzJ<>();
    public static final C73893SzJ<Activity> LJI = new C73893SzJ<>();
    public static final C73893SzJ<BPL> LJII = new C73893SzJ<>();
    public static final C73893SzJ<Boolean> LJIIIIZZ = new C73893SzJ<>();
    public static final C73893SzJ<Application> LJIIIZ = new C73893SzJ<>();
    public static final C73893SzJ<C78495UrL> LJIIJ = new C73893SzJ<>();
    public static volatile boolean LJIIJJI = true;
    public static volatile boolean LJIIL;
    public static int LJIILIIL;
    public static volatile long LJIILJJIL;
    public static volatile long LJIILL;
    public static int LJIILLIIL;
    public static EFU LJIIZILJ;
    public static WeakReference<Activity> LJIJ;

    public static T06 LIZ() {
        return LIZIZ.LJJJJLL();
    }

    public static T06 LIZIZ() {
        return LJI.LJJJJLL();
    }

    public static T06 LIZJ() {
        return LJ.LJJJJLL();
    }

    public static T06 LIZLLL() {
        return LIZLLL.LJJJJLL();
    }

    public static T06 LJ() {
        return LIZJ.LJJJJLL();
    }

    public static T06 LJFF() {
        return LJFF.LJJJJLL();
    }

    public static T06 LJI() {
        return LJIIIIZZ.LJJJJLL();
    }

    public static T06 LJII() {
        return LJIIIZ.LJJJJLL();
    }

    public static Activity LJIIIIZZ() {
        WeakReference<Activity> weakReference = LJIJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static boolean LJIIIZ() {
        return LJIIJJI;
    }

    public static void LJIIJ(Activity activity) {
        if (activity == null) {
            LJIJ = null;
        } else {
            LJIJ = new WeakReference<>(activity);
        }
    }
}
