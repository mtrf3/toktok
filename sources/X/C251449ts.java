package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.9ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251449ts extends C251319tf {
    public final /* synthetic */ C251389tm LJLIL;

    public C251449ts(C251389tm c251389tm) {
        this.LJLIL = c251389tm;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LIZLLL.postDelayed(new ARunnableS40S0100000_4(this, 121), 3000L);
    }
}
