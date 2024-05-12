package X;

import Y.IDAListenerS77S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.tabicon.VSABaseTabIconAnim;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55952Lxc extends VSABaseTabIconAnim {
    @Override // X.AbstractC55918Lx4
    public final void LJ(View view, View view2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C55953Lxd.LIZJ());
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(C55953Lxd.LJIIJJI());
        animatorSet2.setDuration(350L);
        animatorSet2.setStartDelay(150L);
        animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5);
        animatorSet2.addListener(new IDAListenerS77S0100000_9(view2, 32));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(animatorSet, animatorSet2);
        animatorSet3.addListener(new IDAListenerS77S0100000_9(this, 34));
        animatorSet3.addListener(new IDAListenerS77S0100000_9(this, 33));
        this.LIZIZ = animatorSet3;
        animatorSet3.start();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "originIconView.context");
        LJFF(context);
    }
}
