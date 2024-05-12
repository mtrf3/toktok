package X;

import Y.IDTListenerS88S0200000_2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168266j0 extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public final TuxTextView LJZL;
    public int LL;
    public InterfaceC168276j1 LLD;
    public boolean LLF;
    public boolean LLFF;
    public final int LLFFF;
    public final Paint LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public final PorterDuffXfermode LLIIIL;

    public final InterfaceC168296j3 getIndicatorTransform() {
        return null;
    }

    public final int getActiveRailColor() {
        return this.LJLIL;
    }

    public final int getClickHotspotHeight() {
        return this.LJLJLLL;
    }

    public final boolean getHasActiveRail() {
        return this.LLFF;
    }

    public final boolean getHasIndicator() {
        return this.LJLLLLLL;
    }

    public final boolean getHasSteppedDot() {
        return this.LLF;
    }

    public final int getIndicator() {
        return this.LJZ;
    }

    public final int getIndicatorColor() {
        return this.LJLJJI;
    }

    public final int getIndicatorFont() {
        return this.LL;
    }

    public final int getKnobAndIndicatorMargin() {
        return this.LJZI;
    }

    public final int getKnobColor() {
        return this.LJLJI;
    }

    public final int getKnobRadius() {
        return this.LJLJJLL;
    }

    public final int getKnobShadowColor() {
        return this.LJLJJL;
    }

    public final int getKnobShadowOffsetX() {
        return this.LJLLI;
    }

    public final int getKnobShadowOffsetY() {
        return this.LJLLILLLL;
    }

    public final int getKnobShadowRadius() {
        return this.LJLL;
    }

    public final int getMax() {
        return this.LJLLL;
    }

    public final int getMin() {
        return this.LJLLJ;
    }

    public final InterfaceC168276j1 getOnSliderListener() {
        return this.LLD;
    }

    public final int getRailColor() {
        return this.LJLILLLLZI;
    }

    public final int getRailHeight() {
        return this.LJLJLJ;
    }

    public final int getStep() {
        return this.LJLLLL;
    }

    public final int getSteppedDotDiameter() {
        return this.LJLJL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        Canvas canvas2 = canvas;
        o.LJIIIZ(canvas2, "canvas");
        super.onDraw(canvas2);
        if (this.LLIFFJFJJ <= 0) {
            return;
        }
        int i2 = this.LJLLL;
        int i3 = this.LJLLJ;
        int i4 = this.LJLLLL;
        float f2 = ((i2 - ((i2 - i3) % i4)) - i3) / i4;
        float f3 = ((this.LJZ - i3) / i4) / f2;
        if (C26338AVi.LIZLLL(this)) {
            f = C06420Na.LIZIZ(1, f3, this.LLIFFJFJJ, this.LLFZ);
        } else {
            f = this.LLFZ + (this.LLIFFJFJJ * f3);
        }
        if (this.LJLLLLLL) {
            TuxTextView tuxTextView = this.LJZL;
            int i5 = this.LLFFF;
            tuxTextView.measure(i5, i5);
            int measuredWidth = this.LJZL.getMeasuredWidth();
            if (measuredWidth % 2 == 0) {
                i = measuredWidth / 2;
            } else {
                i = (measuredWidth / 2) + 1;
            }
            int i6 = ((int) f) - i;
            int measuredWidth2 = this.LJZL.getMeasuredWidth() + i6;
            if (measuredWidth >= this.LLIIIJ) {
                i6 = this.LLIIII;
            } else {
                int i7 = this.LLIIII;
                if (i6 < i7) {
                    i6 = i7;
                } else {
                    int i8 = this.LLIIIILZ;
                    if (measuredWidth2 > i8) {
                        i6 = i8 - this.LJZL.getMeasuredWidth();
                    }
                }
            }
            this.LJZL.measure(View.MeasureSpec.makeMeasureSpec(this.LLIIIJ, LiveLayoutPreloadThreadPriority.DEFAULT), this.LLFFF);
            TuxTextView tuxTextView2 = this.LJZL;
            tuxTextView2.layout(0, 0, tuxTextView2.getMeasuredWidth(), this.LJZL.getMeasuredHeight());
            canvas2.translate(i6, ((this.LLII - this.LJLJJLL) - this.LJZI) - this.LJZL.getMeasuredHeight());
            this.LJZL.draw(canvas2);
            canvas2.translate(-i6, -(((this.LLII - this.LJLJJLL) - this.LJZI) - this.LJZL.getMeasuredHeight()));
        }
        int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLFII, 31);
        this.LLFII.setColor(this.LJLILLLLZI);
        float f4 = this.LLFZ;
        int i9 = this.LLII;
        canvas2.drawLine(f4, i9, this.LLI, i9, this.LLFII);
        if (this.LLF) {
            this.LLFII.setXfermode(this.LLIIIL);
            int i10 = this.LJLLJ;
            while (i10 <= this.LJLLL) {
                canvas2.drawCircle(C43881HKb.LIZ((i10 - this.LJLLJ) / this.LJLLLL, f2, this.LLIFFJFJJ, this.LLFZ), this.LLII, this.LJLJL / 2, this.LLFII);
                i10 += this.LJLLLL;
            }
            this.LLFII.setXfermode(null);
        }
        if (this.LLFF) {
            this.LLFII.setColor(this.LJLIL);
            if (C26338AVi.LIZLLL(this)) {
                int i11 = this.LLII;
                canvas2 = canvas2;
                canvas2.drawLine(f, i11, this.LLI, i11, this.LLFII);
            } else {
                float f5 = this.LLFZ;
                int i12 = this.LLII;
                canvas2 = canvas2;
                canvas2.drawLine(f5, i12, f, i12, this.LLFII);
            }
            if (this.LLF) {
                this.LLFII.setXfermode(this.LLIIIL);
                int i13 = this.LJLLJ;
                if (C26338AVi.LIZLLL(this)) {
                    while (i13 <= this.LJZ) {
                        canvas2.drawCircle(((1 - (((i13 - this.LJLLJ) / this.LJLLLL) / f2)) * this.LLIFFJFJJ) + this.LLFZ, this.LLII, this.LJLJL / 2, this.LLFII);
                        i13 += this.LJLLLL;
                    }
                } else {
                    while (i13 <= this.LJZ) {
                        canvas2.drawCircle(C43881HKb.LIZ((i13 - this.LJLLJ) / this.LJLLLL, f2, this.LLIFFJFJJ, this.LLFZ), this.LLII, this.LJLJL / 2, this.LLFII);
                        i13 += this.LJLLLL;
                    }
                }
                this.LLFII.setXfermode(null);
            }
        }
        canvas2.restoreToCount(saveLayer);
        this.LLFII.setColor(this.LJLJI);
        if (C26338AVi.LIZLLL(this)) {
            this.LLFII.setShadowLayer(this.LJLL, -this.LJLLI, this.LJLLILLLL, this.LJLJJL);
        } else {
            this.LLFII.setShadowLayer(this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLJJL);
        }
        canvas2.drawCircle(f, this.LLII, this.LJLJJLL, this.LLFII);
        this.LLFII.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void setActiveRailColor(int i) {
        this.LJLIL = i;
        invalidate();
    }

    public final void setClickHotspotHeight(int i) {
        this.LJLJLLL = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
        super.setEnabled(z);
    }

    public final void setHasActiveRail(boolean z) {
        this.LLFF = z;
        invalidate();
    }

    public final void setHasIndicator(boolean z) {
        this.LJLLLLLL = z;
        requestLayout();
    }

    public final void setHasSteppedDot(boolean z) {
        this.LLF = z;
        invalidate();
    }

    public final void setIndicator(int i) {
        InterfaceC168276j1 interfaceC168276j1;
        int i2 = this.LJLLJ;
        if (i >= i2) {
            int i3 = this.LJLLL;
            int i4 = this.LJLLLL;
            int i5 = i3 - ((i3 - i2) % i4);
            if (i > i5) {
                i2 = i5;
            } else {
                int i6 = (i - i2) % i4;
                if (i6 < i4 / 2.0f) {
                    i2 = i - i6;
                } else {
                    i2 = (i4 - i6) + i;
                }
            }
        }
        if (this.LJZ != i2 && (interfaceC168276j1 = this.LLD) != null) {
            interfaceC168276j1.LIZIZ(this, i2, this.LJLZ);
        }
        this.LJZ = i2;
        this.LJZL.setText(String.valueOf(i2));
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.LJLJJI = i;
        this.LJZL.setTextColor(i);
        invalidate();
    }

    public final void setIndicatorFont(int i) {
        this.LL = i;
        this.LJZL.setTuxFont(i);
        requestLayout();
    }

    public final void setIndicatorTransform(InterfaceC168296j3 interfaceC168296j3) {
        setIndicator(this.LJZ);
    }

    public final void setKnobAndIndicatorMargin(int i) {
        this.LJZI = i;
        requestLayout();
    }

    public final void setKnobColor(int i) {
        this.LJLJI = i;
        invalidate();
    }

    public final void setKnobRadius(int i) {
        this.LJLJJLL = i;
        requestLayout();
    }

    public final void setKnobShadowColor(int i) {
        this.LJLJJL = i;
        invalidate();
    }

    public final void setKnobShadowOffsetX(int i) {
        this.LJLLI = i;
        requestLayout();
    }

    public final void setKnobShadowOffsetY(int i) {
        this.LJLLILLLL = i;
        requestLayout();
    }

    public final void setKnobShadowRadius(int i) {
        this.LJLL = i;
        requestLayout();
    }

    public final void setMax(int i) {
        this.LJLLL = Math.max(0, i);
        setIndicator(this.LJZ);
    }

    public final void setMin(int i) {
        this.LJLLJ = Math.max(0, i);
        setIndicator(this.LJZ);
    }

    public final void setOnSliderListener(InterfaceC168276j1 interfaceC168276j1) {
        this.LLD = interfaceC168276j1;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new IDTListenerS88S0200000_2(this, onTouchListener, 0));
    }

    public final void setRailColor(int i) {
        this.LJLILLLLZI = i;
        invalidate();
    }

    public final void setRailHeight(int i) {
        this.LJLJLJ = i;
        this.LLFII.setStrokeWidth(i);
        invalidate();
    }

    public final void setStep(int i) {
        this.LJLLLL = Math.max(1, i);
        setIndicator(this.LJZ);
    }

    public final void setSteppedDotDiameter(int i) {
        this.LJLJL = i;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168266j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.k2);
        a1.LJFF(context, "context");
        this.LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
        this.LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(7));
        this.LJLJLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(3));
        this.LJLJLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
        this.LJLL = C7MY.LIZIZ(4);
        this.LJLLI = C7MY.LIZIZ(0);
        this.LJLLILLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
        this.LJLLL = 100;
        this.LJLLLL = 1;
        this.LJLLLLLL = true;
        this.LJZ = this.LJLLJ;
        this.LJZI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tuxTextView.setText(String.valueOf(this.LJZ));
        tuxTextView.setTextColor(this.LJLJJI);
        tuxTextView.setMaxLines(1);
        this.LJZL = tuxTextView;
        this.LLFF = true;
        this.LLFFF = View.MeasureSpec.makeMeasureSpec(10000, LiveLayoutPreloadThreadPriority.DEFAULT);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.LJLJLJ);
        this.LLFII = paint;
        this.LLIIIL = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.br1, R.attr.br2, R.attr.br3, R.attr.br4, R.attr.br5, R.attr.br6, R.attr.br7, R.attr.br8, R.attr.br9, R.attr.br_, R.attr.bra, R.attr.brb, R.attr.brc, R.attr.brd, R.attr.bre, R.attr.brf, R.attr.brg, R.attr.brh, R.attr.bri, R.attr.brj, R.attr.brk}, R.attr.k2, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eSlider, defStyleAttr, 0)");
        setHasSteppedDot(obtainStyledAttributes.getBoolean(4, false));
        setHasActiveRail(obtainStyledAttributes.getBoolean(2, true));
        setActiveRailColor(obtainStyledAttributes.getColor(0, 0));
        setRailColor(obtainStyledAttributes.getColor(17, 0));
        setKnobColor(obtainStyledAttributes.getColor(9, 0));
        setIndicatorColor(obtainStyledAttributes.getColor(6, 0));
        setKnobShadowColor(obtainStyledAttributes.getColor(11, 0));
        setKnobRadius((int) obtainStyledAttributes.getDimension(10, C32151Nz.LJIIZILJ(10)));
        setRailHeight((int) obtainStyledAttributes.getDimension(18, C32151Nz.LJIIZILJ(3)));
        setClickHotspotHeight((int) obtainStyledAttributes.getDimension(1, C32151Nz.LJIIZILJ(40)));
        setSteppedDotDiameter((int) obtainStyledAttributes.getDimension(20, C32151Nz.LJIIZILJ(7)));
        setKnobShadowRadius((int) obtainStyledAttributes.getDimension(10, C32151Nz.LJIIZILJ(8)));
        setKnobShadowOffsetX((int) obtainStyledAttributes.getDimension(12, 0.0f));
        setKnobShadowOffsetY((int) obtainStyledAttributes.getDimension(13, C32151Nz.LJIIZILJ(2)));
        setMin(obtainStyledAttributes.getInteger(16, 0));
        setMax(obtainStyledAttributes.getInteger(15, 100));
        setStep(obtainStyledAttributes.getInteger(19, 1));
        setHasIndicator(obtainStyledAttributes.getBoolean(3, true));
        setIndicator(obtainStyledAttributes.getInteger(5, 0));
        setKnobAndIndicatorMargin((int) obtainStyledAttributes.getDimension(8, C32151Nz.LJIIZILJ(2)));
        setIndicatorFont(obtainStyledAttributes.getInt(7, 0));
        obtainStyledAttributes.recycle();
        setOnTouchListener(null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int paddingLeft2;
        int paddingRight2;
        int size = View.MeasureSpec.getSize(i);
        int abs = Math.abs(this.LJLLI) + this.LJLJJLL + this.LJLL;
        if (C26338AVi.LIZLLL(this)) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        this.LLFZ = paddingLeft + abs;
        if (C26338AVi.LIZLLL(this)) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int i3 = size - (paddingRight + abs);
        this.LLI = i3;
        this.LLIFFJFJJ = i3 - this.LLFZ;
        int i4 = this.LJLL - this.LJLLILLLL;
        if (i4 > 0) {
            paddingTop = getPaddingTop() + this.LJLJJLL + i4;
        } else {
            paddingTop = this.LJLJJLL + getPaddingTop();
        }
        this.LLII = paddingTop;
        this.LLII = Math.max(this.LJLJLLL / 2, paddingTop);
        if (this.LJLLLLLL) {
            TuxTextView tuxTextView = this.LJZL;
            int i5 = this.LLFFF;
            tuxTextView.measure(i5, i5);
            this.LLII = Math.max(getPaddingTop() + this.LJZL.getMeasuredHeight() + this.LJZI + this.LJLJJLL, this.LLII);
            if (C26338AVi.LIZLLL(this)) {
                paddingLeft2 = getPaddingRight();
            } else {
                paddingLeft2 = getPaddingLeft();
            }
            this.LLIIII = paddingLeft2;
            if (C26338AVi.LIZLLL(this)) {
                paddingRight2 = getPaddingLeft();
            } else {
                paddingRight2 = getPaddingRight();
            }
            int i6 = size - paddingRight2;
            this.LLIIIILZ = i6;
            this.LLIIIJ = i6 - this.LLIIII;
        }
        int i7 = this.LJLL + this.LJLLILLLL;
        if (i7 > 0) {
            paddingBottom = getPaddingBottom() + this.LJLJJLL + i7;
        } else {
            paddingBottom = this.LJLJJLL + getPaddingBottom();
        }
        int max = Math.max(this.LJLJLLL / 2, paddingBottom);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = this.LLII + max;
        }
        setMeasuredDimension(size, size2);
    }
}
