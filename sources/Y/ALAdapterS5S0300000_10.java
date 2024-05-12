package Y;

import X.AbstractC59359NRj;
import X.C59357NRh;
import X.C59363NRn;
import X.OSZ;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ALAdapterS5S0300000_10 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0300000_10 aLAdapterS5S0300000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS5S0300000_10.l0;
        abstractC59359NRj.getClass();
        C59363NRn.LIZ(abstractC59359NRj, 0);
    }

    public static final void onAnimationStart$0(ALAdapterS5S0300000_10 aLAdapterS5S0300000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS5S0300000_10.l0;
        int i = -((C59357NRh) aLAdapterS5S0300000_10.l2).LJIIIIZZ;
        abstractC59359NRj.getClass();
        C59363NRn.LIZ(abstractC59359NRj, i);
        C59363NRn.LIZJ(abstractC59359NRj, 0);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS5S0300000_10.l1;
        C59357NRh c59357NRh = (C59357NRh) aLAdapterS5S0300000_10.l2;
        int i2 = c59357NRh.LJII;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZIZ(abstractC59359NRj2, i2);
        C59363NRn.LIZ(abstractC59359NRj2, -c59357NRh.LJII);
        C59363NRn.LIZJ(abstractC59359NRj2, 0);
    }

    public static final void onAnimationStart$1(ALAdapterS5S0300000_10 aLAdapterS5S0300000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS5S0300000_10.l0;
        int i = -((C59357NRh) aLAdapterS5S0300000_10.l1).LJIIIIZZ;
        abstractC59359NRj.getClass();
        C59363NRn.LIZ(abstractC59359NRj, i);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS5S0300000_10.l0;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZJ(abstractC59359NRj2, 0);
        ((AbstractC59359NRj) aLAdapterS5S0300000_10.l0).LIZLLL(new OSZ("stageName", "showAppInfo"));
        ((AbstractC59359NRj) aLAdapterS5S0300000_10.l2).LIZLLL(new OSZ("stageName", "showAppInfo"));
    }

    public static final void onAnimationStart$2(ALAdapterS5S0300000_10 aLAdapterS5S0300000_10, Animator animation) {
        o.LJIIIZ(animation, "animation");
        AbstractC59359NRj abstractC59359NRj = (AbstractC59359NRj) aLAdapterS5S0300000_10.l0;
        int i = -((C59357NRh) aLAdapterS5S0300000_10.l1).LJIIIIZZ;
        abstractC59359NRj.getClass();
        C59363NRn.LIZ(abstractC59359NRj, i);
        AbstractC59359NRj abstractC59359NRj2 = (AbstractC59359NRj) aLAdapterS5S0300000_10.l0;
        abstractC59359NRj2.getClass();
        C59363NRn.LIZJ(abstractC59359NRj2, 0);
        AbstractC59359NRj abstractC59359NRj3 = (AbstractC59359NRj) aLAdapterS5S0300000_10.l2;
        C59357NRh c59357NRh = (C59357NRh) aLAdapterS5S0300000_10.l1;
        int i2 = c59357NRh.LJII + c59357NRh.LJIIIZ;
        abstractC59359NRj3.getClass();
        C59363NRn.LIZIZ(abstractC59359NRj3, i2);
        AbstractC59359NRj abstractC59359NRj4 = (AbstractC59359NRj) aLAdapterS5S0300000_10.l2;
        C59357NRh c59357NRh2 = (C59357NRh) aLAdapterS5S0300000_10.l1;
        int i3 = (-c59357NRh2.LJII) - c59357NRh2.LJIIIZ;
        abstractC59359NRj4.getClass();
        C59363NRn.LIZ(abstractC59359NRj4, i3);
        AbstractC59359NRj abstractC59359NRj5 = (AbstractC59359NRj) aLAdapterS5S0300000_10.l2;
        abstractC59359NRj5.getClass();
        C59363NRn.LIZJ(abstractC59359NRj5, 0);
        ((AbstractC59359NRj) aLAdapterS5S0300000_10.l0).LIZLLL(new OSZ("stageName", "showAppInfo"));
        ((AbstractC59359NRj) aLAdapterS5S0300000_10.l2).LIZLLL(new OSZ("stageName", "showAppInfo"));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS5S0300000_10(X.C59357NRh r2, X.AbstractC59359NRj r3, X.AbstractC59359NRj r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS5S0300000_10.<init>(X.NRh, X.NRj, X.NRj, int):void");
    }
}
