package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ttve.nativePort.TEImageInterface;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5wJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151035wJ {
    public final Object LIZ;
    public Object LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C151325wm LIZIZ() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.LIZ
            X.Pro r0 = (X.InterfaceC65784Pro) r0
            java.lang.Object r0 = r0.invoke()
            X.5wc r0 = (X.C151225wc) r0
            if (r0 == 0) goto L1a
            X.5wm r1 = r0.LIZ
            if (r1 != 0) goto L19
        L10:
            java.lang.Object r0 = r2.LIZIZ
            X.Pro r0 = (X.InterfaceC65784Pro) r0
            if (r0 == 0) goto L19
            r0.invoke()
        L19:
            return r1
        L1a:
            r1 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151035wJ.LIZIZ():X.5wm");
    }

    public /* synthetic */ C151035wJ(Integer num) {
        this.LIZ = num;
    }

    public static void LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (fragment.mo49getActivity() != null) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            o.LJI(mo49getActivity);
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "fragment.activity!!.supportFragmentManager");
            Fragment LJJJIL = supportFragmentManager.LJJJIL(C16880lQ.LJLLILLLL(fragment.getClass()));
            if (LJJJIL != null && LJJJIL.isAdded()) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJJI(fragment);
                c1b3.LJII();
            }
        }
    }

    public final void LIZLLL(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Integer num = (Integer) this.LIZ;
        if ((num == null || num.intValue() != 0) && this.LIZIZ != null) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.LIZIZ;
            o.LJI(activityC45651qj);
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "hostActivity!!.supportFragmentManager");
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            Fragment LJJJIL = supportFragmentManager.LJJJIL(C16880lQ.LJLLILLLL(fragment.getClass()));
            if (LJJJIL != null && LJJJIL.isAdded()) {
                if (LJJJIL.isHidden()) {
                    c1b3.LJIIL(LJJJIL);
                }
            } else {
                Integer num2 = (Integer) this.LIZ;
                o.LJI(num2);
                c1b3.LJIIIIZZ(num2.intValue(), 1, fragment, C16880lQ.LJLLILLLL(fragment.getClass()));
            }
            c1b3.LJII();
            return;
        }
        throw new IllegalStateException("containerId or hostActivity is null.");
    }

    public /* synthetic */ C151035wJ(AqS152S0100000_2 aqS152S0100000_2) {
        this.LIZ = aqS152S0100000_2;
    }

    public static void LIZJ(C151325wm c151325wm, boolean z) {
        if (z) {
            TEImageInterface tEImageInterface = c151325wm.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.doRenderEffect(false);
            }
            c151325wm.LJ(null, true);
        }
    }
}
