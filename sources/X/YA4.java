package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YA4 extends C77575UcV {
    public final /* synthetic */ YA9 LJLIL;

    public YA4(YA9 ya9) {
        this.LJLIL = ya9;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        YA9 ya9 = this.LJLIL;
        if (ya9 instanceof YA7) {
            ((YA7) ya9).LJJJJ();
        }
    }
}
