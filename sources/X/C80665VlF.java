package X;

import Y.ALAdapterS3S0101000_14;
import Y.AUListenerS1S0104000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VlF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80665VlF extends LinearLayout {
    public int LJLIL;
    public final Paint LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public ValueAnimator LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public boolean LJLLLL;
    public final /* synthetic */ C80664VlE LJLLLLLL;

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
        if (i2 != this.LJLJL || i != this.LJLJLJ) {
            this.LJLJL = i2;
            this.LJLJLJ = i;
            C16300kU.LJIIJ(this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        View childAt;
        View findViewById;
        super.draw(canvas);
        int i = this.LJLJL;
        if (i >= 0 && this.LJLJLJ > i) {
            C80664VlE c80664VlE = this.LJLLLLLL;
            if (c80664VlE.LLII) {
                return;
            }
            c80664VlE.getClass();
            C80664VlE c80664VlE2 = this.LJLLLLLL;
            if (c80664VlE2.LLIIII && (childAt = getChildAt(c80664VlE2.getSelectedTabPosition())) != null && (findViewById = childAt.findViewById(R.id.fmp)) != null) {
                if (this.LJLLLLLL.LLF == null || !this.LJLLLL) {
                    float width = (((this.LJLJLJ - r0) - findViewById.getWidth()) / 2.0f) + this.LJLJL;
                    this.LJLLJ = width;
                    this.LJLLL = width + findViewById.getWidth();
                    int i2 = this.LJLJJL;
                    if (i2 != -1 && i2 < findViewById.getWidth()) {
                        float width2 = (findViewById.getWidth() - this.LJLJJL) / 2;
                        this.LJLLJ += width2;
                        this.LJLLL -= width2;
                    }
                }
                canvas.drawRoundRect(new RectF(this.LJLLJ, getHeight() - this.LJLIL, this.LJLLL, getHeight()), this.LJLJLLL, this.LJLL, this.LJLILLLLZI);
                return;
            }
            canvas.drawRoundRect(new RectF(this.LJLJL, getHeight() - this.LJLIL, this.LJLJLJ, getHeight()), this.LJLJLLL, this.LJLL, this.LJLILLLLZI);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.LJLJJLL != i) {
            requestLayout();
            this.LJLJJLL = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80665VlF(C80664VlE c80664VlE, Context context) {
        super(context);
        this.LJLLLLLL = c80664VlE;
        this.LJLJI = -1;
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        c80664VlE.LJII(27);
        this.LJLLILLLL = Integer.MAX_VALUE;
        setWillNotDraw(false);
        this.LJLILLLLZI = new Paint();
    }

    public final void LIZ(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLLI.cancel();
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
            i4 = this.LJLJL;
            i3 = this.LJLJLJ;
        } else {
            int LJII = this.LJLLLLLL.LJII(24);
            if (i >= this.LJLJI ? !z : z) {
                i3 = left - LJII;
            } else {
                i3 = LJII + right;
            }
            i4 = i3;
        }
        if (i4 != left || i3 != right) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.LJLLI = valueAnimator2;
            valueAnimator2.setInterpolator(C80664VlE.LLIIIZ);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new AUListenerS1S0104000_14(this, i4, left, i3, right, 0));
            valueAnimator2.addListener(new ALAdapterS3S0101000_14(this, i, 0));
            valueAnimator2.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
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
                this.LJLLILLLL = Math.min(this.LJLLILLLL, childAt.getMeasuredWidth());
            }
        }
        C80664VlE c80664VlE = this.LJLLLLLL;
        int i6 = c80664VlE.LJLZ;
        if (i6 == 1) {
            if (c80664VlE.LJLLLLLL != 1 || i4 <= 0) {
                return;
            }
            if (i4 * childCount <= getMeasuredWidth() - (c80664VlE.LJII(16) * 2)) {
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
                C80664VlE c80664VlE2 = this.LJLLLLLL;
                c80664VlE2.LJLLLLLL = 0;
                c80664VlE2.LJIJ(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (i6 != 0 || !c80664VlE.LJZ || c80664VlE.LLIIIJ != getResources().getConfiguration().orientation || i4 <= 0) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                i7 += childAt2.getMeasuredWidth();
            }
        }
        if (i7 > 0 && i7 < this.LJLLLLLL.getMeasuredWidth()) {
            int i9 = i4 * childCount;
            if (i9 < this.LJLLLLLL.getMeasuredWidth()) {
                int measuredWidth = (this.LJLLLLLL.getMeasuredWidth() - i9) / (childCount * 2);
                z = false;
                while (i3 < childCount) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                    if (layoutParams2.width != i4 || layoutParams2.weight != 0.0f || layoutParams2.leftMargin != measuredWidth || layoutParams2.rightMargin != measuredWidth) {
                        layoutParams2.width = i4;
                        layoutParams2.weight = 0.0f;
                        layoutParams2.leftMargin = measuredWidth;
                        layoutParams2.rightMargin = measuredWidth;
                        z = true;
                    }
                    i3++;
                }
            } else {
                int measuredWidth2 = (this.LJLLLLLL.getMeasuredWidth() - i7) / (childCount * 2);
                z = false;
                while (i3 < childCount) {
                    if (getChildAt(i3).getVisibility() != 8) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i3).getLayoutParams();
                        layoutParams3.leftMargin = measuredWidth2;
                        layoutParams3.rightMargin = measuredWidth2;
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
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLLI.cancel();
            LIZ(this.LJLJI, Math.round((1.0f - this.LJLLI.getAnimatedFraction()) * ((float) this.LJLLI.getDuration())));
            return;
        }
        LIZIZ();
    }
}
