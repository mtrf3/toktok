package X;

import Y.ARunnableS42S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.FyV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40719FyV extends AnimatorListenerAdapter {
    public final /* synthetic */ ImageView LJLIL;
    public final /* synthetic */ ControlSloganFragment LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p0) {
        o.LJIIIZ(p0, "p0");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p0) {
        o.LJIIIZ(p0, "p0");
        ControlSloganFragment controlSloganFragment = this.LJLILLLLZI;
        controlSloganFragment.getClass();
        if (E1L.LIZ() || Build.VERSION.SDK_INT <= 28) {
            new Handler(C16880lQ.LLJJJJ()).post(new RunnableC40720FyW(controlSloganFragment));
        } else {
            if (C34206Dbe.LIZ()) {
                C36093EEn.LIZ.getClass();
                C36093EEn.LIZJ();
            }
            if (C2NW.LIZ().LJIILLIIL(DSB.LJLIL)) {
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZ(C39077FVh.LIZIZ.LIZIZ(EFK.BACKGROUND));
                LJIIIZ.LIZJ();
            }
            FFX.LIZ(0, "is_preload_main");
        }
        ControlSloganFragment controlSloganFragment2 = this.LJLILLLLZI;
        controlSloganFragment2.getClass();
        ControlSloganFragment controlSloganFragment3 = this.LJLILLLLZI;
        controlSloganFragment3.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - controlSloganFragment3.LJLJJLL;
        long j = 0;
        if (elapsedRealtime <= 0) {
            elapsedRealtime = 0;
        }
        long j2 = 1500 - elapsedRealtime;
        Handler handler = controlSloganFragment2.LJLJJL;
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(controlSloganFragment2, 81);
        if (j2 > 0) {
            j = j2;
        }
        handler.postDelayed(aRunnableS42S0100000_6, j);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p0) {
        o.LJIIIZ(p0, "p0");
        this.LJLIL.setAlpha(1.0f);
    }

    public C40719FyV(ImageView imageView, ControlSloganFragment controlSloganFragment) {
        this.LJLIL = imageView;
        this.LJLILLLLZI = controlSloganFragment;
    }
}
