package Y;

import X.C53379KxD;
import X.C86652Xzc;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AUListenerS10S0102000_15 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final void onAnimationUpdate$0(AUListenerS10S0102000_15 aUListenerS10S0102000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TuxIconView tuxIconView = ((FeedCaptionView) aUListenerS10S0102000_15.l0).LLIIII;
        if (tuxIconView != null) {
            tuxIconView.setAlpha(it.getAnimatedFraction());
        }
        TuxTextView tuxTextView = ((FeedCaptionView) aUListenerS10S0102000_15.l0).LLIFFJFJJ;
        if (tuxTextView != null) {
            tuxTextView.setAlpha(1 - it.getAnimatedFraction());
        }
        TuxTextView tuxTextView2 = ((FeedCaptionView) aUListenerS10S0102000_15.l0).LLIFFJFJJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setScaleX(((aUListenerS10S0102000_15.i1 - (it.getAnimatedFraction() * (r1 - FeedCaptionView.LLILZLL))) * 1.0f) / aUListenerS10S0102000_15.i1);
        }
        TuxTextView tuxTextView3 = ((FeedCaptionView) aUListenerS10S0102000_15.l0).LLIFFJFJJ;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setScaleY(((aUListenerS10S0102000_15.i2 - (it.getAnimatedFraction() * (r1 - FeedCaptionView.LLILZLL))) * 1.0f) / aUListenerS10S0102000_15.i2);
    }

    public static final void onAnimationUpdate$1(AUListenerS10S0102000_15 aUListenerS10S0102000_15, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (!C53379KxD.LIZ()) {
            ((C86652Xzc) aUListenerS10S0102000_15.l0).LIZ(R.id.bgr).setAlpha(it.getAnimatedFraction());
        }
        ((C86652Xzc) aUListenerS10S0102000_15.l0).LIZ(R.id.b5f).setAlpha(1 - it.getAnimatedFraction());
        View LIZ = ((C86652Xzc) aUListenerS10S0102000_15.l0).LIZ(R.id.b5f);
        int i = aUListenerS10S0102000_15.i1;
        int i2 = C86652Xzc.LJLL;
        LIZ.setScaleX(((i - (it.getAnimatedFraction() * (i - i2))) * 1.0f) / aUListenerS10S0102000_15.i1);
        ((C86652Xzc) aUListenerS10S0102000_15.l0).LIZ(R.id.b5f).setScaleY(((aUListenerS10S0102000_15.i2 - (it.getAnimatedFraction() * (r0 - i2))) * 1.0f) / aUListenerS10S0102000_15.i2);
    }

    public AUListenerS10S0102000_15(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
