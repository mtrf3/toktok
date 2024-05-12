package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135155Sd extends View {
    public TextPaint LJLIL;
    public Paint.FontMetrics LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public boolean LJLL;
    public int LJLLI;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJLJLJ == 0) {
            this.LJLJLJ = 2;
            this.LJLJJLL = 0.0f;
            this.LJLJLLL = 0L;
            invalidate();
        }
    }

    public final Paint.FontMetrics getFontMetrics() {
        return this.LJLILLLLZI;
    }

    public final long getMAnimateMillis() {
        return this.LJLJLLL;
    }

    public final float getMCurOffset() {
        return this.LJLJJLL;
    }

    public final long getMDelay() {
        return this.LJLJJL;
    }

    public final float getMLength() {
        return this.LJLJL;
    }

    public final int getMMaxWidth() {
        return this.LJLLI;
    }

    public final TextPaint getMPaint() {
        return this.LJLIL;
    }

    public final int getMSpeed() {
        return this.LJLJJI;
    }

    public final int getMState() {
        return this.LJLJLJ;
    }

    public final String getMText() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.LJLJI)) {
            float f = 0.0f;
            if (this.LJLJL == 0.0f) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.LJLJLLL;
            if (j > 0) {
                float f2 = ((float) ((uptimeMillis - j) * this.LJLJJI)) / 1000.0f;
                float f3 = this.LJLJJLL;
                if (this.LJLL) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                this.LJLJJLL = ((f2 * i3) + f3) % this.LJLJL;
            }
            if (this.LJLJLJ == 0) {
                this.LJLJLLL = uptimeMillis;
            }
            TextPaint textPaint = this.LJLIL;
            o.LJI(textPaint);
            textPaint.getFontMetrics(this.LJLILLLLZI);
            while (true) {
                float measuredWidth = getMeasuredWidth();
                float f4 = this.LJLJJLL;
                if (this.LJLL) {
                    i = 1;
                } else {
                    i = -1;
                }
                if (f >= (f4 * i) + measuredWidth) {
                    break;
                }
                String str = this.LJLJI;
                o.LJI(str);
                float f5 = this.LJLJJLL;
                if (this.LJLL) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                float f6 = (i2 * f) + f5;
                float f7 = -this.LJLILLLLZI.top;
                TextPaint textPaint2 = this.LJLIL;
                o.LJI(textPaint2);
                canvas.drawText(str, f6, f7, textPaint2);
                f += this.LJLJL;
            }
            if (this.LJLJLJ != 0) {
                return;
            }
            postInvalidateDelayed(this.LJLJJL);
        }
    }

    public final void setFontMetrics(Paint.FontMetrics fontMetrics) {
        o.LJIIIZ(fontMetrics, "<set-?>");
        this.LJLILLLLZI = fontMetrics;
    }

    public final void setMAnimateMillis(long j) {
        this.LJLJLLL = j;
    }

    public final void setMCurOffset(float f) {
        this.LJLJJLL = f;
    }

    public final void setMDelay(long j) {
        this.LJLJJL = j;
    }

    public final void setMLength(float f) {
        this.LJLJL = f;
    }

    public final void setMMaxWidth(int i) {
        this.LJLLI = i;
    }

    public final void setMPaint(TextPaint textPaint) {
        this.LJLIL = textPaint;
    }

    public final void setMSpeed(int i) {
        this.LJLJJI = i;
    }

    public final void setMState(int i) {
        this.LJLJLJ = i;
    }

    public final void setMText(String str) {
        this.LJLJI = str;
    }

    public final void setRtl(boolean z) {
        this.LJLL = z;
    }

    public final void setSpeed(int i) {
        this.LJLJJI = i;
    }

    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(text);
        LIZ.append("    ");
        this.LJLJI = X1D.LIZIZ(LIZ);
        TextPaint textPaint = this.LJLIL;
        o.LJI(textPaint);
        this.LJLJL = textPaint.measureText(this.LJLJI);
        while (this.LJLJL < this.LJLLI) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLJI);
            LIZ2.append(this.LJLJI);
            this.LJLJI = X1D.LIZIZ(LIZ2);
            TextPaint textPaint2 = this.LJLIL;
            o.LJI(textPaint2);
            this.LJLJL = textPaint2.measureText(this.LJLJI);
        }
        this.LJLJJLL = 0.0f;
        this.LJLJLLL = 0L;
        requestLayout();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            o.LJI(textPaint);
            textPaint.setColor(i);
        }
    }

    public final void setTextShadow(int i) {
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            o.LJI(textPaint);
            textPaint.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public final void setTextSize(int i) {
        TextPaint textPaint = this.LJLIL;
        if (textPaint != null) {
            o.LJI(textPaint);
            textPaint.setTextSize(i);
        }
    }

    public final void setText(int i) {
        String string = getResources().getString(i);
        o.LJIIIIZZ(string, "resources.getString(text)");
        setText(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135155Sd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new Paint.FontMetrics();
        this.LJLJJI = 25;
        this.LJLJJL = 16L;
        TextPaint textPaint = new TextPaint();
        this.LJLIL = textPaint;
        textPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6r, R.attr.bbx, R.attr.bv9, R.attr.bv_, R.attr.bva});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.MarqueeView)");
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(1, this.LJLJJI);
        int color = obtainStyledAttributes.getColor(2, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 28);
        int color2 = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        TextPaint textPaint2 = this.LJLIL;
        o.LJI(textPaint2);
        textPaint2.setTextSize(dimensionPixelSize);
        TextPaint textPaint3 = this.LJLIL;
        o.LJI(textPaint3);
        textPaint3.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        TextPaint textPaint4 = this.LJLIL;
        o.LJI(textPaint4);
        textPaint4.setColor(color);
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("regular");
        if (LIZLLL != null) {
            TextPaint textPaint5 = this.LJLIL;
            o.LJI(textPaint5);
            textPaint5.setTypeface(LIZLLL);
        }
        this.LJLJLJ = 2;
        this.LJLLI = context.getResources().getDimensionPixelSize(R.dimen.w1);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        TextPaint textPaint = this.LJLIL;
        o.LJI(textPaint);
        textPaint.getFontMetrics(this.LJLILLLLZI);
        Paint.FontMetrics fontMetrics = this.LJLILLLLZI;
        int i4 = (int) (fontMetrics.bottom - fontMetrics.top);
        boolean z = false;
        if (!TextUtils.isEmpty(this.LJLJI)) {
            TextPaint textPaint2 = this.LJLIL;
            o.LJI(textPaint2);
            i3 = (int) textPaint2.measureText(this.LJLJI);
        } else {
            i3 = 0;
        }
        if (View.MeasureSpec.getSize(i) <= i3) {
            i3 = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, i4);
        if (C16310kV.LIZLLL(this) == 1) {
            z = true;
        }
        this.LJLL = z;
    }
}
