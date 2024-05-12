package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZqD, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public class C91165ZqD extends LinearLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public final Paint LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public ValueAnimator LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public LinearGradient LJLLL;
    public LinearGradient LJLLLL;
    public Paint LJLLLLLL;
    public PorterDuffXfermode LJLZ;
    public int LJZ;
    public OSJ<Float, Float, ? extends Paint> LJZI;
    public float LJZL;
    public final /* synthetic */ C91171ZqJ LL;

    public final void LIZIZ() {
        int i;
        View childAt = getChildAt(this.LJLJJLL);
        int i2 = -1;
        if (childAt != null && childAt.getWidth() > 0) {
            i2 = childAt.getLeft();
            i = childAt.getRight();
            if (this.LJLILLLLZI > 0) {
                int abs = Math.abs(i - i2) / 2;
                int i3 = this.LJLJI;
                i2 = (i2 + abs) - i3;
                i = (i - abs) + i3;
            }
            if (this.LJLJL > 0.0f && this.LJLJJLL < getChildCount() - 1) {
                View childAt2 = getChildAt(this.LJLJJLL + 1);
                int left = childAt2.getLeft();
                int right = childAt2.getRight();
                if (this.LJLILLLLZI > 0) {
                    int abs2 = Math.abs(right - left) / 2;
                    int i4 = this.LJLJI;
                    left = (left + abs2) - i4;
                    right = (right - abs2) + i4;
                }
                float f = this.LJLJL;
                float f2 = left * f;
                float f3 = 1.0f - f;
                i2 = (int) (f2 + (i2 * f3));
                i = (int) ((right * f) + (f3 * i));
            }
        } else {
            i = -1;
        }
        if (i2 != this.LJLJLLL || i != this.LJLL) {
            this.LJLJLLL = i2;
            this.LJLL = i;
            C16300kU.LJIIJ(this);
        }
    }

    public final float getIndicatorPosition() {
        return this.LJLJJLL + this.LJLJL;
    }

    public final OSJ<Float, Float, Paint> getBarrierTriple() {
        return this.LJZI;
    }

    public final PorterDuffXfermode getMDuffXferMode() {
        return this.LJLZ;
    }

    public final boolean getMIsDragged() {
        return this.LJLLJ;
    }

    public final int getMLayerId() {
        return this.LJZ;
    }

    public final LinearGradient getMLeftGradient() {
        return this.LJLLL;
    }

    public final Paint getMOverBorderPaint() {
        return this.LJLLLLLL;
    }

    public final LinearGradient getMRightGradient() {
        return this.LJLLLL;
    }

    public final Paint getMSelectedIndicatorPaint() {
        return this.LJLJJL;
    }

    public final int getMSelectedPosition() {
        return this.LJLJJLL;
    }

    public final float getMSelectionOffset() {
        return this.LJLJL;
    }

    public final float getStripMargin() {
        return this.LJZL;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            java.lang.String r0 = "canvas"
            r7 = r14
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.draw(r7)
            int r2 = r13.getChildCount()
            r1 = 1
            if (r2 <= r1) goto L8f
            X.OSJ<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint> r0 = r13.LJZI
            if (r0 == 0) goto L8f
            int r0 = X.C16310kV.LIZLLL(r13)
            if (r0 != r1) goto L1f
            int r2 = r2 + (-1)
            r1 = 0
        L1d:
            if (r1 >= r2) goto L8f
        L1f:
            int r0 = r13.getHeight()
            float r9 = (float) r0
            X.OSJ<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint> r0 = r13.LJZI
            r6 = 0
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L33:
            float r9 = r9 - r0
            r0 = 2
            float r5 = (float) r0
            float r9 = r9 / r5
            android.view.View r4 = r13.getChildAt(r1)
            X.OSJ<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint> r0 = r13.LJZI
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r3 = r0.floatValue()
        L49:
            float r3 = r3 / r5
            int r0 = r4.getLeft()
            float r8 = (float) r0
            float r8 = r8 - r3
            int r0 = r4.getLeft()
            float r10 = (float) r0
            X.OSJ<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint> r0 = r13.LJZI
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
        L63:
            float r10 = r10 + r0
            X.OSJ<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint> r0 = r13.LJZI
            if (r0 == 0) goto L72
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            float r6 = r0.floatValue()
        L72:
            float r11 = r9 + r6
            X.OSJ<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint> r0 = r13.LJZI
            if (r0 == 0) goto L87
            java.lang.Object r12 = r0.getThird()
            android.graphics.Paint r12 = (android.graphics.Paint) r12
        L7e:
            kotlin.jvm.internal.o.LJI(r12)
            r7.drawRect(r8, r9, r10, r11, r12)
            int r1 = r1 + 1
            goto L1d
        L87:
            r12 = 0
            goto L7e
        L89:
            r0 = 0
            goto L63
        L8b:
            r3 = 0
            goto L49
        L8d:
            r0 = 0
            goto L33
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91165ZqD.draw(android.graphics.Canvas):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = -1;
        if (this.LL.getMMode() == 0 && this.LJLJJI > 0.0f) {
            C91171ZqJ c91171ZqJ = this.LL;
            if ((c91171ZqJ.canScrollHorizontally(-1) || c91171ZqJ.canScrollHorizontally(1)) && canvas != null) {
                i = canvas.saveLayer(this.LL.getScrollX(), 0.0f, this.LL.getScrollX() + getWidth(), getHeight(), this.LJLLLLLL, 31);
            }
        }
        this.LJZ = i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.LJLJLJ != i) {
            requestLayout();
            this.LJLJLJ = i;
        }
    }

    public final void setBarrierTriple(OSJ<Float, Float, ? extends Paint> osj) {
        this.LJZI = osj;
    }

    public final void setMDuffXferMode(PorterDuffXfermode porterDuffXfermode) {
        this.LJLZ = porterDuffXfermode;
    }

    public final void setMIsDragged(boolean z) {
        this.LJLLJ = z;
    }

    public final void setMLayerId(int i) {
        this.LJZ = i;
    }

    public final void setMLeftGradient(LinearGradient linearGradient) {
        this.LJLLL = linearGradient;
    }

    public final void setMOverBorderPaint(Paint paint) {
        this.LJLLLLLL = paint;
    }

    public final void setMRightGradient(LinearGradient linearGradient) {
        this.LJLLLL = linearGradient;
    }

    public final void setMSelectedPosition(int i) {
        this.LJLJJLL = i;
    }

    public final void setMSelectionOffset(float f) {
        this.LJLJL = f;
    }

    public final void setOverBorderWidth(float f) {
        this.LJLJJI = f;
        if (f > 0.0f) {
            this.LJLLL = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, 0, -16777216}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP);
            this.LJLLLL = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{-16777216, 0, 0}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            this.LJZ = -1;
            if (this.LJLLLLLL == null) {
                this.LJLLLLLL = new Paint(1);
            }
            if (this.LJLZ == null) {
                this.LJLZ = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
            }
        }
    }

    public final void setSelectedIndicatorColor(int i) {
        if (this.LJLJJL.getColor() != i) {
            this.LJLJJL.setColor(i);
            C16300kU.LJIIJ(this);
        }
    }

    public final void setSelectedIndicatorHeight(int i) {
        if (this.LJLIL != i) {
            this.LJLIL = i;
            C16300kU.LJIIJ(this);
        }
    }

    public final void setStripMargin(float f) {
        this.LJZL = f;
    }

    public final void setTabBarrierColor(int i) {
        Paint third;
        OSJ<Float, Float, ? extends Paint> osj = this.LJZI;
        if (osj == null || (third = osj.getThird()) == null) {
            return;
        }
        third.setColor(i);
    }

    public final void setTabStripMargin(float f) {
        this.LJZL = f;
        C16300kU.LJIIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91165ZqD(C91171ZqJ c91171ZqJ, Context context) {
        super(context);
        this.LL = c91171ZqJ;
        new LinkedHashMap();
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLL = -1;
        this.LJLLILLLL = Integer.MAX_VALUE;
        this.LJZ = -1;
        setWillNotDraw(false);
        this.LJLJJL = new Paint();
    }

    public final void LIZ(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LJLLI;
            o.LJI(valueAnimator2);
            valueAnimator2.cancel();
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
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = childAt.getLeft();
        C76732zl c76732zl2 = new C76732zl();
        c76732zl2.element = childAt.getRight();
        if (Math.abs(i - this.LJLJJLL) <= 1) {
            i5 = this.LJLJLLL;
            i6 = this.LJLL;
        } else {
            int LIZLLL = this.LL.LIZLLL(24);
            if (i < this.LJLJJLL) {
                if (z) {
                    i3 = c76732zl.element;
                    i5 = i3 - LIZLLL;
                } else {
                    i4 = c76732zl2.element;
                    i5 = i4 + LIZLLL;
                }
            } else if (z) {
                i4 = c76732zl2.element;
                i5 = i4 + LIZLLL;
            } else {
                i3 = c76732zl.element;
                i5 = i3 - LIZLLL;
            }
            i6 = i5;
        }
        if (i5 != c76732zl.element || i6 != c76732zl2.element) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.LJLLI = valueAnimator3;
            valueAnimator3.setInterpolator(C91171ZqJ.LLF);
            valueAnimator3.setDuration(i2);
            valueAnimator3.setFloatValues(0.0f, 1.0f);
            valueAnimator3.addUpdateListener(new C91163ZqB(this, c76732zl2, c76732zl, i5, i6));
            valueAnimator3.addListener(new C91164ZqC(this, i));
            valueAnimator3.start();
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
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                i3 = Math.max(i3, childAt.getMeasuredWidth());
                this.LJLLILLLL = Math.min(this.LJLLILLLL, childAt.getMeasuredWidth());
            }
        }
        if (this.LL.getMMode() == 1 && this.LL.getMTabGravity() == 1) {
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (this.LL.LIZLLL(16) * 2)) {
                boolean z2 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    ViewGroup.LayoutParams layoutParams = getChildAt(i5).getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (layoutParams2.width != i3 || layoutParams2.weight != 0.0f) {
                        layoutParams2.width = i3;
                        layoutParams2.weight = 0.0f;
                        z2 = true;
                    }
                }
                if (!z2) {
                    return;
                }
            } else {
                this.LL.setMTabGravity(0);
                this.LL.LJIIIZ(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (this.LL.getMMode() == 0) {
            C91171ZqJ c91171ZqJ = this.LL;
            if (!c91171ZqJ.LJLL || c91171ZqJ.LJLLLLLL != getResources().getConfiguration().orientation || i3 <= 0) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() != 8) {
                    i6 += childAt2.getMeasuredWidth();
                }
            }
            if (i6 > 0 && i6 < (measuredWidth = (this.LL.getMeasuredWidth() - this.LL.LJLJI.getPaddingLeft()) - this.LL.LJLJI.getPaddingRight())) {
                if (i3 * childCount < measuredWidth) {
                    z = false;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        ViewGroup.LayoutParams layoutParams3 = getChildAt(i8).getLayoutParams();
                        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        if (layoutParams4.width != 0 || layoutParams4.weight != 1.0f) {
                            layoutParams4.width = 0;
                            layoutParams4.weight = 1.0f;
                            z = true;
                        }
                    }
                } else {
                    int i9 = (measuredWidth - i6) / (childCount * 2);
                    z = false;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        if (getChildAt(i10).getVisibility() != 8) {
                            ViewGroup.LayoutParams layoutParams5 = getChildAt(i10).getLayoutParams();
                            o.LJII(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                            layoutParams6.leftMargin = i9;
                            layoutParams6.rightMargin = i9;
                            z = true;
                        }
                    }
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null) {
            o.LJI(valueAnimator);
            if (valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.LJLLI;
                o.LJI(valueAnimator2);
                valueAnimator2.cancel();
                ValueAnimator valueAnimator3 = this.LJLLI;
                o.LJI(valueAnimator3);
                long duration = valueAnimator3.getDuration();
                int i5 = this.LJLJJLL;
                ValueAnimator valueAnimator4 = this.LJLLI;
                o.LJI(valueAnimator4);
                LIZ(i5, Math.round((1.0f - valueAnimator4.getAnimatedFraction()) * ((float) duration)));
                return;
            }
        }
        LIZIZ();
    }
}
