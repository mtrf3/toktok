package X;

import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bld, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29729Bld extends C78983UzD {
    public final /* synthetic */ C29727Blb LJZL;

    public C29729Bld(C29727Blb c29727Blb) {
        this.LJZL = c29727Blb;
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        if (this.LJZL.LIZLLL()) {
            C29727Blb c29727Blb = this.LJZL;
            if (c29727Blb.LJJIIZI) {
                KL2.LJIILLIIL(8, c29727Blb.LJII);
                this.LJZL.LIZ(EnumC29732Blg.FOLLOWED);
                return;
            }
            if (c29727Blb.LJIIJ()) {
                KL2.LJIILLIIL(8, this.LJZL.LJII);
                this.LJZL.LIZ(EnumC29732Blg.FANS_CLUB_JOINED);
                return;
            }
            C29727Blb c29727Blb2 = this.LJZL;
            if (c29727Blb2.LIZIZ == null || c29727Blb2.LJIIL != EnumC29732Blg.FOLLOW_ANIM || c29727Blb2.LJJIIZ == null) {
                return;
            }
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(300L);
            TransitionManager.beginDelayedTransition((ViewGroup) c29727Blb2.LIZIZ, changeBounds);
            KL2.LJIILLIIL(0, c29727Blb2.LJJIII);
            c29727Blb2.LJJIIZ.LJFF();
            View LJIIIZ = c29727Blb2.LJJIIZ.LJIIIZ();
            View LJI = c29727Blb2.LJJIIZ.LJI();
            ValueAnimator ofInt = ValueAnimator.ofInt(c29727Blb2.LJIL.getResources().getColor(R.color.a09), -1);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new AUListenerS94S0100000_5(c29727Blb2, 2));
            ofInt.addListener(new ALAdapterS4S0100000_5(c29727Blb2, 13));
            ObjectAnimator duration = ObjectAnimator.ofFloat(c29727Blb2.LJII, (Property<C2A4, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
            duration.addListener(new ALAdapterS4S0100000_5(c29727Blb2, 14));
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(LJIIIZ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
            duration2.addListener(new ALAdapterS4S0100000_5(LJIIIZ, 0));
            duration2.setStartDelay(300L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(LJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
            duration3.addListener(new ALAdapterS4S0200000_5(c29727Blb2, LJI, 2));
            duration3.setStartDelay(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            c29727Blb2.LJIJJ = animatorSet;
            animatorSet.playTogether(ofInt, duration, duration2, duration3);
            c29727Blb2.LJIJJ.start();
            return;
        }
        if (this.LJZL.LJIILIIL()) {
            KL2.LJIILLIIL(8, this.LJZL.LJII);
            this.LJZL.LIZ(EnumC29732Blg.SUBSCRIBED);
            return;
        }
        KL2.LJIILLIIL(8, this.LJZL.LJII);
        final C29727Blb c29727Blb3 = this.LJZL;
        if (c29727Blb3.LJIIL != EnumC29732Blg.FOLLOW_ANIM) {
            return;
        }
        final GradientDrawable gradientDrawable = (GradientDrawable) c29727Blb3.LIZLLL.getBackground();
        final int measuredWidth = c29727Blb3.LIZLLL.getMeasuredWidth();
        final int measuredHeight = c29727Blb3.LIZLLL.getMeasuredHeight();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        c29727Blb3.LJIJI = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.Ble
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C29727Blb c29727Blb4 = C29727Blb.this;
                int i = measuredWidth;
                int i2 = measuredHeight;
                GradientDrawable gradientDrawable2 = gradientDrawable;
                c29727Blb4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ViewGroup.LayoutParams layoutParams = c29727Blb4.LIZLLL.getLayoutParams();
                int i3 = (int) (floatValue * i);
                layoutParams.width = i3;
                if (i3 <= i2) {
                    layoutParams.height = i3;
                    if (gradientDrawable2 != null) {
                        gradientDrawable2.setCornerRadius(i3 >> 1);
                    }
                }
                c29727Blb4.LIZLLL.setLayoutParams(layoutParams);
            }
        });
        c29727Blb3.LJIJI.addListener(new ALAdapterS4S0200000_5(c29727Blb3, gradientDrawable, 3));
        c29727Blb3.LJIJI.setDuration(200L);
        c29727Blb3.LJIJI.start();
    }
}
