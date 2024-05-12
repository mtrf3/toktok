package X;

import Y.ARunnableS45S0100000_9;
import android.transition.Transition;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Los, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55410Los extends C55422Lp4 {
    public final /* synthetic */ MallRacunActivity LIZ;

    public C55410Los(MallRacunActivity mallRacunActivity) {
        this.LIZ = mallRacunActivity;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator withEndAction;
        ViewPropertyAnimator duration;
        o.LJIIIZ(transition, "transition");
        MallRacunActivity mallRacunActivity = this.LIZ;
        if (!mallRacunActivity.LJLJL) {
            mallRacunActivity.LJLJL = true;
            FrameLayout frameLayout = mallRacunActivity.LJLJI;
            if (frameLayout != null && (animate = frameLayout.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (withEndAction = alpha.withEndAction(new ARunnableS45S0100000_9(mallRacunActivity, 256))) != null && (duration = withEndAction.setDuration(50L)) != null) {
                duration.start();
            }
        }
    }
}
