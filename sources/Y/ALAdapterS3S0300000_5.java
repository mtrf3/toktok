package Y;

import X.B43;
import X.C15380j0;
import X.C15650jR;
import X.C29306Beo;
import X.C29474BhW;
import X.C29717BlR;
import X.C29746Blu;
import X.C29750Bly;
import X.C29771BmJ;
import X.C30743C4t;
import X.C30744C4u;
import X.C31165CKz;
import X.C34K;
import X.C73943T0h;
import X.CCJ;
import X.EnumC29732Blg;
import X.KL2;
import X.ULG;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveClearScreenDrawOptSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ALAdapterS3S0300000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                onAnimationEnd$4(this, animator);
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
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                onAnimationStart$3(this, animator);
                return;
            case 5:
                onAnimationStart$4(this, animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C73943T0h.LIZ().LIZIZ(new B43(true));
        if (LiveClearScreenDrawOptSetting.INSTANCE.getValue()) {
            ((ConstraintProperty) aLAdapterS3S0300000_5.l1).visibility(4);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (((ULG) aLAdapterS3S0300000_5.l2).LIZIZ) {
            ((ConstraintProperty) aLAdapterS3S0300000_5.l1).forceHasOverlappingRenderingCompat(true);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29306Beo.LJJLJLI((View) aLAdapterS3S0300000_5.l0);
        View view = (View) aLAdapterS3S0300000_5.l0;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        C29306Beo.LJI((View) aLAdapterS3S0300000_5.l2);
        View view2 = (View) aLAdapterS3S0300000_5.l2;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        ((DrawGuessStatusWidget) aLAdapterS3S0300000_5.l1).getClass();
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C15650jR.LIZ().LJIIIZ(((C29750Bly) aLAdapterS3S0300000_5.l0).LIZJ).LJIIJJI(((C29746Blu) aLAdapterS3S0300000_5.l1).LJIILL);
        boolean z = C29771BmJ.LJII;
        int i = (int) ((C29750Bly) aLAdapterS3S0300000_5.l2).LIZ;
        C29474BhW.LJ(i, i, "fans_club_entrance_icon", z);
        KL2.LJIILLIIL(4, ((C29746Blu) aLAdapterS3S0300000_5.l1).LJIILL);
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (CCJ.LIZ(((LayeredElementContext) aLAdapterS3S0300000_5.l1).getContext())) {
            ((ConstraintProperty) aLAdapterS3S0300000_5.l0).translationX(-C15380j0.LJIIJJI());
        } else {
            ((ConstraintProperty) aLAdapterS3S0300000_5.l0).translationX(C15380j0.LJIIJJI());
        }
        ((ConstraintProperty) aLAdapterS3S0300000_5.l0).visibility(8);
        C73943T0h LIZ = C73943T0h.LIZ();
        C30744C4u c30744C4u = (C30744C4u) aLAdapterS3S0300000_5.l2;
        LIZ.LIZIZ(new C30743C4t(c30744C4u.LIZ, c30744C4u.LIZIZ));
    }

    public static final void onAnimationStart$0(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (((ULG) aLAdapterS3S0300000_5.l0).LIZIZ) {
            ((ConstraintProperty) aLAdapterS3S0300000_5.l1).forceHasOverlappingRenderingCompat(false);
        }
        C73943T0h.LIZ().LIZIZ((C29717BlR) aLAdapterS3S0300000_5.l2);
    }

    public static final void onAnimationStart$1(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C73943T0h.LIZ().LIZIZ(new B43(false));
        C73943T0h.LIZ().LIZIZ((C29717BlR) aLAdapterS3S0300000_5.l0);
        if (LiveClearScreenDrawOptSetting.INSTANCE.getValue()) {
            ((ConstraintProperty) aLAdapterS3S0300000_5.l1).visibility(0);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        View view = (View) aLAdapterS3S0300000_5.l0;
        if (view != null) {
            view.setAlpha(0.0f);
        }
        C29306Beo.LJJLJLI((View) aLAdapterS3S0300000_5.l0);
        ((DrawGuessStatusWidget) aLAdapterS3S0300000_5.l1).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (!((C34K) aLAdapterS3S0300000_5.l0).element) {
            KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS3S0300000_5.l1).LJIILL);
        }
        C31165CKz c31165CKz = ((C29746Blu) aLAdapterS3S0300000_5.l1).LJIIZILJ;
        if (c31165CKz != null) {
            c31165CKz.setText(String.valueOf(((C29750Bly) aLAdapterS3S0300000_5.l2).LIZ));
        }
        C31165CKz c31165CKz2 = ((C29746Blu) aLAdapterS3S0300000_5.l1).LJIIZILJ;
        if (c31165CKz2 != null) {
            c31165CKz2.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
        }
        C31165CKz c31165CKz3 = ((C29746Blu) aLAdapterS3S0300000_5.l1).LJIIZILJ;
        if (c31165CKz3 != null) {
            String str = ((C29750Bly) aLAdapterS3S0300000_5.l2).LJI;
            if (str == null) {
                str = "#FFFFA25F";
            }
            c31165CKz3.setTextColor(C15380j0.LIZJ(0, str));
        }
        C29746Blu c29746Blu = (C29746Blu) aLAdapterS3S0300000_5.l1;
        c29746Blu.LIZLLL = (C29750Bly) aLAdapterS3S0300000_5.l2;
        c29746Blu.LJIJJ(EnumC29732Blg.FANS_CLUB_JOINED);
    }

    public static final void onAnimationStart$4(ALAdapterS3S0300000_5 aLAdapterS3S0300000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ConstraintProperty) aLAdapterS3S0300000_5.l0).translationX(0.0f);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS3S0300000_5(X.C29717BlR r2, X.ULG r3, com.bytedance.ies.sdk.widgets.ConstraintProperty r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
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
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS3S0300000_5.<init>(X.BlR, X.ULG, com.bytedance.ies.sdk.widgets.ConstraintProperty, int):void");
    }

    public ALAdapterS3S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
