package X;

import Y.ACListenerS44S0200000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LB6 {
    public final ValueAnimator LIZ;
    public final ValueAnimator LIZIZ;
    public final FrameLayout LIZJ;
    public final ConstraintLayout LIZLLL;
    public final FrameLayout LJ;

    public LB6(View view, C77953Uib c77953Uib) {
        FrameLayout frameLayout;
        float LIZ = C15380j0.LIZ(78.0f);
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.auz);
        } else {
            frameLayout = null;
        }
        this.LIZJ = frameLayout;
        ConstraintLayout constraintLayout = view != null ? (ConstraintLayout) view.findViewById(R.id.aut) : null;
        this.LIZLLL = constraintLayout;
        if (constraintLayout != null) {
            this.LJ = (FrameLayout) constraintLayout.findViewById(R.id.aus);
        }
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS44S0200000_9(c77953Uib, this, 51));
        }
        float f = -LIZ;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(-translationY, 0f)");
        this.LIZ = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 78));
        ofFloat.addListener(new LB7(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(0f, -translationY)");
        this.LIZIZ = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(150L);
        ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(this, 79));
        ofFloat2.addListener(new LB8(this));
    }
}
