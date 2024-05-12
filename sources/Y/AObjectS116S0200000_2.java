package Y;

import X.C148725sa;
import X.C159286My;
import X.C60M;
import X.C76800UCe;
import X.InterfaceC29911Fj;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.SJI;
import X.WHL;
import android.app.Activity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObjectS116S0200000_2 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS116S0200000_2 aObjectS116S0200000_2, Object obj) {
        C159286My c159286My;
        Activity activity;
        C60M c60m = (C60M) obj;
        if (c60m == null || (activity = (c159286My = (C159286My) aObjectS116S0200000_2.l0).mActivity) == null) {
            return;
        }
        View view = (View) aObjectS116S0200000_2.l1;
        boolean z = c60m.LIZIZ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c60m.LIZJ;
        TuxTextView tuxTextView = c159286My.LJZL;
        if (tuxTextView != null) {
            C148725sa.LIZ(activity, view, z, interfaceC65784Pro, tuxTextView, WHL.TOP);
        } else {
            o.LJIJI("editorProBtn");
            throw null;
        }
    }

    public static final void onChanged$1(AObjectS116S0200000_2 aObjectS116S0200000_2, Object obj) {
        float f;
        float f2;
        long j;
        float f3;
        final OSZ osz = (OSZ) obj;
        if (osz == null) {
            return;
        }
        boolean booleanValue = ((Boolean) osz.getFirst()).booleanValue();
        ((C159286My) aObjectS116S0200000_2.l0).LLFFF = booleanValue;
        Animation animation = ((View) aObjectS116S0200000_2.l1).getAnimation();
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        Animation animation2 = ((View) aObjectS116S0200000_2.l1).getAnimation();
        if (animation2 != null) {
            animation2.cancel();
        }
        ((View) aObjectS116S0200000_2.l1).clearAnimation();
        float f4 = 0.0f;
        if (booleanValue) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (booleanValue) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
        translateAnimation.setInterpolator(new SJI());
        if (booleanValue) {
            j = 0;
        } else {
            j = 250;
        }
        translateAnimation.setDuration(j);
        if (booleanValue) {
            f3 = 0.0f;
            f4 = 1.0f;
        } else {
            f3 = 1.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(250L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        final View view = (View) aObjectS116S0200000_2.l1;
        final C159286My c159286My = (C159286My) aObjectS116S0200000_2.l0;
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: X.6N2
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation3) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation3) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation3) {
                osz.getSecond().invoke();
                view.clearAnimation();
                c159286My.LLFFF = true;
            }
        });
        ((View) aObjectS116S0200000_2.l1).startAnimation(animationSet);
    }

    public AObjectS116S0200000_2(C159286My c159286My, View view, int i) {
        this.$t = i;
        this.l0 = c159286My;
        this.l1 = view;
    }
}
