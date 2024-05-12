package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.9tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251459tt extends C251319tf {
    public final /* synthetic */ C251389tm LJLIL;

    public C251459tt(C251389tm c251389tm) {
        this.LJLIL = c251389tm;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.LJ.postDelayed(new ARunnableS40S0100000_4(this, LiveTryModeCountDownThresholdSetting.DEFAULT), 5000L);
    }
}
