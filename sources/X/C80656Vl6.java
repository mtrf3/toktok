package X;

import Y.ALAdapterS3S0101000_14;
import Y.AUListenerS1S0104000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vl6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80656Vl6 extends LinearLayout {
    public int LJLIL;
    public final Paint LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public ValueAnimator LJLJLJ;
    public int LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public final /* synthetic */ C80655Vl5 LJLLL;

    public final void LIZIZ() {
        int i;
        View childAt = getChildAt(this.LJLJI);
        int i2 = -1;
        if (childAt != null && childAt.getWidth() > 0) {
            i2 = childAt.getLeft();
            i = childAt.getRight();
            if (this.LJLJJI > 0.0f && this.LJLJI < getChildCount() - 1) {
                View childAt2 = getChildAt(this.LJLJI + 1);
                float left = this.LJLJJI * childAt2.getLeft();
                float f = this.LJLJJI;
                i2 = (int) (((1.0f - f) * i2) + left);
                i = (int) (((1.0f - this.LJLJJI) * i) + (f * childAt2.getRight()));
            }
        } else {
            i = -1;
        }
        if (i2 != this.LJLJJLL || i != this.LJLJL) {
            this.LJLJJLL = i2;
            this.LJLJL = i;
            C16300kU.LJIIJ(this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        View findViewById;
        super.draw(canvas);
        int i = this.LJLJJLL;
        if (i >= 0 && this.LJLJL > i) {
            View childAt = getChildAt(this.LJLLL.getSelectedTabPosition());
            if (childAt != null && (findViewById = childAt.findViewById(R.id.fmp)) != null) {
                if (this.LJLLL.LLFZ == null || !this.LJLLILLLL) {
                    int i2 = this.LJLJJLL;
                    float width = (((this.LJLJL - i2) - findViewById.getWidth()) / 2) + i2;
                    this.LJLL = width;
                    this.LJLLI = width + findViewById.getWidth();
                }
                canvas.drawRect(this.LJLL + this.LJLLJ, getHeight() - this.LJLIL, this.LJLLI - this.LJLLJ, getHeight(), this.LJLILLLLZI);
                return;
            }
            canvas.drawRect(this.LJLJJLL + this.LJLLJ, getHeight() - this.LJLIL, this.LJLJL - this.LJLLJ, getHeight(), this.LJLILLLLZI);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.LJLJJL != i) {
            requestLayout();
            this.LJLJJL = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80656Vl6(C80655Vl5 c80655Vl5, Context context) {
        super(context);
        this.LJLLL = c80655Vl5;
        this.LJLJI = -1;
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        c80655Vl5.LJII(27);
        this.LJLJLLL = Integer.MAX_VALUE;
        setWillNotDraw(false);
        this.LJLILLLLZI = new Paint();
    }

    public final void LIZ(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        ValueAnimator valueAnimator = this.LJLJLJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJLJ.cancel();
        }
        if (C16310kV.LIZLLL(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            LIZIZ();
            return;
        }
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (Math.abs(i - this.LJLJI) <= 1) {
            i4 = this.LJLJJLL;
            i3 = this.LJLJL;
        } else {
            int LJII = this.LJLLL.LJII(24);
            if (i >= this.LJLJI ? !z : z) {
                i3 = left - LJII;
            } else {
                i3 = LJII + right;
            }
            i4 = i3;
        }
        if (i4 != left || i3 != right) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.LJLJLJ = valueAnimator2;
            valueAnimator2.setInterpolator(C80655Vl5.LLIIIZ);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new AUListenerS1S0104000_14(this, i4, left, i3, right, 1));
            valueAnimator2.addListener(new ALAdapterS3S0101000_14(this, i, 1));
            valueAnimator2.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        boolean z;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                i4 = Math.max(i4, childAt.getMeasuredWidth());
                this.LJLJLLL = Math.min(this.LJLJLLL, childAt.getMeasuredWidth());
            }
        }
        C80655Vl5 c80655Vl5 = this.LJLLL;
        int i6 = c80655Vl5.LJZL;
        if (i6 == 1) {
            if (c80655Vl5.LJZI != 1 || i4 <= 0) {
                return;
            }
            if (i4 * childCount <= getMeasuredWidth() - (c80655Vl5.LJII(16) * 2)) {
                boolean z2 = false;
                while (i3 < childCount) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                    if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i4;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                    i3++;
                }
                if (!z2) {
                    return;
                }
            } else {
                C80655Vl5 c80655Vl52 = this.LJLLL;
                c80655Vl52.LJZI = 0;
                c80655Vl52.LJIILLIIL(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (i6 != 0 || !c80655Vl5.LLD || c80655Vl5.LLIIIL != getResources().getConfiguration().orientation || i4 <= 0) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                i7 += childAt2.getMeasuredWidth();
            }
        }
        if (i7 > 0 && i7 < (measuredWidth = (getMeasuredWidth() - this.LJLLL.LJLJI.getPaddingLeft()) - this.LJLLL.LJLJI.getPaddingRight())) {
            if (i4 * childCount < measuredWidth) {
                z = false;
                for (int i9 = 0; i9 < childCount; i9++) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i9).getLayoutParams();
                    if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                        layoutParams2.width = 0;
                        layoutParams2.weight = 1.0f;
                        z = true;
                    }
                }
            } else {
                int i10 = (measuredWidth - i7) / (childCount * 2);
                z = false;
                while (i3 < childCount) {
                    if (getChildAt(i3).getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                        layoutParams3.leftMargin = i10;
                        layoutParams3.rightMargin = i10;
                        z = true;
                    }
                    i3++;
                }
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LJLJLJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJLJ.cancel();
            LIZ(this.LJLJI, Math.round((1.0f - this.LJLJLJ.getAnimatedFraction()) * ((float) this.LJLJLJ.getDuration())));
            return;
        }
        LIZIZ();
    }
}
