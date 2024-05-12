package Y;

import X.C32151Nz;
import X.C76917UGr;
import android.animation.ValueAnimator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuHeaderWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AUListenerS53S1100000_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final void onAnimationUpdate$0(AUListenerS53S1100000_12 aUListenerS53S1100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TuxTextView tuxTextView = ((SkuPanelHeaderWidget) aUListenerS53S1100000_12.l1).LJLJJI;
        if (tuxTextView != null) {
            C76917UGr.LJJJJLI(tuxTextView, aUListenerS53S1100000_12.s0);
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            TuxTextView tuxTextView2 = ((SkuPanelHeaderWidget) aUListenerS53S1100000_12.l1).LJLJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setTranslationY(floatValue - C32151Nz.LJIIZILJ(4));
                TuxTextView tuxTextView3 = ((SkuPanelHeaderWidget) aUListenerS53S1100000_12.l1).LJLJJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setAlpha(floatValue / C32151Nz.LJIIZILJ(4));
                    return;
                } else {
                    o.LJIJI("priceView");
                    throw null;
                }
            }
            o.LJIJI("priceView");
            throw null;
        }
        o.LJIJI("priceView");
        throw null;
    }

    public static final void onAnimationUpdate$1(AUListenerS53S1100000_12 aUListenerS53S1100000_12, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        TuxTextView sku_panel_header_real_price = (TuxTextView) ((UsSkuHeaderWidget) aUListenerS53S1100000_12.l1)._$_findCachedViewById(R.id.k3l);
        o.LJIIIIZZ(sku_panel_header_real_price, "sku_panel_header_real_price");
        C76917UGr.LJJJJLI(sku_panel_header_real_price, aUListenerS53S1100000_12.s0);
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        ((UsSkuHeaderWidget) aUListenerS53S1100000_12.l1)._$_findCachedViewById(R.id.k3l).setTranslationY(f - C32151Nz.LJIIZILJ(4));
        ((UsSkuHeaderWidget) aUListenerS53S1100000_12.l1)._$_findCachedViewById(R.id.k3l).setAlpha(f / C32151Nz.LJIIZILJ(4));
    }

    public AUListenerS53S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
