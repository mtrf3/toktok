package X;

import Y.ACListenerS21S0100000_1;
import Y.ARunnableS7S0110000_1;
import Y.IDAListenerS70S0100000_1;
import Y.IDTListenerS111S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4EU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EU extends FrameLayout {
    public final View LJLIL;
    public Animator LJLILLLLZI;
    public InterfaceC88472Yns<? super C4EN, C76800UCe> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public AnimatorSet LJLJJLL;
    public AnimatorSet LJLJL;
    public C4E2 LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final Typeface getSemiBoldTypeFace() {
        T5S t5s = new T5S();
        t5s.LIZ(22);
        return t5s.getTypeface();
    }

    public final void LIZIZ() {
        boolean z;
        Animator animator = this.LJLILLLLZI;
        if (animator != null && animator.isRunning()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Animator animator2 = this.LJLILLLLZI;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = this.LJLILLLLZI;
            if (animator3 != null) {
                C16880lQ.LJLJJI(animator3);
            }
            this.LJLILLLLZI = null;
        }
        AnimatorSet animatorSet = this.LJLJJLL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLJJLL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.LJLJJLL;
            if (animatorSet3 != null) {
                C16880lQ.LJLJJL(animatorSet3);
            }
            this.LJLJJLL = null;
        }
        AnimatorSet animatorSet4 = this.LJLJL;
        if (animatorSet4 != null && animatorSet4.isRunning()) {
            AnimatorSet animatorSet5 = this.LJLJL;
            if (animatorSet5 != null) {
                animatorSet5.cancel();
            }
            AnimatorSet animatorSet6 = this.LJLJL;
            if (animatorSet6 != null) {
                C16880lQ.LJLJJL(animatorSet6);
            }
            this.LJLJL = null;
        }
        if (((C29701Eo) LIZ(R.id.k9u)).isAnimating()) {
            ((C29701Eo) LIZ(R.id.k9u)).cancelAnimation();
        }
        if (((C29701Eo) LIZ(R.id.k9t)).isAnimating()) {
            ((C29701Eo) LIZ(R.id.k9t)).cancelAnimation();
        }
    }

    public final void LIZJ() {
        this.LJLJLJ = C4E2.LOW_VOLUME;
        LIZ(R.id.k9u).setScaleX(1.0f);
        LIZ(R.id.k9u).setScaleY(1.0f);
        LIZ(R.id.k9u).setAlpha(1.0f);
        ((ImageView) LIZ(R.id.k9u)).setVisibility(0);
        ((ImageView) LIZ(R.id.k9t)).setVisibility(8);
        ((C29701Eo) LIZ(R.id.k9u)).playAnimation();
    }

    public final InterfaceC65784Pro<C76800UCe> getOnClickListeningSpeechBtn() {
        return this.LJLJJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnClickWaitingSpeechBtn() {
        return this.LJLJJI;
    }

    public final InterfaceC88472Yns<C4EN, C76800UCe> getOnDismissCallback() {
        return this.LJLJI;
    }

    public final void LIZLLL(C4E2 status) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        o.LJIIIZ(status, "status");
        int i = C4EI.LIZIZ[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C4E2 c4e2 = this.LJLJLJ;
            C4E2 c4e22 = C4E2.HIGH_VOLUME;
            if (c4e2 == c4e22) {
                return;
            }
            this.LJLJLJ = c4e22;
            AnimatorSet animatorSet3 = this.LJLJJLL;
            if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = this.LJLJJLL) != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet4 = this.LJLJL;
            if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = this.LJLJL) != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.k9u), "scaleX", LIZ(R.id.k9u).getScaleX(), 0.3f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LIZ(R.id.k9u), "scaleY", LIZ(R.id.k9u).getScaleY(), 0.3f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LIZ(R.id.k9u), "alpha", LIZ(R.id.k9u).getAlpha(), 0.0f);
            animatorSet5.play(ofFloat).with(ofFloat2).with(ofFloat3);
            ofFloat.setInterpolator(C55953Lxd.LJI());
            ofFloat2.setInterpolator(C55953Lxd.LJI());
            ofFloat3.setInterpolator(new LinearInterpolator());
            animatorSet5.setDuration(200L);
            animatorSet5.addListener(new IDAListenerS70S0100000_1(this, 11));
            this.LJLJJLL = animatorSet5;
            AnimatorSet animatorSet6 = new AnimatorSet();
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LIZ(R.id.k9t), "alpha", 0.0f, 1.0f);
            ofFloat4.setInterpolator(new LinearInterpolator());
            animatorSet6.setDuration(200L);
            animatorSet6.play(ofFloat4);
            animatorSet6.addListener(new IDAListenerS70S0100000_1(this, 12));
            this.LJLJL = animatorSet6;
            AnimatorSet animatorSet7 = this.LJLJJLL;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            AnimatorSet animatorSet8 = this.LJLJL;
            if (animatorSet8 == null) {
                return;
            }
            animatorSet8.start();
            return;
        }
        if (this.LJLJLJ == C4E2.LOW_VOLUME) {
            return;
        }
        LIZJ();
    }

    public final void setOnClickListeningSpeechBtn(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJL = interfaceC65784Pro;
    }

    public final void setOnClickWaitingSpeechBtn(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJI = interfaceC65784Pro;
    }

    public final void setOnDismissCallback(InterfaceC88472Yns<? super C4EN, C76800UCe> interfaceC88472Yns) {
        this.LJLJI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4EU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLLL = C62850Ola.LJFF(context, "context");
        this.LJLIL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.b8t, this, true);
        this.LJLJLJ = C4E2.LOW_VOLUME;
        ((TuxTextView) LIZ(R.id.k9w)).LJJIZ(17.0f, 24, getSemiBoldTypeFace(), 0.0f);
        LIZ(R.id.k9v).setClickable(true);
        setOnTouchListener(new IDTListenerS111S0100000_1(this, 5));
        View LIZ = LIZ(R.id.k9v);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(C49R.LIZ.LIZLLL);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        LIZ.setBackground(c110614Vt.LIZ(context2));
        C29701Eo c29701Eo = (C29701Eo) LIZ(R.id.k9u);
        c29701Eo.setAnimation("im_speech_input_waiting.json");
        c29701Eo.setRepeatCount(-1);
        c29701Eo.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 163)));
        C29701Eo c29701Eo2 = (C29701Eo) LIZ(R.id.k9t);
        c29701Eo2.setAnimation("im_speech_input_listening.json");
        c29701Eo2.setRepeatCount(-1);
        c29701Eo2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 164)));
        C16880lQ.LJIILJJIL((FrameLayout) LIZ(R.id.k9s), new ACListenerS21S0100000_1(this, 165));
    }

    public final void LJ(C4EJ status, CharSequence text) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(text, "text");
        int i = C4EI.LIZ[status.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                LIZLLL(C4E2.HIGH_VOLUME);
                ((TuxTextView) LIZ(R.id.k9w)).setTextColorRes(R.attr.go);
            }
        } else {
            LIZLLL(C4E2.LOW_VOLUME);
            ((TuxTextView) LIZ(R.id.k9w)).setTextColorRes(R.attr.gx);
        }
        if (LIZ(R.id.k9w).getMeasuredHeight() - LIZ(R.id.jcz).getHeight() != LIZ(R.id.jcz).getScrollY()) {
            z = false;
        }
        ((TextView) LIZ(R.id.k9w)).setText(text);
        LIZ(R.id.jcz).post(new ARunnableS7S0110000_1(this, z, 2));
    }
}
