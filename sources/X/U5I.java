package X;

import Y.ARunnableS17S0101000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import ujb.o;

/* loaded from: classes14.dex */
public final class U5I extends FrameLayout {
    public boolean LJLIL;
    public C2A8 LJLILLLLZI;
    public HorizontalScrollView LJLJI;
    public LinearLayout LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public ARunnableS17S0101000_13 LJLJL;
    public ValueAnimator LJLJLJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LJLIL = false;
        super.onDetachedFromWindow();
        removeCallbacks(this.LJLJL);
        ValueAnimator valueAnimator = this.LJLJLJ;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.LJLJL = null;
        this.LJLJLJ = null;
    }

    public final String getText() {
        CharSequence text;
        String charSequence;
        C2A8 c2a8 = this.LJLILLLLZI;
        if (c2a8 == null || (text = c2a8.getText()) == null || (charSequence = text.toString()) == null) {
            return "";
        }
        return charSequence;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLIL = true;
        findViewById(R.id.bdn);
        this.LJLJI = (HorizontalScrollView) findViewById(R.id.jco);
        this.LJLILLLLZI = (C2A8) findViewById(R.id.mn1);
        this.LJLJJI = (LinearLayout) findViewById(R.id.g6i);
        this.LJLJJL = findViewById(R.id.n__);
        this.LJLJJLL = findViewById(R.id.n_a);
    }

    public final void LIZ(int i) {
        Integer num;
        StringBuilder LJ = C7MY.LJ("scroll width is ", i, ", scroll X is ");
        HorizontalScrollView horizontalScrollView = this.LJLJI;
        if (horizontalScrollView != null) {
            num = Integer.valueOf(horizontalScrollView.getScrollX());
        } else {
            num = null;
        }
        LJ.append(num);
        C0NB.LIZIZ("BattleTaskGuide", X1D.LIZIZ(LJ));
        if (i >= C15380j0.LIZ(10.0f)) {
            removeCallbacks(this.LJLJL);
            ARunnableS17S0101000_13 aRunnableS17S0101000_13 = new ARunnableS17S0101000_13(i, this, 2);
            this.LJLJL = aRunnableS17S0101000_13;
            postDelayed(aRunnableS17S0101000_13, 1000L);
        }
    }

    public final void setTextSize(float f) {
        C2A8 c2a8 = this.LJLILLLLZI;
        if (c2a8 != null) {
            c2a8.setTextSize(1, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dbo, this, true);
    }

    public static void LIZIZ(U5I u5i, SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int i3 = 0;
        if (spannableStringBuilder != null) {
            u5i.getClass();
            if (!o.LJJJJJL(spannableStringBuilder)) {
                C2A8 c2a8 = u5i.LJLILLLLZI;
                if (c2a8 != null) {
                    c2a8.setText(spannableStringBuilder);
                }
                if (!u5i.LJLIL) {
                    return;
                }
                LinearLayout linearLayout = u5i.LJLJJI;
                if (linearLayout != null) {
                    i = linearLayout.getWidth();
                } else {
                    i = 0;
                }
                HorizontalScrollView horizontalScrollView = u5i.LJLJI;
                if (horizontalScrollView != null) {
                    i2 = horizontalScrollView.getWidth();
                } else {
                    i2 = 0;
                }
                int i4 = i - i2;
                HorizontalScrollView horizontalScrollView2 = u5i.LJLJI;
                if (horizontalScrollView2 != null) {
                    if (C15380j0.LJIIZILJ()) {
                        i3 = i4;
                    }
                    horizontalScrollView2.setScrollX(i3);
                }
                u5i.LIZ(i4);
                return;
            }
        }
        u5i.setVisibility(8);
    }
}
