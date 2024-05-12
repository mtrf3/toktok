package X;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VvE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnTouchListenerC81284VvE implements View.OnTouchListener {
    public final /* synthetic */ C81282VvC LJLIL;
    public final /* synthetic */ LinearLayout LJLILLLLZI;

    public ViewOnTouchListenerC81284VvE(C81282VvC c81282VvC, LinearLayout linearLayout) {
        this.LJLIL = c81282VvC;
        this.LJLILLLLZI = linearLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        o.LJIIIIZZ(event, "event");
        if (event.getAction() == 1) {
            ObjectAnimator animator = ObjectAnimator.ofInt(this.LJLILLLLZI, "backgroundColor", this.LJLIL.LJLJJI, 16777215);
            o.LJIIIIZZ(animator, "animator");
            animator.setDuration(500L);
            animator.setEvaluator(new ArgbEvaluator());
            animator.start();
        }
        return false;
    }
}
