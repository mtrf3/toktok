package Y;

import X.C264612c;
import X.C32151Nz;
import X.C71510S4s;
import X.C71863SIh;
import X.C73046Sle;
import X.C73053Sll;
import X.C73063Slv;
import X.C74040T4a;
import X.C74041T4b;
import X.C74053T4n;
import X.C74063T4x;
import X.C76917UGr;
import X.C90193gN;
import X.InterfaceC71509S4r;
import X.S3N;
import X.S4U;
import X.TBK;
import X.XXG;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuHeaderWidget;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AUListenerS99S0100000_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationUpdate$16(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        TBK.LIZ((TBK) aUListenerS99S0100000_12.l0, valueAnimator);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                return;
            case 20:
                onAnimationUpdate$20(this, valueAnimator);
                return;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                return;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                return;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                return;
            case 24:
                onAnimationUpdate$24(this, valueAnimator);
                return;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                return;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                return;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                return;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                return;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS99S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (C90193gN.LIZIZ(((XXG) aUListenerS99S0100000_12.l0).LLFF)) {
            ((ViewGroup.MarginLayoutParams) ((XXG) aUListenerS99S0100000_12.l0).LJLLL.getLayoutParams()).leftMargin = intValue;
        } else {
            ((ViewGroup.MarginLayoutParams) ((XXG) aUListenerS99S0100000_12.l0).LJLLL.getLayoutParams()).rightMargin = intValue;
        }
        ((XXG) aUListenerS99S0100000_12.l0).LJLLL.requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View LJFF = ((C71510S4s) aUListenerS99S0100000_12.l0).LJFF();
        if (LJFF == null) {
            return;
        }
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        C71510S4s c71510S4s = (C71510S4s) aUListenerS99S0100000_12.l0;
        Rect rect = c71510S4s.LJLJI;
        Rect rect2 = c71510S4s.LJLIL;
        int i = rect2.left;
        Rect rect3 = c71510S4s.LJLILLLLZI;
        rect.left = (int) (((rect3.left - i) * floatValue) + i);
        rect.top = (int) (((rect3.top - r2) * floatValue) + rect2.top);
        rect.right = (int) (((rect3.right - r2) * floatValue) + rect2.right);
        rect.bottom = (int) (((rect3.bottom - r2) * floatValue) + rect2.bottom);
        C71510S4s.LJII(rect, LJFF);
        C71510S4s c71510S4s2 = (C71510S4s) aUListenerS99S0100000_12.l0;
        int i2 = c71510S4s2.LJLLI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                Iterator<InterfaceC71509S4r> it = c71510S4s2.LJLLL.iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ((1 - floatValue) * c71510S4s2.LJLLLL, c71510S4s2.LJLLI);
                }
                return;
            }
            Iterator<InterfaceC71509S4r> it2 = c71510S4s2.LJLLL.iterator();
            while (it2.hasNext()) {
                InterfaceC71509S4r next = it2.next();
                int i3 = c71510S4s2.LJLLI;
                float f = c71510S4s2.LJLLLL;
                next.LIZIZ(((1 - f) * floatValue) + f, i3);
            }
            return;
        }
        Iterator<InterfaceC71509S4r> it3 = c71510S4s2.LJLLL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(floatValue, c71510S4s2.LJLLI);
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        SkuPanelHeaderWidget skuPanelHeaderWidget = (SkuPanelHeaderWidget) aUListenerS99S0100000_12.l0;
        TuxTextView tuxTextView = skuPanelHeaderWidget.LJLJJI;
        if (tuxTextView != null) {
            C76917UGr.LJJJJLI(tuxTextView, skuPanelHeaderWidget.getMViewModel().LLI);
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            TuxTextView tuxTextView2 = ((SkuPanelHeaderWidget) aUListenerS99S0100000_12.l0).LJLJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setTranslationY(floatValue);
                TuxTextView tuxTextView3 = ((SkuPanelHeaderWidget) aUListenerS99S0100000_12.l0).LJLJJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setAlpha(1 - (floatValue / C32151Nz.LJIIZILJ(4)));
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

    public static final void onAnimationUpdate$11(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        float f;
        Float f2;
        o.LJIIIZ(it, "it");
        TuxTextView sku_panel_header_real_price = (TuxTextView) ((UsSkuHeaderWidget) aUListenerS99S0100000_12.l0)._$_findCachedViewById(R.id.k3l);
        o.LJIIIIZZ(sku_panel_header_real_price, "sku_panel_header_real_price");
        C76917UGr.LJJJJLI(sku_panel_header_real_price, ((UsSkuHeaderWidget) aUListenerS99S0100000_12.l0).getMViewModel().LLI);
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        ((UsSkuHeaderWidget) aUListenerS99S0100000_12.l0)._$_findCachedViewById(R.id.k3l).setTranslationY(f);
        ((UsSkuHeaderWidget) aUListenerS99S0100000_12.l0)._$_findCachedViewById(R.id.k3l).setAlpha(1 - (f / C32151Nz.LJIIZILJ(4)));
    }

    public static final void onAnimationUpdate$12(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C73046Sle) aUListenerS99S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationUpdate$13(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C73046Sle) aUListenerS99S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationUpdate$14(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C73046Sle) aUListenerS99S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationUpdate$15(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C73053Sll) aUListenerS99S0100000_12.l0).LIZLLL();
    }

    public static final void onAnimationUpdate$17(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        C74063T4x c74063T4x = (C74063T4x) aUListenerS99S0100000_12.l0;
        if (c74063T4x.LJLJLJ != 0.0f) {
            c74063T4x.LJLZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((C74063T4x) aUListenerS99S0100000_12.l0).invalidate();
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74063T4x) aUListenerS99S0100000_12.l0).LJLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C74063T4x) aUListenerS99S0100000_12.l0).invalidate();
    }

    public static final void onAnimationUpdate$19(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74063T4x) aUListenerS99S0100000_12.l0).LJLLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static final void onAnimationUpdate$2(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View LJFF = ((C71510S4s) aUListenerS99S0100000_12.l0).LJFF();
        if (LJFF == null) {
            return;
        }
        LJFF.setAlpha(floatValue);
    }

    public static final void onAnimationUpdate$20(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74063T4x) aUListenerS99S0100000_12.l0).LJLLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static final void onAnimationUpdate$21(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ((C73053Sll) aUListenerS99S0100000_12.l0).LIZLLL();
    }

    public static final void onAnimationUpdate$22(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator va) {
        Window window;
        View decorView;
        o.LJIIIZ(va, "va");
        TuxSheet tuxSheet = ((S4U) aUListenerS99S0100000_12.l0).LJFF;
        if (tuxSheet != null) {
            Dialog dialog = tuxSheet.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                Object animatedValue = va.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                decorView.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
                return;
            }
            return;
        }
        o.LJIJI("dialog");
        throw null;
    }

    public static final void onAnimationUpdate$23(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74041T4b) aUListenerS99S0100000_12.l0).LJLJLJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C74041T4b) aUListenerS99S0100000_12.l0).invalidate();
    }

    public static final void onAnimationUpdate$24(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74041T4b) aUListenerS99S0100000_12.l0).LJLJLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static final void onAnimationUpdate$25(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74041T4b) aUListenerS99S0100000_12.l0).LJLJLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static final void onAnimationUpdate$26(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        C73063Slv this$0 = (C73063Slv) aUListenerS99S0100000_12.l0;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(it, "it");
        this$0.LIZJ();
    }

    public static final void onAnimationUpdate$27(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        C73063Slv this$0 = (C73063Slv) aUListenerS99S0100000_12.l0;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(it, "it");
        this$0.LIZJ();
    }

    public static final void onAnimationUpdate$28(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        C73063Slv this$0 = (C73063Slv) aUListenerS99S0100000_12.l0;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(it, "it");
        this$0.LIZJ();
    }

    public static final void onAnimationUpdate$29(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TuxTextView tuxTextView = ((S3N) aUListenerS99S0100000_12.l0).LJIIL;
        if (tuxTextView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            tuxTextView.setScrollX(((Integer) animatedValue).intValue());
            return;
        }
        o.LJIJI("topSaleTitle");
        throw null;
    }

    public static final void onAnimationUpdate$3(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C71863SIh c71863SIh = (C71863SIh) aUListenerS99S0100000_12.l0;
        c71863SIh.LLIIIJ.getValues(c71863SIh.LJLLJ);
        float f = c71863SIh.LJLLJ[0];
        C71863SIh c71863SIh2 = (C71863SIh) aUListenerS99S0100000_12.l0;
        c71863SIh2.LJZ.getValues(c71863SIh2.LJLLJ);
        float f2 = c71863SIh2.LJLLJ[0] / f;
        C71863SIh c71863SIh3 = (C71863SIh) aUListenerS99S0100000_12.l0;
        Iterator<InterfaceC71509S4r> it2 = c71863SIh3.LLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(f2, c71863SIh3.LLII);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator animator) {
        o.LJIIIZ(animator, "animator");
        C74053T4n c74053T4n = (C74053T4n) aUListenerS99S0100000_12.l0;
        Object animatedValue = animator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c74053T4n.scrollTo(((Integer) animatedValue).intValue(), 0);
    }

    public static final void onAnimationUpdate$5(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74041T4b) aUListenerS99S0100000_12.l0).LJLLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C74041T4b) aUListenerS99S0100000_12.l0).invalidate();
    }

    public static final void onAnimationUpdate$6(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74040T4a) aUListenerS99S0100000_12.l0).LJLZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C74040T4a) aUListenerS99S0100000_12.l0).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74040T4a) aUListenerS99S0100000_12.l0).LJLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C74040T4a) aUListenerS99S0100000_12.l0).invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74040T4a) aUListenerS99S0100000_12.l0).LJLLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static final void onAnimationUpdate$9(AUListenerS99S0100000_12 aUListenerS99S0100000_12, ValueAnimator valueAnimator) {
        ((C74040T4a) aUListenerS99S0100000_12.l0).LJLLI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
