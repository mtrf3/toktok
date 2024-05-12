package X;

import Y.AUListenerS92S0100000_3;
import Y.AUListenerS97S0200000_5;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Nf0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59894Nf0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final View view) {
        if (view == null) {
            return;
        }
        final float alpha = view.getAlpha();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.2QK
            public final /* synthetic */ float LJLILLLLZI = 0.75f;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent event) {
                o.LJIIIZ(event, "event");
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    view.animate().alpha(alpha).setDuration(150L).start();
                    return false;
                }
                view.animate().alpha(this.LJLILLLLZI).setDuration(150L).start();
                return false;
            }
        });
    }

    public static ValueAnimator LIZIZ(View view, int i, int i2, int i3) {
        o.LJIIIZ(view, "view");
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AUListenerS92S0100000_3(view, 35));
        ofInt.setDuration(i3);
        ofInt.setTarget(view);
        return ofInt;
    }

    public static void LIZJ(View view, Drawable drawable, int i, int i2, long j) {
        if (i == i2) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        Drawable mutate = C07840Sm.LJFF(drawable).mutate();
        o.LJIIIIZZ(mutate, "wrap(drawable).mutate()");
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(i2);
        }
        ofObject.addUpdateListener(new AUListenerS97S0200000_5(view, mutate, 18));
        ofObject.setDuration(j);
        ofObject.start();
    }
}
