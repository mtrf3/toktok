package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.08H, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C08H extends ReplacementSpan {
    public final C08E LJLILLLLZI;
    public final Paint.FontMetricsInt LJLIL = new Paint.FontMetricsInt();
    public float LJLJI = 1.0f;

    public C08H(C08E c08e) {
        TMC.LJIIIZ(c08e, "metadata cannot be null");
        this.LJLILLLLZI = c08e;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        paint.getFontMetricsInt(this.LJLIL);
        Paint.FontMetricsInt fontMetricsInt2 = this.LJLIL;
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C29351Df LIZJ = this.LJLILLLLZI.LIZJ();
        int LIZ = LIZJ.LIZ(14);
        short s2 = 0;
        if (LIZ != 0) {
            s = LIZJ.LIZIZ.getShort(LIZ + LIZJ.LIZ);
        } else {
            s = 0;
        }
        this.LJLJI = abs / s;
        C29351Df LIZJ2 = this.LJLILLLLZI.LIZJ();
        int LIZ2 = LIZJ2.LIZ(14);
        if (LIZ2 != 0) {
            LIZJ2.LIZIZ.getShort(LIZ2 + LIZJ2.LIZ);
        }
        C29351Df LIZJ3 = this.LJLILLLLZI.LIZJ();
        int LIZ3 = LIZJ3.LIZ(12);
        if (LIZ3 != 0) {
            s2 = LIZJ3.LIZIZ.getShort(LIZ3 + LIZJ3.LIZ);
        }
        short s3 = (short) (s2 * this.LJLJI);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.LJLIL;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s3;
    }
}
