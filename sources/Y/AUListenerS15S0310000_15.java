package Y;

import X.C53379KxD;
import X.C76732zl;
import X.C86652Xzc;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AUListenerS15S0310000_15 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS15S0310000_15 aUListenerS15S0310000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = ((FeedCaptionView) aUListenerS15S0310000_15.l0).LLIIIJ;
        if (view != null) {
            view.setAlpha(1 - it.getAnimatedFraction());
        }
        if (!aUListenerS15S0310000_15.z3) {
            TuxTextView tuxTextView = ((FeedCaptionView) aUListenerS15S0310000_15.l0).LLIFFJFJJ;
            if (tuxTextView != null) {
                tuxTextView.setAlpha(it.getAnimatedFraction());
            }
            TuxTextView tuxTextView2 = ((FeedCaptionView) aUListenerS15S0310000_15.l0).LLIFFJFJJ;
            if (tuxTextView2 != null) {
                int i = FeedCaptionView.LLILZLL;
                tuxTextView2.setScaleX(((it.getAnimatedFraction() * (r1 - i)) / ((C76732zl) aUListenerS15S0310000_15.l1).element) + ((i * 1.0f) / ((C76732zl) aUListenerS15S0310000_15.l1).element));
            }
            TuxTextView tuxTextView3 = ((FeedCaptionView) aUListenerS15S0310000_15.l0).LLIFFJFJJ;
            if (tuxTextView3 == null) {
                return;
            }
            int i2 = FeedCaptionView.LLILZLL;
            tuxTextView3.setScaleY(((it.getAnimatedFraction() * (r1 - i2)) / ((C76732zl) aUListenerS15S0310000_15.l2).element) + ((i2 * 1.0f) / ((C76732zl) aUListenerS15S0310000_15.l2).element));
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS15S0310000_15 aUListenerS15S0310000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (!C53379KxD.LIZ()) {
            ((C86652Xzc) aUListenerS15S0310000_15.l0).LIZ(R.id.bgr).setAlpha(1 - it.getAnimatedFraction());
        }
        if (!aUListenerS15S0310000_15.z3) {
            ((C86652Xzc) aUListenerS15S0310000_15.l0).LIZ(R.id.b5f).setAlpha(it.getAnimatedFraction());
            View LIZ = ((C86652Xzc) aUListenerS15S0310000_15.l0).LIZ(R.id.b5f);
            int i = C86652Xzc.LJLL;
            LIZ.setScaleX(((it.getAnimatedFraction() * (r1 - i)) / ((C76732zl) aUListenerS15S0310000_15.l1).element) + ((i * 1.0f) / ((C76732zl) aUListenerS15S0310000_15.l1).element));
            ((C86652Xzc) aUListenerS15S0310000_15.l0).LIZ(R.id.b5f).setScaleY(((it.getAnimatedFraction() * (r1 - i)) / ((C76732zl) aUListenerS15S0310000_15.l2).element) + ((i * 1.0f) / ((C76732zl) aUListenerS15S0310000_15.l2).element));
        }
    }

    public AUListenerS15S0310000_15(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z3 = z;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
