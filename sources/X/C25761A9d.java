package X;

import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import kotlin.jvm.internal.AqS2S0112000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A9d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25761A9d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C25765A9h LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public C25761A9d(C76732zl c76732zl, int i, C25765A9h c25765A9h, boolean z, int i2) {
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = i;
        this.LJLJI = c25765A9h;
        this.LJLJJI = z;
        this.LJLJJL = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        C76732zl c76732zl = this.LJLIL;
        int i = c76732zl.element + 1;
        c76732zl.element = i;
        if (i % this.LJLILLLLZI != 0) {
            return;
        }
        Object animatedValue = animator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        C25765A9h c25765A9h = this.LJLJI;
        CustomDialogFragment customDialogFragment = c25765A9h.LJLLILLLL;
        if (customDialogFragment != null) {
            customDialogFragment.vl(new AqS2S0112000_4(this.LJLJJI, this.LJLJJL, intValue, c25765A9h, 1));
        }
    }
}
