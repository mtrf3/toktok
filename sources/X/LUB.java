package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* loaded from: classes10.dex */
public final class LUB extends AbstractC72439Sbr {
    public final /* synthetic */ LUG LJLIL;

    public LUB(LUG lug) {
        this.LJLIL = lug;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLIL.LJ = false;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        AnimatorSet animatorSet;
        this.LJLIL.LJ();
        LUG lug = this.LJLIL;
        SmartImageView smartImageView = lug.LIZIZ;
        View view2 = lug.LIZJ;
        if (smartImageView == null || view2 == null) {
            animatorSet = null;
        } else {
            ObjectAnimator LIZJ = LUG.LIZJ(smartImageView);
            ObjectAnimator LIZIZ = LUG.LIZIZ(view2);
            animatorSet = new AnimatorSet();
            animatorSet.play(LIZJ).after(LIZIZ);
        }
        lug.LIZLLL = animatorSet;
        Animator animator = this.LJLIL.LIZLLL;
        if (animator != null) {
            animator.start();
        }
    }
}
