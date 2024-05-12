package X;

import Y.IDTListenerS92S0200000_12;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.T4c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74042T4c extends View {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public final int LJLLLLLL;
    public final RectF LJLZ;
    public final int LJZ;
    public final int LJZI;
    public int LJZL;
    public OPF LL;
    public final Paint LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public final PorterDuffXfermode LLFZ;

    public final int getValueFrom() {
        return 0;
    }

    public final int getIndicator() {
        return this.LJZL;
    }

    public final OPF getOnSliderListener() {
        return this.LL;
    }

    public final int getValueTo() {
        return this.LJZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        o.LJIIIZ(canvas2, "canvas");
        super.onDraw(canvas2);
        if (this.LLFFF <= 0) {
            return;
        }
        int i = this.LJZ;
        int i2 = this.LJZI;
        float f2 = (i - (i % i2)) / i2;
        float f3 = (this.LJZL / i2) / f2;
        if (C26338AVi.LIZLLL(this)) {
            f = C06420Na.LIZIZ(1, f3, this.LLFFF, this.LLF);
        } else {
            f = (this.LLFFF * f3) + this.LLF;
        }
        int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLD, 31);
        this.LLD.setColor(this.LJLIL);
        float f4 = this.LLF;
        int i3 = this.LLFII;
        canvas2.drawLine(f4, i3, this.LLFF, i3, this.LLD);
        this.LLD.setXfermode(this.LLFZ);
        int i4 = 0;
        while (i4 <= this.LJZ) {
            float LIZ = C43881HKb.LIZ(i4 / this.LJZI, f2, this.LLFFF, this.LLF);
            float f5 = this.LLFII;
            RectF rectF = this.LJLZ;
            int i5 = this.LJLJLLL;
            int i6 = this.LJLL;
            rectF.set(LIZ - (i5 / 2), f5 - (i6 / 2), LIZ + (i5 / 2), f5 + (i6 / 2));
            RectF rectF2 = this.LJLZ;
            int i7 = this.LJLLI;
            canvas2.drawRoundRect(rectF2, i7, i7, this.LLD);
            i4 += this.LJZI;
        }
        this.LLD.setXfermode(null);
        this.LLD.setColor(this.LJLILLLLZI);
        if (C26338AVi.LIZLLL(this)) {
            int i8 = this.LLFII;
            canvas2 = canvas2;
            canvas2.drawLine(f, i8, this.LLFF, i8, this.LLD);
        } else {
            float f6 = this.LLF;
            int i9 = this.LLFII;
            canvas2.drawLine(f6, i9, f, i9, this.LLD);
        }
        this.LLD.setXfermode(this.LLFZ);
        if (C26338AVi.LIZLLL(this)) {
            int i10 = 0;
            while (i10 <= this.LJZL) {
                float f7 = ((1 - ((i10 / this.LJZI) / f2)) * this.LLFFF) + this.LLF;
                float f8 = this.LLFII;
                RectF rectF3 = this.LJLZ;
                int i11 = this.LJLJLLL;
                int i12 = this.LJLL;
                rectF3.set(f7 - (i11 / 2), f8 - (i12 / 2), f7 + (i11 / 2), f8 + (i12 / 2));
                RectF rectF4 = this.LJLZ;
                int i13 = this.LJLLI;
                canvas2.drawRoundRect(rectF4, i13, i13, this.LLD);
                i10 += this.LJZI;
            }
        } else {
            int i14 = 0;
            while (i14 <= this.LJZL) {
                float LIZ2 = C43881HKb.LIZ(i14 / this.LJZI, f2, this.LLFFF, this.LLF);
                float f9 = this.LLFII;
                RectF rectF5 = this.LJLZ;
                int i15 = this.LJLJLLL;
                int i16 = this.LJLL;
                rectF5.set(LIZ2 - (i15 / 2), f9 - (i16 / 2), LIZ2 + (i15 / 2), f9 + (i16 / 2));
                RectF rectF6 = this.LJLZ;
                int i17 = this.LJLLI;
                canvas2.drawRoundRect(rectF6, i17, i17, this.LLD);
                i14 += this.LJZI;
            }
        }
        this.LLD.setXfermode(null);
        canvas2.restoreToCount(saveLayer);
        this.LLD.setColor(this.LJLJJI);
        if (C26338AVi.LIZLLL(this)) {
            this.LLD.setShadowLayer(this.LJLLL, -this.LJLLLL, this.LJLLLLLL, this.LJLJJL);
        } else {
            this.LLD.setShadowLayer(this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLJJL);
        }
        int i18 = (this.LJLJJLL / 2) - (this.LJLJLLL / 2);
        int i19 = this.LLFII;
        int i20 = this.LJLJL;
        float f10 = i19 - (i20 / 2);
        float f11 = i19 + (i20 / 2);
        float f12 = f - (r3 / 2);
        float f13 = f + (r3 / 2);
        int i21 = this.LJZL;
        if (i21 == 0) {
            RectF rectF7 = this.LJLZ;
            int i22 = this.LJLLILLLL;
            float f14 = i18;
            rectF7.set((f12 - i22) + f14, f10 - i22, i22 + f13 + f14, i22 + f11);
            RectF rectF8 = this.LJLZ;
            int i23 = this.LJLJLJ;
            int i24 = this.LJLLILLLL;
            canvas2.drawRoundRect(rectF8, i23 + i24, i23 + i24, this.LLD);
            this.LLD.setColor(this.LJLJI);
            this.LJLZ.set(f12 + f14, f10, f13 + f14, f11);
            RectF rectF9 = this.LJLZ;
            int i25 = this.LJLJLJ;
            canvas2.drawRoundRect(rectF9, i25, i25, this.LLD);
        } else if (i21 == this.LJZ) {
            RectF rectF10 = this.LJLZ;
            int i26 = this.LJLLILLLL;
            float f15 = i18;
            rectF10.set((f12 - i26) - f15, f10 - i26, (i26 + f13) - f15, i26 + f11);
            RectF rectF11 = this.LJLZ;
            int i27 = this.LJLJLJ;
            int i28 = this.LJLLILLLL;
            canvas2.drawRoundRect(rectF11, i27 + i28, i27 + i28, this.LLD);
            this.LLD.setColor(this.LJLJI);
            this.LJLZ.set(f12 - f15, f10, f13 - f15, f11);
            RectF rectF12 = this.LJLZ;
            int i29 = this.LJLJLJ;
            canvas2.drawRoundRect(rectF12, i29, i29, this.LLD);
        } else {
            RectF rectF13 = this.LJLZ;
            int i30 = this.LJLLILLLL;
            rectF13.set(f12 - i30, f10 - i30, i30 + f13, i30 + f11);
            RectF rectF14 = this.LJLZ;
            int i31 = this.LJLJLJ;
            int i32 = this.LJLLILLLL;
            canvas2.drawRoundRect(rectF14, i31 + i32, i31 + i32, this.LLD);
            this.LLD.setColor(this.LJLJI);
            this.LJLZ.set(f12, f10, f13, f11);
            RectF rectF15 = this.LJLZ;
            int i33 = this.LJLJLJ;
            canvas2.drawRoundRect(rectF15, i33, i33, this.LLD);
        }
        this.LLD.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void setIndicator(int i) {
        int i2;
        OPF opf;
        if (i < 0) {
            i2 = 0;
        } else {
            int i3 = this.LJZ;
            int i4 = this.LJZI;
            i2 = i3 - (i3 % i4);
            if (i <= i2) {
                int i5 = i % i4;
                if (i5 < i4 / 2.0f) {
                    i2 = i - i5;
                } else {
                    i2 = (i4 - i5) + i;
                }
            }
        }
        if (this.LJZL != i2 && (opf = this.LL) != null) {
            opf.LIZ(this, i2);
        }
        this.LJZL = i2;
        invalidate();
    }

    public final void setOnSliderListener(OPF opf) {
        this.LL = opf;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(new IDTListenerS92S0200000_12(onTouchListener, this, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74042T4c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = AnonymousClass636.LJIIIIZZ(R.attr.dw, context);
        this.LJLILLLLZI = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        this.LJLJI = AnonymousClass636.LJIIIIZZ(R.attr.dj, context);
        this.LJLJJI = AnonymousClass636.LJIIIIZZ(R.attr.ds, context);
        this.LJLJJL = AnonymousClass636.LJIIIIZZ(R.attr.ds, context);
        this.LJLJJLL = C7MY.LIZIZ(20);
        this.LJLJL = C7MY.LIZIZ(30);
        this.LJLJLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
        this.LJLJLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        this.LJLL = C7MY.LIZIZ(12);
        this.LJLLI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        this.LJLLILLLL = C7MY.LIZIZ(1);
        this.LJLLJ = C7MY.LIZIZ(40);
        this.LJLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
        this.LJLLLL = C7MY.LIZIZ(0);
        this.LJLLLLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
        this.LJLZ = new RectF();
        this.LJZ = 3;
        this.LJZI = 1;
        this.LJZL = 0;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(LJJIIZ);
        this.LLD = paint;
        this.LLFZ = new PorterDuffXfermode(PorterDuff.Mode.SRC);
        h0.LJIJI(this, new C74043T4d(this));
        setOnTouchListener(null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int size = View.MeasureSpec.getSize(i);
        int abs = Math.abs(this.LJLLLL) + this.LJLJLJ + this.LJLLL;
        if (C26338AVi.LIZLLL(this)) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        this.LLF = paddingLeft + abs;
        if (C26338AVi.LIZLLL(this)) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int i3 = size - (paddingRight + abs);
        this.LLFF = i3;
        this.LLFFF = i3 - this.LLF;
        int i4 = this.LJLLL - this.LJLLLLLL;
        if (i4 > 0) {
            paddingTop = getPaddingTop() + this.LJLJLJ + i4;
        } else {
            paddingTop = this.LJLJLJ + getPaddingTop();
        }
        this.LLFII = paddingTop;
        this.LLFII = Math.max(this.LJLLJ / 2, paddingTop);
        int i5 = this.LJLLL + this.LJLLLLLL;
        if (i5 > 0) {
            paddingBottom = getPaddingBottom() + this.LJLJLJ + i5;
        } else {
            paddingBottom = this.LJLJLJ + getPaddingBottom();
        }
        int max = Math.max(this.LJLLJ / 2, paddingBottom);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size2 = this.LLFII + max;
        }
        setMeasuredDimension(size, size2);
    }
}
