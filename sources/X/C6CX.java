package X;

import Y.ALAdapterS0S0310000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;

/* renamed from: X.6CX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CX {
    public final Context LIZ;
    public final long LIZIZ = 200;
    public AnimatorSet LIZJ;
    public ObjectAnimator LIZLLL;
    public ObjectAnimator LJ;

    public C6CX(Context context) {
        this.LIZ = context;
        C74275TDb.LIZIZ(context, 15.0f);
    }

    public final void LIZ(View view, C6CY c6cy) {
        AnimatorSet.Builder play;
        AnimatorSet animatorSet = this.LIZJ;
        if (animatorSet == null) {
            this.LIZJ = new AnimatorSet();
        } else {
            C16880lQ.LJLJJL(animatorSet);
            AnimatorSet animatorSet2 = this.LIZJ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
        this.LIZLLL = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        this.LJ = ObjectAnimator.ofFloat(view, "translationY", C74275TDb.LIZIZ(this.LIZ, 15.0f), 0.0f);
        AnimatorSet animatorSet3 = this.LIZJ;
        if (animatorSet3 != null && (play = animatorSet3.play(this.LIZLLL)) != null) {
            play.with(this.LJ);
        }
        AnimatorSet animatorSet4 = this.LIZJ;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(this.LIZIZ);
        }
        AnimatorSet animatorSet5 = this.LIZJ;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new ALAdapterS0S0310000_2(view, this, c6cy, 1));
        }
        AnimatorSet animatorSet6 = this.LIZJ;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }
}
