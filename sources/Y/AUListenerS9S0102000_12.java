package Y;

import X.C16530kr;
import X.C71395S0h;
import X.O6R;
import X.S08;
import X.S09;
import X.S18;
import X.TCQ;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class AUListenerS9S0102000_12 implements ValueAnimator.AnimatorUpdateListener {
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS9S0102000_12 aUListenerS9S0102000_12, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.LayoutParams layoutParams = ((S08) aUListenerS9S0102000_12.l0).LIZ(R.id.a3s).getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * aUListenerS9S0102000_12.i1);
        if (((S08) aUListenerS9S0102000_12.l0).LIZ(R.id.a22).getMeasuredWidth() < aUListenerS9S0102000_12.i2) {
            layoutParams.width = (int) Math.ceil((CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * (aUListenerS9S0102000_12.i2 - ((S08) aUListenerS9S0102000_12.l0).LIZ(R.id.a22).getMeasuredWidth())) + ((S08) aUListenerS9S0102000_12.l0).LIZ(R.id.a22).getMeasuredWidth());
        }
        ((S08) aUListenerS9S0102000_12.l0).LIZ(R.id.a3s).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS9S0102000_12 aUListenerS9S0102000_12, ValueAnimator it) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(it, "it");
        float parseFloat = CastFloatProtector.parseFloat(it.getAnimatedValue().toString());
        ViewGroup.LayoutParams layoutParams = ((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a3s).getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(CastFloatProtector.parseFloat(it.getAnimatedValue().toString()) * aUListenerS9S0102000_12.i1);
        if (((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a22).getMeasuredWidth() < aUListenerS9S0102000_12.i2) {
            layoutParams.width = (int) Math.ceil(((aUListenerS9S0102000_12.i2 - ((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a22).getMeasuredWidth()) * parseFloat) + ((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a22).getMeasuredWidth());
        }
        ((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a3s).setLayoutParams(layoutParams);
        View anchor_pre_title = ((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a3f);
        o.LJIIIIZZ(anchor_pre_title, "anchor_pre_title");
        if (anchor_pre_title.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams2 = ((S09) aUListenerS9S0102000_12.l0).LIZ(R.id.a3f).getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                S09 s09 = (S09) aUListenerS9S0102000_12.l0;
                int measuredWidth = s09.LIZ(R.id.a3f).getMeasuredWidth();
                View anchor_pre_title2 = s09.LIZ(R.id.a3f);
                o.LJIIIIZZ(anchor_pre_title2, "anchor_pre_title");
                ViewGroup.LayoutParams layoutParams3 = anchor_pre_title2.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    i4 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams3);
                } else {
                    i4 = 0;
                }
                int measuredWidth2 = s09.LIZ(R.id.a4o).getMeasuredWidth() + measuredWidth + i4;
                View anchor_title_div = s09.LIZ(R.id.a4o);
                o.LJIIIIZZ(anchor_title_div, "anchor_title_div");
                ViewGroup.LayoutParams layoutParams4 = anchor_title_div.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    i5 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams4);
                } else {
                    i5 = 0;
                }
                marginLayoutParams.setMarginStart(-((int) ((measuredWidth2 + i5) * parseFloat)));
                s09.LIZ(R.id.a3f).setAlpha(1 - parseFloat);
                s09.LIZ(R.id.a3f).setLayoutParams(marginLayoutParams);
            }
            S09 s092 = (S09) aUListenerS9S0102000_12.l0;
            C71395S0h.LIZ.getClass();
            boolean LIZIZ = C71395S0h.LIZIZ();
            S18 s18 = S18.LJLIL;
            int i6 = s092.LJLJJI;
            View anchor_pre_title3 = s092.LIZ(R.id.a3f);
            o.LJIIIIZZ(anchor_pre_title3, "anchor_pre_title");
            if (anchor_pre_title3.getVisibility() == 0) {
                int measuredWidth3 = s092.LIZ(R.id.a3f).getMeasuredWidth();
                View anchor_pre_title4 = s092.LIZ(R.id.a3f);
                o.LJIIIIZZ(anchor_pre_title4, "anchor_pre_title");
                ViewGroup.LayoutParams layoutParams5 = anchor_pre_title4.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    i = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams5);
                } else {
                    i = 0;
                }
                int i7 = measuredWidth3 + i;
                View anchor_pre_title5 = s092.LIZ(R.id.a3f);
                o.LJIIIIZZ(anchor_pre_title5, "anchor_pre_title");
                ViewGroup.LayoutParams layoutParams6 = anchor_pre_title5.getLayoutParams();
                if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                    i2 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams6);
                } else {
                    i2 = 0;
                }
                int measuredWidth4 = s092.LIZ(R.id.a4o).getMeasuredWidth() + i7 + i2;
                View anchor_title_div2 = s092.LIZ(R.id.a4o);
                o.LJIIIIZZ(anchor_title_div2, "anchor_title_div");
                ViewGroup.LayoutParams layoutParams7 = anchor_title_div2.getLayoutParams();
                if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                    i3 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams7);
                } else {
                    i3 = 0;
                }
                i6 -= measuredWidth4 + i3;
            }
            View anchor_suffix = s092.LIZ(R.id.a45);
            o.LJIIIIZZ(anchor_suffix, "anchor_suffix");
            if (anchor_suffix.getVisibility() == 0) {
                i6 -= s092.LIZ(R.id.a28).getMeasuredWidth() + s092.LIZ(R.id.a45).getMeasuredWidth();
            }
            View anchor_buy_button = s092.LIZ(R.id.a1y);
            o.LJIIIIZZ(anchor_buy_button, "anchor_buy_button");
            if (anchor_buy_button.getVisibility() == 0 || LIZIZ) {
                i6 -= s092.LJLJI;
            }
            ((TextView) s092.LIZ(R.id.a4n)).setMaxWidth(i6);
            ((TextView) s092.LIZ(R.id.a4n)).setEllipsize(TextUtils.TruncateAt.END);
            s18.getClass();
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS9S0102000_12 aUListenerS9S0102000_12, ValueAnimator valueAnimator) {
        TCQ this$0 = (TCQ) aUListenerS9S0102000_12.l0;
        int i = aUListenerS9S0102000_12.i1;
        int i2 = aUListenerS9S0102000_12.i2;
        o.LJIIIZ(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.update(i, ((Integer) animatedValue).intValue() + i2, -1, -1);
    }

    public AUListenerS9S0102000_12(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
