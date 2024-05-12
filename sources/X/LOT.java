package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class LOT extends LinearLayout {
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
    public int LJLLL;
    public LinearGradient LJLLLL;
    public LinearGradient LJLLLLLL;
    public LinearGradient LJLZ;
    public Paint LJZ;
    public PorterDuffXfermode LJZI;
    public int LJZL;
    public OSJ<Float, Float, ? extends Paint> LL;
    public float LLD;
    public float LLF;
    public final /* synthetic */ LOS LLFF;

    public final void LJI() {
        int i;
        View childAt = getChildAt(this.LJLJJLL);
        int i2 = -1;
        if (childAt != null && childAt.getWidth() > 0) {
            i2 = childAt.getLeft();
            i = childAt.getRight();
            if (C52309Kfx.LIZ()) {
                boolean LJIJJ = this.LLFF.LJIJJ(this.LJLJJLL);
                if (!this.LLFF.LLD) {
                    i2 = LIZJ(this.LJLJJLL);
                    i = LJ(this.LJLJJLL, i2, LJIJJ);
                    if (LJIJJ) {
                        i -= this.LLFF.LLIIIL;
                    }
                } else {
                    i2 = LIZLLL(this.LJLJJLL);
                    i = LJ(this.LJLJJLL, i2, LJIJJ);
                    if (LJIJJ) {
                        i2 += this.LLFF.LLIIIL;
                    }
                    if (this.LJLJJLL == 0) {
                        i2 += this.LLFF.LLIIL;
                    }
                }
            }
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
                if (C52309Kfx.LIZ()) {
                    boolean LJIJJ2 = this.LLFF.LJIJJ(this.LJLJJLL + 1);
                    if (!this.LLFF.LLD) {
                        left = LIZJ(this.LJLJJLL + 1);
                        right = LJ(this.LJLJJLL + 1, left, LJIJJ2);
                        if (LJIJJ2) {
                            right -= this.LLFF.LLIIIL;
                        }
                    } else {
                        left = LIZLLL(this.LJLJJLL + 1);
                        right = LJ(this.LJLJJLL + 1, left, LJIJJ2);
                        if (LJIJJ2) {
                            left += this.LLFF.LLIIIL;
                        }
                    }
                }
                if (this.LJLILLLLZI > 0) {
                    int abs2 = Math.abs(right - left) / 2;
                    int i4 = this.LJLJI;
                    left = (left + abs2) - i4;
                    right = (right - abs2) + i4;
                }
                float f = this.LJLJL;
                float f2 = left * f;
                float f3 = 1.0f - f;
                i2 = (int) ((i2 * f3) + f2);
                i = (int) ((f3 * i) + (right * f));
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
        return this.LL;
    }

    public final float getIndicatorLineCorner() {
        return this.LLF;
    }

    public final LinearGradient getLeftGradientRTL() {
        return this.LJLLLLLL;
    }

    public final PorterDuffXfermode getMDuffXferMode() {
        return this.LJZI;
    }

    public final boolean getMIsDragged() {
        return this.LJLLJ;
    }

    public final int getMLayerId() {
        return this.LJZL;
    }

    public final LinearGradient getMLeftGradient() {
        return this.LJLLLL;
    }

    public final Paint getMOverBorderPaint() {
        return this.LJZ;
    }

    public final LinearGradient getMRightGradient() {
        return this.LJLZ;
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
        return this.LLD;
    }

    public final int LIZJ(int i) {
        LOS los = this.LLFF;
        if (los.LLIIZ && !((Boolean) los.LLIILZL.getValue()).booleanValue()) {
            LOS los2 = this.LLFF;
            if (los2.LLIL) {
                int width = los2.getWidth();
                LOS los3 = this.LLFF;
                if (los3.LLIIJLIL <= 0) {
                    los3.LLIIJLIL = width;
                }
                if (width == los3.LLIIJLIL) {
                    Integer num = (Integer) ((LinkedHashMap) los3.LLIIJI).get(Integer.valueOf(i));
                    if (num != null && num.intValue() >= 0) {
                        return num.intValue();
                    }
                } else {
                    los3.LLIIJLIL = width;
                    los3.LLIIJI = new LinkedHashMap();
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += LIZIZ(i3, i);
        }
        if (this.LLFF.LLIIZ) {
            this.LLFF.LLIIJI.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return i2;
    }

    public final int LIZLLL(int i) {
        LOS los = this.LLFF;
        if (los.LLIIZ && !((Boolean) los.LLIILZL.getValue()).booleanValue()) {
            LOS los2 = this.LLFF;
            if (los2.LLIL) {
                int width = los2.getWidth();
                LOS los3 = this.LLFF;
                if (los3.LLIIJLIL <= 0) {
                    los3.LLIIJLIL = width;
                }
                if (width == los3.LLIIJLIL) {
                    Integer num = (Integer) ((LinkedHashMap) los3.LLIIJI).get(Integer.valueOf(i));
                    if (num != null && num.intValue() >= 0) {
                        return num.intValue();
                    }
                } else {
                    los3.LLIIJLIL = width;
                    los3.LLIIJI = new LinkedHashMap();
                }
            }
        }
        int tabCount = this.LLFF.getTabCount() - 1;
        int i2 = i + 1;
        int i3 = 0;
        if (i2 <= tabCount) {
            while (true) {
                i3 += LIZIZ(tabCount, i);
                if (tabCount == i2) {
                    break;
                }
                tabCount--;
            }
        }
        if (this.LLFF.LLIIZ) {
            this.LLFF.LLIIJI.put(Integer.valueOf(i), Integer.valueOf(i3));
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOT.draw(android.graphics.Canvas):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = -1;
        if (this.LLFF.getMMode() == 0 && this.LJLJJI > 0.0f) {
            LOS los = this.LLFF;
            if ((los.canScrollHorizontally(-1) || los.canScrollHorizontally(1)) && canvas != null) {
                i = canvas.saveLayer(this.LLFF.getScrollX(), 0.0f, this.LLFF.getScrollX() + getWidth(), getHeight(), this.LJZ, 31);
            }
        }
        this.LJZL = i;
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
        this.LL = osj;
    }

    public final void setIndicatorLineCorner(float f) {
        this.LLF = f;
    }

    public final void setLeftGradientRTL(LinearGradient linearGradient) {
        this.LJLLLLLL = linearGradient;
    }

    public final void setMDuffXferMode(PorterDuffXfermode porterDuffXfermode) {
        this.LJZI = porterDuffXfermode;
    }

    public final void setMIsDragged(boolean z) {
        this.LJLLJ = z;
    }

    public final void setMLayerId(int i) {
        this.LJZL = i;
    }

    public final void setMLeftGradient(LinearGradient linearGradient) {
        this.LJLLLL = linearGradient;
    }

    public final void setMOverBorderPaint(Paint paint) {
        this.LJZ = paint;
    }

    public final void setMRightGradient(LinearGradient linearGradient) {
        this.LJLZ = linearGradient;
    }

    public final void setMSelectedPosition(int i) {
        this.LJLJJLL = i;
    }

    public final void setMSelectionOffset(float f) {
        this.LJLJL = f;
    }

    public final void setOverBorderWidth(float f) {
        this.LJLJJI = f;
        float LJIIIIZZ = f + this.LLFF.LJIIIIZZ(4);
        int i = this.LLFF.LLIIIZ;
        float f2 = this.LJLJJI;
        float f3 = i / (i + f2);
        if (f2 > 0.0f) {
            this.LJLLLL = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.LJLLLLLL = new LinearGradient(0.0f, 0.0f, f + C7MY.LIZIZ(24), 0.0f, new int[]{0, 0, -16777216}, new float[]{0.0f, f3, 1.0f}, Shader.TileMode.CLAMP);
            this.LJLZ = new LinearGradient(0.0f, 0.0f, LJIIIIZZ, 0.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.LJZL = -1;
            if (this.LJZ == null) {
                this.LJZ = new Paint(1);
            }
            if (this.LJZI == null) {
                this.LJZI = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
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

    public final void setSelectedTabHorizontalPadding(int i) {
        this.LJLLL = i;
    }

    public final void setStripMargin(float f) {
        this.LLD = f;
    }

    public final void setTabStripMargin(float f) {
        this.LLD = f;
        C16300kU.LJIIJ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LOT(LOS los, Context context) {
        super(context);
        this.LLFF = los;
        new LinkedHashMap();
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLL = -1;
        this.LJLLILLLL = Integer.MAX_VALUE;
        this.LJZL = -1;
        this.LLF = -1.0f;
        setWillNotDraw(false);
        this.LJLJJL = new Paint();
    }

    public final void LIZ(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int LIZJ;
        int LJ;
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LJLLI;
            o.LJI(valueAnimator2);
            valueAnimator2.cancel();
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            LJI();
            return;
        }
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = childAt.getLeft();
        C76732zl c76732zl2 = new C76732zl();
        c76732zl2.element = childAt.getRight();
        if (C52309Kfx.LIZ()) {
            boolean LJIJJ = this.LLFF.LJIJJ(i);
            if (this.LLFF.LLD) {
                LIZJ = LIZLLL(i);
                LJ = LJ(i, LIZJ, LJIJJ);
                if (LJIJJ) {
                    LIZJ += this.LLFF.LLIIIL;
                }
                if (i == 0) {
                    LIZJ += this.LLFF.LLIIL;
                }
            } else {
                LIZJ = LIZJ(i);
                LJ = LJ(i, LIZJ, LJIJJ);
                if (LJIJJ) {
                    LJ -= this.LLFF.LLIIIL;
                }
            }
            if (LIZJ >= 0) {
                c76732zl.element = LIZJ;
                c76732zl2.element = LJ;
            }
        }
        LOW tabAnimationHelper = this.LLFF.getTabAnimationHelper();
        if (Math.abs(i - this.LJLJJLL) <= 1 || tabAnimationHelper != null) {
            i3 = this.LJLJLLL;
            i4 = this.LJLL;
        } else {
            int LJIIIIZZ = this.LLFF.LJIIIIZZ(24);
            if (i < this.LJLJJLL) {
                if (this.LLFF.LJIILIIL()) {
                    i5 = c76732zl.element;
                    i4 = i5 - LJIIIIZZ;
                } else {
                    i6 = c76732zl2.element;
                    i4 = i6 + LJIIIIZZ;
                }
            } else if (this.LLFF.LJIILIIL()) {
                i6 = c76732zl2.element;
                i4 = i6 + LJIIIIZZ;
            } else {
                i5 = c76732zl.element;
                i4 = i5 - LJIIIIZZ;
            }
            i3 = i4;
        }
        if (i3 != c76732zl.element || i4 != c76732zl2.element) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.LJLLI = valueAnimator3;
            valueAnimator3.setInterpolator(LOS.LLILII);
            valueAnimator3.setDuration(i2);
            valueAnimator3.setFloatValues(0.0f, 1.0f);
            valueAnimator3.addUpdateListener(new LOZ(this, c76732zl2, c76732zl, i3, i4));
            valueAnimator3.addListener(new C54177LOb(this, i, this.LLFF));
            valueAnimator3.start();
        }
    }

    public final int LIZIZ(int i, int i2) {
        ImageView imageView;
        int i3;
        Integer num;
        int i4;
        Drawable drawable;
        SY9 sy9;
        Object obj;
        int LIZIZ;
        Drawable[] compoundDrawables;
        View childAt = getChildAt(i);
        Integer num2 = null;
        if (childAt != null) {
            imageView = (ImageView) childAt.findViewById(R.id.e6d);
        } else {
            imageView = null;
        }
        if (childAt != null) {
            i3 = childAt.getWidth();
        } else {
            i3 = 0;
        }
        if (childAt instanceof LOX) {
            if (this.LLFF.LLD) {
                i4 = 0;
            } else {
                i4 = 2;
            }
            LOX lox = (LOX) childAt;
            TextView mCustomTextView$homepage_common_release = lox.getMCustomTextView$homepage_common_release();
            if (mCustomTextView$homepage_common_release != null && (compoundDrawables = mCustomTextView$homepage_common_release.getCompoundDrawables()) != null) {
                drawable = (Drawable) ORY.LJJJJI(i4, compoundDrawables);
            } else {
                drawable = null;
            }
            if ((drawable instanceof SY9) && (sy9 = (SY9) drawable) != null) {
                LOP tab = lox.getTab();
                if (tab != null) {
                    obj = tab.LJ;
                } else {
                    obj = null;
                }
                if (o.LJ(obj, "FRIENDS_FEED")) {
                    LIZIZ = this.LLFF.LLIILII;
                } else {
                    LIZIZ = sy9.LIZIZ();
                }
                i3 -= LIZIZ;
            }
        }
        if (imageView != null && imageView.getVisibility() == 0) {
            i3 -= imageView.getWidth();
        }
        if (Math.abs(i2 - i) > 1 && imageView != null) {
            imageView.setVisibility(8);
        }
        StringBuilder LJ = C7MY.LJ("getTabViewLeft, visibility: left:", i3, ", ");
        if (imageView != null) {
            num = Integer.valueOf(imageView.getVisibility());
        } else {
            num = null;
        }
        LJ.append(num);
        LJ.append(", ");
        if (imageView != null) {
            num2 = Integer.valueOf(imageView.getWidth());
        }
        LJ.append(num2);
        X1D.LIZIZ(LJ);
        return i3;
    }

    public final void LJFF(int i, float f) {
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LJLLI;
            o.LJI(valueAnimator2);
            valueAnimator2.cancel();
        }
        this.LJLJJLL = i;
        this.LJLJL = f;
        LJI();
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
        if (this.LLFF.getMMode() == 1 && this.LLFF.getMTabGravity() == 1) {
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (this.LLFF.LJIIIIZZ(16) * 2)) {
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
                this.LLFF.setMTabGravity(0);
                this.LLFF.LJJ(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (this.LLFF.getMMode() == 0) {
            LOS los = this.LLFF;
            if (!los.LJLLILLLL || los.LJZ != getResources().getConfiguration().orientation || i3 <= 0) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getVisibility() != 8) {
                    i6 += childAt2.getMeasuredWidth();
                }
            }
            if (i6 > 0 && i6 < (measuredWidth = (this.LLFF.getMeasuredWidth() - this.LLFF.LJLJI.getPaddingLeft()) - this.LLFF.LJLJI.getPaddingRight())) {
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

    public final int LJ(int i, int i2, boolean z) {
        View view;
        int i3;
        int i4;
        Integer num;
        View childAt = getChildAt(i);
        Integer num2 = null;
        if (childAt != null) {
            view = childAt.findViewById(R.id.e6d);
        } else {
            view = null;
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        } else {
            i3 = 0;
        }
        int i5 = i2 + i3;
        if (z) {
            i4 = this.LLFF.LLIIIL;
        } else {
            i4 = 0;
        }
        int i6 = i5 + i4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getTabViewRight: visibility: pos:");
        LIZ.append(i);
        LIZ.append(' ');
        if (view != null) {
            num = Integer.valueOf(view.getVisibility());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        if (view != null) {
            num2 = Integer.valueOf(view.getWidth());
        }
        LIZ.append(num2);
        X1D.LIZIZ(LIZ);
        if (view != null && view.getVisibility() == 0) {
            return i6 - view.getWidth();
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            android.animation.ValueAnimator r0 = r5.LJLLI
            if (r0 == 0) goto L55
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L55
            X.LOS r0 = r5.LLFF
            boolean r0 = r0.LJIIL()
            if (r0 != 0) goto L3d
            android.animation.ValueAnimator r0 = r5.LJLLI
            if (r0 == 0) goto L1f
            r0.cancel()
        L1f:
            android.animation.ValueAnimator r0 = r5.LJLLI
            if (r0 == 0) goto L52
            long r2 = r0.getDuration()
        L27:
            int r4 = r5.LJLJJLL
            android.animation.ValueAnimator r0 = r5.LJLLI
            if (r0 == 0) goto L50
            float r0 = r0.getAnimatedFraction()
        L31:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            r5.LIZ(r4, r0)
        L3d:
            X.LOS r2 = r5.LLFF
            int r1 = r2.getMeasuredWidth()
            int r0 = r5.getMeasuredWidth()
            if (r1 >= r0) goto L4e
            r0 = 1
        L4a:
            r2.setTouchable(r0)
            return
        L4e:
            r0 = 0
            goto L4a
        L50:
            r0 = 0
            goto L31
        L52:
            r2 = 200(0xc8, double:9.9E-322)
            goto L27
        L55:
            r5.LJI()
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOT.onLayout(boolean, int, int, int, int):void");
    }
}
