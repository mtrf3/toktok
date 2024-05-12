package Y;

import X.ActivityC45651qj;
import X.C6CX;
import X.C6CY;
import X.C6PB;
import X.InterfaceC15040iS;
import X.InterfaceC1554368d;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ALAdapterS0S0310000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0310000_2 aLAdapterS0S0310000_2, Animator animator) {
        if (!aLAdapterS0S0310000_2.z3) {
            ((View) aLAdapterS0S0310000_2.l1).setVisibility(4);
        }
        InterfaceC15040iS interfaceC15040iS = (InterfaceC15040iS) aLAdapterS0S0310000_2.l2;
        if (interfaceC15040iS != null) {
            interfaceC15040iS.accept(null);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0310000_2 aLAdapterS0S0310000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (!aLAdapterS0S0310000_2.z3) {
            ((View) aLAdapterS0S0310000_2.l0).setVisibility(8);
            try {
                C6CX c6cx = (C6CX) aLAdapterS0S0310000_2.l1;
                Context context = c6cx.LIZ;
                if (context instanceof ActivityC45651qj) {
                    if (!((ActivityC45651qj) context).isFinishing()) {
                        ((C6CX) aLAdapterS0S0310000_2.l1).getClass();
                    }
                } else {
                    c6cx.getClass();
                }
            } catch (IllegalArgumentException e) {
                InterfaceC1554368d LIZJ = C6PB.LIZJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AlphaPopAnimManager: dismiss pop failed :");
                LIZ.append(e.getMessage());
                LIZJ.d(X1D.LIZIZ(LIZ));
            } catch (Exception unused) {
            }
        }
        C6CY c6cy = (C6CY) aLAdapterS0S0310000_2.l2;
        if (c6cy != null) {
            c6cy.LIZ();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0310000_2 aLAdapterS0S0310000_2, Animator animator) {
        ((View) aLAdapterS0S0310000_2.l0).setVisibility(0);
    }

    public static final void onAnimationStart$1(ALAdapterS0S0310000_2 aLAdapterS0S0310000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (aLAdapterS0S0310000_2.z3) {
            ((View) aLAdapterS0S0310000_2.l0).setVisibility(0);
        }
        C6CY c6cy = (C6CY) aLAdapterS0S0310000_2.l2;
        if (c6cy != null) {
            c6cy.LIZIZ();
        }
    }

    public ALAdapterS0S0310000_2(View view, C6CX c6cx, C6CY c6cy, int i) {
        this.$t = i;
        this.z3 = true;
        this.l0 = view;
        this.l1 = c6cx;
        this.l2 = c6cy;
    }

    public ALAdapterS0S0310000_2(View view, boolean z, View view2, InterfaceC15040iS interfaceC15040iS, int i) {
        this.$t = i;
        this.l0 = view;
        this.z3 = z;
        this.l1 = view2;
        this.l2 = interfaceC15040iS;
    }
}
