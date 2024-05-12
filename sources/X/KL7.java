package X;

import Y.ALAdapterS4S0300000_8;
import Y.ALAdapterS6S0200000_8;
import android.animation.Animator;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes9.dex */
public abstract class KL7 implements View.OnTouchListener {
    public abstract Animator LIZ(View view);

    public abstract void LIZIZ(MotionEvent motionEvent, View view);

    public abstract Animator LIZJ(View view);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator LIZ = LIZ(view);
            LIZ.addListener(new ALAdapterS6S0200000_8(this, view, motionEvent, 2));
            LIZ.start();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            Animator LIZJ = LIZJ(view);
            LIZJ.addListener(new ALAdapterS4S0300000_8(view, motionEvent, this, 2));
            LIZJ.start();
            return true;
        }
        if (motionEvent.getAction() == 3) {
            LIZJ(view).start();
        }
        return false;
    }
}
