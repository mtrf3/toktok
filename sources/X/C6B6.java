package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: X.6B6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B6 extends ImageSpan {
    public final Integer LJLIL;
    public final CharSequence LJLILLLLZI;
    public boolean LJLJI;

    public C6B6(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        this.LJLIL = num;
        this.LJLILLLLZI = charSequence;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Integer num = this.LJLIL;
        if (num != null && num.intValue() != i2 - i && this.LJLJI) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer num = this.LJLIL;
        if (num != null && num.intValue() != i2 - i && this.LJLJI) {
            this.LJLJI = false;
            return;
        }
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f + 0, i6);
        drawable.draw(canvas);
        canvas.restore();
        Integer num2 = this.LJLIL;
        if (num2 != null && num2.intValue() != i2 - i) {
            this.LJLJI = true;
        }
    }
}
