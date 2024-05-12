package X;

import Y.ARunnableS26S0300000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Xvq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnTouchListenerC86418Xvq implements View.OnTouchListener {
    public final Context LJLIL;
    public final boolean LJLILLLLZI;
    public boolean LJLJI;

    public ViewOnTouchListenerC86418Xvq(Context context, boolean z) {
        this.LJLIL = context;
        this.LJLILLLLZI = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator animate3;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                if (!this.LJLJI && view != null && (animate3 = view.animate()) != null) {
                    animate3.scaleX(0.9f);
                    animate3.scaleY(0.9f);
                    animate3.setDuration(150L);
                    animate3.withEndAction(RunnableC86419Xvr.LJLIL);
                    animate3.start();
                }
            } else if (num.intValue() == 1) {
                if (this.LJLJI) {
                    return true;
                }
                this.LJLJI = true;
                if (view != null && (animate2 = view.animate()) != null) {
                    animate2.cancel();
                    animate2.scaleX(0.9f);
                    animate2.scaleY(0.9f);
                    animate2.setDuration(O6R.LJJIJ(((float) 150) * ((view.getScaleX() - 0.9f) / 0.100000024f)));
                    animate2.withEndAction(new ARunnableS26S0300000_15(animate2, this, view, 3));
                    animate2.start();
                }
            } else if (num.intValue() == 3 && view != null && (animate = view.animate()) != null) {
                animate.cancel();
                animate.scaleX(1.0f);
                animate.scaleY(1.0f);
                animate.setDuration(150L);
                animate.withEndAction(new ARunnableS51S0100000_15(this, 82));
                animate.start();
            }
        }
        return true;
    }
}
