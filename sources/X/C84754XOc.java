package X;

import Y.AfS58S0200000_9;
import Y.AfS64S0200000_15;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XOc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84754XOc implements G57 {
    public boolean LIZIZ;
    public boolean LIZJ;
    public WeakReference<ActivityC45651qj> LJ;
    public final List<InterfaceC84755XOd> LIZ = new ArrayList();
    public final List<InterfaceC92693kP> LIZLLL = new ArrayList();

    public final void LIZIZ(int i) {
        for (InterfaceC84755XOd interfaceC84755XOd : this.LIZ) {
            switch (i) {
                case 0:
                    interfaceC84755XOd.onCreate();
                    break;
                case 1:
                    interfaceC84755XOd.LIZ();
                    break;
                case 2:
                    interfaceC84755XOd.LJ();
                    break;
                case 3:
                    interfaceC84755XOd.onResume();
                    break;
                case 4:
                    interfaceC84755XOd.onPause();
                    break;
                case 5:
                    interfaceC84755XOd.LIZIZ();
                    break;
                case 6:
                    interfaceC84755XOd.LIZLLL();
                    break;
                case 7:
                    interfaceC84755XOd.onDestroy();
                    break;
                case 8:
                    interfaceC84755XOd.LJFF();
                    break;
                case 9:
                    interfaceC84755XOd.LIZJ();
                    break;
            }
        }
    }

    public final void LIZJ(WeakReference<ActivityC45651qj> weakReference) {
        this.LJ = weakReference;
        ((ArrayList) this.LIZLLL).add(C84763XOl.LIZ().LJJJJZI(new AfS58S0200000_9(weakReference, this, 24)));
        ((ArrayList) this.LIZLLL).add(C84763XOl.LJ().LJJJJZI(new AfS64S0200000_15(this, (WeakReference) weakReference, 13)));
        ((ArrayList) this.LIZLLL).add(C84763XOl.LIZLLL().LJJJJZI(new AfS58S0200000_9(weakReference, this, 25)));
        ((ArrayList) this.LIZLLL).add(C84763XOl.LIZJ().LJJJJZI(new AfS58S0200000_9(weakReference, this, 26)));
        ((ArrayList) this.LIZLLL).add(C84763XOl.LJFF().LJJJJZI(new AfS64S0200000_15(this, (WeakReference) weakReference, 14)));
        ((ArrayList) this.LIZLLL).add(C84763XOl.LIZIZ().LJJJJZI(new AfS64S0200000_15(this, (WeakReference) weakReference, 11)));
        ((ArrayList) this.LIZLLL).add(C84763XOl.LJIIJ.LJJJJLL().LJJJJZI(new AfS64S0200000_15(this, (WeakReference) weakReference, 12)));
        ((List) G58.LIZ.getValue()).add(this);
    }

    @Override // X.G57
    public final void LIZ(Activity activity, boolean z) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(activity, "activity");
        WeakReference<ActivityC45651qj> weakReference = this.LJ;
        if (weakReference != null) {
            activityC45651qj = weakReference.get();
        } else {
            activityC45651qj = null;
        }
        if (activity == activityC45651qj) {
            if (z) {
                LIZIZ(8);
            } else {
                LIZIZ(9);
            }
        }
    }
}
