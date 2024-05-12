package X;

import Y.ARunnableS25S0200000_6;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G56 extends G46 {
    public G5A LIZJ;

    public final boolean LJIILLIIL() {
        InterfaceC28616BKy interfaceC28616BKy;
        InterfaceC28616BKy interfaceC28616BKy2;
        Iterator<InterfaceC28616BKy> it = LJIILJJIL().LIZ().iterator();
        while (true) {
            interfaceC28616BKy = null;
            if (it.hasNext()) {
                interfaceC28616BKy2 = it.next();
                if (interfaceC28616BKy2 instanceof C40730Fyg) {
                    break;
                }
            } else {
                interfaceC28616BKy2 = null;
                break;
            }
        }
        if (interfaceC28616BKy2 instanceof C40730Fyg) {
            interfaceC28616BKy = interfaceC28616BKy2;
        }
        C40730Fyg c40730Fyg = (C40730Fyg) interfaceC28616BKy;
        if (c40730Fyg != null) {
            return c40730Fyg.LJLIL;
        }
        return false;
    }

    public final G5A LJIILL(Context context) {
        if (this.LIZJ == null) {
            this.LIZJ = new G5A(context);
        }
        return this.LIZJ;
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityResumed(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        if (!LJIILLIIL() && !C66851QLn.LIZ) {
            if (EUU.LIZ) {
                C38995FSd.LIZLLL().execute(new ARunnableS25S0200000_6(activity, this, 7));
                return;
            }
            G5A LJIILL = LJIILL(activity);
            if (LJIILL == null) {
                return;
            }
            LJIILL.LIZIZ(activity);
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityStopped(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        if (!LJIILLIIL() && !C66851QLn.LIZ) {
            if (EUU.LIZ) {
                C38995FSd.LIZLLL().execute(new ARunnableS25S0200000_6(activity, this, 8));
                return;
            }
            G5A LJIILL = LJIILL(activity);
            if (LJIILL == null) {
                return;
            }
            LJIILL.LIZ(activity);
        }
    }

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onWindowFocusChanged(ActivityC86117Xqz activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        Iterator it = ((List) G58.LIZ.getValue()).iterator();
        while (it.hasNext()) {
            ((G57) it.next()).LIZ(activity, z);
        }
        BN6.LIZ.onNext(Boolean.valueOf(z));
    }
}
