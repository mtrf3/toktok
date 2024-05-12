package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.741, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass741 extends KL7 {
    public final float LJLIL = 0.75f;
    public final long LJLILLLLZI = 150;

    public abstract void LIZLLL(View view);

    @Override // X.KL7
    public final Animator LIZ(View view) {
        o.LJIIIZ(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, this.LJLIL);
        ofFloat.setDuration(this.LJLILLLLZI);
        return ofFloat;
    }

    @Override // X.KL7
    public final Animator LIZJ(View view) {
        o.LJIIIZ(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", this.LJLIL, 1.0f);
        ofFloat.setDuration(this.LJLILLLLZI);
        return ofFloat;
    }

    @Override // X.KL7
    public final void LIZIZ(MotionEvent event, View view) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(event, "event");
        LIZLLL(view);
    }
}
