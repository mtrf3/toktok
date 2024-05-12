package X;

import Y.AUListenerS92S0100000_3;
import Y.AUListenerS97S0200000_5;
import Y.IDAListenerS78S0100000_10;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public final class KP0 {
    public static void LIZ(final View view) {
        if (view == null) {
            return;
        }
        final float alpha = view.getAlpha();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.2QM
            public final /* synthetic */ float LJLILLLLZI = 0.75f;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                View view3 = view;
                float f = this.LJLILLLLZI;
                float f2 = alpha;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    view3.animate().alpha(f2).setDuration(150L).start();
                    return false;
                }
                view3.animate().alpha(f).setDuration(150L).start();
                return false;
            }
        });
    }

    public static ValueAnimator LIZIZ(View view, int i, int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AUListenerS92S0100000_3(view, 22));
        ofInt.setDuration(i3);
        ofInt.setTarget(view);
        return ofInt;
    }

    public static void LIZJ(View view, Drawable drawable, int i, int i2, long j, IDAListenerS78S0100000_10 iDAListenerS78S0100000_10) {
        if (i == i2) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        Drawable mutate = C07840Sm.LJFF(drawable).mutate();
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(i2);
        }
        ofObject.addUpdateListener(new AUListenerS97S0200000_5(view, mutate, 13));
        if (iDAListenerS78S0100000_10 != null) {
            ofObject.addListener(iDAListenerS78S0100000_10);
        }
        ofObject.setDuration(j);
        ofObject.start();
    }
}
