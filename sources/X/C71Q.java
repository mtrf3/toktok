package X;

import Y.AUListenerS95S0200000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.71Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C71Q {
    public final View LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public AnimatorSet LJ;

    public final FrameLayout LIZ() {
        return (FrameLayout) this.LIZIZ.getValue();
    }

    public C71Q(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZIZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1577));
        this.LIZJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1579));
        this.LIZLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1578));
    }

    public final void LIZIZ(boolean z, boolean z2) {
        float LJIIZILJ;
        ValueAnimator ofInt;
        ViewGroup.LayoutParams layoutParams = ((View) this.LIZJ.getValue()).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z2) {
            if (z) {
                ofInt = ValueAnimator.ofInt(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)));
                o.LJIIIIZZ(ofInt, "{\n                ValueA….dp, 52.dp)\n            }");
            } else {
                ofInt = ValueAnimator.ofInt(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                o.LJIIIIZZ(ofInt, "{\n                ValueA….dp, 12.dp)\n            }");
            }
            ofInt.addUpdateListener(new AUListenerS95S0200000_3(marginLayoutParams, this, 8));
            ofInt.setDuration(200L).start();
            return;
        }
        marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        if (z) {
            LJIIZILJ = C32151Nz.LJIIZILJ(52);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(12);
        }
        marginLayoutParams.setMarginEnd(O6R.LJJIIZ(LJIIZILJ));
        ((View) this.LIZJ.getValue()).setLayoutParams(marginLayoutParams);
    }

    public final void LIZJ(boolean z, boolean z2) {
        if (z) {
            AnimatorSet animatorSet = this.LJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LIZ().setVisibility(0);
            LIZIZ(true, z2);
            if (z2) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(LIZ(), (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(250L);
                o.LJIIIIZZ(duration, "ofFloat(btnSendComment, …       .setDuration(250L)");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(LIZ(), (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(250L);
                o.LJIIIIZZ(duration2, "ofFloat(btnSendComment, …       .setDuration(250L)");
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.LJ = animatorSet2;
                animatorSet2.addListener(new IDAListenerS72S0100000_3(this, 44));
                animatorSet2.setInterpolator(new Interpolator() { // from class: X.71R
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        if (f == 0.0f) {
                            return 0.0f;
                        }
                        return f <= 0.72f ? 1.14f * (f / 0.72f) : f <= 0.88f ? (((0.88f - f) / 0.16f) * 0.20999998f) + 0.93f : 1.0f - (((1.0f - f) / 0.12f) * 0.06999999f);
                    }
                });
                animatorSet2.playTogether(duration, duration2);
                animatorSet2.start();
            }
            ((TextView) this.LIZLLL.getValue()).setHint("");
            ((TextView) this.LIZLLL.getValue()).setMaxLines(4);
            return;
        }
        LIZ().setVisibility(8);
        LIZIZ(false, z2);
        ((TextView) this.LIZLLL.getValue()).setMaxLines(1);
        ((EditText) this.LIZLLL.getValue()).setEllipsize(TextUtils.TruncateAt.END);
    }
}
