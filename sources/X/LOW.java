package X;

import Y.AUListenerS99S0200000_9;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOW implements C0C3, InterfaceC54179LOd {
    public static final Interpolator LJLJL;
    public static final FloatEvaluator LJLJLJ;
    public final LOS LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public Float LJLJJL;
    public Float LJLJJLL;

    @Override // X.InterfaceC54179LOd
    public final void LIZ() {
    }

    static {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(0.33f, 0.86f, 0.2f, 1f)");
        LJLJL = LIZIZ;
        LJLJLJ = new FloatEvaluator();
    }

    public LOW(LOS tabLayout) {
        o.LJIIIZ(tabLayout, "tabLayout");
        this.LJLIL = tabLayout;
    }

    @Override // X.InterfaceC54179LOd
    public final void LIZIZ(LOP tab) {
        TextView mCustomTextView$homepage_common_release;
        o.LJIIIZ(tab, "tab");
        LOX lox = tab.LIZLLL;
        if (lox == null || (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) == null) {
            return;
        }
        int i = this.LJLJI;
        if (i == 1 || (i == 2 && this.LJLILLLLZI == 1)) {
            mCustomTextView$homepage_common_release.setAlpha(1.0f);
        } else {
            LIZLLL(mCustomTextView$homepage_common_release, false);
        }
    }

    @Override // X.InterfaceC54179LOd
    public final void LIZJ(LOP lop) {
        TextView mCustomTextView$homepage_common_release;
        LOX lox = lop.LIZLLL;
        if (lox == null || (mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release()) == null) {
            return;
        }
        int i = this.LJLJI;
        if (i == 1 || (i == 2 && this.LJLILLLLZI == 1)) {
            mCustomTextView$homepage_common_release.setAlpha(0.7f);
        } else {
            LIZLLL(mCustomTextView$homepage_common_release, true);
        }
    }

    public final TextView LJFF(Integer num) {
        LOX lox;
        if (num == null) {
            return null;
        }
        LOP LJIIJ = this.LJLIL.LJIIJ(num.intValue());
        if (LJIIJ == null || (lox = LJIIJ.LIZLLL) == null) {
            return null;
        }
        return lox.getMCustomTextView$homepage_common_release();
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLILLLLZI = this.LJLJI;
        this.LJLJI = i;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        float f;
        float LJIIZILJ;
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            TextView LJFF = LJFF(Integer.valueOf(i));
            if (LJFF != null) {
                LJIIZILJ = LJFF.getTextSize();
            } else {
                LJIIZILJ = C32151Nz.LJIIZILJ(17);
            }
            float f2 = 1.1f * LJIIZILJ;
            this.LJLJJLL = Float.valueOf(f2);
            this.LJLJJL = Float.valueOf(LJIIZILJ);
            if (LJFF != null) {
                LJFF.setTextSize(0, f2);
            }
        }
        int childCount = this.LJLIL.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            TextView LJFF2 = LJFF(Integer.valueOf(i2));
            if (LJFF2 != null) {
                if (i2 == i) {
                    f = 1.0f;
                } else {
                    f = 0.7f;
                }
                LJFF2.setAlpha(f);
            }
        }
    }

    public final void LIZLLL(TextView textView, boolean z) {
        float f;
        textView.clearAnimation();
        Float f2 = this.LJLJJLL;
        if (f2 != null) {
            float floatValue = f2.floatValue();
            Float f3 = this.LJLJJL;
            if (f3 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3.floatValue(), floatValue);
                ofFloat.setDuration(200L);
                Interpolator interpolator = LJLJL;
                ofFloat.setInterpolator(interpolator);
                ofFloat.addUpdateListener(new AUListenerS99S0200000_9(this, textView, 3));
                if (z) {
                    f = 0.7f;
                } else {
                    f = 1.0f;
                }
                textView.animate().alpha(f).setInterpolator(interpolator).setDuration(200L).start();
                if (z) {
                    ofFloat.reverse();
                } else {
                    ofFloat.start();
                }
            }
        }
    }

    public static void LJ(TextView textView, Float f, boolean z) {
        if (f != null) {
            f.floatValue();
            textView.getPaint().setTextSize(f.floatValue());
            int width = textView.getWidth() - (textView.getPaddingLeft() + textView.getPaddingRight());
            float measureText = textView.getPaint().measureText(textView.getText().toString());
            if (!z) {
                C16300kU.LJIIJ(textView);
            } else {
                textView.invalidate();
            }
            if (measureText > width) {
                textView.requestLayout();
            }
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        Float f2;
        TextView LJFF;
        int i3 = this.LJLJI;
        if ((i3 == 1 || (i3 == 2 && this.LJLILLLLZI == 1)) && (f2 = this.LJLJJL) != null) {
            float floatValue = f2.floatValue();
            Float f3 = this.LJLJJLL;
            if (f3 != null) {
                float floatValue2 = f3.floatValue();
                TextView LJFF2 = LJFF(Integer.valueOf(i + 1));
                if (LJFF2 == null || (LJFF = LJFF(Integer.valueOf(i))) == null) {
                    return;
                }
                FloatEvaluator floatEvaluator = LJLJLJ;
                Float evaluate = floatEvaluator.evaluate(f, (Number) Float.valueOf(floatValue), (Number) Float.valueOf(floatValue2));
                LJ(LJFF, floatEvaluator.evaluate(f, (Number) Float.valueOf(floatValue2), (Number) Float.valueOf(floatValue)), false);
                LJ(LJFF2, evaluate, false);
                Float currentAlpha = floatEvaluator.evaluate(f, (Number) Float.valueOf(0.7f), (Number) Float.valueOf(1.0f));
                Float nextAlpha = floatEvaluator.evaluate(f, (Number) Float.valueOf(1.0f), (Number) Float.valueOf(0.7f));
                o.LJIIIIZZ(nextAlpha, "nextAlpha");
                LJFF.setAlpha(nextAlpha.floatValue());
                o.LJIIIIZZ(currentAlpha, "currentAlpha");
                LJFF2.setAlpha(currentAlpha.floatValue());
            }
        }
    }
}
