package X;

import Y.ARunnableS45S0100000_9;
import android.animation.AnimatorSet;
import android.view.View;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LDT implements InterfaceC53894LDe {
    public final /* synthetic */ C54085LKn LJLIL;

    public LDT(C54085LKn c54085LKn) {
        this.LJLIL = c54085LKn;
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        View view;
        View contentView;
        View view2;
        View view3;
        View contentView2;
        o.LJIIIZ(to, "to");
        C54085LKn c54085LKn = this.LJLIL;
        ActivityC45651qj activityC45651qj = c54085LKn.LIZ;
        if (activityC45651qj != null) {
            Object obj = null;
            if ((o.LJ(str, "HOME") || o.LJ("HOME", com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).sv0(str))) && !o.LJ(to, "HOME") && !o.LJ("HOME", com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).sv0(to))) {
                if ((C53765L8f.LJIIJJI() && o.LJ(to, "USER")) || (!C53765L8f.LJIIL("NOTIFICATION") && o.LJ(to, "NOTIFICATION"))) {
                    AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(c54085LKn, 984);
                    LDQ ldq = LER.LIZIZ;
                    if (ldq != null) {
                        ldq.dismiss();
                    }
                    aqS159S0100000_9.invoke();
                    return;
                }
                if (!c54085LKn.LIZLLL) {
                    return;
                }
                LDQ ldq2 = LER.LIZIZ;
                if (ldq2 != null && (contentView = ldq2.getContentView()) != null) {
                    obj = contentView.getParent();
                }
                if ((obj instanceof View) && (view = (View) obj) != null) {
                    view.setVisibility(8);
                }
                LDQ ldq3 = LER.LIZIZ;
                if (!(ldq3 instanceof LDQ) || ldq3 == null || (animatorSet = ldq3.LJIILLIIL) == null || !animatorSet.isRunning() || (animatorSet2 = ldq3.LJIILLIIL) == null) {
                    return;
                }
                animatorSet2.pause();
                return;
            }
            if (o.LJ(str, "HOME")) {
                return;
            }
            C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
            if (o.LJ("HOME", c188787b0.LIZ(activityC45651qj).sv0(str))) {
                return;
            }
            if ((!o.LJ(to, "HOME") && !o.LJ("HOME", c188787b0.LIZ(activityC45651qj).sv0(to))) || !c54085LKn.LIZLLL) {
                return;
            }
            LDQ ldq4 = LER.LIZIZ;
            if (ldq4 != null && (contentView2 = ldq4.getContentView()) != null) {
                obj = contentView2.getParent();
            }
            if ((obj instanceof View) && (view3 = (View) obj) != null) {
                view3.setVisibility(0);
            }
            LDQ ldq5 = LER.LIZIZ;
            if (!(ldq5 instanceof LDQ) || ldq5 == null || (view2 = ldq5.LJI) == null) {
                return;
            }
            view2.post(new ARunnableS45S0100000_9(112));
        }
    }
}
