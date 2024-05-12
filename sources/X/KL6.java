package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class KL6 extends KL7 {
    public boolean LJLIL = true;

    public abstract void LIZLLL(View view);

    @Override // X.KL7
    public final Animator LIZ(View view) {
        o.LJIIIZ(view, "view");
        if (!this.LJLIL) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
            o.LJIIIIZZ(ofFloat, "ofFloat(view, \"alpha\", 1f, 1f)");
            return ofFloat;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
        ofFloat2.setDuration(150L);
        return ofFloat2;
    }

    @Override // X.KL7
    public final Animator LIZJ(View view) {
        o.LJIIIZ(view, "view");
        if (!this.LJLIL) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 1.0f);
            o.LJIIIIZZ(ofFloat, "ofFloat(view, \"alpha\", 1f, 1f)");
            return ofFloat;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
        ofFloat2.setDuration(150L);
        return ofFloat2;
    }

    @Override // X.KL7
    public final void LIZIZ(MotionEvent event, View view) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(event, "event");
        LIZLLL(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2 != 3) goto L9;
     */
    @Override // X.KL7, android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int r2 = r5.getAction()
            r1 = 1
            if (r2 == 0) goto L23
            if (r2 == r1) goto L1e
            r0 = 2
            if (r2 == r0) goto L23
            r0 = 3
            if (r2 == r0) goto L1e
        L19:
            boolean r0 = super.onTouch(r4, r5)
            return r0
        L1e:
            r0 = 0
            r4.setPressed(r0)
            goto L19
        L23:
            r4.setPressed(r1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KL6.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
