package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43591nP extends C1K4 {
    public View LJLJI;
    public int LJLJJI;
    public Path LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public Paint LJLL;
    public Paint LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public final RectF LJLLLLLL;
    public final RectF LJLZ;
    public final RectF LJZ;
    public final RectF LJZI;
    public final Rect LJZL;
    public final Rect LL;
    public final Rect LLD;
    public Rect LLF;
    public int LLFF;
    public int LLFFF;
    public Rect LLFII;
    public Rect LLFZ;
    public final PointF LLI;
    public final PointF LLIFFJFJJ;
    public boolean LLII;
    public Paint LLIIII;

    public C43591nP(Context context) {
        super(context);
        this.LJLLLLLL = new RectF();
        this.LJLZ = new RectF();
        this.LJZ = new RectF();
        this.LJZI = new RectF();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        this.LJZL = rect2;
        Rect rect3 = new Rect();
        this.LL = rect3;
        this.LLD = new Rect();
        this.LLI = new PointF();
        this.LLIFFJFJJ = new PointF();
        Paint paint = new Paint(1);
        this.LJLL = paint;
        paint.setColor(C259910h.LIZIZ(R.attr.bnm, getContext()));
        setWillNotDraw(false);
        this.LJLJJL = new Path();
        this.LJLJJLL = getContext().getResources().getDimensionPixelSize(R.dimen.ahj);
        this.LJLJLJ = getContext().getResources().getDimensionPixelSize(R.dimen.ahi);
        this.LJLJLLL = getContext().getResources().getDimensionPixelSize(R.dimen.ahg);
        this.LJLLILLLL = getContext().getResources().getDimension(R.dimen.ahf);
        this.LJLLJ = getContext().getResources().getDimension(R.dimen.ahh);
        this.LJLLL = getContext().getResources().getDimensionPixelSize(R.dimen.ahr);
        this.LJLLLL = getContext().getResources().getDimensionPixelSize(R.dimen.ahq);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.ahl);
        rect2.set(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int i = this.LJLLLL;
        rect.left = i;
        int i2 = this.LJLLL;
        rect.top = i - i2;
        rect.right = i;
        rect.bottom = i2 + i;
        rect3.left = Math.max(i, rect2.left);
        rect3.top = Math.max(rect.top, rect2.top);
        rect3.right = Math.max(rect.right, rect2.right);
        rect3.bottom = Math.max(rect.bottom, rect2.bottom);
        if (this.LJLLLL > 0) {
            Paint paint2 = new Paint(1);
            this.LJLLI = paint2;
            paint2.setColor(-16777216);
            TypedValue typedValue = new TypedValue();
            getContext().getResources().getValue(R.dimen.ahp, typedValue, true);
            this.LJLLI.setAlpha((int) (typedValue.getFloat() * 255.0f));
            this.LJLLI.setMaskFilter(new BlurMaskFilter(this.LJLLLL, BlurMaskFilter.Blur.NORMAL));
        }
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LJLLI != null) {
            canvas.save();
            Rect rect = this.LLD;
            canvas.translate(rect.left, rect.top + this.LJLLL);
            this.LJLJJL.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.LJLJJL, this.LJLLI);
            canvas.restore();
        }
        if (this.LLII) {
            C0EL.LIZ(canvas, getWidth(), getHeight(), null);
        }
        super.draw(canvas);
        if (this.LLII) {
            Rect rect2 = this.LLD;
            canvas.translate(rect2.left, rect2.top);
            this.LJLJJL.setFillType(Path.FillType.INVERSE_WINDING);
            canvas.drawPath(this.LJLJJL, this.LLIIII);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLII) {
            canvas.drawColor(this.LJLL.getColor());
            return;
        }
        canvas.save();
        Rect rect = this.LLD;
        canvas.translate(rect.left, rect.top);
        this.LJLJJL.setFillType(Path.FillType.WINDING);
        canvas.drawPath(this.LJLJJL, this.LJLL);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int max;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i7;
        int i8;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i9 = this.LJLJJI;
        boolean z2 = true;
        if (i9 == 8388611 || i9 == 8388613) {
            z = true;
            max = Math.max((this.LJLJJLL * 2) + this.LJLJLJ, this.LJLJL * 2);
        } else {
            z = false;
            max = Math.max(this.LJLJJLL * 2, this.LJLJL * 2) + this.LJLJLLL;
        }
        Rect rect = this.LLFII;
        int i10 = rect.left;
        if (i10 == -1) {
            i10 = this.LJZL.left;
        }
        int i11 = size - i10;
        int i12 = rect.right;
        if (i12 == -1) {
            i12 = this.LJZL.right;
        }
        int i13 = this.LJLJL;
        int i14 = (i11 - i12) - (i13 * 2);
        if (z) {
            i14 -= this.LJLJLLL;
        }
        int i15 = this.LLFFF - (i13 * 2);
        if (z) {
            i3 = this.LJLJLLL;
        } else {
            i3 = 0;
        }
        int max2 = Math.max(0, Math.min(i14, i15 - i3));
        Rect rect2 = this.LLFII;
        int i16 = rect2.top;
        if (i16 == -1) {
            i16 = this.LJZL.top;
        }
        int i17 = size2 - i16;
        int i18 = rect2.bottom;
        if (i18 == -1) {
            i18 = this.LJZL.bottom;
        }
        int i19 = (i17 - i18) - (this.LJLJL * 2);
        if (!z) {
            i19 -= this.LJLJLLL;
        }
        int max3 = Math.max(0, i19);
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        childAt.measure(FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(max2, LiveLayoutPreloadThreadPriority.DEFAULT), 0, layoutParams.width), FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(max3, LiveLayoutPreloadThreadPriority.DEFAULT), 0, layoutParams.height));
        if (layoutParams.width == -1 && childAt.getMeasuredWidth() < (i8 = this.LLFF - (this.LJLJL * 2))) {
            childAt.measure(FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), 0, layoutParams.width), FrameLayout.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(max3, LiveLayoutPreloadThreadPriority.DEFAULT), 0, layoutParams.height));
        }
        int max4 = Math.max((this.LJLJL * 2) + childAt.getMeasuredWidth(), this.LLFF);
        if (z) {
            i4 = this.LJLJLLL;
        } else {
            i4 = 0;
        }
        int i20 = max4 + i4;
        int measuredHeight = (this.LJLJL * 2) + childAt.getMeasuredHeight();
        if (z) {
            i5 = 0;
        } else {
            i5 = this.LJLJLLL;
        }
        int max5 = Math.max(max, measuredHeight + i5);
        PointF pointF = this.LLI;
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        Rect rect3 = this.LLFII;
        if (rect3.left != -1 || rect3.right != -1) {
            int height = this.LLFZ.top - ((max5 - this.LJLJI.getHeight()) / 2);
            Rect rect4 = this.LLF;
            int i21 = rect4.top;
            int i22 = height - i21;
            Rect rect5 = this.LJZL;
            int i23 = rect5.top;
            if (i22 <= i21 + i23) {
                height = i21 + i23;
                i6 = height + max5;
            } else {
                int i24 = height + max5;
                int i25 = rect4.bottom;
                int i26 = rect5.bottom;
                if (i24 >= i25 - i26) {
                    i6 = i25 - i26;
                    height = i6 - max5;
                } else {
                    i6 = i24;
                }
            }
            Rect rect6 = this.LLFZ;
            PointF pointF2 = this.LLI;
            int i27 = this.LJLJJLL;
            int i28 = this.LJLJLJ;
            pointF2.y = C78609UtB.LJJIIJZLJL((rect6.bottom + rect6.top) / 2.0f, (i28 / 2.0f) + (height + i27), (i6 - i27) - (i28 / 2.0f)) - ((i6 + height) / 2.0f);
            this.LLD.top = Math.min(height - this.LLF.top, this.LL.top);
            this.LLD.bottom = Math.min(this.LLF.bottom - i6, this.LL.bottom);
            Rect rect7 = this.LLFII;
            int i29 = rect7.left;
            if (i29 != -1) {
                Rect rect8 = this.LLD;
                rect8.left = i29;
                int i30 = this.LLFZ.right;
                int i31 = this.LJZL.right;
                int i32 = i30 + i20 + i31;
                Rect rect9 = this.LLF;
                int i33 = rect9.right;
                if (i32 > i33) {
                    rect8.right = i31;
                } else {
                    rect8.right = Math.min(Math.min(i33 - i30, rect9.width() - this.LLD.left) - i20, this.LL.right);
                }
            } else {
                Rect rect10 = this.LLD;
                rect10.right = rect7.right;
                int i34 = this.LLFZ.left;
                int i35 = this.LJZL.left;
                int i36 = (i34 - i20) - i35;
                Rect rect11 = this.LLF;
                int i37 = rect11.left;
                if (i36 < i37) {
                    rect10.left = i35;
                } else {
                    rect10.left = Math.min(Math.min(i34 - i37, rect11.width() - this.LLD.right) - i20, this.LL.left);
                }
            }
        } else {
            int width = this.LLFZ.left - ((i20 - this.LJLJI.getWidth()) / 2);
            Rect rect12 = this.LLF;
            int i38 = rect12.left;
            int i39 = width - i38;
            Rect rect13 = this.LJZL;
            int i40 = rect13.left;
            if (i39 <= i38 + i40) {
                width = i38 + i40;
                i7 = width + i20;
            } else {
                i7 = width + i20;
                int i41 = rect12.right;
                int i42 = rect13.right;
                if (i7 >= i41 - i42) {
                    i7 = i41 - i42;
                    width = i7 - i20;
                }
            }
            Rect rect14 = this.LLFZ;
            PointF pointF3 = this.LLI;
            int i43 = this.LJLJJLL;
            int i44 = this.LJLJLJ;
            pointF3.x = C78609UtB.LJJIIJZLJL((rect14.right + rect14.left) / 2.0f, (i44 / 2.0f) + (width + i43), (i7 - i43) - (i44 / 2.0f)) - ((i7 + width) / 2.0f);
            this.LLD.left = Math.min(width - this.LLF.left, this.LL.left);
            this.LLD.right = Math.min(this.LLF.right - i7, this.LL.right);
            Rect rect15 = this.LLFII;
            int i45 = rect15.top;
            if (i45 != -1) {
                Rect rect16 = this.LLD;
                rect16.top = i45;
                int i46 = this.LLFZ.bottom;
                int i47 = this.LJZL.bottom;
                int i48 = i46 + max5 + i47;
                Rect rect17 = this.LLF;
                int i49 = rect17.bottom;
                if (i48 > i49) {
                    rect16.bottom = i47;
                } else {
                    rect16.bottom = Math.min(Math.min(i49 - i46, rect17.height() - this.LLD.top) - max5, this.LL.bottom);
                }
            } else {
                Rect rect18 = this.LLD;
                rect18.bottom = rect15.bottom;
                int i50 = this.LLFZ.top;
                int i51 = this.LJZL.top;
                int i52 = (i50 - max5) - i51;
                Rect rect19 = this.LLF;
                int i53 = rect19.top;
                if (i52 < i53) {
                    rect18.top = i51;
                } else {
                    rect18.top = Math.min(Math.min(i50 - i53, rect19.height() - this.LLD.bottom) - max5, this.LL.top);
                }
            }
        }
        Rect rect20 = this.LLD;
        setMeasuredDimension(i20 + rect20.left + rect20.right, max5 + rect20.top + rect20.bottom);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Rect rect21 = this.LLD;
        int i54 = (measuredWidth - rect21.left) - rect21.right;
        int i55 = (measuredHeight2 - rect21.top) - rect21.bottom;
        if (C16310kV.LIZLLL(this.LJLJI) != 1) {
            z2 = false;
        }
        this.LJLJJL.reset();
        int i56 = this.LJLJJI;
        if (i56 == 48) {
            f17 = this.LJLJJLL;
            LIZ(0.0f, 0.0f, this.LJLLLLLL);
            f3 = (i55 - this.LJLJLLL) - this.LJLJJLL;
            LIZ(0.0f, r6 - (r5 * 2), this.LJLZ);
            int i57 = this.LJLJLJ;
            PointF pointF4 = this.LLI;
            float f24 = pointF4.x;
            f23 = ((i54 - i57) / 2.0f) + f24;
            f14 = i55 - this.LJLJLLL;
            float f25 = pointF4.y;
            f13 = f14 + f25;
            float f26 = this.LJLLILLLL;
            f5 = f23 + f26;
            f15 = i54;
            f8 = (f15 / 2.0f) + f24;
            f9 = i55 + f25;
            float f27 = this.LJLLJ;
            f16 = f8 - f27;
            f21 = f8 + f27;
            f20 = ((i57 + i54) / 2.0f) + f24;
            f19 = f20 - f26;
            int i58 = this.LJLJJLL;
            f4 = i54 - i58;
            int i59 = i58 * 2;
            LIZ(i54 - i59, r3 - i59, this.LJZ);
            f22 = this.LJLJJLL;
            LIZ(i54 - (r0 * 2), 0.0f, this.LJZI);
            f10 = f9;
            f6 = f13;
            f7 = f13;
            f = 0.0f;
            f2 = 0.0f;
            f12 = f13;
            f18 = 270.0f;
            f11 = f9;
        } else if (i56 == 80) {
            int i60 = this.LJLJJLL;
            f17 = i54 - i60;
            f = i55;
            int i61 = i60 * 2;
            LIZ(i54 - i61, i55 - i61, this.LJLLLLLL);
            f2 = i54;
            int i62 = this.LJLJLLL;
            f3 = i62 + this.LJLJJLL;
            LIZ(i54 - (r3 * 2), i62, this.LJLZ);
            int i63 = this.LJLJLJ;
            PointF pointF5 = this.LLI;
            float f28 = pointF5.x;
            f23 = ((i54 + i63) / 2.0f) + f28;
            f14 = this.LJLJLLL;
            f9 = pointF5.y;
            f13 = f14 + f9;
            float f29 = this.LJLLILLLL;
            f5 = f23 - f29;
            f8 = (f2 / 2.0f) + f28;
            float f30 = this.LJLLJ;
            f16 = f8 + f30;
            f21 = f8 - f30;
            f20 = ((i54 - i63) / 2.0f) + f28;
            f19 = f20 + f29;
            f4 = this.LJLJJLL;
            LIZ(0.0f, f14, this.LJZ);
            f22 = i55 - this.LJLJJLL;
            LIZ(0.0f, i55 - (r1 * 2), this.LJZI);
            f11 = f9;
            f10 = f9;
            f7 = f13;
            f15 = 0.0f;
            f18 = 90.0f;
            f12 = f13;
            f6 = f13;
        } else if (i56 != 8388611 ? i56 != 8388613 || !z2 : z2) {
            f17 = i54;
            f = this.LJLJJLL;
            LIZ(i54 - (r6 * 2), 0.0f, this.LJLLLLLL);
            int i64 = this.LJLJLLL;
            f2 = this.LJLJJLL + i64;
            LIZ(i64, 0.0f, this.LJLZ);
            f4 = this.LJLJLLL;
            PointF pointF6 = this.LLI;
            float f31 = pointF6.x;
            f19 = f4 + f31;
            int i65 = this.LJLJLJ;
            float f32 = pointF6.y;
            f6 = ((i55 - i65) / 2.0f) + f32;
            float f33 = this.LJLLILLLL;
            f7 = f6 + f33;
            f21 = f31 + 0.0f;
            f22 = i55;
            f9 = (f22 / 2.0f) + f32;
            float f34 = this.LJLLJ;
            f10 = f9 - f34;
            f11 = f34 + f9;
            f12 = f32 + ((i65 + i55) / 2.0f);
            f13 = f12 - f33;
            f14 = i55 - this.LJLJJLL;
            LIZ(f4, i55 - (r5 * 2), this.LJZ);
            int i66 = this.LJLJJLL;
            f15 = i54 - i66;
            int i67 = i66 * 2;
            LIZ(i54 - i67, i55 - i67, this.LJZI);
            f23 = f19;
            f5 = f19;
            f16 = f21;
            f20 = f19;
            f18 = 0.0f;
            f8 = f21;
            f3 = 0.0f;
        } else {
            f = i55 - this.LJLJJLL;
            LIZ(0.0f, i55 - (r5 * 2), this.LJLLLLLL);
            int i68 = this.LJLJJLL;
            f2 = (i54 - i68) - this.LJLJLLL;
            f3 = i55;
            int i69 = i68 * 2;
            LIZ((i54 - i69) - r3, i55 - i69, this.LJLZ);
            f4 = i54 - this.LJLJLLL;
            PointF pointF7 = this.LLI;
            float f35 = pointF7.x;
            f5 = f4 + f35;
            int i70 = this.LJLJLJ;
            float f36 = pointF7.y;
            f6 = ((i55 + i70) / 2.0f) + f36;
            float f37 = this.LJLLILLLL;
            f7 = f6 - f37;
            f8 = i54 + f35;
            f9 = (f3 / 2.0f) + f36;
            float f38 = this.LJLLJ;
            f10 = f9 + f38;
            f11 = f9 - f38;
            f12 = ((i55 - i70) / 2.0f) + f36;
            f13 = f12 + f37;
            f14 = this.LJLJJLL;
            LIZ(r5 - (r1 * 2), 0.0f, this.LJZ);
            f15 = this.LJLJJLL;
            LIZ(0.0f, 0.0f, this.LJZI);
            f16 = f8;
            f17 = 0.0f;
            f18 = 180.0f;
            f19 = f5;
            f20 = f5;
            f21 = f8;
            f22 = 0.0f;
            f23 = f5;
        }
        this.LJLJJL.moveTo(f17, f);
        this.LJLJJL.arcTo(this.LJLLLLLL, f18, -90.0f);
        this.LJLJJL.lineTo(f2, f3);
        this.LJLJJL.arcTo(this.LJLZ, f18 - 90.0f, -90.0f);
        this.LJLJJL.lineTo(f23, f6);
        this.LJLJJL.cubicTo(f5, f7, f16, f10, f8, f9);
        this.LJLJJL.cubicTo(f21, f11, f19, f13, f20, f12);
        this.LJLJJL.lineTo(f4, f14);
        this.LJLJJL.arcTo(this.LJZ, f18 - 180.0f, -90.0f);
        this.LJLJJL.lineTo(f15, f22);
        this.LJLJJL.arcTo(this.LJZI, f18 - 270.0f, -90.0f);
        this.LJLJJL.close();
        PointF pointF8 = this.LLIFFJFJJ;
        Rect rect22 = this.LLD;
        float f39 = rect22.left + f8;
        pointF8.x = f39;
        pointF8.y = rect22.top + f9;
        setPivotX(f39);
        setPivotY(this.LLIFFJFJJ.y);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
    }

    public final void LIZ(float f, float f2, RectF rectF) {
        float f3 = this.LJLJJLL * 2;
        rectF.set(f, f2, f3 + f, f3 + f2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("TooltipOutlineLayout can host only one direct child");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        r5 = r5 + r8.LJLJLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r7 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r7 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r7 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r7 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        r12 = r12 - r8.LJLJLLL;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            android.view.View r0 = r8.LJLJI
            int r0 = X.C16310kV.LIZLLL(r0)
            r6 = 0
            r7 = 1
            if (r0 != r7) goto L7f
        La:
            android.graphics.Rect r2 = r8.LLD
            int r5 = r2.left
            int r1 = r8.LJLJL
            int r5 = r5 + r1
            int r3 = r2.top
            int r3 = r3 + r1
            int r0 = r2.right
            int r12 = r12 - r0
            int r12 = r12 - r1
            int r0 = r2.bottom
            int r13 = r13 - r0
            int r13 = r13 - r1
            int r4 = r8.LJLJJI
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r1) goto L5e
            if (r7 == 0) goto L62
        L28:
            int r0 = r8.LJLJLLL
            int r12 = r12 - r0
        L2b:
            int r12 = r12 - r5
            int r13 = r13 - r3
            if (r12 <= 0) goto L5d
            if (r13 <= 0) goto L5d
            android.view.View r4 = r8.getChildAt(r6)
            int r0 = r4.getMeasuredWidth()
            int r1 = java.lang.Math.max(r0, r12)
            int r0 = r4.getMeasuredWidth()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r2 = r2 + r5
            int r0 = r4.getMeasuredHeight()
            int r1 = java.lang.Math.max(r0, r13)
            int r0 = r4.getMeasuredHeight()
            int r1 = r1 - r0
            int r1 = r1 / 2
            int r1 = r1 + r3
            int r0 = r4.getMeasuredWidth()
            int r0 = r0 + r2
            X.C17M.LIZIZ(r4, r1, r2, r1, r0)
        L5d:
            return
        L5e:
            if (r4 != r2) goto L65
            if (r7 == 0) goto L28
        L62:
            int r0 = r8.LJLJLLL
            int r5 = r5 + r0
        L65:
            if (r4 != r2) goto L6a
            if (r7 == 0) goto L28
            goto L2b
        L6a:
            if (r4 != r1) goto L6f
            if (r7 == 0) goto L2b
            goto L28
        L6f:
            r0 = 80
            if (r4 != r0) goto L77
            int r0 = r8.LJLJLLL
            int r3 = r3 + r0
            goto L2b
        L77:
            r0 = 48
            if (r4 != r0) goto L2b
            int r0 = r8.LJLJLLL
            int r13 = r13 - r0
            goto L2b
        L7f:
            r7 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43591nP.onLayout(boolean, int, int, int, int):void");
    }
}
