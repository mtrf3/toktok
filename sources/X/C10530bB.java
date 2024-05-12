package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.0bB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10530bB extends ReplacementSpan {
    public Paint.FontMetricsInt LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    public C10530bB() {
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
    }

    public final Paint.FontMetricsInt LIZ() {
        Paint.FontMetricsInt fontMetricsInt = this.LJLIL;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        o.LJIJI("fontMetrics");
        throw null;
    }

    public final int LIZIZ() {
        if (this.LJLJJI) {
            return this.LJLJI;
        }
        "PlaceholderSpan is not laid out yet.".toString();
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int LIZJ() {
        if (this.LJLJJI) {
            return this.LJLILLLLZI;
        }
        "PlaceholderSpan is not laid out yet.".toString();
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        this.LJLJJI = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        o.LJIIIIZZ(fontMetricsInt2, "paint.fontMetricsInt");
        this.LJLIL = fontMetricsInt2;
        if (LIZ().descent > LIZ().ascent) {
            this.LJLILLLLZI = (int) Math.ceil(0.0f);
            this.LJLJI = (int) Math.ceil(0.0f);
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = LIZ().ascent;
                fontMetricsInt.descent = LIZ().descent;
                fontMetricsInt.leading = LIZ().leading;
                if (fontMetricsInt.ascent > (-LIZIZ())) {
                    fontMetricsInt.ascent = -LIZIZ();
                }
                fontMetricsInt.top = Math.min(LIZ().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(LIZ().bottom, fontMetricsInt.descent);
            }
            return LIZJ();
        }
        "Invalid fontMetrics: line height can not be negative.".toString();
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
    }
}
