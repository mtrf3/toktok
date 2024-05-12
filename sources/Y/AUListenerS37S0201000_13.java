package Y;

import X.C15380j0;
import X.C15490jB;
import X.C29306Beo;
import X.C34K;
import X.C78866UxK;
import X.CFX;
import X.U46;
import X.U5I;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AUListenerS37S0201000_13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationUpdate$0(AUListenerS37S0201000_13 aUListenerS37S0201000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        if (((U5I) aUListenerS37S0201000_13.l0).LJLJI == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        HorizontalScrollView horizontalScrollView = ((U5I) aUListenerS37S0201000_13.l0).LJLJI;
        if (horizontalScrollView != null) {
            int scrollX = intValue - horizontalScrollView.getScrollX();
            if (C15380j0.LJIIZILJ()) {
                HorizontalScrollView horizontalScrollView2 = ((U5I) aUListenerS37S0201000_13.l0).LJLJI;
                if (horizontalScrollView2 != null) {
                    int i = aUListenerS37S0201000_13.i2;
                    Object animatedValue2 = it.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                    horizontalScrollView2.scrollTo(i - ((Integer) animatedValue2).intValue(), 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                HorizontalScrollView horizontalScrollView3 = ((U5I) aUListenerS37S0201000_13.l0).LJLJI;
                if (horizontalScrollView3 != null) {
                    horizontalScrollView3.scrollBy(scrollX, 0);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Object animatedValue3 = it.getAnimatedValue();
            o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) animatedValue3).intValue() == aUListenerS37S0201000_13.i2) {
                C34K c34k = (C34K) aUListenerS37S0201000_13.l1;
                if (!c34k.element && ((U5I) aUListenerS37S0201000_13.l0).LJLIL) {
                    c34k.element = true;
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onAnimationUpdate$1(AUListenerS37S0201000_13 aUListenerS37S0201000_13, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        View ll_victory_activity_tips = ((U46) aUListenerS37S0201000_13.l0).LIZ(R.id.g71);
        o.LJIIIIZZ(ll_victory_activity_tips, "ll_victory_activity_tips");
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        C78866UxK.LJJLIL(ll_victory_activity_tips, ((Integer) animatedValue).intValue());
        if (((Number) animatedValue).intValue() <= aUListenerS37S0201000_13.i2) {
            C34K c34k = (C34K) aUListenerS37S0201000_13.l1;
            if (c34k.element) {
                c34k.element = false;
                C15490jB.LJIILLIIL(((U46) aUListenerS37S0201000_13.l0).LIZ(R.id.g71), CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_truth_or_dare/ttlive_truth_or_dare_bg1.png", new ARunnableS49S0100000_13((U46) aUListenerS37S0201000_13.l0, 111));
                if (((U46) aUListenerS37S0201000_13.l0).LLFFF) {
                    if (C15380j0.LJIIZILJ()) {
                        C29306Beo.LJJLIIIIJ(C15380j0.LIZ(18.0f), ((U46) aUListenerS37S0201000_13.l0).LIZ(R.id.g71));
                        return;
                    } else {
                        C29306Beo.LJJJLIIL(C15380j0.LIZ(18.0f), ((U46) aUListenerS37S0201000_13.l0).LIZ(R.id.g71));
                        return;
                    }
                }
                if (C15380j0.LJIIZILJ()) {
                    C29306Beo.LJJLIIIIJ(C15380j0.LIZ(14.0f), ((U46) aUListenerS37S0201000_13.l0).LIZ(R.id.g71));
                } else {
                    C29306Beo.LJJJLIIL(C15380j0.LIZ(14.0f), ((U46) aUListenerS37S0201000_13.l0).LIZ(R.id.g71));
                }
            }
        }
    }

    public AUListenerS37S0201000_13(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
