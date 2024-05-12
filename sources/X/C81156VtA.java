package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import defpackage.i0;

/* renamed from: X.VtA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81156VtA extends C81155Vt9 {
    public Paint getPaint() {
        return this.LJLIL;
    }

    public String getText() {
        return this.LJLJI;
    }

    @Override // X.C81155Vt9, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        if (!TextUtils.isEmpty(this.LJLJI)) {
            float f = 0.0f;
            if (this.LJLJLJ == 0.0f) {
                return;
            }
            if (this.LJLLI) {
                f = getWidth() - this.LJLJLJ;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.LJLL;
            if (j > 0) {
                float f2 = ((float) ((uptimeMillis - j) * this.LJLJJL)) / 1000.0f;
                float f3 = this.LJLJL;
                if (this.LJLLI) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                this.LJLJL = ((f2 * i2) + f3) % this.LJLJLJ;
            }
            if (this.LJLJLLL == 0) {
                this.LJLL = uptimeMillis;
            }
            this.LJLIL.getFontMetrics(this.LJLILLLLZI);
            float f4 = -this.LJLILLLLZI.top;
            if (this.LJLJJI) {
                float height = getHeight();
                Paint.FontMetrics fontMetrics = this.LJLILLLLZI;
                f4 = ((height - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
            }
            if (this.LJLJLLL == 0) {
                while (true) {
                    float measuredWidth = getMeasuredWidth();
                    float f5 = this.LJLJL;
                    if (this.LJLLI) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    if (f >= (i * f5) + measuredWidth) {
                        break;
                    }
                    canvas.drawText(this.LJLJI, f5 + f, f4, this.LJLIL);
                    f += this.LJLJLJ;
                }
            } else {
                canvas.drawText(this.LJLJI, this.LJLJL + f, f4, this.LJLIL);
            }
            if (this.LJLJLLL != 0) {
                return;
            }
            postInvalidateDelayed(this.LJLJJLL);
        }
    }

    @Override // X.C81155Vt9
    public void setText(String str) {
        String LJFF = i0.LJFF(str, "    ");
        this.LJLJI = LJFF;
        this.LJLJLJ = this.LJLIL.measureText(LJFF);
        this.LJLJL = 0.0f;
        this.LJLL = 0L;
        this.LJLLI = C13670gF.LIZJ().LIZLLL(this.LJLJI);
        requestLayout();
    }

    public C81156VtA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C81155Vt9, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i2) == 0) {
            this.LJLIL.getFontMetrics(this.LJLILLLLZI);
            Paint.FontMetrics fontMetrics = this.LJLILLLLZI;
            setMeasuredDimension(View.MeasureSpec.getSize(i), (int) (fontMetrics.bottom - fontMetrics.top));
            return;
        }
        super.onMeasure(i, i2);
    }
}
