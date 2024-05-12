package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* renamed from: X.8F6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F6 extends ReplacementSpan {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public final TextPaint LIZ(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(this.LJLIL);
        textPaint.setColor(this.LJLILLLLZI);
        textPaint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
        return textPaint;
    }

    public C8F6(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float measureText;
        if (C176536wL.LIZ().LIZIZ) {
            measureText = LIZ(paint).measureText(charSequence.toString().substring(i, i2));
        } else {
            measureText = LIZ(paint).measureText(charSequence.subSequence(i, i2).toString());
        }
        return (int) measureText;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String str;
        if (C176536wL.LIZ().LIZIZ) {
            str = charSequence.toString().substring(i, i2);
        } else {
            charSequence = charSequence.subSequence(i, i2);
            str = "";
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        TextPaint LIZ = LIZ(paint);
        Paint.FontMetricsInt fontMetricsInt2 = LIZ.getFontMetricsInt();
        if (C176536wL.LIZ().LIZIZ) {
            int i6 = fontMetricsInt.descent;
            int i7 = ((i6 - fontMetricsInt.ascent) / 2) - i6;
            int i8 = fontMetricsInt2.descent;
            canvas.drawText(str, f, i4 - (i7 - (((i8 - fontMetricsInt2.ascent) / 2) - i8)), LIZ);
            return;
        }
        String charSequence2 = charSequence.toString();
        int i9 = fontMetricsInt.descent;
        int i10 = ((i9 - fontMetricsInt.ascent) / 2) - i9;
        int i11 = fontMetricsInt2.descent;
        canvas.drawText(charSequence2, f, i4 - (i10 - (((i11 - fontMetricsInt2.ascent) / 2) - i11)), LIZ);
    }
}
