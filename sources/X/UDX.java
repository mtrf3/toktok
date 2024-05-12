package X;

import Y.ARunnableS49S0100000_13;
import android.os.CountDownTimer;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* loaded from: classes14.dex */
public final class UDX extends CountDownTimer {
    public final /* synthetic */ UDY LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        ViewPropertyAnimator withEndAction2;
        TextView textView = this.LIZ.LIZ;
        if (textView != null && (animate2 = textView.animate()) != null && (alpha2 = animate2.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null && (withEndAction2 = duration2.withEndAction(new ARunnableS49S0100000_13(this.LIZ, 180))) != null) {
            withEndAction2.start();
        }
        TextView textView2 = this.LIZ.LIZIZ;
        if (textView2 != null && (animate = textView2.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(200L)) != null && (withEndAction = duration.withEndAction(new ARunnableS49S0100000_13(this.LIZ, 181))) != null) {
            withEndAction.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDX(UDY udy) {
        super(3700L, 3700L);
        this.LIZ = udy;
    }
}
