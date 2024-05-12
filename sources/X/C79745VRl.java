package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spannable;
import com.lynx.tasm.behavior.shadow.text.BackgroundColorSpan;

/* renamed from: X.VRl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79745VRl extends AbstractC79752VRs {
    public final int LJLJJLL;
    public final float LJLJL;

    public C79745VRl(int i, float f) {
        this.LJLJJLL = i;
        this.LJLJL = f;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            int i5 = i3 - i4;
            if (i3 == i4) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            int LIZ = (int) LIZ(fontMetricsInt.ascent, fontMetricsInt.descent);
            this.LJLJI = LIZ;
            if (fontMetricsInt.ascent > LIZ) {
                fontMetricsInt.ascent = LIZ;
            }
            if (fontMetricsInt.descent < LIZ + i5) {
                fontMetricsInt.descent = LIZ + i5;
            }
            int i6 = fontMetricsInt.top;
            int i7 = fontMetricsInt.ascent;
            if (i6 > i7) {
                fontMetricsInt.top = i7;
            }
            int i8 = fontMetricsInt.bottom;
            int i9 = fontMetricsInt.descent;
            if (i8 < i9) {
                fontMetricsInt.bottom = i9;
            }
        }
        return Math.round(paint.measureText(charSequence, i, i2));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        float f3;
        float f4;
        int i6 = i4;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spannable.getSpans(i, i2, BackgroundColorSpan.class);
            if (backgroundColorSpanArr != null && backgroundColorSpanArr.length != 0) {
                Paint paint2 = new Paint();
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(backgroundColorSpanArr[0].getBackgroundColor());
                Rect rect = new Rect(Math.round(f), i3, Math.round(paint.measureText(spannable, i, i2) + f), i5);
                rect.offset(0, Math.round(this.LJLJL));
                canvas.drawRect(rect, paint2);
            }
        }
        int i7 = this.LJLJJLL;
        if (i7 == 0) {
            i6 = -Math.round(fontMetrics.top);
        } else if (i7 == 2) {
            i6 = i5 - Math.round(fontMetrics.leading);
        } else if (i7 == 1) {
            i6 = (int) (Math.round(Math.abs(fontMetrics.ascent)) + i3 + (((i5 - i3) - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f));
            if (fontMetrics.leading == 0.0f) {
                i6 = (int) (((fontMetrics.descent / 2.0f) - paint.getStrokeMiter()) + i6);
            }
        } else if (i7 == 3) {
            i6 = (int) (i6 + this.LJLJL);
        }
        int i8 = this.LJLIL;
        if (i8 != 0) {
            if (i8 != 4) {
                if (i8 != 7) {
                    if (i8 != 11) {
                        i6 = (int) ((this.LJLJI - fontMetrics.ascent) + i6);
                    } else {
                        f4 = (((i3 + i5) - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
                        i6 = (int) f4;
                    }
                } else {
                    f2 = i5;
                    f3 = fontMetrics.descent;
                }
            } else {
                f2 = i3;
                f3 = fontMetrics.ascent;
            }
            f4 = f2 - f3;
            i6 = (int) f4;
        }
        canvas.drawText(charSequence, i, i2, f, i6, paint);
    }
}
