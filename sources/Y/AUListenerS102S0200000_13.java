package Y;

import X.AbstractC76473Tzp;
import X.C018905p;
import X.C264612c;
import X.C32014ChO;
import X.C56414MCc;
import X.C76414Tys;
import X.C76805UCj;
import X.C76810UCo;
import X.C76811UCp;
import X.C76813UCr;
import X.C77044ULo;
import X.C78866UxK;
import X.U21;
import X.U8H;
import X.WW1;
import X.X1D;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionTitleLayout;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.MatchSpeedChallengeAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AUListenerS102S0200000_13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS102S0200000_13.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintProperty.translationX(((Float) animatedValue).floatValue());
        float width = ((LayeredElementContext) aUListenerS102S0200000_13.l1).getContainer().getWidth();
        if (width > 0.0f) {
            ConstraintProperty constraintProperty2 = (ConstraintProperty) aUListenerS102S0200000_13.l0;
            constraintProperty2.alpha(1 - Math.abs(constraintProperty2.translationX() / width));
        } else {
            ((ConstraintProperty) aUListenerS102S0200000_13.l0).alpha(1.0f);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintLayout constraintLayout = ((InteractionTitleLayout) aUListenerS102S0200000_13.l0).LJZI;
        if (constraintLayout != null) {
            Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            constraintLayout.setScaleX(((Float) animatedValue).floatValue());
            ConstraintLayout constraintLayout2 = ((InteractionTitleLayout) aUListenerS102S0200000_13.l0).LJZI;
            if (constraintLayout2 != null) {
                Object animatedValue2 = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                constraintLayout2.setScaleY(((Float) animatedValue2).floatValue());
                return;
            }
            o.LJIJI("linkMicLayout");
            throw null;
        }
        o.LJIJI("linkMicLayout");
        throw null;
    }

    public static final void onAnimationUpdate$10(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if ((it.getAnimatedValue() instanceof Integer) && ((MatchSpeedChallengeAssem) aUListenerS102S0200000_13.l0).LJLL) {
            ProgressBar progressBar = (ProgressBar) aUListenerS102S0200000_13.l1;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            progressBar.setProgress(((Integer) animatedValue).intValue());
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l0).getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((AbstractC76473Tzp) aUListenerS102S0200000_13.l1).LJJJ().setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$12(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        C018905p c018905p = (C018905p) aUListenerS102S0200000_13.l0;
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((ViewGroup.MarginLayoutParams) c018905p).topMargin = ((Integer) animatedValue).intValue();
        ((U8H) aUListenerS102S0200000_13.l1).LJIIJJI.requestLayout();
        ((U8H) aUListenerS102S0200000_13.l1).getClass();
        String LJJJ = U8H.LJJJ(1394);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((U8H) aUListenerS102S0200000_13.l1).LJJIJ());
        LIZ.append(":updateContainerOffsetY:");
        Object animatedValue2 = animation.getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        LIZ.append(((Integer) animatedValue2).intValue());
        C32014ChO.LIZ(LJJJ, X1D.LIZIZ(LIZ));
    }

    public static final void onAnimationUpdate$13(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintProperty constraintProperty = ((C77044ULo) aUListenerS102S0200000_13.l0).LJLILLLLZI;
        if (constraintProperty != null) {
            Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            constraintProperty.margin(3, ((Integer) animatedValue).intValue());
            constraintProperty.apply();
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l0).getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((View) aUListenerS102S0200000_13.l1).setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$15(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS102S0200000_13.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS102S0200000_13.l0).setScaleY(floatValue);
        ((U21) aUListenerS102S0200000_13.l1).LJLIL.setScaleX(floatValue);
        ((U21) aUListenerS102S0200000_13.l1).LJLIL.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$16(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS102S0200000_13.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS102S0200000_13.l0).setScaleY(floatValue);
        ((U21) aUListenerS102S0200000_13.l1).LJLIL.setScaleX(floatValue);
        ((U21) aUListenerS102S0200000_13.l1).LJLIL.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$17(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((U21) aUListenerS102S0200000_13.l0).LJLIL.setScaleX(floatValue);
        ((U21) aUListenerS102S0200000_13.l0).LJLIL.setScaleY(floatValue);
        ((C56414MCc) aUListenerS102S0200000_13.l1).setScaleX(floatValue);
        ((C56414MCc) aUListenerS102S0200000_13.l1).setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$18(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "ani", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ((C56414MCc) aUListenerS102S0200000_13.l0).setScaleX(floatValue);
        ((C56414MCc) aUListenerS102S0200000_13.l0).setScaleY(floatValue);
        ((U21) aUListenerS102S0200000_13.l1).LJLIL.setScaleX(floatValue);
        ((U21) aUListenerS102S0200000_13.l1).LJLIL.setScaleY(floatValue);
    }

    public static final void onAnimationUpdate$2(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ConstraintLayout constraintLayout = ((InteractionTitleLayout) aUListenerS102S0200000_13.l0).LJZI;
        if (constraintLayout != null) {
            Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            constraintLayout.setScaleX(((Float) animatedValue).floatValue());
            ConstraintLayout constraintLayout2 = ((InteractionTitleLayout) aUListenerS102S0200000_13.l0).LJZI;
            if (constraintLayout2 != null) {
                Object animatedValue2 = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                constraintLayout2.setScaleY(((Float) animatedValue2).floatValue());
                return;
            }
            o.LJIJI("linkMicLayout");
            throw null;
        }
        o.LJIJI("linkMicLayout");
        throw null;
    }

    public static final void onAnimationUpdate$3(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View LIZ = ((C76414Tys) aUListenerS102S0200000_13.l0).LIZ(R.id.fjd);
        Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        LIZ.setScaleX(((Float) animatedValue).floatValue());
        View LIZ2 = ((C76414Tys) aUListenerS102S0200000_13.l0).LIZ(R.id.fjd);
        Object animatedValue2 = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        LIZ2.setScaleY(((Float) animatedValue2).floatValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View LIZ = ((C76414Tys) aUListenerS102S0200000_13.l0).LIZ(R.id.fjd);
        Object animatedValue = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        LIZ.setScaleX(((Float) animatedValue).floatValue());
        View LIZ2 = ((C76414Tys) aUListenerS102S0200000_13.l0).LIZ(R.id.fjd);
        Object animatedValue2 = ((ValueAnimator) aUListenerS102S0200000_13.l1).getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        LIZ2.setScaleY(((Float) animatedValue2).floatValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS102S0200000_13.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        View view = ((WW1) aUListenerS102S0200000_13.l1).LJLJL;
        if (view != null) {
            view.setLayoutParams((ViewGroup.LayoutParams) aUListenerS102S0200000_13.l0);
        } else {
            o.LJIJI("rootSlideSlipContainer");
            throw null;
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if ((it.getAnimatedValue() instanceof Integer) && ((C76805UCj) aUListenerS102S0200000_13.l0).LJLIL) {
            ViewGroup viewGroup = ((C76810UCo) aUListenerS102S0200000_13.l1).LIZLLL;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            C78866UxK.LJJLJ(((Integer) animatedValue).intValue(), viewGroup);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if ((it.getAnimatedValue() instanceof Integer) && ((C76805UCj) aUListenerS102S0200000_13.l0).LJLIL) {
            ProgressBar progressBar = (ProgressBar) aUListenerS102S0200000_13.l1;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            progressBar.setProgress(((Integer) animatedValue).intValue());
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if ((it.getAnimatedValue() instanceof Integer) && ((MatchSpeedChallengeAssem) aUListenerS102S0200000_13.l0).LJLL) {
            ViewGroup viewGroup = ((C76811UCp) aUListenerS102S0200000_13.l1).LIZJ;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            C78866UxK.LJJLJ(((Integer) animatedValue).intValue(), viewGroup);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS102S0200000_13 aUListenerS102S0200000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if ((it.getAnimatedValue() instanceof Integer) && ((MatchSpeedChallengeAssem) aUListenerS102S0200000_13.l0).LJLL) {
            ViewGroup viewGroup = ((C76813UCr) aUListenerS102S0200000_13.l1).LIZJ;
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            C78866UxK.LJJLJ(((Integer) animatedValue).intValue(), viewGroup);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS102S0200000_13(X.U21 r2, X.C56414MCc r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 15: goto Le;
                case 16: goto Le;
                case 17: goto L5;
                case 18: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS102S0200000_13.<init>(X.U21, X.MCc, int):void");
    }

    public AUListenerS102S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
