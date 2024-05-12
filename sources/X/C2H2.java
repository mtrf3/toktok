package X;

import Y.IDAListenerS69S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.2H2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H2 extends C45101pq {
    public final int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public Animator LJLLILLLL;
    public boolean LJLLJ;
    public Boolean LJLLL;
    public final View LJLLLL;
    public final View LJLLLLLL;
    public final View LJLZ;

    public final void LLLZI() {
        int LIZIZ;
        int LIZIZ2;
        Boolean bool = this.LJLLL;
        if (bool == null || o.LJ(bool, Boolean.FALSE)) {
            return;
        }
        int i = this.LJLJLJ;
        if (this.LJLJLLL == 1) {
            int i2 = this.LJLL;
            LIZIZ = -i2;
            LIZIZ2 = (-i) - i2;
            View view = this.LJLJJI;
            if (view != null) {
                view.setRotationY(0.0f);
            }
        } else {
            LIZIZ = (C22970vF.LIZIZ() - i) - this.LJLL;
            LIZIZ2 = this.LJLL + C22970vF.LIZIZ() + i;
            View view2 = this.LJLJJI;
            if (view2 != null) {
                view2.setRotationY(180.0f);
            }
        }
        LLLZIL(LIZIZ, LIZIZ2, false);
    }

    public final void LLLZ(int i) {
        int LIZIZ;
        int LIZIZ2;
        this.LJLJLLL = i;
        int i2 = this.LJLJLJ;
        if (i == 1) {
            int i3 = this.LJLL;
            LIZIZ = (-i2) - i3;
            LIZIZ2 = -i3;
            View view = this.LJLJJI;
            if (view != null) {
                view.setRotationY(0.0f);
            }
        } else {
            LIZIZ = C22970vF.LIZIZ() + i2 + this.LJLL;
            LIZIZ2 = (C22970vF.LIZIZ() - i2) - this.LJLL;
            View view2 = this.LJLJJI;
            if (view2 != null) {
                view2.setRotationY(180.0f);
            }
        }
        LLLZIL(LIZIZ, LIZIZ2, true);
    }

    public C2H2(Context context, View view) {
        super(context);
        View ivBg;
        int LIZ = C15380j0.LIZ(28.0f);
        this.LJLJLJ = LIZ;
        int i = -LIZ;
        boolean isExperimentGroup = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();
        this.LJLJLLL = 1;
        this.LJLLI = C87277YNd.LJIIJJI(2);
        View findViewById = view.findViewById(R.id.f3k);
        this.LJLLLL = findViewById;
        View findViewById2 = view.findViewById(R.id.f3l);
        this.LJLLLLLL = findViewById2;
        if (isExperimentGroup) {
            ivBg = findViewById2;
        } else {
            ivBg = findViewById;
        }
        this.LJLZ = ivBg;
        findViewById.getLayoutParams().height = LIZ;
        findViewById.getLayoutParams().width = LIZ;
        findViewById2.getLayoutParams().height = LIZ;
        findViewById2.getLayoutParams().width = LIZ;
        this.LJLJJI = view;
        LLLLZIL(LIZ, LIZ);
        LLLLZ(i, LIZ);
        this.LJLJI.flags = 262696;
        init();
        o.LJIIIIZZ(ivBg, "ivBg");
        C87277YNd.LJJIJ(ivBg);
        ivBg.setAlpha(0.0f);
    }

    public final void LLLZIL(int i, int i2, boolean z) {
        ValueAnimator ofFloat;
        if (this.LJLLJ) {
            if (o.LJ(this.LJLLL, Boolean.valueOf(z))) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Same isSlidingIn = ");
                LIZ.append(z);
                LIZ.append(", returning...");
                C0NB.LIZIZ("TrayView", X1D.LIZIZ(LIZ));
                return;
            }
            Animator animator = this.LJLLILLLL;
            if (animator != null) {
                animator.cancel();
            }
            C0NB.LIZIZ("TrayView", "isSlidingIn changed, animator are canceled.");
        }
        this.LJLLL = Boolean.valueOf(z);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("New isSlidingIn = ");
        LIZ2.append(z);
        LIZ2.append(", animator are created.");
        C0NB.LIZIZ("TrayView", X1D.LIZIZ(LIZ2));
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new IDUListenerS263S0100000(this, 46));
        ofInt.addListener(new IDAListenerS69S0100000(this, 16));
        if (z) {
            ofFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(1.0f, 0.0f);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 47));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
        this.LJLLILLLL = animatorSet;
    }
}
