package X;

import Y.ALAdapterS1S0200000_2;
import Y.AUListenerS90S0100000_1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.61C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61C {
    public final ViewGroup LIZ;
    public final List<View> LIZIZ;
    public final Activity LIZJ;
    public View LIZLLL;
    public LinearLayout LJ;
    public View LJFF;
    public int LJII;
    public final long LJI = 250;
    public boolean LJIIIIZZ = true;

    public final void LIZIZ() {
        LinearLayout linearLayout;
        if (!this.LJIIIIZZ && (linearLayout = this.LJ) != null) {
            View view = this.LJFF;
            if (view != null) {
                view.setRotation(0.0f);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.LJII, 0);
            ofInt.setDuration(this.LJI);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(linearLayout, 2));
            ofInt.addListener(new ALAdapterS1S0200000_2(this, linearLayout, 1));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f);
            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, this.LJI);
            LIZLLL.playTogether(ofInt, ofFloat);
            LIZLLL.start();
        }
    }

    public final void LIZJ() {
        LinearLayout linearLayout;
        if (this.LJIIIIZZ && (linearLayout = this.LJ) != null) {
            View view = this.LJFF;
            if (view != null) {
                view.setRotation(180.0f);
            }
            linearLayout.measure(0, 0);
            int measuredHeight = linearLayout.getMeasuredHeight();
            this.LJII = measuredHeight;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
            ofInt.setDuration(this.LJI);
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(linearLayout, 2));
            ofInt.addListener(new ALAdapterS1S0200000_2(this, linearLayout, 2));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 0.0f, 1.0f);
            AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, this.LJI);
            LIZLLL.playTogether(ofInt, ofFloat);
            LIZLLL.start();
        }
    }

    public final void LIZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) KL2.LIZJ(this.LIZJ, 12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C61C(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        this.LIZ = viewGroup;
        this.LIZIZ = list;
        this.LIZJ = activity;
    }
}
