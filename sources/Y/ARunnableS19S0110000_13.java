package Y;

import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C47121t6;
import X.C76265TwT;
import X.CFX;
import X.ORZ;
import X.U1S;
import X.U1T;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.promote.PromoteProgramDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ARunnableS19S0110000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        U1T u1t;
        View view;
        boolean z;
        float LJFF;
        U1S u1s = (U1S) this.l0;
        if (this.z1) {
            u1t = (U1T) ORZ.LJLLLL(u1s.LJLL);
        } else {
            u1t = (U1T) ORZ.LJLLLL(u1s.LJLLI);
        }
        u1s.LJLJLLL = u1t;
        U1T u1t2 = ((U1S) this.l0).LJLJLLL;
        if (u1t2 != null && !u1t2.LIZIZ && u1t2 != null && (view = u1t2.LIZ) != null && view.findViewById(R.id.fcd) != null) {
            ((U1S) this.l0).getMMvpImageView().setVisibility(0);
            if (C76265TwT.LIZ.LJIIJJI) {
                C15490jB.LJ(((U1S) this.l0).getMMvpImageView(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_pk_army_mvp_sfx.png");
            } else {
                C15490jB.LJ(((U1S) this.l0).getMMvpImageView(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_pk_army_mvp.png");
            }
            U1S u1s2 = (U1S) this.l0;
            U1T u1t3 = u1s2.LJLJLLL;
            o.LJI(u1t3);
            View findViewById = u1t3.LIZ.findViewById(R.id.fcd);
            o.LJIIIIZZ(findViewById, "mvpViewHolder!!.view.fin…eView>(R.id.iv_user_icon)");
            AnimatorSet animatorSet = u1s2.LJLJLJ;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = u1s2.LJLJLJ;
                if (animatorSet2 != null) {
                    C16880lQ.LJLJJL(animatorSet2);
                }
                AnimatorSet animatorSet3 = u1s2.LJLJLJ;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
            }
            u1s2.LJLJJLL = false;
            AnimatorSet animatorSet4 = new AnimatorSet();
            u1s2.LJLJLJ = animatorSet4;
            Animator[] animatorArr = new Animator[3];
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playSequentially(U1S.LIZJ(u1s2, 0.0f, 0.0f, 0L), U1S.LIZIZ(u1s2, 0.0f, 4.0f, 200L), U1S.LIZIZ(u1s2, 4.0f, 3.0f, 160L), U1S.LIZIZ(u1s2, 3.0f, 3.5f, 120L), U1S.LIZIZ(u1s2, 3.5f, 3.5f, 360L));
            animatorArr[0] = animatorSet5;
            int LJIIL = C15380j0.LJIIL();
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = LJIIL / 2.0f;
            if (f < f2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LJFF = -(f2 - ((C15380j0.LJFF(R.dimen.a5w) / 2.0f) + f));
            } else {
                LJFF = f2 - ((LJIIL - r13) - (C15380j0.LJFF(R.dimen.a5w) / 2.0f));
            }
            float bottom = findViewById.getBottom() - (u1s2.getHeight() / 2.0f);
            AnimatorSet animatorSet6 = new AnimatorSet();
            animatorSet6.playTogether(U1S.LIZJ(u1s2, LJFF, bottom, 200L), U1S.LIZIZ(u1s2, 3.5f, 0.8f, 200L));
            animatorArr[1] = animatorSet6;
            animatorArr[2] = U1S.LIZIZ(u1s2, 0.8f, 1.0f, 160L);
            animatorSet4.playSequentially(animatorArr);
            AnimatorSet animatorSet7 = u1s2.LJLJLJ;
            if (animatorSet7 != null) {
                animatorSet7.addListener(new IDAListenerS80S0100000_13(u1s2, 12));
            }
            AnimatorSet animatorSet8 = u1s2.LJLJLJ;
            if (animatorSet8 != null) {
                animatorSet8.start();
            }
        }
    }

    public static final void run$0(ARunnableS19S0110000_13 aRunnableS19S0110000_13) {
        PromoteProgramDialog.lambda$viewAnim$1((View) aRunnableS19S0110000_13.l0, aRunnableS19S0110000_13.z1);
    }

    public static final void run$1(ARunnableS19S0110000_13 aRunnableS19S0110000_13) {
        boolean LIZ;
        try {
            aRunnableS19S0110000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS19S0110000_13 aRunnableS19S0110000_13) {
        boolean LIZ;
        try {
            if (aRunnableS19S0110000_13.z1) {
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotX(r1.getWidth());
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotY(0.0f);
            } else {
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotX(0.0f);
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotY(0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS19S0110000_13 aRunnableS19S0110000_13) {
        boolean LIZ;
        try {
            if (aRunnableS19S0110000_13.z1) {
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotX(r1.getWidth());
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotY(0.0f);
            } else {
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotX(0.0f);
                ((C47121t6) aRunnableS19S0110000_13.l0).setPivotY(0.0f);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS19S0110000_13(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
