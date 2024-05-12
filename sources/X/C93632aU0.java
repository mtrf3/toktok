package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aU0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93632aU0 extends LinearLayout {
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
    public final /* synthetic */ C93635aU3 LJLLLLLL;

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
                i2 = (int) (left + ((1.0f - f) * i2));
                i = (int) ((f * childAt2.getRight()) + ((1.0f - this.LJLJJI) * i));
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
        int i;
        View childAt;
        super.draw(canvas);
        C93635aU3 c93635aU3 = this.LJLLLLLL;
        if (c93635aU3.LLIIII || (i = this.LJLJL) < 0 || this.LJLJLJ <= i || c93635aU3.LLII) {
            return;
        }
        c93635aU3.getClass();
        C93635aU3 c93635aU32 = this.LJLLLLLL;
        if (c93635aU32.LLIIIILZ && (childAt = getChildAt(c93635aU32.getSelectedTabPosition())) != null) {
            View findViewById = childAt.findViewById(R.id.fmp);
            View findViewById2 = childAt.findViewById(R.id.kyn);
            if (findViewById != null) {
                if (this.LJLLLLLL.LLF == null || !this.LJLLLL) {
                    if (findViewById2 != null && findViewById2.getVisibility() != 8) {
                        this.LJLLJ = this.LJLJL + ((((this.LJLJLJ - r0) - findViewById.getWidth()) - (findViewById2.getRight() - findViewById.getRight())) / 2.0f);
                    } else {
                        this.LJLLJ = this.LJLJL + (((this.LJLJLJ - r0) - findViewById.getWidth()) / 2.0f);
                    }
                    this.LJLLL = this.LJLLJ + findViewById.getWidth();
                    int i2 = this.LJLJJL;
                    if (i2 != -1 && i2 < findViewById.getWidth()) {
                        float width = (findViewById.getWidth() - this.LJLJJL) / 2;
                        this.LJLLJ += width;
                        this.LJLLL -= width;
                    }
                }
                canvas.drawRoundRect(new RectF(this.LJLLJ, getHeight() - this.LJLIL, this.LJLLL, getHeight()), this.LJLJLLL, this.LJLL, this.LJLILLLLZI);
                return;
            }
        }
        canvas.drawRoundRect(new RectF(this.LJLJL, getHeight() - this.LJLIL, this.LJLJLJ, getHeight()), this.LJLJLLL, this.LJLL, this.LJLILLLLZI);
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
    public C93632aU0(C93635aU3 c93635aU3, Context context) {
        super(context);
        this.LJLLLLLL = c93635aU3;
        this.LJLJI = -1;
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        c93635aU3.LJII(27);
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
            valueAnimator2.setInterpolator(C93830aXC.LIZ);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new C93630aTy(this, i4, left, i3, right));
            valueAnimator2.addListener(new C93631aTz(this, i));
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
        C93635aU3 c93635aU3 = this.LJLLLLLL;
        int i6 = c93635aU3.LJLZ;
        if (i6 == 1) {
            if (c93635aU3.LJLLLLLL != 1 || i4 <= 0) {
                return;
            }
            if (i4 * childCount <= getMeasuredWidth() - (c93635aU3.LJII(16) * 2)) {
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
                C93635aU3 c93635aU32 = this.LJLLLLLL;
                c93635aU32.LJLLLLLL = 0;
                c93635aU32.LJIJ(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (i6 != 0 || !c93635aU3.LJZ || c93635aU3.LLIIIL != getResources().getConfiguration().orientation || i4 <= 0) {
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
