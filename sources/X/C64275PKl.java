package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.PKl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64275PKl implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C64269PKf LJLIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C64275PKl(C64269PKf c64269PKf) {
        this.LJLIL = c64269PKf;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String LIZ;
        if (this.LJLIL.LJIJJ == null) {
            LIZ = activity.getClass().getName();
        } else {
            LIZ = C40328FsC.LIZ(activity);
        }
        int indexOf = ((ArrayList) this.LJLIL.LIZ).indexOf(LIZ);
        if (indexOf > -1 && indexOf < ((ArrayList) this.LJLIL.LIZ).size()) {
            ListProtector.remove(this.LJLIL.LIZ, indexOf);
            ListProtector.remove(this.LJLIL.LIZIZ, indexOf);
        }
        ((ArrayList) this.LJLIL.LIZJ).add(LIZ);
        long currentTimeMillis = System.currentTimeMillis();
        ((ArrayList) this.LJLIL.LIZLLL).add(Long.valueOf(currentTimeMillis));
        this.LJLIL.LJ(activity.hashCode(), LIZ, "onDestroy", currentTimeMillis);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String LIZ;
        C64269PKf c64269PKf = this.LJLIL;
        if (c64269PKf.LJIJJ == null) {
            LIZ = activity.getClass().getName();
        } else {
            LIZ = C40328FsC.LIZ(activity);
        }
        c64269PKf.LJIIL = LIZ;
        this.LJLIL.LJIILIIL = System.currentTimeMillis();
        C64269PKf c64269PKf2 = this.LJLIL;
        int i = c64269PKf2.LJIJI - 1;
        c64269PKf2.LJIJI = i;
        if (i == 0) {
            c64269PKf2.LJIILLIIL = false;
            C64269PKf.LJJ = false;
            c64269PKf2.LJIIZILJ = SystemClock.uptimeMillis();
        } else if (i < 0) {
            c64269PKf2.LJIJI = 0;
            c64269PKf2.LJIILLIIL = false;
            C64269PKf.LJJ = false;
            c64269PKf2.LJIIZILJ = SystemClock.uptimeMillis();
        }
        C64269PKf c64269PKf3 = this.LJLIL;
        c64269PKf3.LJ(activity.hashCode(), c64269PKf3.LJIIL, "onPause", c64269PKf3.LJIILIIL);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String LIZ;
        C64269PKf c64269PKf = this.LJLIL;
        if (c64269PKf.LJIJJ == null) {
            LIZ = activity.getClass().getName();
        } else {
            LIZ = C40328FsC.LIZ(activity);
        }
        c64269PKf.LJIIJ = LIZ;
        this.LJLIL.LJIIJJI = System.currentTimeMillis();
        C64269PKf c64269PKf2 = this.LJLIL;
        c64269PKf2.LJIJI++;
        if (!c64269PKf2.LJIILLIIL) {
            c64269PKf2.LJIILLIIL = true;
            if (C64269PKf.LJIJJLI) {
                C64269PKf.LJIJJLI = false;
                C64269PKf.LJJI = 1;
                C64269PKf.LJJII = c64269PKf2.LJIIJJI;
            }
            if (c64269PKf2.LJIIJ.equals(c64269PKf2.LJIIL)) {
                if (C64269PKf.LJJ) {
                    if (!C64269PKf.LJIL) {
                        C64269PKf.LJJI = 4;
                        C64269PKf.LJJII = this.LJLIL.LJIIJJI;
                    }
                } else {
                    C64269PKf.LJJI = 3;
                    C64269PKf.LJJII = this.LJLIL.LJIIJJI;
                }
            }
        }
        C64269PKf c64269PKf3 = this.LJLIL;
        c64269PKf3.LJ(activity.hashCode(), c64269PKf3.LJIIJ, "onResume", c64269PKf3.LJIIJJI);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        String LIZ;
        C64269PKf c64269PKf = this.LJLIL;
        if (c64269PKf.LJIJJ == null) {
            LIZ = activity.getClass().getName();
        } else {
            LIZ = C40328FsC.LIZ(activity);
        }
        c64269PKf.LJIIIIZZ = LIZ;
        this.LJLIL.LJIIIZ = System.currentTimeMillis();
        C64269PKf c64269PKf2 = this.LJLIL;
        c64269PKf2.LJ(activity.hashCode(), c64269PKf2.LJIIIIZZ, "onStart", c64269PKf2.LJIIIZ);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        String LIZ;
        C64269PKf c64269PKf = this.LJLIL;
        if (c64269PKf.LJIJJ == null) {
            LIZ = activity.getClass().getName();
        } else {
            LIZ = C40328FsC.LIZ(activity);
        }
        c64269PKf.LJIILJJIL = LIZ;
        this.LJLIL.LJIILL = System.currentTimeMillis();
        C64269PKf c64269PKf2 = this.LJLIL;
        c64269PKf2.LJ(activity.hashCode(), c64269PKf2.LJIILJJIL, "onStop", c64269PKf2.LJIILL);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String LIZ;
        boolean z;
        C64269PKf c64269PKf = this.LJLIL;
        if (c64269PKf.LJIJJ == null) {
            LIZ = activity.getClass().getName();
        } else {
            LIZ = C40328FsC.LIZ(activity);
        }
        c64269PKf.LJI = LIZ;
        this.LJLIL.LJII = System.currentTimeMillis();
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        C64269PKf.LJIL = z;
        C64269PKf.LJJ = true;
        C64269PKf c64269PKf2 = this.LJLIL;
        ((ArrayList) c64269PKf2.LIZ).add(c64269PKf2.LJI);
        C64269PKf c64269PKf3 = this.LJLIL;
        ((ArrayList) c64269PKf3.LIZIZ).add(Long.valueOf(c64269PKf3.LJII));
        C64269PKf c64269PKf4 = this.LJLIL;
        c64269PKf4.LJ(activity.hashCode(), c64269PKf4.LJI, "onCreate", c64269PKf4.LJII);
        this.LJLIL.LJFF.add(new WeakReference<>(activity));
    }
}
